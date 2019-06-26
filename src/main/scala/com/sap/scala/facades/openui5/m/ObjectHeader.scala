package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
//import com.sap.scala.facades.openui5.m.{ObjectNumber,ObjectHeaderContainer,ObjectStatus,BackgroundDesign,ObjectMarker,ObjectAttribute}
import com.sap.scala.facades.openui5.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.ObjectHeader")
@js.native
class ObjectHeader() extends Control {
  def addAdditionalNumber(oAdditionalNumber: ObjectNumber): this.type = js.native
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addAttribute(oAttribute: ObjectAttribute): this.type = js.native
//  def addMarker(oMarker: ObjectMarker): this.type = js.native
  def addStatus(oStatus: Control): this.type = js.native
  def attachIconPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachIntroPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachTitlePress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachTitleSelectorPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyAdditionalNumbers(): this.type = js.native
  def destroyAttributes(): this.type = js.native
  def destroyFirstStatus(): this.type = js.native
  def destroyHeaderContainer(): this.type = js.native
  def destroyMarkers(): this.type = js.native
  def destroySecondStatus(): this.type = js.native
  def destroyStatuses(): this.type = js.native
  def detachIconPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachIntroPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachTitlePress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachTitleSelectorPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireIconPress(mParameters: Object): this.type = js.native
  def fireIntroPress(mParameters: Object): this.type = js.native
  def fireTitlePress(mParameters: Object): this.type = js.native
  def fireTitleSelectorPress(mParameters: Object): this.type = js.native
  def getAdditionalNumbers(): js.Array[ObjectNumber] = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getAttributes(): js.Array[ObjectAttribute] = js.native
  def getBackgroundDesign(): BackgroundDesign = js.native
  def getCondensed(): Boolean = js.native
  def getFirstStatus(): ObjectStatus = js.native
  def getFullScreenOptimized(): Boolean = js.native
//  def getHeaderContainer(): ObjectHeaderContainer = js.native
  def getIcon(): URI = js.native
  def getIconActive(): Boolean = js.native
  def getIconAlt(): String = js.native
  def getIconDensityAware(): Boolean = js.native
  def getIconTooltip(): String = js.native
  def getIntro(): String = js.native
  def getIntroActive(): Boolean = js.native
  def getIntroHref(): URI = js.native
  def getIntroTarget(): String = js.native
  def getIntroTextDirection(): TextDirection = js.native
//  def getMarkers(): js.Array[ObjectMarker] = js.native
  def getMarkFavorite(): Boolean = js.native
  def getMarkFlagged(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def getNumber(): String = js.native
  def getNumberState(): ValueState = js.native
  def getNumberTextDirection(): TextDirection = js.native
  def getNumberUnit(): String = js.native
  def getResponsive(): Boolean = js.native
  def getSecondStatus(): ObjectStatus = js.native
  def getShowMarkers(): Boolean = js.native
  def getShowTitleSelector(): Boolean = js.native
  def getStatuses(): js.Array[Control] = js.native
  def getTitle(): String = js.native
  def getTitleActive(): Boolean = js.native
  def getTitleHref(): URI = js.native
  def getTitleLevel(): TitleLevel = js.native
  def getTitleSelectorTooltip(): String = js.native
  def getTitleTarget(): String = js.native
  def getTitleTextDirection(): TextDirection = js.native
  def indexOfAdditionalNumber(oAdditionalNumber: ObjectNumber): Int = js.native
  def indexOfAttribute(oAttribute: ObjectAttribute): Int = js.native
//  def indexOfMarker(oMarker: ObjectMarker): Int = js.native
  def indexOfStatus(oStatus: Control): Int = js.native
  def insertAdditionalNumber(oAdditionalNumber: ObjectNumber, iIndex: Int): this.type = js.native
  def insertAttribute(oAttribute: ObjectAttribute, iIndex: Int): this.type = js.native
//  def insertMarker(oMarker: ObjectMarker, iIndex: Int): this.type = js.native
  def insertStatus(oStatus: Control, iIndex: Int): this.type = js.native
  def removeAdditionalNumber(vAdditionalNumber: Int | String | ObjectNumber): ObjectNumber = js.native
  def removeAllAdditionalNumbers(): js.Array[ObjectNumber] = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllAttributes(): js.Array[ObjectAttribute] = js.native
//  def removeAllMarkers(): js.Array[ObjectMarker] = js.native
  def removeAllStatuses(): js.Array[Control] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeAttribute(vAttribute: Int | String | ObjectAttribute): ObjectAttribute = js.native
//  def removeMarker(vMarker: Int | String | ObjectMarker): ObjectMarker = js.native
  def removeStatus(vStatus: Int | String | Control): Control = js.native
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): this.type = js.native
  def setCondensed(bCondensed: Boolean): this.type = js.native
  def setFirstStatus(oFirstStatus: ObjectStatus): this.type = js.native
  def setFullScreenOptimized(bFullScreenOptimized: Boolean): this.type = js.native
//  def setHeaderContainer(oHeaderContainer: ObjectHeaderContainer): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setIconActive(bIconActive: Boolean): this.type = js.native
  def setIconAlt(sIconAlt: String): this.type = js.native
  def setIconDensityAware(bIconDensityAware: Boolean): this.type = js.native
  def setIconTooltip(sIconTooltip: String): this.type = js.native
  def setIntro(sIntro: String): this.type = js.native
  def setIntroActive(bIntroActive: Boolean): this.type = js.native
  def setIntroHref(sIntroHref: URI): this.type = js.native
  def setIntroTarget(sIntroTarget: String): this.type = js.native
  def setIntroTextDirection(sIntroTextDirection: TextDirection): this.type = js.native
  def setMarkFavorite(bMarked: Boolean): this.type = js.native
  def setMarkFlagged(bMarked: Boolean): this.type = js.native
  def setNumber(sNumber: String): this.type = js.native
  def setNumberState(sState: ValueState): this.type = js.native
  def setNumberTextDirection(sNumberTextDirection: TextDirection): this.type = js.native
  def setNumberUnit(sUnit: String): this.type = js.native
  def setResponsive(bResponsive: Boolean): this.type = js.native
  def setSecondStatus(oSecondStatus: ObjectStatus): this.type = js.native
  def setShowMarkers(bMarked: Boolean): this.type = js.native
  def setShowTitleSelector(bShowTitleSelector: Boolean): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
  def setTitleActive(bTitleActive: Boolean): this.type = js.native
  def setTitleHref(sTitleHref: URI): this.type = js.native
  def setTitleLevel(sTitleLevel: TitleLevel): this.type = js.native
//  def setTitleSelectorTooltip(sTooltip: /*TODO Type: 'undefined' not found.*/): this.type = js.native
  def setTitleTarget(sTitleTarget: String): this.type = js.native
  def setTitleTextDirection(sTitleTextDirection: TextDirection): this.type = js.native
}