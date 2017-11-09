
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{Control,CSSSize,TextAlign,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Text")
@js.native
class Text() extends Control {
  def bindText(oBindingInfo: BindingInfo): this.type = js.native
//  def clampHeight(oDomRef: /*TODO Type: 'HTMLElement' not found.*/): /*TODO Type: 'Number' not found.*/ = js.native
//  def clampText(oDomRef: /*TODO Type: 'HTMLElement' not found.*/, iStartPos: /*TODO Type: 'number' not found.*/, iEndPos: /*TODO Type: 'number' not found.*/): /*TODO Type: 'number' not found.*/ | /*TODO Type: 'undefined' not found.*/ = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getClampHeight(oDomRef: /*TODO Type: 'HTMLElement' not found.*/): /*TODO Type: 'Number' not found.*/ = js.native
//  def getLineHeight(oDomRef: /*TODO Type: 'HTMLElement' not found.*/): /*TODO Type: 'Number' not found.*/ = js.native
  def getMaxLines(): Int = js.native
//  def getMetadata(): Metadata = js.native
  def getText(): String = js.native
  def getTextAlign(): TextAlign = js.native
  def getTextDirection(): TextDirection = js.native
//  def getTextDomRef(): /*TODO Type: 'HTMLElement' not found.*/ | /*TODO Type: 'null' not found.*/ = js.native
  def getWidth(): CSSSize = js.native
  def getWrapping(): Boolean = js.native
//  def hasMaxLines(): /*TODO Type: 'HTMLElement' not found.*/ | /*TODO Type: 'null' not found.*/ = js.native
  def setMaxLines(iMaxLines: Int): this.type = js.native
//  def setNodeValue(oDomRef: /*TODO Type: 'HTMLElement' not found.*/, sNodeValue: /*TODO Type: 'String' not found.*/): Unit = js.native
  def setText(sText: String): this.type = js.native
  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def setWrapping(bWrapping: Boolean): this.type = js.native
  def unbindText(): this.type = js.native
}
     