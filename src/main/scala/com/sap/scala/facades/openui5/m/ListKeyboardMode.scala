package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ListKeyboardMode extends js.Object

object ListKeyboardMode{
  @JSGlobal("sap.m.ListKeyboardMode.Edit")
  @js.native
  object Edit extends ListKeyboardMode

  @JSGlobal("sap.m.ListKeyboardMode.Navigation")
  @js.native
  object Navigation extends ListKeyboardMode
}

/* copy to Enum.scala
sealed trait ListKeyboardMode{
  private[ui] def toFacade: sap.m.ListKeyboardMode
}

object ListKeyboardMode {
  def fromFacade(s: m.ListKeyboardMode): ListKeyboardMode = s match {
    case m.ListKeyboardMode.Edit => ListKeyboardMode.Edit
    case m.ListKeyboardMode.Navigation => ListKeyboardMode.Navigation
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ListKeyboardMode: $s")
  }

  object Edit extends ListKeyboardMode {
    override private[ui] def toFacade: m.ListKeyboardMode = m.ListKeyboardMode.Edit
  }

  object Navigation extends ListKeyboardMode {
    override private[ui] def toFacade: m.ListKeyboardMode = m.ListKeyboardMode.Navigation
  }

}*/