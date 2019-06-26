package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ValueState extends js.Object

object ValueState{
  @JSGlobal("sap.ui.core.ValueState.Error")
  @js.native
  object Error extends ValueState

  @JSGlobal("sap.ui.core.ValueState.None")
  @js.native
  object None extends ValueState

  @JSGlobal("sap.ui.core.ValueState.Success")
  @js.native
  object Success extends ValueState

  @JSGlobal("sap.ui.core.ValueState.Warning")
  @js.native
  object Warning extends ValueState
}

/* copy to Enum.scala
sealed trait ValueState{
  private[ui] def toFacade: sap.ui.core.ValueState
}

object ValueState {
  def fromFacade(s: ui.core.ValueState): ValueState = s match {
    case ui.core.ValueState.Error => ValueState.Error
    case ui.core.ValueState.None => ValueState.None
    case ui.core.ValueState.Success => ValueState.Success
    case ui.core.ValueState.Warning => ValueState.Warning
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ValueState: $s")
  }

  object Error extends ValueState {
    override private[ui] def toFacade: ui.core.ValueState = ui.core.ValueState.Error
  }

  object None extends ValueState {
    override private[ui] def toFacade: ui.core.ValueState = ui.core.ValueState.None
  }

  object Success extends ValueState {
    override private[ui] def toFacade: ui.core.ValueState = ui.core.ValueState.Success
  }

  object Warning extends ValueState {
    override private[ui] def toFacade: ui.core.ValueState = ui.core.ValueState.Warning
  }

}
*/