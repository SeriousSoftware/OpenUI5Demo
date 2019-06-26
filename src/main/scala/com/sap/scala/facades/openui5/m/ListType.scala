package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ListType extends js.Object

object ListType{
  @JSGlobal("sap.m.ListType.Active")
  @js.native
  object Active extends ListType

  @JSGlobal("sap.m.ListType.Detail")
  @js.native
  object Detail extends ListType

  @JSGlobal("sap.m.ListType.DetailAndActive")
  @js.native
  object DetailAndActive extends ListType

  @JSGlobal("sap.m.ListType.Inactive")
  @js.native
  object Inactive extends ListType

  @JSGlobal("sap.m.ListType.Navigation")
  @js.native
  object Navigation extends ListType
}

/* copy to Enum.scala
sealed trait ListType{
  private[ui] def toFacade: sap.m.ListType
}

object ListType {
  def fromFacade(s: m.ListType): ListType = s match {
    case m.ListType.Active => ListType.Active
    case m.ListType.Detail => ListType.Detail
    case m.ListType.DetailAndActive => ListType.DetailAndActive
    case m.ListType.Inactive => ListType.Inactive
    case m.ListType.Navigation => ListType.Navigation
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ListType: $s")
  }

  object Active extends ListType {
    override private[ui] def toFacade: m.ListType = m.ListType.Active
  }

  object Detail extends ListType {
    override private[ui] def toFacade: m.ListType = m.ListType.Detail
  }

  object DetailAndActive extends ListType {
    override private[ui] def toFacade: m.ListType = m.ListType.DetailAndActive
  }

  object Inactive extends ListType {
    override private[ui] def toFacade: m.ListType = m.ListType.Inactive
  }

  object Navigation extends ListType {
    override private[ui] def toFacade: m.ListType = m.ListType.Navigation
  }

}*/