package com.sap.scala.facades.openui5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("jQuery.sap.util.ResourceBundle")
@js.native
class ResourceBundle extends js.Any {
  def getText(key: String, args: js.Array[String]): String = js.native
  def getText(key: String): String = js.native
  def hasText(key: String): Boolean = js.native
}
