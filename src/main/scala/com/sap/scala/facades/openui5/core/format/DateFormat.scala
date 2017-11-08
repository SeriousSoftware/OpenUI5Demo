
package com.sap.scala.facades.openui5.core.format

import com.sap.scala.facades.openui5.core.Locale


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.core.format.DateFormat.html
  */
@JSGlobal("sap.ui.core.format.DateFormat")
@js.native
class DateFormat() extends js.Object {
  def format(vJSDate: js.Date, bUTC: Boolean): String = js.native
  def parse(sValue: String, bUTC: Boolean, bStrict: Boolean): js.Date = js.native
}

@JSGlobal("sap.ui.core.format.DateFormat")
@js.native
object DateFormat extends js.Object {
  //TODO add locale to instance getters
  def getDateInstance(formatOptions: DateFormatOptions): DateFormat = js.native
  def getDateTimeInstance(formatOptions: DateFormatOptions): DateFormat = js.native
  def getTimeInstance(formatOptions: DateFormatOptions): DateFormat = js.native
}

@ScalaJSDefined
trait DateFormatOptions extends js.Object {
  val pattern: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[String] = js.undefined
}
