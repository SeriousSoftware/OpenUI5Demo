package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.TextProp
//import com.sap.scala.facades.openui5.m.LabelDesign
import com.sap.scala.facades.openui5.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.Label")
@js.native
class Label() extends Control with TextProp {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getDesign(): LabelDesign = js.native
//  def getLabelFor(): ID = js.native
//  def getMetadata(): Metadata = js.native
  def getRequired(): Boolean = js.native
//  def getText(): String = js.native
//  def getTextAlign(): TextAlign = js.native
//  def getTextDirection(): TextDirection = js.native
//  def getWidth(): CSSSize = js.native
//  def setDesign(sDesign: LabelDesign): this.type = js.native
// def setLabelFor(oLabelFor: ID | Control): this.type = js.native
  def setLabelFor(oLabelFor: String): this.type = js.native
//  def setRequired(bRequired: Boolean): this.type = js.native
//  def setText(sText: String): this.type = js.native
//  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
//  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
//  def setWidth(sWidth: CSSSize): this.type = js.native
}