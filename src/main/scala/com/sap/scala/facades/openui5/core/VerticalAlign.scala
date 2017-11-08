package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait VerticalAlign extends js.Object

object VerticalAlign{
  @JSGlobal("sap.ui.core.VerticalAlign.Bottom")
  @js.native
  object Bottom extends VerticalAlign

  @JSGlobal("sap.ui.core.VerticalAlign.Inherit")
  @js.native
  object Inherit extends VerticalAlign

  @JSGlobal("sap.ui.core.VerticalAlign.Middle")
  @js.native
  object Middle extends VerticalAlign

  @JSGlobal("sap.ui.core.VerticalAlign.Top")
  @js.native
  object Top extends VerticalAlign
}

/* copy to Enum.scala
sealed trait VerticalAlign{
  private[ui] def toFacade: sap.ui.core.VerticalAlign
}

object VerticalAlign {
  def fromFacade(s: ui.core.VerticalAlign): VerticalAlign = s match {
    case ui.core.VerticalAlign.Bottom => VerticalAlign.Bottom
    case ui.core.VerticalAlign.Inherit => VerticalAlign.Inherit
    case ui.core.VerticalAlign.Middle => VerticalAlign.Middle
    case ui.core.VerticalAlign.Top => VerticalAlign.Top
   case _ =>
     throw new UnsupportedOperationException(s"Unknown VerticalAlign: $s")
  }
  
  object Bottom extends VerticalAlign {
    override private[ui] def toFacade: ui.core.VerticalAlign = ui.core.VerticalAlign.Bottom
  }

  object Inherit extends VerticalAlign {
    override private[ui] def toFacade: ui.core.VerticalAlign = ui.core.VerticalAlign.Inherit
  }

  object Middle extends VerticalAlign {
    override private[ui] def toFacade: ui.core.VerticalAlign = ui.core.VerticalAlign.Middle
  }

  object Top extends VerticalAlign {
    override private[ui] def toFacade: ui.core.VerticalAlign = ui.core.VerticalAlign.Top
  }

}
*/
