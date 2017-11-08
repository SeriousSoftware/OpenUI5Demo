
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.{EnabledProp, TextProp}
import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{URI,Control}


import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.m.Button.html
  */
@JSGlobal("sap.m.Button")
@js.native //TODO This thing needs to be reworked...
class Button() extends Control with TextProp with EnabledProp {
  def attachPress(fnFunction : js.Function1[Event[EventProps], Unit])             : this.type = js.native // TODO Event Prop Type
  def detachPress(listener: Event.Fn, context: js.UndefOr[Control] = js.undefined): Unit      = js.native

  def getIcon()         : URI  = js.native
  def setIcon(icon: URI): Unit = js.native

  def setType(`type`: ButtonType): Unit       = js.native
  def getType()                  : ButtonType = js.native

  def firePress(): this.type = js.native
}



/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.m.ButtonType.html
  */
@js.native
sealed trait ButtonType extends js.Object

object ButtonType {

  @JSGlobal("sap.m.ButtonType.Accept")
  @js.native
  object Accept extends ButtonType

  @JSGlobal("sap.m.ButtonType.Back")
  @js.native
  object Back extends ButtonType

  @JSGlobal("sap.m.ButtonType.Default")
  @js.native
  object Default extends ButtonType

  @JSGlobal("sap.m.ButtonType.Emphasized  ")
  @js.native
  object Emphasized extends ButtonType

  @JSGlobal("sap.m.ButtonType.Reject")
  @js.native
  object Reject extends ButtonType

  @JSGlobal("sap.m.ButtonType.Transparent")
  @js.native
  object Transparent extends ButtonType

  @JSGlobal("sap.m.ButtonType.Unstyled")
  @js.native
  object Unstyled extends ButtonType

  @JSGlobal("sap.m.ButtonType.Up")
  @js.native
  object Up extends ButtonType

}
