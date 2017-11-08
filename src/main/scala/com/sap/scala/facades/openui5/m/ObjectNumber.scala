
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{ID,ValueState,Control,TextAlign,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ObjectNumber")
@js.native
class ObjectNumber() extends Control {
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getEmphasized(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def getNumber(): String = js.native
  def getNumberUnit(): String = js.native
  def getState(): ValueState = js.native
  def getTextAlign(): TextAlign = js.native
  def getTextDirection(): TextDirection = js.native
  def getUnit(): String = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def setEmphasized(bEmphasized: Boolean): this.type = js.native
  def setNumber(sNumber: String): this.type = js.native
  def setNumberUnit(sNumberUnit: String): this.type = js.native
  def setState(sState: ValueState): this.type = js.native
  def setTextAlign(sAlign: TextAlign): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setUnit(sUnit: String): this.type = js.native
}
     