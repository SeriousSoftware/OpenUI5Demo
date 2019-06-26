package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{BackgroundDesign, CSSSize, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.Panel")
@js.native
class Panel() extends Control {
  def addContent(oContent: Control): this.type = js.native
  def attachExpand(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def destroyContent(): this.type = js.native
  def destroyHeaderToolbar(): this.type = js.native
  def destroyInfoToolbar(): this.type = js.native
  def detachExpand(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireExpand(mParameters: Object): this.type = js.native
//  def getAccessibleRole(): PanelAccessibleRole = js.native
  def getBackgroundDesign(): BackgroundDesign = js.native
  def getContent(): js.Array[Control] = js.native
  def getExpandable(): Boolean = js.native
  def getExpandAnimation(): Boolean = js.native
  def getExpanded(): Boolean = js.native
  def getHeaderText(): String = js.native
  def getHeaderToolbar(): Toolbar = js.native
  def getHeight(): CSSSize = js.native
  def getInfoToolbar(): Toolbar = js.native
//  def getMetadata(): Metadata = js.native
  def getWidth(): CSSSize = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
//  def setAccessibleRole(sRole: PanelAccessibleRole): this.type = js.native
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): this.type = js.native
  def setExpandable(bExpandable: Boolean): this.type = js.native
  def setExpandAnimation(bExpandAnimation: Boolean): this.type = js.native
  def setExpanded(bExpanded: Boolean): this.type = js.native
  def setHeaderText(sHeaderText: String): this.type = js.native
  def setHeaderToolbar(oHeaderToolbar: Toolbar): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setInfoToolbar(oInfoToolbar: Toolbar): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}