
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{Control,VerticalAlign}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ColumnListItem")
@js.native
class ColumnListItem() extends ListItemBase {
  def $Popin(): Unit = js.native
  def addCell(oCell: Control): this.type = js.native
  def bindCells(oBindingInfo: Object): this.type = js.native
  def destroyCells(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getCells(): js.Array[Control] = js.native
//  def getMetadata(): Metadata = js.native
  def getPopin(): Unit = js.native
//  def getTabbables(): /*TODO Type: 'jQuery' not found.*/ = js.native
  def getVAlign(): VerticalAlign = js.native
  def hasPopin(): Unit = js.native
  def indexOfCell(oCell: Control): Int = js.native
  def insertCell(oCell: Control, iIndex: Int): this.type = js.native
  def removeAllCells(): js.Array[Control] = js.native
  def removeCell(vCell: Int | String | Control): Control = js.native
  def removePopin(): Unit = js.native
  def setVAlign(sVAlign: VerticalAlign): this.type = js.native
  def unbindCells(): this.type = js.native
}
     