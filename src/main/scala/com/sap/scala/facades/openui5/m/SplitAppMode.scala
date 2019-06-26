package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait SplitAppMode extends js.Object

object SplitAppMode{
  @JSGlobal("sap.m.SplitAppMode.HideMode")
  @js.native
  object HideMode extends SplitAppMode

  @JSGlobal("sap.m.SplitAppMode.PopoverMode")
  @js.native
  object PopoverMode extends SplitAppMode

  @JSGlobal("sap.m.SplitAppMode.ShowHideMode")
  @js.native
  object ShowHideMode extends SplitAppMode

  @JSGlobal("sap.m.SplitAppMode.StretchCompressMode")
  @js.native
  object StretchCompressMode extends SplitAppMode
}

/* copy to Enum.scala
sealed trait SplitAppMode{
  private[ui] def toFacade: sap.m.SplitAppMode
}

object SplitAppMode {
  def fromFacade(s: m.SplitAppMode): SplitAppMode = s match {
    case m.SplitAppMode.HideMode => SplitAppMode.HideMode
    case m.SplitAppMode.PopoverMode => SplitAppMode.PopoverMode
    case m.SplitAppMode.ShowHideMode => SplitAppMode.ShowHideMode
    case m.SplitAppMode.StretchCompressMode => SplitAppMode.StretchCompressMode
   case _ =>
     throw new UnsupportedOperationException(s"Unknown SplitAppMode: $s")
  }

  object HideMode extends SplitAppMode {
    override private[ui] def toFacade: m.SplitAppMode = m.SplitAppMode.HideMode
  }

  object PopoverMode extends SplitAppMode {
    override private[ui] def toFacade: m.SplitAppMode = m.SplitAppMode.PopoverMode
  }

  object ShowHideMode extends SplitAppMode {
    override private[ui] def toFacade: m.SplitAppMode = m.SplitAppMode.ShowHideMode
  }

  object StretchCompressMode extends SplitAppMode {
    override private[ui] def toFacade: m.SplitAppMode = m.SplitAppMode.StretchCompressMode
  }

}
*/