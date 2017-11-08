
package com.sap.scala.facades.openui5.layout

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{Control,TitleLevel,HorizontalAlign}
//import com.sap.scala.facades.openui5.layout.{BlockLayoutCellColorSet,BlockLayoutCellColorShade}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.BlockLayoutCell")
@js.native
class BlockLayoutCell() extends Control {
  def addContent(oContent: Control): this.type = js.native
  def destroyContent(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getBackgroundColorSet(): BlockLayoutCellColorSet = js.native
//  def getBackgroundColorShade(): BlockLayoutCellColorShade = js.native
  def getContent(): js.Array[Control] = js.native
//  def getMetadata(): Metadata = js.native
  def getTitle(): String = js.native
  def getTitleAlignment(): HorizontalAlign = js.native
  def getTitleLevel(): TitleLevel = js.native
  def getWidth(): Int = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
//  def setBackgroundColorSet(sBackgroundColorSet: BlockLayoutCellColorSet): this.type = js.native
//  def setBackgroundColorShade(sBackgroundColorShade: BlockLayoutCellColorShade): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
  def setTitleAlignment(sTitleAlignment: HorizontalAlign): this.type = js.native
  def setTitleLevel(sTitleLevel: TitleLevel): this.type = js.native
}
     