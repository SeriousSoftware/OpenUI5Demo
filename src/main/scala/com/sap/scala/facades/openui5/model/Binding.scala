
package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.base.{EventProvider, Event, EventProps}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.model.Binding")
@js.native
class Binding() extends EventProvider {
  def attachAggregatedDataStateChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachDataReceived(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachDataRequested(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachDataStateChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachEvents(oEvents: Object): Unit = js.native
  def attachRefresh(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def destroy(): Unit = js.native
  def detachAggregatedDataStateChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachDataReceived(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachDataRequested(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachDataStateChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachEvents(oEvents: Object): Unit = js.native
  def detachRefresh(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireDataReceived(mArguments: /*TODO Type: 'Map' not found.*/): Unit = js.native
//  def fireDataRequested(mArguments: /*TODO Type: 'Map' not found.*/): Unit = js.native
//  def getMetadata(): Metadata = js.native
  def initialize(): Unit = js.native
  def isInitial(): Boolean = js.native
  def isRelative(): Boolean = js.native
  def isSuspended(): Boolean = js.native
  def refresh(bForceUpdate: Boolean): Unit = js.native
  def resume(): Unit = js.native
  def suspend(): Unit = js.native
  def updateRequired(oModel: Object): Boolean = js.native
}
     