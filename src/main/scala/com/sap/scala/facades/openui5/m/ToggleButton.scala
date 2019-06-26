package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.EventProps

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.ToggleButton")
@js.native
class ToggleButton() extends Button {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getMetadata(): Metadata = js.native
  def getPressed(): Boolean = js.native
  def setPressed(bPressed: Boolean): this.type = js.native
}

@js.native
trait ToggleEventProps extends EventProps {
  val pressed: Boolean
}