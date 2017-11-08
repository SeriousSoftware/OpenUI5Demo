
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.core.{CSSSize,URI,Control}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.core.Icon")
@js.native
class Icon() extends Control {
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getActiveBackgroundColor(): String = js.native
  def getActiveColor(): String = js.native
  def getAlt(): String = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getBackgroundColor(): String = js.native
  def getColor(): String = js.native
  def getDecorative(): Boolean = js.native
  def getHeight(): CSSSize = js.native
  def getHoverBackgroundColor(): String = js.native
  def getHoverColor(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getNoTabStop(): Boolean = js.native
  def getSize(): CSSSize = js.native
  def getSrc(): URI = js.native
  def getUseIconTooltip(): Boolean = js.native
  def getWidth(): CSSSize = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def setActiveBackgroundColor(sActiveBackgroundColor: String): this.type = js.native
  def setActiveColor(sActiveColor: String): this.type = js.native
  def setAlt(sAlt: String): this.type = js.native
  def setBackgroundColor(sBackgroundColor: String): this.type = js.native
  def setColor(sColor: String): this.type = js.native
  def setDecorative(bDecorative: Boolean): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setHoverBackgroundColor(sHoverBackgroundColor: String): this.type = js.native
  def setHoverColor(sHoverColor: String): this.type = js.native
  def setNoTabStop(bNoTabStop: Boolean): this.type = js.native
  def setSize(sSize: CSSSize): this.type = js.native
  def setSrc(sSrc: URI): this.type = js.native
  def setUseIconTooltip(bUseIconTooltip: Boolean): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}
     