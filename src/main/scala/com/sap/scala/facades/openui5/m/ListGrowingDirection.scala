package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ListGrowingDirection extends js.Object

object ListGrowingDirection{
  @JSGlobal("sap.m.ListGrowingDirection.Downwards")
  @js.native
  object Downwards extends ListGrowingDirection

  @JSGlobal("sap.m.ListGrowingDirection.Upwards")
  @js.native
  object Upwards extends ListGrowingDirection
}

/* copy to Enum.scala
sealed trait ListGrowingDirection{
  private[ui] def toFacade: sap.m.ListGrowingDirection
}

object ListGrowingDirection {
  def fromFacade(s: m.ListGrowingDirection): ListGrowingDirection = s match {
    case m.ListGrowingDirection.Downwards => ListGrowingDirection.Downwards
    case m.ListGrowingDirection.Upwards => ListGrowingDirection.Upwards
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ListGrowingDirection: $s")
  }
  
  object Downwards extends ListGrowingDirection {
    override private[ui] def toFacade: m.ListGrowingDirection = m.ListGrowingDirection.Downwards
  }

  object Upwards extends ListGrowingDirection {
    override private[ui] def toFacade: m.ListGrowingDirection = m.ListGrowingDirection.Upwards
  }

}
*/
