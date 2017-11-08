
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{Popover,Dialog}
//import com.sap.scala.facades.openui5.core.Item


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ComboBox")
@js.native
class ComboBox() extends ComboBoxBase {
  def attachChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSelectionChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def createPicker(sPickerType: String): Popover | Dialog = js.native
  def detachChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSelectionChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireChange(mParameters: Object): this.type = js.native
  def fireSelectionChange(mParameters: Object): this.type = js.native
//  def getDefaultSelectedItem(): /*TODO Type: 'null' not found.*/ = js.native
  def getFilterSecondaryValues(): Boolean = js.native
//  def getItems(): js.Array[Item] = js.native
//  def getMetadata(): Metadata = js.native
//  def getSelectedItem(): Item | /*TODO Type: 'null' not found.*/ = js.native
  def getSelectedItemId(): String = js.native
  def getSelectedKey(): String = js.native
  def getShowSecondaryValues(): Boolean = js.native
  def onBeforeOpen(): Unit = js.native
//  def removeItem(vItem: Int | String | Item): Item = js.native
  def selectText(iSelectionStart: Int, iSelectionEnd: Int): Unit = js.native
  def setFilterSecondaryValues(bFilterSecondaryValues: Boolean): this.type = js.native
//  def setSelectedItem(vItem: String | Item | /*TODO Type: 'null' not found.*/): this.type = js.native
//  def setSelectedItemId(vItem: String | /*TODO Type: 'undefined' not found.*/): this.type = js.native
  def setSelectedKey(sKey: String): this.type = js.native
  def setShowSecondaryValues(bShowSecondaryValues: Boolean): this.type = js.native
  def synchronizeSelection(): Unit = js.native
}
     