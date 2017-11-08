
package com.sap.scala.facades.openui5.core.message

import com.sap.scala.facades.openui5.base.{Event, EventProps, EventProvider}
import com.sap.scala.facades.openui5.model.ListBinding


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

//@JSGlobal("sap.ui.core.message.MessageProcessor")
//@js.native
//class MessageProcessor() extends EventProvider {
//  def attachMessageChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def checkMessage(): ListBinding = js.native
//  def destroy(): Unit = js.native
//  def detachMessageChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireMessageChange(mArguments: Object): this.type = js.native
//  def getId(): String = js.native
//  def getMetadata(): Metadata = js.native
////  def setMessages(vMessages: /*TODO Type: 'map' not found.*/): Unit = js.native
//}

@JSGlobal("sap.ui.core.message.MessageProcessor")
@js.native
abstract class MessageProcessor extends EventProvider {
  def attachMessageChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def checkMessage(): ListBinding = js.native
  override def destroy(): Unit = js.native
  def detachMessageChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def fireMessageChange(mArguments: Object): this.type = js.native
  def getId(): String = js.native
  def setMessages(vMessages: Object): Unit = js.native
}
