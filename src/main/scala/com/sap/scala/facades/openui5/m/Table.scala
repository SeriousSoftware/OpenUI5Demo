
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.BackgroundDesign
//import com.sap.scala.facades.openui5.m.Column


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Table")
@js.native
class Table() extends ListBase {
  def addColumn(oColumn: Column): this.type = js.native
  def destroyColumns(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getBackgroundDesign(): BackgroundDesign = js.native
//  def getColumns(bSort: /*TODO Type: 'Boolean' not found.*/): js.Array[Column] = js.native
  def getFixedLayout(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def getShowOverlay(): Boolean = js.native
  def indexOfColumn(oColumn: Column): Int = js.native
  def insertColumn(oColumn: Column, iIndex: Int): this.type = js.native
  def removeAllColumns(): js.Array[Column] = js.native
  def removeColumn(vColumn: Int | String | Column): Column = js.native
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): this.type = js.native
  def setFixedLayout(bFixedLayout: Boolean): this.type = js.native
  def setShowOverlay(bShowOverlay: Boolean): this.type = js.native
}
     