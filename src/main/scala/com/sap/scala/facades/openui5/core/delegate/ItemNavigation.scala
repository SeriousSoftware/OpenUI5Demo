package com.sap.scala.facades.openui5.core.delegate

import com.sap.scala.facades.openui5.base.{Event, EventProps, EventProvider}
import org.scalajs.dom.{Element => DOMElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.core.delegate.ItemNavigation")
@js.native
class ItemNavigation() extends EventProvider {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getDisabledModifiers(oDisabledModifiers: Object): Object = js.native
//  def getItemDomRefs(): /*TODO Type: 'Element[]' not found.*/ = js.native
//  def getMetadata(): Metadata = js.native
  def getRootDomRef(): DOMElement = js.native
  def hasDisabledModifier(oEvent: org.scalajs.jquery.JQueryEventObject): Boolean = js.native
  def setColumns(iColumns: Int, bNoColumnChange: Boolean): this.type = js.native
  def setCycling(bCycling: Boolean): this.type = js.native
  def setDisabledModifiers(oDisabledModifiers: js.Object): this.type = js.native
  def setHomeEndColumnMode(bStayInRow: Boolean, bCtrlEnabled: Boolean): this.type = js.native
  def setItemDomRefs(aItemDomRefs: DOMElement): this.type = js.native
  def setPageSize(iPageSize: Int): this.type = js.native
  def setRootDomRef(oDomRef: Object): this.type = js.native
  def setSelectedIndex(iIndex: Int): this.type = js.native
  def setTableMode(bTableMode: Boolean, bTableList: Boolean): this.type = js.native
}