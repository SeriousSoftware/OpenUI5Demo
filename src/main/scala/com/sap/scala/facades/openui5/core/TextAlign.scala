package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait TextAlign extends js.Object

object TextAlign{
  @JSGlobal("sap.ui.core.TextAlign.Begin")
  @js.native
  object Begin extends TextAlign

  @JSGlobal("sap.ui.core.TextAlign.Center")
  @js.native
  object Center extends TextAlign

  @JSGlobal("sap.ui.core.TextAlign.End")
  @js.native
  object End extends TextAlign

  @JSGlobal("sap.ui.core.TextAlign.Initial")
  @js.native
  object Initial extends TextAlign

  @JSGlobal("sap.ui.core.TextAlign.Left")
  @js.native
  object Left extends TextAlign

  @JSGlobal("sap.ui.core.TextAlign.Right")
  @js.native
  object Right extends TextAlign
}

/* copy to Enum.scala
sealed trait TextAlign{
  private[ui] def toFacade: sap.ui.core.TextAlign
}

object TextAlign {
  def fromFacade(s: ui.core.TextAlign): TextAlign = s match {
    case ui.core.TextAlign.Begin => TextAlign.Begin
    case ui.core.TextAlign.Center => TextAlign.Center
    case ui.core.TextAlign.End => TextAlign.End
    case ui.core.TextAlign.Initial => TextAlign.Initial
    case ui.core.TextAlign.Left => TextAlign.Left
    case ui.core.TextAlign.Right => TextAlign.Right
   case _ =>
     throw new UnsupportedOperationException(s"Unknown TextAlign: $s")
  }

  object Begin extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.Begin
  }

  object Center extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.Center
  }

  object End extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.End
  }

  object Initial extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.Initial
  }

  object Left extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.Left
  }

  object Right extends TextAlign {
    override private[ui] def toFacade: ui.core.TextAlign = ui.core.TextAlign.Right
  }

}*/
