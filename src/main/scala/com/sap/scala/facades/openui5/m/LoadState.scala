package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait LoadState extends js.Object

object LoadState{
  @JSGlobal("sap.m.LoadState.Disabled")
  @js.native
  object Disabled extends LoadState

  @JSGlobal("sap.m.LoadState.Failed")
  @js.native
  object Failed extends LoadState

  @JSGlobal("sap.m.LoadState.Loaded")
  @js.native
  object Loaded extends LoadState

  @JSGlobal("sap.m.LoadState.Loading")
  @js.native
  object Loading extends LoadState
}

/* copy to Enum.scala
sealed trait LoadState{
  private[ui] def toFacade: sap.m.LoadState
}

object LoadState {
  def fromFacade(s: m.LoadState): LoadState = s match {
    case m.LoadState.Disabled => LoadState.Disabled
    case m.LoadState.Failed => LoadState.Failed
    case m.LoadState.Loaded => LoadState.Loaded
    case m.LoadState.Loading => LoadState.Loading
   case _ =>
     throw new UnsupportedOperationException(s"Unknown LoadState: $s")
  }

  object Disabled extends LoadState {
    override private[ui] def toFacade: m.LoadState = m.LoadState.Disabled
  }

  object Failed extends LoadState {
    override private[ui] def toFacade: m.LoadState = m.LoadState.Failed
  }

  object Loaded extends LoadState {
    override private[ui] def toFacade: m.LoadState = m.LoadState.Loaded
  }

  object Loading extends LoadState {
    override private[ui] def toFacade: m.LoadState = m.LoadState.Loading
  }

}
*/