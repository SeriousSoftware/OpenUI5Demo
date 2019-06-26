package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait TextDirection extends js.Object

object TextDirection{
  @JSGlobal("sap.ui.core.TextDirection.Inherit")
  @js.native
  object Inherit extends TextDirection

  @JSGlobal("sap.ui.core.TextDirection.LTR")
  @js.native
  object LTR extends TextDirection

  @JSGlobal("sap.ui.core.TextDirection.RTL")
  @js.native
  object RTL extends TextDirection
}

/* copy to Enum.scala
sealed trait TextDirection{
  private[ui] def toFacade: sap.ui.core.TextDirection
}

object TextDirection {
  def fromFacade(s: ui.core.TextDirection): TextDirection = s match {
    case ui.core.TextDirection.Inherit => TextDirection.Inherit
    case ui.core.TextDirection.LTR => TextDirection.LTR
    case ui.core.TextDirection.RTL => TextDirection.RTL
   case _ =>
     throw new UnsupportedOperationException(s"Unknown TextDirection: $s")
  }

  object Inherit extends TextDirection {
    override private[ui] def toFacade: ui.core.TextDirection = ui.core.TextDirection.Inherit
  }

  object LTR extends TextDirection {
    override private[ui] def toFacade: ui.core.TextDirection = ui.core.TextDirection.LTR
  }

  object RTL extends TextDirection {
    override private[ui] def toFacade: ui.core.TextDirection = ui.core.TextDirection.RTL
  }

}*/