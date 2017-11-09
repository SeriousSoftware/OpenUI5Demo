
package com.sap.scala.facades.openui5.base

//import com.sap.scala.facades.openui5.base.Metadata


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.base.EventProvider")
@js.native
abstract class EventProvider extends js.Object {
  def attachEvent(sEventId: String, oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native

  def attachEventOnce(sEventId: String, fnFunction: js.Function1[Event[EventProps], Unit]): this.type = js.native

  def destroy() : Unit = js.native

  def detachEvent(sEventId: String, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)              : this.type           = js.native
  def fireEvent  (sEventId: String, mParameters: Object, bAllowPreventDefault: Boolean, bEnableEventBubbling: Boolean) : this.type | Boolean = js.native

  def getEventingParent()            : EventProvider = js.native
  def hasListeners(sEventId: String) : Boolean       = js.native

  override def toString() : String = js.native
}
     