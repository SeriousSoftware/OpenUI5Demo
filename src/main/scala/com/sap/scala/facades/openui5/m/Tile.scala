package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.Tile")
@js.native
class Tile() extends Control {
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): this.type = js.native
//  def getMetadata(): Metadata = js.native
  def getRemovable(): Boolean = js.native
  def setRemovable(bRemovable: Boolean): this.type = js.native
}