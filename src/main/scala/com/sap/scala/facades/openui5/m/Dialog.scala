package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{ID, CSSSize, Control, URI, ValueState}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@JSGlobal("sap.m.Dialog")
@js.native
class Dialog() extends Control {
  def _getAnyHeader(): Unit = js.native
  def addAriaDescribedBy(vAriaDescribedBy: ID | Control): this.type = js.native
  def addAriaLabelledBy(vAriaLabelledBy: ID | Control): this.type = js.native
  def addButton(oButton: Button): this.type = js.native
  def addContent(oContent: Control): this.type = js.native
  def attachAfterClose(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachAfterOpen(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachBeforeClose(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachBeforeOpen(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def close(): Unit = js.native
  def destroyBeginButton(): this.type = js.native
  def destroyButtons(): this.type = js.native
  def destroyContent(): this.type = js.native
  def destroyCustomHeader(): this.type = js.native
  def destroyEndButton(): this.type = js.native
  def destroySubHeader(): this.type = js.native
  def detachAfterClose(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachAfterOpen(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachBeforeClose(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachBeforeOpen(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireAfterClose(mParameters: Object): this.type = js.native
  def fireAfterOpen(mParameters: Object): this.type = js.native
  def fireBeforeClose(mParameters: Object): this.type = js.native
  def fireBeforeOpen(mParameters: Object): this.type = js.native
  def getAriaDescribedBy(): js.Array[ID] = js.native
  def getAriaLabelledBy(): js.Array[ID] = js.native
  def getBeginButton(): Button = js.native
  def getButtons(): js.Array[Button] = js.native
  def getContent(): js.Array[Control] = js.native
  def getContentHeight(): CSSSize = js.native
  def getContentWidth(): CSSSize = js.native
  def getCustomHeader(): IBar = js.native
  def getDraggable(): Boolean = js.native
  def getEndButton(): Button = js.native
//  def getEscapeHandler(): /*TODO Type: 'any' not found.*/ = js.native
  def getHorizontalScrolling(): Boolean = js.native
  def getIcon(): URI = js.native
  def getInitialFocus(): ID = js.native
  def getLeftButton(): ID = js.native
//  def getMetadata(): Metadata = js.native
  def getResizable(): Boolean = js.native
  def getRightButton(): ID = js.native
  def getShowHeader(): Boolean = js.native
  def getState(): ValueState = js.native
  def getStretch(): Boolean = js.native
  def getStretchOnPhone(): Boolean = js.native
  def getSubHeader(): IBar = js.native
  def getTitle(): String = js.native
//  def getType(): DialogType = js.native
  def getVerticalScrolling(): Boolean = js.native
  def indexOfButton(oButton: Button): Int = js.native
  def indexOfContent(oContent: Control): Int = js.native
  def insertButton(oButton: Button, iIndex: Int): this.type = js.native
  def insertContent(oContent: Control, iIndex: Int): this.type = js.native
  def isOpen(): Unit = js.native
  def open(): Unit = js.native
  def removeAllAriaDescribedBy(): js.Array[ID] = js.native
  def removeAllAriaLabelledBy(): js.Array[ID] = js.native
  def removeAllButtons(): js.Array[Button] = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Int | ID | Control): ID = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Int | ID | Control): ID = js.native
  def removeButton(vButton: Int | String | Button): Button = js.native
  def removeContent(vContent: Int | String | Control): Control = js.native
  def setBeginButton(oBeginButton: Button): this.type = js.native
  def setContentHeight(sContentHeight: CSSSize): this.type = js.native
  def setContentWidth(sContentWidth: CSSSize): this.type = js.native
  def setCustomHeader(oCustomHeader: IBar): this.type = js.native
  def setDraggable(bDraggable: Boolean): this.type = js.native
  def setEndButton(oEndButton: Button): this.type = js.native
//  def setEscapeHandler(oEscapeHandler: /*TODO Type: 'any' not found.*/): this.type = js.native
  def setHorizontalScrolling(bHorizontalScrolling: Boolean): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setInitialFocus(oInitialFocus: ID | Control): this.type = js.native
  def setLeftButton(oLeftButton: ID | Button): this.type = js.native
  def setResizable(bResizable: Boolean): this.type = js.native
  def setRightButton(oRightButton: ID | Button): this.type = js.native
  def setShowHeader(bShowHeader: Boolean): this.type = js.native
  def setState(sState: ValueState): this.type = js.native
  def setStretch(bStretch: Boolean): this.type = js.native
  def setStretchOnPhone(bStretchOnPhone: Boolean): this.type = js.native
  def setSubHeader(oSubHeader: IBar): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
//  def setType(sType: DialogType): this.type = js.native
  def setVerticalScrolling(bVerticalScrolling: Boolean): this.type = js.native
}