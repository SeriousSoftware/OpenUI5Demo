package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
//import com.sap.scala.facades.openui5.m.{Popover,NavContainer,SplitAppMode}
import com.sap.scala.facades.openui5.core.{Control, ID, URI}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.SplitContainer")
@js.native
class SplitContainer() extends Control {
  def addDetailPage(oDetailPage: Control): this.type = js.native
  def addMasterPage(oMasterPage: Control): this.type = js.native
  def addPage(oPage: Control, bMaster: Boolean): this.type = js.native
  def attachAfterDetailNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachAfterMasterClose(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachAfterMasterNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachAfterMasterOpen(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachBeforeMasterClose(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachBeforeMasterOpen(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachDetailNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachMasterButton(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachMasterNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def backDetail(oBackData: Object, oTransitionParameter: Object): this.type = js.native
  def backMaster(oBackData: Object, oTransitionParameter: Object): this.type = js.native
  def backToPage(sPageId: String, oBackData: Object, oTransitionParameters: Object): this.type = js.native
  def backToTopDetail(oBackData: Object, oTransitionParameter: Object): Control = js.native
  def backToTopMaster(oBackData: Object, oTransitionParameter: Object): Control = js.native
  def destroyDetailPages(): this.type = js.native
  def destroyMasterPages(): this.type = js.native
  def detachAfterDetailNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachAfterMasterClose(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachAfterMasterNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachAfterMasterOpen(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachBeforeMasterClose(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachBeforeMasterOpen(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachDetailNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachMasterButton(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachMasterNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireAfterDetailNavigate(mParameters: Object): this.type = js.native
  def fireAfterMasterClose(mParameters: Object): this.type = js.native
  def fireAfterMasterNavigate(mParameters: Object): this.type = js.native
  def fireAfterMasterOpen(mParameters: Object): this.type = js.native
  def fireBeforeMasterClose(mParameters: Object): this.type = js.native
  def fireBeforeMasterOpen(mParameters: Object): this.type = js.native
  def fireDetailNavigate(mParameters: Object): Boolean = js.native
  def fireMasterButton(mParameters: Object): this.type = js.native
  def fireMasterNavigate(mParameters: Object): Boolean = js.native
  def getBackgroundColor(): String = js.native
  def getBackgroundImage(): URI = js.native
  def getBackgroundOpacity(): Float = js.native
  def getBackgroundRepeat(): Boolean = js.native
  def getCurrentDetailPage(): Control = js.native
  def getCurrentMasterPage(): Control = js.native
  def getCurrentPage(bMaster: Boolean): Control = js.native
  def getDefaultTransitionNameDetail(): String = js.native
  def getDefaultTransitionNameMaster(): String = js.native
  def getDetailPage(sId: String): Control = js.native
  def getDetailPages(): js.Array[Control] = js.native
  def getInitialDetail(): ID = js.native
  def getInitialMaster(): ID = js.native
  def getMasterButtonText(): String = js.native
  def getMasterButtonTooltip(): String = js.native
  def getMasterPage(sId: String): Control = js.native
  def getMasterPages(): js.Array[Control] = js.native
//  def getMetadata(): Metadata = js.native
  def getMode(): SplitAppMode = js.native
  def getPage(sId: String, bMaster: Boolean): Control = js.native
  def getPreviousPage(bMaster: Boolean): Control = js.native
  def hideMaster(): this.type = js.native
  def indexOfDetailPage(oDetailPage: Control): Int = js.native
  def indexOfMasterPage(oMasterPage: Control): Int = js.native
  def insertDetailPage(oDetailPage: Control, iIndex: Int): this.type = js.native
  def insertMasterPage(oMasterPage: Control, iIndex: Int): this.type = js.native
  def insertPreviousPage(sPageId: String, sTransitionName: String, oData: Object): this.type = js.native
  def isMasterShown(): Boolean = js.native
  def removeAllDetailPages(): js.Array[Control] = js.native
  def removeAllMasterPages(): js.Array[Control] = js.native
  def removeDetailPage(vDetailPage: Int | String | Control): Control = js.native
  def removeMasterPage(vMasterPage: Int | String | Control): Control = js.native
  def setBackgroundColor(sBackgroundColor: String): this.type = js.native
  def setBackgroundImage(sBackgroundImage: URI): this.type = js.native
  def setBackgroundOpacity(fBackgroundOpacity: Float): this.type = js.native
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): this.type = js.native
  def setDefaultTransitionNameDetail(sDefaultTransitionNameDetail: String): this.type = js.native
  def setDefaultTransitionNameMaster(sDefaultTransitionNameMaster: String): this.type = js.native
  def setInitialDetail(oInitialDetail: ID | Control): this.type = js.native
  def setInitialMaster(oInitialMaster: ID | Control): this.type = js.native
  def setMasterButtonText(sMasterButtonText: String): this.type = js.native
  def setMasterButtonTooltip(sMasterButtonTooltip: String): this.type = js.native
  def setMode(sMode: SplitAppMode): this.type = js.native
  def showMaster(): this.type = js.native
  def to(sPageId: String, sTransitionName: String, oData: Object, oTransitionParameters: Object): this.type = js.native
  def toDetail(sPageId: String, sTransitionName: String, oData: Object, oTransitionParameter: Object): this.type = js.native
  def toMaster(sPageId: String, sTransitionName: String, oData: Object, oTransitionParameters: Object): this.type = js.native
}