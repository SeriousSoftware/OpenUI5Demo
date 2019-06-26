package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait SwipeDirection extends js.Object

object SwipeDirection{
  @JSGlobal("sap.m.SwipeDirection.Both")
  @js.native
  object Both extends SwipeDirection

  @JSGlobal("sap.m.SwipeDirection.LeftToRight")
  @js.native
  object LeftToRight extends SwipeDirection

  @JSGlobal("sap.m.SwipeDirection.RightToLeft")
  @js.native
  object RightToLeft extends SwipeDirection
}

/* copy to Enum.scala
sealed trait SwipeDirection{
  private[ui] def toFacade: sap.m.SwipeDirection
}

object SwipeDirection {
  def fromFacade(s: m.SwipeDirection): SwipeDirection = s match {
    case m.SwipeDirection.Both => SwipeDirection.Both
    case m.SwipeDirection.LeftToRight => SwipeDirection.LeftToRight
    case m.SwipeDirection.RightToLeft => SwipeDirection.RightToLeft
   case _ =>
     throw new UnsupportedOperationException(s"Unknown SwipeDirection: $s")
  }

  object Both extends SwipeDirection {
    override private[ui] def toFacade: m.SwipeDirection = m.SwipeDirection.Both
  }

  object LeftToRight extends SwipeDirection {
    override private[ui] def toFacade: m.SwipeDirection = m.SwipeDirection.LeftToRight
  }

  object RightToLeft extends SwipeDirection {
    override private[ui] def toFacade: m.SwipeDirection = m.SwipeDirection.RightToLeft
  }

}
*/