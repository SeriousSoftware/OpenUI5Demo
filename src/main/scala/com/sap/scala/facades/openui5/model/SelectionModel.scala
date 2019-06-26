package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.base.{Event, EventProps, EventProvider}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.model.SelectionModel")
@js.native
class SelectionModel() extends EventProvider {
  def addSelectionInterval(iFromIndex: Int, iToIndex: Int): this.type = js.native
  def attachSelectionChanged(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def clearSelection(): this.type = js.native
  def detachSelectionChanged(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireSelectionChanged(mArguments: Object): this.type = js.native
  def getLeadSelectedIndex(): Int = js.native
//  def getMetadata(): Metadata = js.native
//  def getSelectedIndices(): /*TODO Type: 'int[]' not found.*/ = js.native
  def getSelectionMode(): Int = js.native
  def isSelectedIndex(iIndex: Int): Boolean = js.native
  def moveSelectionInterval(iStartIndex: Int, iMove: Int): this.type = js.native
  def removeSelectionInterval(iFromIndex: Int, iToIndex: Int): this.type = js.native
  def selectAll(iToIndex: Int): this.type = js.native
  def setSelectionInterval(iFromIndex: Int, iToIndex: Int): this.type = js.native
  def setSelectionMode(iSelectionMode: Int): Unit = js.native
  def sliceSelectionInterval(iFromIndex: Int, iToIndex: Int): this.type = js.native
}