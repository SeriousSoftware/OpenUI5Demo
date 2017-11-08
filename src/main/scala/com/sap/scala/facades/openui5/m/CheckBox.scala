
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.Label
import com.sap.scala.facades.openui5.core.{ID,CSSSize,ValueState,Control,TextAlign,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.CheckBox")
@js.native
class CheckBox() extends Control {
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def attachSelect(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSelect(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireSelect(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getActiveHandling(): Boolean = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getEditable(): Boolean = js.native
  def getEnabled(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def getName(): String = js.native
  def getSelected(): Boolean = js.native
  def getTabIndex(): Int = js.native
  def getText(): String = js.native
  def getTextAlign(): TextAlign = js.native
  def getTextDirection(): TextDirection = js.native
  def getValueState(): ValueState = js.native
  def getWidth(): CSSSize = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def setActiveHandling(bActiveHandling: Boolean): this.type = js.native
  def setEditable(bEditable: Boolean): this.type = js.native
  def setEnabled(bEnabled: Boolean): this.type = js.native
  def setName(sName: String): this.type = js.native
  def setTabIndex(iTabIndex: Int): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setValueState(sValueState: ValueState): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}
     