package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
//import com.sap.scala.facades.openui5.m.Text
import com.sap.scala.facades.openui5.core.{CSSSize, Wrapping}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.TextArea")
@js.native
class TextArea() extends InputBase {
  def attachLiveChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachLiveChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireLiveChange(mParameters: Object): this.type = js.native
  def getCols(): Int = js.native
  def getGrowing(): Boolean = js.native
  def getGrowingMaxLines(): Int = js.native
  def getHeight(): CSSSize = js.native
  def getMaxLength(): Int = js.native
//  def getMetadata(): Metadata = js.native
  def getRows(): Int = js.native
  def getShowExceededText(): Boolean = js.native
  def getValueLiveUpdate(): Boolean = js.native
  def getWrapping(): Wrapping = js.native
  def setCols(iCols: Int): this.type = js.native
  def setGrowing(bGrowing: Boolean): this.type = js.native
  def setGrowingMaxLines(iGrowingMaxLines: Int): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setMaxLength(iMaxLength: Int): this.type = js.native
  def setRows(iRows: Int): this.type = js.native
  def setShowExceededText(bShowExceededText: Boolean): this.type = js.native
  def setValueLiveUpdate(bValueLiveUpdate: Boolean): this.type = js.native
  def setWrapping(sWrapping: Wrapping): this.type = js.native
}