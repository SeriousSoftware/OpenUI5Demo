
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{Bar,SelectList,Popover,ComboBox,ComboBoxTextField,Input,Dialog}
import com.sap.scala.facades.openui5.core.Item


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ComboBoxBase")
@js.native
class ComboBoxBase() extends ComboBoxTextField {
  def addItem(oItem: Item): this.type = js.native
  def attachLoadItems(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindItems(oBindingInfo: Object): this.type = js.native
  def clearSelection(): Unit = js.native
  def close(): this.type = js.native
//  def createPicker(sPickerType: String): Popover | Dialog = js.native
  def createPickerHeader(): Bar = js.native
  def destroyItems(): ComboBox = js.native
  def detachLoadItems(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireLoadItems(mParameters: Object): this.type = js.native
  def getEnabledItems(aItems: js.Array[Item]): js.Array[Item] = js.native
  def getFirstItem(): Item = js.native
  def getItemAt(iIndex: Int): Item = js.native
  def getItemByKey(sKey: String): Item = js.native
  def getItems(): js.Array[Item] = js.native
  def getLastItem(): Item = js.native
//  def getList(): SelectList = js.native
//  def getMetadata(): Metadata = js.native
//  def getPicker(): Dialog | Popover | /*TODO Type: 'null' not found.*/ = js.native
  def getPickerInvisibleTextId(): String = js.native
//  def getPickerTextField(): ComboBoxTextField | Input | /*TODO Type: 'null' not found.*/ = js.native
  def getPickerType(): String = js.native
  def indexOfItem(oItem: Item): Int = js.native
  def insertItem(oItem: Item, iIndex: Int): this.type = js.native
  def isOpen(): Boolean = js.native
  def open(): this.type = js.native
  def removeAllItems(): js.Array[Item] = js.native
  def removeItem(vItem: Int | String | Item): Item = js.native
  def setPickerType(sPickerType: String): Unit = js.native
  def unbindItems(): this.type = js.native
}
     