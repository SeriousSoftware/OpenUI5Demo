package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{Control, TitleLevel, URI}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.Page")
@js.native
class Page() extends Control {
  def addContent(oContent: Control): this.type = js.native
  def addHeaderContent(oHeaderContent: Control): this.type = js.native
  def attachNavButtonPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachNavButtonTap(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyContent(): this.type = js.native
  def destroyCustomHeader(): this.type = js.native
  def destroyFooter(): this.type = js.native
  def destroyHeaderContent(): this.type = js.native
  def destroyLandmarkInfo(): this.type = js.native
  def destroySubHeader(): this.type = js.native
  def detachNavButtonPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachNavButtonTap(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireNavButtonPress(mParameters: Object): this.type = js.native
  def fireNavButtonTap(mParameters: Object): this.type = js.native
  def getBackgroundDesign(): PageBackgroundDesign = js.native
  def getContent(): js.Array[Control] = js.native
  def getContentOnlyBusy(): Boolean = js.native
  def getCustomHeader(): IBar = js.native
  def getEnableScrolling(): Boolean = js.native
  def getFloatingFooter(): Boolean = js.native
  def getFooter(): IBar = js.native
  def getHeaderContent(): js.Array[Control] = js.native
  def getIcon(): URI = js.native
  def getLandmarkInfo(): PageAccessibleLandmarkInfo = js.native
//  def getMetadata(): Metadata = js.native
  def getNavButtonText(): String = js.native
  def getNavButtonTooltip(): String = js.native
  def getNavButtonType(): ButtonType = js.native
  def getShowFooter(): Boolean = js.native
  def getShowHeader(): Boolean = js.native
  def getShowNavButton(): Boolean = js.native
  def getShowSubHeader(): Boolean = js.native
  def getSubHeader(): IBar = js.native
  def getTitle(): String = js.native
  def getTitleLevel(): TitleLevel = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def indexOfHeaderContent(oHeaderContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def insertHeaderContent(oHeaderContent: Control, iIndex: Int): this.type = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeAllHeaderContent(): js.Array[Control] = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
  def removeHeaderContent(vHeaderContent: Int | String | Control): Control = js.native
  def scrollTo(y: Int, time: Int): this.type = js.native
//  def scrollToElement(oElement: /*TODO Type: 'HTMLElement' not found.*/ | Element, iTime: Int): this.type = js.native
  def setBackgroundDesign(sBackgroundDesign: PageBackgroundDesign): this.type = js.native
  def setContentOnlyBusy(bContentOnlyBusy: Boolean): this.type = js.native
  def setEnableScrolling(bEnableScrolling: Boolean): this.type = js.native
  def setFloatingFooter(bFloatingFooter: Boolean): this.type = js.native
  def setFooter(oFooter: IBar): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setLandmarkInfo(oLandmarkInfo: PageAccessibleLandmarkInfo): this.type = js.native
  def setNavButtonText(sNavButtonText: String): this.type = js.native
  def setNavButtonTooltip(sNavButtonTooltip: String): this.type = js.native
  def setNavButtonType(sNavButtonType: ButtonType): this.type = js.native
  def setShowFooter(bShowFooter: Boolean): this.type = js.native
  def setShowHeader(bShowHeader: Boolean): this.type = js.native
  def setShowNavButton(bShowNavButton: Boolean): this.type = js.native
  def setShowSubHeader(bShowSubHeader: Boolean): this.type = js.native
  def setSubHeader(oSubHeader: IBar): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
  def setTitleLevel(sTitleLevel: TitleLevel): this.type = js.native
}