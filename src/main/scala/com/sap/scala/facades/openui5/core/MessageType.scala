package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait MessageType extends js.Object

object MessageType{
  @JSGlobal("sap.ui.core.MessageType.Error")
  @js.native
  object Error extends MessageType

  @JSGlobal("sap.ui.core.MessageType.Information")
  @js.native
  object Information extends MessageType

  @JSGlobal("sap.ui.core.MessageType.None")
  @js.native
  object None extends MessageType

  @JSGlobal("sap.ui.core.MessageType.Success")
  @js.native
  object Success extends MessageType

  @JSGlobal("sap.ui.core.MessageType.Warning")
  @js.native
  object Warning extends MessageType
}

/* copy to Enum.scala
sealed trait MessageType{
  private[ui] def toFacade: sap.ui.core.MessageType
}

object MessageType {
  def fromFacade(s: ui.core.MessageType): MessageType = s match {
    case ui.core.MessageType.Error => MessageType.Error
    case ui.core.MessageType.Information => MessageType.Information
    case ui.core.MessageType.None => MessageType.None
    case ui.core.MessageType.Success => MessageType.Success
    case ui.core.MessageType.Warning => MessageType.Warning
   case _ =>
     throw new UnsupportedOperationException(s"Unknown MessageType: $s")
  }
  
  object Error extends MessageType {
    override private[ui] def toFacade: ui.core.MessageType = ui.core.MessageType.Error
  }

  object Information extends MessageType {
    override private[ui] def toFacade: ui.core.MessageType = ui.core.MessageType.Information
  }

  object None extends MessageType {
    override private[ui] def toFacade: ui.core.MessageType = ui.core.MessageType.None
  }

  object Success extends MessageType {
    override private[ui] def toFacade: ui.core.MessageType = ui.core.MessageType.Success
  }

  object Warning extends MessageType {
    override private[ui] def toFacade: ui.core.MessageType = ui.core.MessageType.Warning
  }

}
*/
