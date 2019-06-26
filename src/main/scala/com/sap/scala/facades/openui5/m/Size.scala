package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait Size extends js.Object

object Size{
  @JSGlobal("sap.m.Size.Auto")
  @js.native
  object Auto extends Size

  @JSGlobal("sap.m.Size.L")
  @js.native
  object L extends Size

  @JSGlobal("sap.m.Size.M")
  @js.native
  object M extends Size

  @JSGlobal("sap.m.Size.Responsive")
  @js.native
  object Responsive extends Size

  @JSGlobal("sap.m.Size.S")
  @js.native
  object S extends Size

  @JSGlobal("sap.m.Size.XS")
  @js.native
  object XS extends Size
}

/* copy to Enum.scala
sealed trait Size{
  private[ui] def toFacade: sap.m.Size
}

object Size {
  def fromFacade(s: m.Size): Size = s match {
    case m.Size.Auto => Size.Auto
    case m.Size.L => Size.L
    case m.Size.M => Size.M
    case m.Size.Responsive => Size.Responsive
    case m.Size.S => Size.S
    case m.Size.XS => Size.XS
   case _ =>
     throw new UnsupportedOperationException(s"Unknown Size: $s")
  }

  object Auto extends Size {
    override private[ui] def toFacade: m.Size = m.Size.Auto
  }

  object L extends Size {
    override private[ui] def toFacade: m.Size = m.Size.L
  }

  object M extends Size {
    override private[ui] def toFacade: m.Size = m.Size.M
  }

  object Responsive extends Size {
    override private[ui] def toFacade: m.Size = m.Size.Responsive
  }

  object S extends Size {
    override private[ui] def toFacade: m.Size = m.Size.S
  }

  object XS extends Size {
    override private[ui] def toFacade: m.Size = m.Size.XS
  }

}*/