package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait PopinDisplay extends js.Object

object PopinDisplay{
  @JSGlobal("sap.m.PopinDisplay.Block")
  @js.native
  object Block extends PopinDisplay

  @JSGlobal("sap.m.PopinDisplay.Inline")
  @js.native
  object Inline extends PopinDisplay

  @JSGlobal("sap.m.PopinDisplay.WithoutHeader")
  @js.native
  object WithoutHeader extends PopinDisplay
}

/* copy to Enum.scala
sealed trait PopinDisplay{
  private[ui] def toFacade: sap.m.PopinDisplay
}

object PopinDisplay {
  def fromFacade(s: m.PopinDisplay): PopinDisplay = s match {
    case m.PopinDisplay.Block => PopinDisplay.Block
    case m.PopinDisplay.Inline => PopinDisplay.Inline
    case m.PopinDisplay.WithoutHeader => PopinDisplay.WithoutHeader
   case _ =>
     throw new UnsupportedOperationException(s"Unknown PopinDisplay: $s")
  }

  object Block extends PopinDisplay {
    override private[ui] def toFacade: m.PopinDisplay = m.PopinDisplay.Block
  }

  object Inline extends PopinDisplay {
    override private[ui] def toFacade: m.PopinDisplay = m.PopinDisplay.Inline
  }

  object WithoutHeader extends PopinDisplay {
    override private[ui] def toFacade: m.PopinDisplay = m.PopinDisplay.WithoutHeader
  }

}*/