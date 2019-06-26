package com.sap.scala.facades.openui5.m
//import com.sap.scala.facades.openui5.m.BarDesign
import com.sap.scala.facades.openui5.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


/* Interface for Bar, OverflowToolbar and Toolbar
 * https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.m.IBar.html
 */
@js.native
trait IBar extends Control

@JSGlobal("sap.m.Bar")
@js.native
class Bar() extends IBar {
//  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native

  def addContentLeft(oContentLeft: Control): this.type = js.native
  def addContentMiddle(oContentMiddle: Control): this.type = js.native
  def addContentRight(oContentRight: Control): this.type = js.native

  def destroyContentLeft(): this.type = js.native
  def destroyContentMiddle(): this.type = js.native
  def destroyContentRight(): this.type = js.native

//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native

//  def getAriaLabelledBy(): js.Array[ID] = js.native

  def getContentLeft(): js.Array[Control] = js.native
  def getContentMiddle(): js.Array[Control] = js.native
  def getContentRight(): js.Array[Control] = js.native

  def getDesign(): BarDesign = js.native
//  def getEnableFlexBox(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
//  def getTranslucent(): Boolean = js.native

  def indexOfContentLeft(oContentLeft: Control): Int = js.native
  def indexOfContentMiddle(oContentMiddle: Control): Int = js.native
  def indexOfContentRight(oContentRight: Control): Int = js.native

  def insertContentLeft(oContentLeft: Control, iIndex: Int): this.type = js.native
  def insertContentMiddle(oContentMiddle: Control, iIndex: Int): this.type = js.native
  def insertContentRight(oContentRight: Control, iIndex: Int): this.type = js.native

//  def removeAllAriaLabelledBy(): js.Array[ID] = js.native

  def removeAllContentLeft(): js.Array[Control] = js.native
  def removeAllContentMiddle(): js.Array[Control] = js.native
  def removeAllContentRight(): js.Array[Control] = js.native

//  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native

//  def removeContentLeft(vContentLeft: Int | String | Control): Control = js.native
//  def removeContentMiddle(vContentMiddle: Int | String | Control): Control = js.native
//  def removeContentRight(vContentRight: Int | String | Control): Control = js.native

  def setDesign(sDesign: BarDesign): this.type = js.native
//  def setEnableFlexBox(bEnableFlexBox: Boolean): this.type = js.native
//  def setTranslucent(bTranslucent: Boolean): this.type = js.native
}