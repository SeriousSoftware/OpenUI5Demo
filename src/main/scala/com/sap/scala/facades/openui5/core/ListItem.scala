
package com.sap.scala.facades.openui5.core


import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

//@JSGlobal("sap.ui.core.ListItem")
//@js.native
//class ListItem() extends Item {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAdditionalText(): String = js.native
//  def getIcon(): String = js.native
//  def getMetadata(): Metadata = js.native
//  def setAdditionalText(sAdditionalText: String): this.type = js.native
//  def setIcon(sIcon: String): this.type = js.native
//}

@JSGlobal("sap.ui.core.ListItem")
@js.native
class ListItem() extends Control{
  def getKey(): String = js.native
  def getText(): String = js.native
  def getEnabled(): Boolean = js.native

  def setKey(s: String): Unit = js.native
  def setText(s: String): Unit = js.native
  def setEnabled(s: Boolean): Unit = js.native
}

object ListItem {
  def apply(key: String = "",
            text: String = "",
            enabled: Boolean = true,
            customData: js.Array[CustomData] = js.Array[CustomData]()): ListItem = {
    val result = new ListItem()
    result.setKey(key)
    result.setText(text)
    result.setEnabled(enabled)
    customData.foreach(result.addCustomData)
    result
  }
}
