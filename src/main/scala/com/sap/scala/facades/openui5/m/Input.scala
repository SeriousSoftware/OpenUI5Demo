
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.LiveValueProp
import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{Column, ColumnListItem, InputBase, InputTextFormatMode, InputType}
import com.sap.scala.facades.openui5.core.{CSSSize, ID, Icon, Item}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

@JSGlobal("sap.m.Input")
@js.native
class Input() extends InputBase with LiveValueProp {
  def addSuggestionColumn(oSuggestionColumn: Column): this.type = js.native
  def addSuggestionItem(oSuggestionItem: Item): this.type = js.native
  def addSuggestionRow(oSuggestionRow: ColumnListItem): this.type = js.native
  def attachLiveChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSubmit(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSuggest(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSuggestionItemSelected(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachValueHelpRequest(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def bindAggregation(sAggregationName: String, oBindingInfo: Object): this.type = js.native
  def bindSuggestionColumns(oBindingInfo: Object): this.type = js.native
  def bindSuggestionRows(oBindingInfo: Object): this.type = js.native
  def closeSuggestions(): Unit = js.native
  def destroySuggestionColumns(): this.type = js.native
  def destroySuggestionItems(): this.type = js.native
  def destroySuggestionRows(): this.type = js.native
  def detachLiveChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSubmit(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSuggest(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSuggestionItemSelected(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachValueHelpRequest(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireLiveChange(mParameters: Object): this.type = js.native
  def fireSubmit(mParameters: Object): this.type = js.native
  def fireSuggest(mParameters: Object): this.type = js.native
  def fireSuggestionItemSelected(mParameters: Object): this.type = js.native
  def fireValueHelpRequest(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getDateFormat(): String = js.native
  def getDescription(): String = js.native
  def getEnableSuggestionsHighlighting(): Boolean = js.native
  def getFieldWidth(): CSSSize = js.native
  def getFilterSuggests(): Boolean = js.native
  def getMaxLength(): Int = js.native
  def getMaxSuggestionWidth(): CSSSize = js.native
//  def getMetadata(): Metadata = js.native
  def getSelectedItem(): ID = js.native
  def getSelectedKey(): String = js.native
  def getSelectedRow(): ID = js.native
  def getShowSuggestion(): Boolean = js.native
  def getShowTableSuggestionValueHelp(): Boolean = js.native
  def getShowValueHelp(): Boolean = js.native
//  def getShowValueStateMessage(): Boolean = js.native
  def getStartSuggestion(): Int = js.native
  def getSuggestionColumns(): js.Array[Column] = js.native
//  def getSuggestionItemByKey(sKey: String): Item | /*TODO Type: 'undefined' not found.*/ = js.native
  def getSuggestionItems(): js.Array[Item] = js.native
  def getSuggestionRows(): js.Array[ColumnListItem] = js.native
//  def getSuggestionRowValidator(): /*TODO Type: 'any' not found.*/ = js.native
//  def getTextFormatMode(): InputTextFormatMode = js.native
//  def getTextFormatter(): /*TODO Type: 'any' not found.*/ = js.native
//  def getType(): InputType = js.native
  def getValueHelpOnly(): Boolean = js.native
  def getValueLiveUpdate(): Boolean = js.native
//  def getValueStateText(): String = js.native
//  def getWidth(): String = js.native
  def indexOfSuggestionColumn(oSuggestionColumn: Column): Int = js.native
  def indexOfSuggestionItem(oSuggestionItem: Item): Int = js.native
  def indexOfSuggestionRow(oSuggestionRow: ColumnListItem): Int = js.native
  def insertSuggestionColumn(oSuggestionColumn: Column, iIndex: Int): this.type = js.native
  def insertSuggestionItem(oSuggestionItem: Item, iIndex: Int): this.type = js.native
  def insertSuggestionRow(oSuggestionRow: ColumnListItem, iIndex: Int): this.type = js.native
//  def ontap(oEvent: /*TODO Type: 'jQuery.Event' not found.*/): Unit = js.native
  def removeAllSuggestionColumns(): js.Array[Column] = js.native
  def removeAllSuggestionItems(): js.Array[Item] = js.native
  def removeAllSuggestionRows(): js.Array[ColumnListItem] = js.native
  def removeSuggestionColumn(vSuggestionColumn: Int | String | Column): Column = js.native
  def removeSuggestionItem(vSuggestionItem: Int | String | Item): Item = js.native
  def removeSuggestionRow(vSuggestionRow: Int | String | ColumnListItem): ColumnListItem = js.native
  def setDateFormat(sDateFormat: String): this.type = js.native
  def setDescription(sDescription: String): this.type = js.native
  def setEnableSuggestionsHighlighting(bEnableSuggestionsHighlighting: Boolean): this.type = js.native
  def setFieldWidth(sFieldWidth: CSSSize): this.type = js.native
  def setFilterFunction(fnFilter: js.Function1[Event[EventProps], Unit]): this.type = js.native
  def setFilterSuggests(bFilterSuggests: Boolean): this.type = js.native
  def setMaxLength(iMaxLength: Int): this.type = js.native
  def setMaxSuggestionWidth(sMaxSuggestionWidth: CSSSize): this.type = js.native
  def setRowResultFunction(fnFilter: js.Function1[Event[EventProps], Unit]): this.type = js.native
//  def setSelectedItem(oItem: String | Item | /*TODO Type: 'null' not found.*/): this.type = js.native
  def setSelectedKey(sKey: String): this.type = js.native
//  def setSelectedRow(oListItem: String | ColumnListItem | /*TODO Type: 'null' not found.*/): this.type = js.native
  def setShowSuggestion(bShowSuggestion: Boolean): this.type = js.native
  def setShowTableSuggestionValueHelp(bShowTableSuggestionValueHelp: Boolean): this.type = js.native
  def setShowValueHelp(bShowValueHelp: Boolean): this.type = js.native
//  def setShowValueStateMessage(bShowValueStateMessage: Boolean): InputBase = js.native
  def setStartSuggestion(iStartSuggestion: Int): this.type = js.native
//  def setSuggestionRowValidator(oSuggestionRowValidator: /*TODO Type: 'any' not found.*/): this.type = js.native
//  def setTextFormatMode(sTextFormatMode: InputTextFormatMode): this.type = js.native
//  def setTextFormatter(oTextFormatter: /*TODO Type: 'any' not found.*/): this.type = js.native
//  def setType(sType: InputType): this.type = js.native
//  def setValue(sValue: String): this.type = js.native
  def setValueHelpOnly(bValueHelpOnly: Boolean): this.type = js.native
  def setValueLiveUpdate(bValueLiveUpdate: Boolean): this.type = js.native
//  def setValueStateText(sValueStateText: String): InputBase = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def unbindSuggestionColumns(): this.type = js.native
  def unbindSuggestionRows(): this.type = js.native
}
     