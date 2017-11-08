
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core._
import com.sap.scala.facades.openui5._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

//@JSGlobal("sap.m.InputBase")
//@js.native
//class InputBase() extends Control {
//  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
//  def applyFocusInfo(oFocusInfo: Object): Unit = js.native
//  def attachChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def bindToInputEvent(fnCallback: js.Function1[Event[EventProps], Unit]): this.type = js.native
//  def bindValue(oBindingInfo: Object): this.type = js.native
//  def closeValueStateMessage(): Unit = js.native
//  def detachChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireChange(mParameters: Object): this.type = js.native
////  def fireChangeEvent(sValue: /*TODO Type: 'String' not found.*/, oParams: /*TODO Type: 'Object' not found.*/): Unit = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getAriaLabelledBy(): js.Array[ID] = js.native
//  def getDomRefForValueStateMessage(): Object = js.native
//  def getEditable(): Boolean = js.native
//  def getEnabled(): Boolean = js.native
//  def getFocusInfo(): Object = js.native
//  def getLabels(): js.Array[Label] = js.native
//  def getMetadata(): Metadata = js.native
//  def getName(): String = js.native
//  def getPlaceholder(): String = js.native
//  def getRequired(): Boolean = js.native
//  def getSelectedText(): String = js.native
//  def getShowValueStateMessage(): Boolean = js.native
//  def getTextAlign(): TextAlign = js.native
//  def getTextDirection(): TextDirection = js.native
//  def getValue(): String = js.native
//  def getValueState(): ValueState = js.native
//  def getValueStateText(): String = js.native
//  def getWidth(): CSSSize = js.native
////  def onChange(oEvent: Object, mParameters: Object): /*TODO Type: 'true' not found.*/ | /*TODO Type: 'undefined' not found.*/ = js.native
////  def onValueRevertedByEscape(sValue: /*TODO Type: 'String' not found.*/): Unit = js.native
//  def openValueStateMessage(): Unit = js.native
////  def preventChangeOnFocusLeave(oEvent: /*TODO Type: 'jQuery.Event' not found.*/): Boolean = js.native
//  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
//  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
//  def selectText(iSelectionStart: Int, iSelectionEnd: Int): this.type = js.native
//  def setEditable(bEditable: Boolean): this.type = js.native
//  def setEnabled(bEnabled: Boolean): this.type = js.native
//  def setName(sName: String): this.type = js.native
//  def setPlaceholder(sPlaceholder: String): this.type = js.native
//  def setRequired(bRequired: Boolean): this.type = js.native
//  def setShowValueStateMessage(bShowValueStateMessage: Boolean): this.type = js.native
//  def setTextAlign(sTextAlign: TextAlign): this.type = js.native
//  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
//  def setValue(sValue: String): this.type = js.native
//  def setValueState(sValueState: ValueState): this.type = js.native
//  def setValueStateText(sText: String): this.type = js.native
//  def setWidth(sWidth: CSSSize): this.type = js.native
//  def unbindValue(): this.type = js.native
//  def updateDomValue(sValue: String): this.type = js.native
//}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.m.InputBase.html
  */
@JSGlobal("sap.m.InputBase")
@js.native
abstract class InputBase extends Control with EnabledProp with EditableProp with StringValueProp with NameProp with PlaceholderProp {
  self =>
  def setValueState(sValueState: ValueState): InputBase = js.native
  def setValueStateText(msg: String): InputBase = js.native
  def fireChange(): self.type = js.native
  def getValueState(): ValueState = js.native
}