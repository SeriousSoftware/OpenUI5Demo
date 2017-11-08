
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{Link,Text}
import com.sap.scala.facades.openui5.core.{Control,URI,MessageType}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.MessageStrip")
@js.native
class MessageStrip() extends Control {
  def attachClose(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def close(): Unit = js.native
  def destroyLink(): this.type = js.native
  def detachClose(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireClose(mParameters: Object): this.type = js.native
  def getCustomIcon(): URI = js.native
  def getLink(): Link = js.native
//  def getMetadata(): Metadata = js.native
  def getShowCloseButton(): Boolean = js.native
  def getShowIcon(): Boolean = js.native
  def getText(): String = js.native
  def getType(): MessageType = js.native
  def setCustomIcon(sCustomIcon: URI): this.type = js.native
  def setLink(oLink: Link): this.type = js.native
  def setShowCloseButton(bShowCloseButton: Boolean): this.type = js.native
  def setShowIcon(bShowIcon: Boolean): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setType(sType: MessageType): this.type = js.native
}
     