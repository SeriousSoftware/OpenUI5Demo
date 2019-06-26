package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5._
import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.Token")
@js.native
class Token() extends EditableProp with SelectedProp with TextProp {
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
//  def attachDelete(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachDeselect(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def attachSelect(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachDelete(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachDeselect(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachSelect(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireDelete(mParameters: Object): this.type = js.native
//  def fireDeselect(mParameters: Object): this.type = js.native
//  def firePress(mParameters: Object): this.type = js.native
//  def fireSelect(mParameters: Object): this.type = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
//  def getEditable(): Boolean = js.native
  def getKey(): String = js.native
//  def getMetadata(): Metadata = js.native
//  def getSelected(): Boolean = js.native
//  def getText(): String = js.native
  def getTextDirection(): TextDirection = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
//  def setEditable(bEditable: Boolean): this.type = js.native
  def setKey(sKey: String): this.type = js.native
//  def setSelected(bSelected: Boolean): this.type = js.native
//  def setText(sText: String): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
}