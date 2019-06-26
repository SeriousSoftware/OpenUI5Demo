package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.MultiInput")
@js.native
class MultiInput() extends Input {
  def addToken(oToken: Token): this.type = js.native
  def addValidator(fValidator: js.Function1[Event[EventProps], Unit]): Unit = js.native
  def attachTokenChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachTokenUpdate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def clone(): Element = js.native
  def closeMultiLine(): Unit = js.native
  def destroyTokens(): this.type = js.native
  def detachTokenChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachTokenUpdate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireTokenChange(mParameters: Object): this.type = js.native
  def fireTokenUpdate(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getDomRefForValueStateMessage(): /*TODO Type: 'DOMRef' not found.*/ = js.native
  def getEnableMultiLineMode(): Boolean = js.native
  def getMaxTokens(): Int = js.native
//  def getMetadata(): Metadata = js.native
//  def getPopupAnchorDomRef(): /*TODO Type: 'domRef' not found.*/ = js.native
  def getTokens(): js.Array[Token] = js.native
  def indexOfToken(oToken: Token): Int = js.native
  def insertToken(oToken: Token, iIndex: Int): this.type = js.native
//  def onfocusin(oEvent: /*TODO Type: 'jQuery.Event' not found.*/): Unit = js.native
//  def onsapescape(oEvent: /*TODO Type: 'jQuery.Event' not found.*/): Unit = js.native
//  def ontap(oEvent: /*TODO Type: 'jQuery.Event' not found.*/): Unit = js.native
  def openMultiLine(): Unit = js.native
  def removeAllTokens(): js.Array[Token] = js.native
  def removeAllValidators(): Unit = js.native
  def removeToken(vToken: Int | String | Token): Token = js.native
  def removeValidator(fValidator: js.Function1[Event[EventProps], Unit]): Unit = js.native
  def setEnableMultiLineMode(): Unit = js.native
  def setMaxTokens(iMaxTokens: Int): this.type = js.native
  def setTokens(aTokens: js.Array[Token]): this.type = js.native
}