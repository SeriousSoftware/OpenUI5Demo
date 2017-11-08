
package com.sap.scala.facades.openui5.core


import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.core.HTML.html
  */
@JSGlobal("sap.ui.core.HTML")
@js.native
class HTML() extends Control {
  override def getDomRef(sSuffix: String = ""): org.scalajs.dom.Element = js.native
  def attachAfterRendering(oData: Any, fnFunction: js.Function0[Any]): Unit = js.native
  def setContent(content: String): this.type = js.native
  def getContent(): String = js.native
}
     