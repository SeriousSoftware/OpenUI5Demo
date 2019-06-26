package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.core.LayoutData

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.layout.form.GridElementData")
@js.native
class GridElementData() extends LayoutData {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getHCells(): GridElementCells = js.native
//  def getMetadata(): Metadata = js.native
//  def getVCells(): Int = js.native
  def setHCells(sHCells: String = "auto"): this.type = js.native
  def setVCells(iVCells: Int = 1)        : this.type = js.native
}