package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.core.{Control, Element}
import com.sap.scala.facades.openui5.m.Label

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.ui.layout.form.FormElement")
@js.native
class FormElement() extends Element {
  def addField(oField: Control): this.type = js.native
//  def destroyFields(): this.type = js.native
//  def destroyLabel(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getFields(): js.Array[Control] = js.native
  def getLabel(): Label | String = js.native
//  def getLabelControl(): Label = js.native
//  def getMetadata(): Metadata = js.native
  def getVisible(): Boolean = js.native
//  def indexOfField(oField: Control): Int = js.native
//  def insertField(oField: Control, iIndex: Int): this.type = js.native
  def removeAllFields(): js.Array[Control] = js.native
//  def removeField(vField: Int | String | Control): Control = js.native
  def setLabel(vLabel: Label | String): this.type = js.native
  def setVisible(bVisible: Boolean): this.type = js.native
}