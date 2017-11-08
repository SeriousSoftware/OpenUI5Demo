
package com.sap.scala.facades.openui5.model


import scala.scalajs.js.Object

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.model.Context.html
  */
@JSGlobal("sap.ui.model.Context")
@js.native
abstract class Context extends js.Object {
  def getModel()                  : Model  = js.native
  def getObject(): Object = js.native
  def getObject(sPath : String)   : Object = js.native
  def getPath(sPath : String)     : String = js.native
  def getProperty(sPath : String) : Any    = js.native
}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.model.ContextBinding.html
  */
@JSGlobal("sap.ui.model.ContextBinding")
@js.native
abstract class ContextBinding extends Binding {
}
