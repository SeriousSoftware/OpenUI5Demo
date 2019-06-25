
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.{SwipeDirection,ListHeaderDesign,ListGrowingDirection,ListSeparators,Toolbar,ListKeyboardMode,ListItemBase,ListMode}
import com.sap.scala.facades.openui5.core.{ID,CSSSize,Control}
//import com.sap.scala.facades.openui5.core.delegate.ItemNavigation


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.ListBase")
@js.native
class ListBase() extends Control {
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addItem(oItem: ListItemBase): this.type = js.native
  def attachDelete(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachGrowingFinished(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachGrowingStarted(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachItemPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSelect(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSelectionChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachSwipe(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachUpdateFinished(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachUpdateStarted(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindItems(oBindingInfo: Object): this.type = js.native
  def destroyHeaderToolbar(): this.type = js.native
  def destroyInfoToolbar(): this.type = js.native
  def destroyItems(): this.type = js.native
  def destroySwipeContent(): this.type = js.native
  def detachDelete(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachGrowingFinished(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachGrowingStarted(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachItemPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSelect(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSelectionChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachSwipe(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachUpdateFinished(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachUpdateStarted(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireDelete(mParameters: Object): this.type = js.native
  def fireGrowingFinished(mParameters: Object): this.type = js.native
  def fireGrowingStarted(mParameters: Object): this.type = js.native
  def fireItemPress(mParameters: Object): this.type = js.native
  def fireSelect(mParameters: Object): this.type = js.native
  def fireSelectionChange(mParameters: Object): this.type = js.native
  def fireSwipe(mParameters: Object): Boolean = js.native
  def fireUpdateFinished(mParameters: Object): this.type = js.native
  def fireUpdateStarted(mParameters: Object): this.type = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getEnableBusyIndicator(): Boolean = js.native
  def getFooterText(): String = js.native
  def getGrowing(): Boolean = js.native
  def getGrowingDirection(): ListGrowingDirection = js.native
  def getGrowingInfo(): Object = js.native
  def getGrowingScrollToLoad(): Boolean = js.native
  def getGrowingThreshold(): Int = js.native
  def getGrowingTriggerText(): String = js.native
//  def getHeaderDesign(): ListHeaderDesign = js.native
  def getHeaderText(): String = js.native
  def getHeaderToolbar(): Toolbar = js.native
  def getIncludeItemInSelection(): Boolean = js.native
  def getInfoToolbar(): Toolbar = js.native
  def getInset(): Boolean = js.native
//  def getItemNavigation(): ItemNavigation | /*TODO Type: 'undefined' not found.*/ = js.native
  def getItems(): js.Array[ListItemBase] = js.native
  def getKeyboardMode(): ListKeyboardMode = js.native
  def getLastMode(): Unit = js.native
//  def getMetadata(): Metadata = js.native
  def getMode(): ListMode = js.native
  def getModeAnimationOn(): Boolean = js.native
  def getNoDataText(): String = js.native
  def getRememberSelections(): Boolean = js.native
//  def getSelectedContexts(bAll: Boolean): /*TODO Type: 'object[]' not found.*/ = js.native
  def getSelectedItem(): ListItemBase = js.native
  def getSelectedItems(): js.Array[ListItemBase] = js.native
  def getShowNoData(): Boolean = js.native
  def getShowSeparators(): ListSeparators = js.native
  def getShowUnread(): Boolean = js.native
  def getSwipeContent(): Control = js.native
  def getSwipeDirection(): SwipeDirection = js.native
  def getSwipedItem(): ListItemBase = js.native
  def getWidth(): CSSSize = js.native
  def indexOfItem(oItem: ListItemBase): Int = js.native
  def insertItem(oItem: ListItemBase, iIndex: Int): this.type = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllItems(): js.Array[ListItemBase] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeItem(vItem: Int | String | ListItemBase): ListItemBase = js.native
  def removeSelections(bAll: Boolean): this.type = js.native
  def selectAll(): this.type = js.native
  def setEnableBusyIndicator(bEnableBusyIndicator: Boolean): this.type = js.native
  def setFooterText(sFooterText: String): this.type = js.native
  def setGrowing(bGrowing: Boolean): this.type = js.native
  def setGrowingDirection(sGrowingDirection: ListGrowingDirection): this.type = js.native
  def setGrowingScrollToLoad(bGrowingScrollToLoad: Boolean): this.type = js.native
  def setGrowingThreshold(iGrowingThreshold: Int): this.type = js.native
  def setGrowingTriggerText(sGrowingTriggerText: String): this.type = js.native
//  def setHeaderDesign(sHeaderDesign: ListHeaderDesign): this.type = js.native
  def setHeaderText(sHeaderText: String): this.type = js.native
  def setHeaderToolbar(oHeaderToolbar: Toolbar): this.type = js.native
  def setIncludeItemInSelection(bIncludeItemInSelection: Boolean): this.type = js.native
  def setInfoToolbar(oInfoToolbar: Toolbar): this.type = js.native
  def setInset(bInset: Boolean): this.type = js.native
  def setKeyboardMode(sKeyboardMode: ListKeyboardMode): this.type = js.native
  def setMode(sMode: ListMode): this.type = js.native
  def setModeAnimationOn(bModeAnimationOn: Boolean): this.type = js.native
  def setNoDataText(sNoDataText: String): this.type = js.native
  def setRememberSelections(bRememberSelections: Boolean): this.type = js.native
  def setSelectedItem(oListItem: ListItemBase, bSelect: Boolean): this.type = js.native
  def setSelectedItemById(sId: String, bSelect: Boolean): this.type = js.native
  def setShowNoData(bShowNoData: Boolean): this.type = js.native
  def setShowSeparators(sShowSeparators: ListSeparators): this.type = js.native
  def setShowUnread(bShowUnread: Boolean): this.type = js.native
  def setSwipeContent(oSwipeContent: Control): this.type = js.native
  def setSwipeDirection(sSwipeDirection: SwipeDirection): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
//  def swipeOut(oCallback: /*TODO Type: 'any' not found.*/): this.type = js.native
  def unbindItems(): this.type = js.native
}