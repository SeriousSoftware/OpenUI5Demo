package com.sap.scala.facades.openui5.layout

import com.sap.scala.facades.openui5.core.{CSSSize, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.ui.layout.Grid")
@js.native
class Grid() extends Control {
//  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addContent(oContent: Control): this.type = js.native
  def destroyContent(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getAccessibilityInfo(): Unit = js.native
//  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getContainerQuery(): Boolean = js.native
  def getContent(): js.Array[Control] = js.native
  def getDefaultIndent(): GridIndent = js.native
  def getDefaultSpan(): GridSpan = js.native
  def getHSpacing(): Float = js.native
//  def getMetadata(): Metadata = js.native
  def getPosition(): GridPosition = js.native
  def getVSpacing(): Float = js.native
  def getWidth(): CSSSize = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
//  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllContent(): js.Array[Control] = js.native
//  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
  def setContainerQuery(bContainerQuery: Boolean): this.type = js.native
  def setDefaultIndent(sDefaultIndent: GridIndent): this.type = js.native
  def setDefaultSpan(sDefaultSpan: GridSpan): this.type = js.native
  def setHSpacing(fHSpacing: Float): this.type = js.native
  def setPosition(sPosition: GridPosition): this.type = js.native
  def setVSpacing(fVSpacing: Float): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}