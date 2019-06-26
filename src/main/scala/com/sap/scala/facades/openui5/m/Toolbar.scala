package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
//import com.sap.scala.facades.openui5.m.{ToolbarDesign,Title}
import com.sap.scala.facades.openui5.core.{CSSSize, Control, ID}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.Toolbar")
@js.native
class Toolbar() extends Control {
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addContent(oContent: Control): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyContent(): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): this.type = js.native
  def getActive(): Boolean = js.native
//  def getActiveDesign(): ToolbarDesign = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getContent(): js.Array[Control] = js.native
//  def getDesign(): ToolbarDesign = js.native
  def getEnabled(): Boolean = js.native
  def getHeight(): CSSSize = js.native
//  def getMetadata(): Metadata = js.native
//  def getTitleControl(): Title | /*TODO Type: 'undefined' not found.*/ = js.native
//  def getTitleId(): /*TODO Type: 'String' not found.*/ = js.native
  def getWidth(): CSSSize = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
  def setActive(bActive: Boolean): this.type = js.native
//  def setDesign(sDesign: ToolbarDesign): this.type = js.native
  def setEnabled(bEnabled: Boolean): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}