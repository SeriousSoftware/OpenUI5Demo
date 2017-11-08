package com.sap.scala.facades.openui5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("sap.ui")
object ui extends js.Object {
  def getCore(): core.Core = js.native
}
