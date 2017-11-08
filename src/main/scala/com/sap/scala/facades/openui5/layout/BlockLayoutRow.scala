
package com.sap.scala.facades.openui5.layout

//import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core._
//import com.sap.scala.facades.openui5.layout.{BlockRowColorSets,BlockLayoutCell}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.BlockLayoutRow")
@js.native
class BlockLayoutRow() extends Control {
  def addAccentCell(vAccentCell: ID | BlockLayoutCell): this.type = js.native
  def addContent(oContent: BlockLayoutCell): this.type = js.native
  def destroyContent(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getAccentCells(): js.Array[ID] = js.native
  def getContent(): js.Array[BlockLayoutCell] = js.native
//  def getMetadata(): Metadata = js.native
  def getRowColorSet(): BlockRowColorSets = js.native
  def getScrollable(): Boolean = js.native
  def indexOfContent(oContent: BlockLayoutCell): Int = js.native
  def insertContent(oContent: BlockLayoutCell, iIndex: Int): this.type = js.native
  def removeAccentCell(vAccentCell: Int | ID | BlockLayoutCell): ID = js.native
  def removeAllAccentCells(): js.Array[ID] = js.native
  def removeAllContent(): js.Array[BlockLayoutCell] = js.native
  def removeContent(vContent: Int | String | BlockLayoutCell): BlockLayoutCell = js.native
  def setScrollable(bScrollable: Boolean): this.type = js.native
}
     