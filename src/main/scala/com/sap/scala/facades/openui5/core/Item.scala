
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.core.TextDirection


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.core.Item")
@js.native
class Item() extends Element {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getEnabled(): Boolean = js.native
  def getKey(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getText(): String = js.native
  def getTextDirection(): TextDirection = js.native
  def setEnabled(bEnabled: Boolean): this.type = js.native
  def setKey(sKey: String): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
}
     