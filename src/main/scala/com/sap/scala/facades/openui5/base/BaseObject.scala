package com.sap.scala.facades.openui5.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.base.Object.html
  */
@JSGlobal("sap.ui.base.Object")
@js.native
class BaseObject extends js.Object {
  //def sap.ui.base.Object.extend(sClassName, oClassInfo?, FNMetaImpl?) = js.native
  def destroy(): Unit = js.native
  //def getInterface() = js.native
  //def getMetadata() = js.native
}