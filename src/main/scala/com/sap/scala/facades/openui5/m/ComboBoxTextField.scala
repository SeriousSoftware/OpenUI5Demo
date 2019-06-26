package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core.CSSSize

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.ComboBoxTextField")
@js.native
class ComboBoxTextField() extends InputBase {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getMaxWidth(): CSSSize = js.native
//  def getMetadata(): Metadata = js.native
  def getShowButton(): Boolean = js.native
//  def getValue(): String = js.native
  def setMaxWidth(sMaxWidth: CSSSize): this.type = js.native
  def setShowButton(bShowButton: Boolean): this.type = js.native
}