package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.core.{BackgroundDesign, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.layout.form.FormLayout")
@js.native
class FormLayout() extends Control {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getBackgroundDesign(): BackgroundDesign = js.native
//  def getMetadata(): Metadata = js.native
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): this.type = js.native
}