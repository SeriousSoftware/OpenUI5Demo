
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{ID,URI,ValueState,Control,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ObjectStatus")
@js.native
class ObjectStatus() extends Control {
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getIcon(): URI = js.native
  def getIconDensityAware(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def getState(): ValueState = js.native
  def getText(): String = js.native
  def getTextDirection(): TextDirection = js.native
  def getTitle(): String = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setIconDensityAware(bIconDensityAware: Boolean): this.type = js.native
  def setState(sState: ValueState): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
}
     