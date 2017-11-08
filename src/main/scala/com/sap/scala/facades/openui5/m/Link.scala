
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{ID,CSSSize,URI,Control,TextAlign,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Link")
@js.native
class Link() extends Control {
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): Boolean = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getEmphasized(): Boolean = js.native
  def getEnabled(): Boolean = js.native
  def getHref(): URI = js.native
//  def getMetadata(): Metadata = js.native
  def getSubtle(): Boolean = js.native
  def getTarget(): String = js.native
  def getText(): String = js.native
  def getTextAlign(): TextAlign = js.native
  def getTextDirection(): TextDirection = js.native
  def getWidth(): CSSSize = js.native
  def getWrapping(): Boolean = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def setEmphasized(bEmphasized: Boolean): this.type = js.native
  def setEnabled(bEnabled: Boolean): this.type = js.native
  def setHref(sHref: URI): this.type = js.native
  def setSubtle(bSubtle: Boolean): this.type = js.native
  def setTarget(sTarget: String): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def setWrapping(bWrapping: Boolean): this.type = js.native
}
     