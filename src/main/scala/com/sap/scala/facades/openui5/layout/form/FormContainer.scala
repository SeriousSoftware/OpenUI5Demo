
package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.core.{Title, Element}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.form.FormContainer")
@js.native
class FormContainer() extends Element {
//  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addFormElement(oFormElement: FormElement): this.type = js.native
  def destroyFormElements(): this.type = js.native
  def destroyTitle(): this.type = js.native
  def destroyToolbar(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getExpandable(): Boolean = js.native
  def getExpanded(): Boolean = js.native
  def getFormElements(): js.Array[FormElement] = js.native
//  def getMetadata(): Metadata = js.native
  def getTitle(): Title | String = js.native
//  def getToolbar(): Toolbar = js.native
  def getVisible(): Boolean = js.native
  def indexOfFormElement(oFormElement: FormElement): Int = js.native
  def insertFormElement(oFormElement: FormElement, iIndex: Int): this.type = js.native
//  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllFormElements(): js.Array[FormElement] = js.native
//  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeFormElement(vFormElement: Int | String | FormElement): FormElement = js.native
  def setExpandable(bExpandable: Boolean): this.type = js.native
  def setExpanded(bExpanded: Boolean): this.type = js.native
  def setTitle(vTitle: Title | String): this.type = js.native
//  def setToolbar(oToolbar: Toolbar): this.type = js.native
  def setVisible(bVisible: Boolean): this.type = js.native
}
     