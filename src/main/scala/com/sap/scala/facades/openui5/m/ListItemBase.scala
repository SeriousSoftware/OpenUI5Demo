
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.ListType
import com.sap.scala.facades.openui5.core.{ID,Control,MessageType}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ListItemBase")
@js.native
class ListItemBase() extends Control {
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def attachDetailPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachDetailTap(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachTap(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachDetailPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachDetailTap(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachTap(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireDetailPress(mParameters: Object): this.type = js.native
  def fireDetailTap(mParameters: Object): this.type = js.native
  def firePress(mParameters: Object): this.type = js.native
  def fireTap(mParameters: Object): this.type = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getCounter(): Int = js.native
  def getHighlight(): MessageType = js.native
//  def getMetadata(): Metadata = js.native
  def getMode(): String = js.native
  def getSelected(): Boolean = js.native
//  def getTabbables(): /*TODO Type: 'jQuery' not found.*/ = js.native
  def getType(): ListType = js.native
  def getUnread(): Boolean = js.native
//  def getVisible(): Boolean = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def setCounter(iCounter: Int): this.type = js.native
  def setHighlight(sHighlight: MessageType): this.type = js.native
  def setSelected(bSelected: Boolean): this.type = js.native
  def setType(sType: ListType): this.type = js.native
  def setUnread(bUnread: Boolean): this.type = js.native
//  def setVisible(bVisible: Boolean): this.type = js.native
}
     