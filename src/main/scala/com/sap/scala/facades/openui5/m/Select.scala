
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{Popover,SelectType,Dialog}
import com.sap.scala.facades.openui5.core._


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Select")
@js.native
class Select() extends Control {
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addItem(oItem: Item): this.type = js.native
  def attachChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindItems(oBindingInfo: Object): this.type = js.native
  def close(): this.type = js.native
//  def createPicker(sPickerType: String): Popover | Dialog = js.native
  def destroyItems(): this.type = js.native
  def detachChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireChange(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getAutoAdjustWidth(): Boolean = js.native
  def getEnabled(): Boolean = js.native
  def getEnabledItems(aItems: js.Array[Item]): js.Array[Item] = js.native
//  def getFirstItem(): Item | /*TODO Type: 'null' not found.*/ = js.native
  def getForceSelection(): Boolean = js.native
  def getIcon(): URI = js.native
//  def getItemAt(iIndex: Int): Item | /*TODO Type: 'null' not found.*/ = js.native
//  def getItemByKey(sKey: String): Item | /*TODO Type: 'null' not found.*/ = js.native
  def getItems(): js.Array[Item] = js.native
//  def getLastItem(): Item | /*TODO Type: 'null' not found.*/ = js.native
  def getMaxWidth(): CSSSize = js.native
//  def getMetadata(): Metadata = js.native
//  def getName(): String = js.native
//  def getSelectedItem(): Item | /*TODO Type: 'null' not found.*/ = js.native
  def getSelectedItemId(): String = js.native
  def getSelectedKey(): String = js.native
  def getShowSecondaryValues(): Boolean = js.native
  def getTextAlign(): TextAlign = js.native
  def getTextDirection(): TextDirection = js.native
//  def getType(): SelectType = js.native
  def getValueState(): ValueState = js.native
  def getValueStateText(): String = js.native
  def getWidth(): CSSSize = js.native
  def indexOfItem(oItem: Item): Int = js.native
  def insertItem(oItem: Item, iIndex: Int): this.type = js.native
  def isOpen(): Boolean = js.native
  def open(): this.type = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllItems(): js.Array[Item] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeItem(vItem: Int | String | Item): Item = js.native
  def setAutoAdjustWidth(bAutoAdjustWidth: Boolean): this.type = js.native
  def setEnabled(bEnabled: Boolean): this.type = js.native
  def setForceSelection(bForceSelection: Boolean): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setMaxWidth(sMaxWidth: CSSSize): this.type = js.native
  def setName(sName: String): this.type = js.native
//  def setSelectedItem(vItem: String | Item | /*TODO Type: 'null' not found.*/): this.type = js.native
//  def setSelectedItemId(vItem: String | /*TODO Type: 'undefined' not found.*/): this.type = js.native
  def setSelectedKey(sKey: String): this.type = js.native
  def setShowSecondaryValues(bShowSecondaryValues: Boolean): this.type = js.native
  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
//  def setType(sType: SelectType): this.type = js.native
  def setValueState(sValueState: ValueState): this.type = js.native
  def setValueStateText(sValueStateText: String): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def unbindItems(): this.type = js.native
}
     