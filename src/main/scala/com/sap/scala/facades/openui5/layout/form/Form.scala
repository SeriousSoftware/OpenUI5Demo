package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.core.{CSSSize, Control, Title}
import com.sap.scala.facades.openui5.m.Toolbar

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.ui.layout.form.Form")
@js.native
class Form() extends Control {
  // Add override so that method chaining still works
  override def addStyleClass(sStyleClass: String): this.type = js.native

//  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addFormContainer(oFormContainer: FormContainer): this.type = js.native
//  def destroyFormContainers(): this.type = js.native
//  def destroyLayout(): this.type = js.native
//  def destroyTitle(): this.type = js.native
//  def destroyToolbar(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAriaLabelledBy(): js.Array[ID] = js.native

  def getEditable(): Boolean = js.native
  def getFormContainers(): js.Array[FormContainer] = js.native
  def getLayout(): FormLayout = js.native

//  def getMetadata(): Metadata = js.native

  def getTitle(): Title | String = js.native
  def getToolbar(): Toolbar = js.native
  def getWidth(): CSSSize = js.native

//  def indexOfFormContainer(oFormContainer: FormContainer): Int = js.native
//  def insertFormContainer(oFormContainer: FormContainer, iIndex: Int): this.type = js.native
//  def removeAllAriaLabelledBy(): js.Array[ID] = js.native

  def removeAllFormContainers(): js.Array[FormContainer] = js.native

//  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
//  def removeFormContainer(vFormContainer: Int | String | FormContainer): FormContainer = js.native

  def setEditable(bEditable: Boolean): this.type = js.native
  def setLayout(oLayout: FormLayout): this.type = js.native
  def setTitle(vTitle: Title | String): this.type = js.native
  def setToolbar(oToolbar: Toolbar): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}