
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{ID,CSSSize,Control}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.NavContainer")
@js.native
class NavContainer() extends Control {
  def addCustomTransition(sName: String, oTo: Object, oBack: Object): this.type = js.native
  def addPage(oPage: Control): this.type = js.native
  def attachAfterNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachNavigate(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def back(oBackData: Object, oTransitionParameters: Object): this.type = js.native
  def backToPage(sPageId: String, oBackData: Object, oTransitionParameters: Object): this.type = js.native
  def backToTop(oBackData: Object, oTransitionParameters: Object): this.type = js.native
  def currentPageIsTopPage(): Boolean = js.native
  def destroyPages(): this.type = js.native
  def detachAfterNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachNavigate(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireAfterNavigate(mParameters: Object): this.type = js.native
  def fireNavigate(mParameters: Object): Boolean = js.native
  def getAutoFocus(): Boolean = js.native
  def getCurrentPage(): Control = js.native
  def getDefaultTransitionName(): String = js.native
  def getHeight(): CSSSize = js.native
  def getInitialPage(): ID = js.native
//  def getMetadata(): Metadata = js.native
  def getPage(sId: String): Control = js.native
  def getPages(): js.Array[Control] = js.native
  def getPreviousPage(): Control = js.native
//  def getVisible(): Boolean = js.native
  def getWidth(): CSSSize = js.native
  def indexOfPage(oPage: Control): Int = js.native
  def insertPage(oPage: Control, iIndex: Int): this.type = js.native
  def insertPreviousPage(sPageId: String, sTransitionName: String, oData: Object): this.type = js.native
  def removeAllPages(): js.Array[Control] = js.native
  def removePage(vPage: Int | String | Control): Control = js.native
  def setAutoFocus(bAutoFocus: Boolean): this.type = js.native
  def setDefaultTransitionName(sDefaultTransitionName: String): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setInitialPage(oInitialPage: ID | Control): this.type = js.native
//  def setVisible(bVisible: Boolean): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def to(sPageId: String, sTransitionName: String, oData: Object, oTransitionParameters: Object): this.type = js.native
}
     