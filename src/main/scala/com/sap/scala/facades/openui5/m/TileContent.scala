package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core.Control


import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal( "sap.m.TileContent")
@js.native
class TileContent() extends Control {
  def bindContent(oBindingInfo: Object): this.type = js.native
  def destroyContent(): this.type = js.native
  //  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: Type: function not found.): Type: function not found. = js.native
  def getContent(): Control = js.native
  def getDisabled(): Boolean = js.native
  def getFooter(): String = js.native
  def getFrameType(): FrameType = js.native
  //  def getMetadata(): Metadata = js.native
  def getSize(): Size = js.native
  def getUnit(): String = js.native
  def setContent(oContent: Control): this.type = js.native
  def setDisabled(bDisabled: Boolean): this.type = js.native
  def setFooter(sFooter: String): this.type = js.native
  def setFrameType(sFrameType: FrameType): this.type = js.native
  def setRenderContent(value: Boolean): this.type = js.native
  def setRenderFooter(value: Boolean): this.type = js.native
  def setSize(sSize: Size): this.type = js.native
  def setUnit(sUnit: String): this.type = js.native
  def unbindContent(): this.type = js.native
}
