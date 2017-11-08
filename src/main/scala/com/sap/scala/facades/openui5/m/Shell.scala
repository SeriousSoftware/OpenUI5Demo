
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{URI,Control,TitleLevel,CSSColor}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Shell")
@js.native
class Shell() extends Control {
  def attachLogout(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyApp(): this.type = js.native
  def detachLogout(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireLogout(mParameters: Object): this.type = js.native
  def getApp(): Control = js.native
  def getAppWidthLimited(): Boolean = js.native
  def getBackgroundColor(): CSSColor = js.native
  def getBackgroundImage(): URI = js.native
  def getBackgroundOpacity(): Float = js.native
  def getBackgroundRepeat(): Boolean = js.native
  def getHeaderRightText(): String = js.native
  def getHomeIcon(): Object = js.native
  def getLogo(): URI = js.native
//  def getMetadata(): Metadata = js.native
  def getShowLogout(): Boolean = js.native
  def getTitle(): String = js.native
  def getTitleLevel(): TitleLevel = js.native
  def setApp(oApp: Control): this.type = js.native
  def setAppWidthLimited(bAppWidthLimited: Boolean): this.type = js.native
  def setBackgroundColor(sBackgroundColor: CSSColor): this.type = js.native
  def setBackgroundImage(sBackgroundImage: URI): this.type = js.native
  def setBackgroundOpacity(fBackgroundOpacity: Float): this.type = js.native
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): this.type = js.native
  def setHeaderRightText(sHeaderRightText: String): this.type = js.native
  def setHomeIcon(oHomeIcon: Object): this.type = js.native
  def setLogo(sLogo: URI): this.type = js.native
  def setShowLogout(bShowLogout: Boolean): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
  def setTitleLevel(sTitleLevel: TitleLevel): this.type = js.native
}
     