
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.URI


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.App")
@js.native
class App() extends NavContainer {
//  def attachOrientationChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachOrientationChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireOrientationChange(mParameters: Object): this.type = js.native
  def getBackgroundColor(): String = js.native
  def getBackgroundImage(): URI = js.native
  def getBackgroundOpacity(): Float = js.native
  def getBackgroundRepeat(): Boolean = js.native
//  def getHomeIcon(): /*TODO Type: 'any' not found.*/ = js.native
//  def getMetadata(): Metadata = js.native
  def setBackgroundColor(sBackgroundColor: String): this.type = js.native
  def setBackgroundImage(sBackgroundImage: URI): this.type = js.native
  def setBackgroundOpacity(fBackgroundOpacity: Float): this.type = js.native
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): this.type = js.native
//  def setHomeIcon(oHomeIcon: /*TODO Type: 'any' not found.*/): this.type = js.native
}
     