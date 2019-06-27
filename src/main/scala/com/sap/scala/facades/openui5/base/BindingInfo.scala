package com.sap.scala.facades.openui5.base

import scala.scalajs.js
import scala.scalajs.js.|

trait BindingInfo extends js.Object

object BindingInfo {
  type OrBindingInfo[A] = A | BindingInfo
}