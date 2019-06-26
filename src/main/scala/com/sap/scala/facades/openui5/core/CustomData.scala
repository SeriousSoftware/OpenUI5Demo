package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.core.CustomData.html
  */
@JSGlobal("sap.ui.core.CustomData")
@js.native
class CustomData() extends Element {
  def getKey(): String = js.native
  def getValue(): js.Any = js.native
  def getWriteToDom(): Boolean = js.native
  def setKey(sKey: String): CustomData = js.native
  def setValue(oValue: js.Any): CustomData = js.native
  def setWriteToDom(bWriteToDom: Boolean): CustomData = js.native
}



object CustomData {
  def apply(key: String, value: js.Any, writeToDom: Boolean): CustomData = {
    val result = new CustomData()
    result.setValue(value)
    result.setKey(key)
    result.setWriteToDom(writeToDom)
    result
  }
}