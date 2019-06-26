package com.sap.scala.facades.openui5.layout

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait GridPosition extends js.Object

object GridPosition{
  @JSGlobal("sap.ui.layout.GridPosition.Center")
  @js.native
  object Center extends GridPosition

  @JSGlobal("sap.ui.layout.GridPosition.Left")
  @js.native
  object Left extends GridPosition

  @JSGlobal("sap.ui.layout.GridPosition.Right")
  @js.native
  object Right extends GridPosition
}

/* copy to Enum.scala
sealed trait GridPosition{
  private[ui] def toFacade: sap.ui.layout.GridPosition
}

object GridPosition {
  def fromFacade(s: ui.layout.GridPosition): GridPosition = s match {
    case ui.layout.GridPosition.Center => GridPosition.Center
    case ui.layout.GridPosition.Left => GridPosition.Left
    case ui.layout.GridPosition.Right => GridPosition.Right
   case _ =>
     throw new UnsupportedOperationException(s"Unknown GridPosition: $s")
  }

  object Center extends GridPosition {
    override private[ui] def toFacade: ui.layout.GridPosition = ui.layout.GridPosition.Center
  }

  object Left extends GridPosition {
    override private[ui] def toFacade: ui.layout.GridPosition = ui.layout.GridPosition.Left
  }

  object Right extends GridPosition {
    override private[ui] def toFacade: ui.layout.GridPosition = ui.layout.GridPosition.Right
  }

}
*/