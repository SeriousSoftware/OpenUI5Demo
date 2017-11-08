package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ListMode extends js.Object

object ListMode{
  @JSGlobal("sap.m.ListMode.Delete")
  @js.native
  object Delete extends ListMode

  @JSGlobal("sap.m.ListMode.MultiSelect")
  @js.native
  object MultiSelect extends ListMode

  @JSGlobal("sap.m.ListMode.None")
  @js.native
  object None extends ListMode

  @JSGlobal("sap.m.ListMode.SingleSelect")
  @js.native
  object SingleSelect extends ListMode

  @JSGlobal("sap.m.ListMode.SingleSelectLeft")
  @js.native
  object SingleSelectLeft extends ListMode

  @JSGlobal("sap.m.ListMode.SingleSelectMaster")
  @js.native
  object SingleSelectMaster extends ListMode
}

/* copy to Enum.scala
sealed trait ListMode{
  private[ui] def toFacade: sap.m.ListMode
}

object ListMode {
  def fromFacade(s: m.ListMode): ListMode = s match {
    case m.ListMode.Delete => ListMode.Delete
    case m.ListMode.MultiSelect => ListMode.MultiSelect
    case m.ListMode.None => ListMode.None
    case m.ListMode.SingleSelect => ListMode.SingleSelect
    case m.ListMode.SingleSelectLeft => ListMode.SingleSelectLeft
    case m.ListMode.SingleSelectMaster => ListMode.SingleSelectMaster
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ListMode: $s")
  }
  
  object Delete extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.Delete
  }

  object MultiSelect extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.MultiSelect
  }

  object None extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.None
  }

  object SingleSelect extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.SingleSelect
  }

  object SingleSelectLeft extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.SingleSelectLeft
  }

  object SingleSelectMaster extends ListMode {
    override private[ui] def toFacade: m.ListMode = m.ListMode.SingleSelectMaster
  }

}
*/
