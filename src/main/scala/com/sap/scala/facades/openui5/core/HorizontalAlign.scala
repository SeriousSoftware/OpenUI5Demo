package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait HorizontalAlign extends js.Object

object HorizontalAlign{
  @JSGlobal("sap.ui.core.HorizontalAlign.Begin")
  @js.native
  object Begin extends HorizontalAlign

  @JSGlobal("sap.ui.core.HorizontalAlign.Center")
  @js.native
  object Center extends HorizontalAlign

  @JSGlobal("sap.ui.core.HorizontalAlign.End")
  @js.native
  object End extends HorizontalAlign

  @JSGlobal("sap.ui.core.HorizontalAlign.Left")
  @js.native
  object Left extends HorizontalAlign

  @JSGlobal("sap.ui.core.HorizontalAlign.Right")
  @js.native
  object Right extends HorizontalAlign
}

/* copy to Enum.scala
sealed trait HorizontalAlign{
  private[ui] def toFacade: sap.ui.core.HorizontalAlign
}

object HorizontalAlign {
  def fromFacade(s: ui.core.HorizontalAlign): HorizontalAlign = s match {
    case ui.core.HorizontalAlign.Begin => HorizontalAlign.Begin
    case ui.core.HorizontalAlign.Center => HorizontalAlign.Center
    case ui.core.HorizontalAlign.End => HorizontalAlign.End
    case ui.core.HorizontalAlign.Left => HorizontalAlign.Left
    case ui.core.HorizontalAlign.Right => HorizontalAlign.Right
   case _ =>
     throw new UnsupportedOperationException(s"Unknown HorizontalAlign: $s")
  }

  object Begin extends HorizontalAlign {
    override private[ui] def toFacade: ui.core.HorizontalAlign = ui.core.HorizontalAlign.Begin
  }

  object Center extends HorizontalAlign {
    override private[ui] def toFacade: ui.core.HorizontalAlign = ui.core.HorizontalAlign.Center
  }

  object End extends HorizontalAlign {
    override private[ui] def toFacade: ui.core.HorizontalAlign = ui.core.HorizontalAlign.End
  }

  object Left extends HorizontalAlign {
    override private[ui] def toFacade: ui.core.HorizontalAlign = ui.core.HorizontalAlign.Left
  }

  object Right extends HorizontalAlign {
    override private[ui] def toFacade: ui.core.HorizontalAlign = ui.core.HorizontalAlign.Right
  }

}*/