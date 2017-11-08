
package com.sap.scala.facades.openui5.layout

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.Control
//import com.sap.scala.facades.openui5.layout.{BlockBackgroundType,BlockLayoutRow}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.BlockLayout")
@js.native
class BlockLayout() extends Control {
  def addContent(oContent: BlockLayoutRow): this.type = js.native
  def destroyContent(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getBackground(): BlockBackgroundType = js.native
  def getContent(): js.Array[BlockLayoutRow] = js.native
//  def getMetadata(): Metadata = js.native
  def indexOfContent(oContent: BlockLayoutRow): Int = js.native
  def insertContent(oContent: BlockLayoutRow, iIndex: Int): this.type = js.native
  def removeAllContent(): js.Array[BlockLayoutRow] = js.native
  def removeContent(vContent: Int | String | BlockLayoutRow): BlockLayoutRow = js.native
  def setBackground(sNewBackground: String): this.type = js.native
}
     