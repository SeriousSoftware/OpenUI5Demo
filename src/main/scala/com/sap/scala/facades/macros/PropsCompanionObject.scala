package com.sap.scala.facades.macros

import scala.annotation.{StaticAnnotation, tailrec}
import scala.reflect.macros.whitebox
import scala.language.experimental.macros

/**
  * This class works as macro which creates a companion object for the SapUI5 facade properties.
  *
  * The macro creates a companion object with an `apply()` method. All fields of the properties companion class
  * are setable in this method. The method parameters are ordered by mandatory/obligatory, each block in alphabetical order.
  *
  * The macro also makes the annotated property trait abstract, extracting all initializers into default arguments of
  * the generated apply method on the companion object.
  *
  *
  * {{{
  *   @PropsCompanionObject
  *   trait AProps {
  *     val a : String = "foo"
  *     val c : String = "bar"
  *   }
  *
  *   @PropsCompanionObject
  *   trait BProps extends AProps {
  *     val b : Int
  *   }
  *
  *   // generated companion object for BProps
  *
  *   object BProps {
  *     def apply(b: Int,
  *               a: String = "foo",
  *               c: String = "bar"): BProps = ...
  *   }
  * }}}
  */
class PropsCompanionObject extends StaticAnnotation{
  def macroTransform(annottees: Any*): Any = macro MacroGenerator.generateCompanion
}

object MacroGenerator {
  def generateCompanion(c: whitebox.Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    import c.universe._

    def asTerm(x: Tree): Tree = {
      x match {
        case Ident(TypeName(v)) => Ident(TermName(v))
        case Select(q, TypeName(n)) => Select(q, TermName(n))
      }
    }

    val result = {
      annottees.map(_.tree).toList match {
        case q" ..$otherAnnotation trait $name extends ..$parents { ..$body }" :: Nil =>
          val nameAndType: Seq[(String, Tree, Option[Tree])] = body.map {
            case q"def ${TermName(varName)}: $varType" => (varName, varType, None)
            case q"val ${TermName(varName)}: $varType" => (varName, varType, None)
            case q"def ${TermName(varName)}: $varType = $varValue" => (varName, varType, Some(varValue))
            case q"val ${TermName(varName)}: $varType = $varValue" => (varName, varType, Some(varValue))
          }

          //Prepare Trait Body without the default values
          val traitBody = body.map {
            case q"def ${TermName(varName)}: $varType = $varValue" => q"def ${TermName(varName)}: $varType"
            case q"val ${TermName(varName)}: $varType = $varValue" => q"val ${TermName(varName)}: $varType"
            case d => d
          }

          //Handling of Parent classes and their members for the trait
          val jsObjectMembers =  c.typecheck(q"??? : js.Object").tpe.members

          val parentNameAndType = for {
            parent <- parents
            parentType = c.typecheck(q"(??? : ${parent})").tpe
            members = parentType.members.filter(x => jsObjectMembers.forall(_ != x)).toSeq
            memberSymbol <- members
            member = memberSymbol.name.decodedName.toString
            t = memberSymbol.typeSignature.resultType

            val parentAsTerm = asTerm(parent)

            parentValue = {
              if (parentType.companion.member(member: TermName) != NoSymbol)
                Some(q"$parentAsTerm.${TermName(member)}")
              else
                None
            }
          } yield ((member, tq"$t", parentValue))

          val sortByMandatoryAndName =
            (tuple1: (String, c.universe.Tree, Option[c.universe.Tree]), tuple2: (String, c.universe.Tree, Option[c.universe.Tree])) =>
              (tuple1._3.isEmpty && tuple2._3.isDefined) || (tuple1._3.isEmpty == tuple2._3.isEmpty) && (tuple1._1 < tuple2._1)

          val classMembers = (nameAndType ++ parentNameAndType).sortWith(sortByMandatoryAndName)

          //Prepare val assignments for apply method
          val valAssignBlock = classMembers.map {
            case (varName, varType, varValue) => q"val ${TermName("_"+varName)} = ${TermName(varName)}"
          }

          //code goes inside new object instantiation
          val varObjectBlock = classMembers.map {
            case (varName, varType, varValue) => q"override val ${TermName(varName)} = ${TermName("_" + varName)}"
          }

          //Prepare method parameters for Apply method

          val methodParams = classMembers.map {
            case (varName, varType, varValue) =>
              varValue match {
                case None => q" val ${TermName(varName)}: $varType"
                case Some(value) => q" val ${TermName(varName)}: $varType = $value"
              }
          }

          val defaultValues = classMembers.map {
            case (varName, varType, Some(defaultValue)) =>
              q"val ${TermName(varName)}: $varType = $defaultValue"
            case (_, _, None) =>
              q""
          }

          q"""
              //Generates trait
              $otherAnnotation trait ${TypeName(name.toString())} extends ..$parents{
                ..$traitBody
              }
              //Generates the companion object
              object ${TermName(name.toString())} {
                def apply(..$methodParams) ={
                  ..$valAssignBlock
                  new $name{
                   ..$varObjectBlock
                   }
                }
              ..$defaultValues
              }

           """
      }
    }
    //Shows the macro expansion while compiling the code
    //    println(result)
    c.Expr[Any](result)
  }
}


