package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.m.MessageToast.html
  */
@JSGlobal("sap.m.MessageToast")
@js.native
object MessageToast extends js.Any {
  def show(message: String): Unit = js.native
  def show(message: String, options: js.Dictionary[Any]): Unit = js.native
}