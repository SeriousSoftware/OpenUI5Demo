package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait FlexDirection extends js.Object

object FlexDirection{
  @JSGlobal("sap.m.FlexDirection.Column")
  @js.native
  object Column extends FlexDirection

  @JSGlobal("sap.m.FlexDirection.ColumnReverse")
  @js.native
  object ColumnReverse extends FlexDirection

  @JSGlobal("sap.m.FlexDirection.Inherit")
  @js.native
  object Inherit extends FlexDirection

  @JSGlobal("sap.m.FlexDirection.Row")
  @js.native
  object Row extends FlexDirection

  @JSGlobal("sap.m.FlexDirection.RowReverse")
  @js.native
  object RowReverse extends FlexDirection
}

/* copy to Enum.scala
sealed trait FlexDirection{
  private[ui] def toFacade: sap.m.FlexDirection
}

object FlexDirection {
  def fromFacade(s: m.FlexDirection): FlexDirection = s match {
    case m.FlexDirection.Column => FlexDirection.Column
    case m.FlexDirection.ColumnReverse => FlexDirection.ColumnReverse
    case m.FlexDirection.Inherit => FlexDirection.Inherit
    case m.FlexDirection.Row => FlexDirection.Row
    case m.FlexDirection.RowReverse => FlexDirection.RowReverse
   case _ =>
     throw new UnsupportedOperationException(s"Unknown FlexDirection: $s")
  }
  
  object Column extends FlexDirection {
    override private[ui] def toFacade: m.FlexDirection = m.FlexDirection.Column
  }

  object ColumnReverse extends FlexDirection {
    override private[ui] def toFacade: m.FlexDirection = m.FlexDirection.ColumnReverse
  }

  object Inherit extends FlexDirection {
    override private[ui] def toFacade: m.FlexDirection = m.FlexDirection.Inherit
  }

  object Row extends FlexDirection {
    override private[ui] def toFacade: m.FlexDirection = m.FlexDirection.Row
  }

  object RowReverse extends FlexDirection {
    override private[ui] def toFacade: m.FlexDirection = m.FlexDirection.RowReverse
  }

}
*/
