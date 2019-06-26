package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait PageBackgroundDesign extends js.Object

object PageBackgroundDesign{
  @JSGlobal("sap.m.PageBackgroundDesign.List")
  @js.native
  object List extends PageBackgroundDesign

  @JSGlobal("sap.m.PageBackgroundDesign.Solid")
  @js.native
  object Solid extends PageBackgroundDesign

  @JSGlobal("sap.m.PageBackgroundDesign.Standard")
  @js.native
  object Standard extends PageBackgroundDesign

  @JSGlobal("sap.m.PageBackgroundDesign.Transparent")
  @js.native
  object Transparent extends PageBackgroundDesign
}

/* copy to Enum.scala
sealed trait PageBackgroundDesign{
  private[ui] def toFacade: sap.m.PageBackgroundDesign
}

object PageBackgroundDesign {
  def fromFacade(s: m.PageBackgroundDesign): PageBackgroundDesign = s match {
    case m.PageBackgroundDesign.List => PageBackgroundDesign.List
    case m.PageBackgroundDesign.Solid => PageBackgroundDesign.Solid
    case m.PageBackgroundDesign.Standard => PageBackgroundDesign.Standard
    case m.PageBackgroundDesign.Transparent => PageBackgroundDesign.Transparent
   case _ =>
     throw new UnsupportedOperationException(s"Unknown PageBackgroundDesign: $s")
  }

  object List extends PageBackgroundDesign {
    override private[ui] def toFacade: m.PageBackgroundDesign = m.PageBackgroundDesign.List
  }

  object Solid extends PageBackgroundDesign {
    override private[ui] def toFacade: m.PageBackgroundDesign = m.PageBackgroundDesign.Solid
  }

  object Standard extends PageBackgroundDesign {
    override private[ui] def toFacade: m.PageBackgroundDesign = m.PageBackgroundDesign.Standard
  }

  object Transparent extends PageBackgroundDesign {
    override private[ui] def toFacade: m.PageBackgroundDesign = m.PageBackgroundDesign.Transparent
  }

}*/