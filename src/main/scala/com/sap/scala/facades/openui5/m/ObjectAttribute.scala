
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{Control,TextDirection}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ObjectAttribute")
@js.native
class ObjectAttribute() extends Control {
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyCustomContent(): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def firePress(mParameters: Object): this.type = js.native
  def getActive(): Boolean = js.native
  def getCustomContent(): Control = js.native
//  def getMetadata(): Metadata = js.native
//  def getPopupAnchorDomRef(): /*TODO Type: 'DomNode' not found.*/ = js.native
  def getText(): String = js.native
  def getTextDirection(): TextDirection = js.native
  def getTitle(): String = js.native
  def setActive(bActive: Boolean): this.type = js.native
  def setCustomContent(oCustomContent: Control): this.type = js.native
  def setText(sText: String): this.type = js.native
  def setTextDirection(sTextDirection: TextDirection): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
}
     