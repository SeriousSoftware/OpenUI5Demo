package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait FrameType extends js.Object

object FrameType{
  @JSGlobal("sap.m.FrameType.Auto")
  @js.native
  object Auto extends FrameType

  @JSGlobal("sap.m.FrameType.OneByOne")
  @js.native
  object OneByOne extends FrameType

  @JSGlobal("sap.m.FrameType.TwoByOne")
  @js.native
  object TwoByOne extends FrameType

  @JSGlobal("sap.m.FrameType.TwoThirds")
  @js.native
  object TwoThirds extends FrameType
}

/* copy to Enum.scala
sealed trait FrameType{
  private[ui] def toFacade: sap.m.FrameType
}

object FrameType {
  def fromFacade(s: m.FrameType): FrameType = s match {
    case m.FrameType.Auto => FrameType.Auto
    case m.FrameType.OneByOne => FrameType.OneByOne
    case m.FrameType.TwoByOne => FrameType.TwoByOne
    case m.FrameType.TwoThirds => FrameType.TwoThirds
   case _ =>
     throw new UnsupportedOperationException(s"Unknown FrameType: $s")
  }
  
  object Auto extends FrameType {
    override private[ui] def toFacade: m.FrameType = m.FrameType.Auto
  }

  object OneByOne extends FrameType {
    override private[ui] def toFacade: m.FrameType = m.FrameType.OneByOne
  }

  object TwoByOne extends FrameType {
    override private[ui] def toFacade: m.FrameType = m.FrameType.TwoByOne
  }

  object TwoThirds extends FrameType {
    override private[ui] def toFacade: m.FrameType = m.FrameType.TwoThirds
  }

}
*/
