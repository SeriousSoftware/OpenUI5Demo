
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.DateValueProp
import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.Element
//import com.sap.scala.facades.openui5.unified.{DateTypeRange,CalendarLegend}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.DatePicker")
@js.native
class DatePicker() extends InputBase with DateValueProp {
//  def addSpecialDate(oSpecialDate: DateTypeRange): this.type = js.native
  def attachNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroySpecialDates(): this.type = js.native
  def detachNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireChange(mArguments: /*TODO Type: 'Map' not found.*/): this.type = js.native
  def fireNavigate(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getDateValue(): Object = js.native
  def getDisplayFormat(): String = js.native
  def getDisplayFormatType(): String = js.native
//  def getLegend(): ID = js.native
  def getMaxDate(): Object = js.native
//  def getMetadata(): Metadata = js.native
  def getMinDate(): Object = js.native
//  def getSecondaryCalendarType(): CalendarType = js.native
  def getSpecialDates(): js.Array[Element] = js.native
//  def getValue(): String = js.native
  def getValueFormat(): String = js.native
  def indexOfSpecialDate(oSpecialDate: Element): Int = js.native
//  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Int): this.type = js.native
  def removeAllSpecialDates(): js.Array[Element] = js.native
//  def removeSpecialDate(oSpecialDate: DateTypeRange): DateTypeRange = js.native
  def setDateValue(oDateValue: Object): this.type = js.native
  def setDisplayFormat(sDisplayFormat: String): this.type = js.native
  def setDisplayFormatType(sDisplayFormatType: String): this.type = js.native
//  def setLegend(oLegend: ID | CalendarLegend): this.type = js.native
  def setMaxDate(oMaxDate: Object): this.type = js.native
  def setMinDate(oMinDate: Object): this.type = js.native
//  def setSecondaryCalendarType(sSecondaryCalendarType: CalendarType): this.type = js.native
//  def setValue(sValue: String): this.type = js.native
  def setValueFormat(sValueFormat: String): this.type = js.native
  def setWidth(sWidth: String): this.type = js.native
}
     