
package com.sap.scala.facades.openui5.layout

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.Control


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.HorizontalLayout")
@js.native
class HorizontalLayout() extends Control {
  def addContent(oContent: Control): this.type = js.native
  def destroyContent(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getAllowWrapping(): Boolean = js.native
  def getContent(): js.Array[Control] = js.native
//  def getMetadata(): Metadata = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
  def setAllowWrapping(bAllowWrapping: Boolean): this.type = js.native
}
     