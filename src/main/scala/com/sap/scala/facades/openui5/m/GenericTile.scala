package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{Control, URI}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.GenericTile")
@js.native
class GenericTile() extends Control {
  def addTileContent(oTileContent: TileContent): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindTileContent(oBindingInfo: Object): this.type = js.native
  def destroyIcon(): this.type = js.native
  def destroyTileContent(): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): this.type = js.native
  def getBackgroundImage(): URI = js.native
//  def getBoundingRects(): /*TODO Type: 'object[]' not found.*/ = js.native
  def getFailedText(): String = js.native
  def getFrameType(): FrameType = js.native
  def getHeader(): String = js.native
  def getHeaderImage(): URI = js.native
  def getIcon(): Control = js.native
  def getImageDescription(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getMode(): GenericTileMode = js.native
//  def getScope(): GenericTileScope = js.native
  def getSize(): Size = js.native
  def getState(): LoadState = js.native
  def getSubheader(): String = js.native
  def getTileContent(): js.Array[TileContent] = js.native
  def indexOfTileContent(oTileContent: TileContent): Int = js.native
  def insertTileContent(oTileContent: TileContent, iIndex: Int): this.type = js.native
  def removeAllTileContent(): js.Array[TileContent] = js.native
  def removeTileContent(vTileContent: Int | String | TileContent): TileContent = js.native
  def setBackgroundImage(sBackgroundImage: URI): this.type = js.native
  def setFailedText(sFailedText: String): this.type = js.native
  def setFrameType(sFrameType: FrameType): this.type = js.native
  def setHeader(sHeader: String): this.type = js.native
  def setHeaderImage(sHeaderImage: URI): this.type = js.native
  def setIcon(oIcon: Control): this.type = js.native
  def setImageDescription(sImageDescription: String): this.type = js.native
  def setMode(sMode: GenericTileMode): this.type = js.native
  def setPressEnabled(value: Boolean): Unit = js.native
//  def setScope(sScope: GenericTileScope): this.type = js.native
  def setSize(sSize: Size): this.type = js.native
  def setState(sState: LoadState): this.type = js.native
  def setSubheader(sSubheader: String): this.type = js.native
  def showActionsView(value: Boolean): Unit = js.native
  def unbindTileContent(): this.type = js.native
}