package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.SplitApp")
@js.native
class SplitApp() extends SplitContainer {
  def _onOrientationChange(): Unit = js.native
  def attachOrientationChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachOrientationChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireOrientationChange(mParameters: Object): this.type = js.native
//  def getHomeIcon(): /*TODO Type: 'any' not found.*/ = js.native
//  def getMetadata(): Metadata = js.native
//  def setHomeIcon(oHomeIcon: /*TODO Type: 'any' not found.*/): this.type = js.native
}