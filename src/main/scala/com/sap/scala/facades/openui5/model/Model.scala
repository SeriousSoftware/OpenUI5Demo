package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.core.message.MessageProcessor
import com.sap.scala.facades.openui5.base.{Event, EventProps}


import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}


@JSGlobal("sap.ui.model.Model")
@js.native
abstract class Model extends MessageProcessor {
  def attachParseError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def attachPropertyChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def attachRequestCompleted(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def attachRequestFailed(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def attachRequestSent(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def bindContext(sPath: String | Object, oContext: Object, mParameters: Object, oEvents: Object)
  //  def bindList(sPath: String, oContext: Object, aSorters: Sorter, aFilters: /*TODO Type: 'array' not found.*/, mParameters: Object): ListBinding = js.native
  def bindProperty(sPath: String, oContext: Object, mParameters: Object)
  //  def bindTree(sPath: String, oContext: Object, aFilters: /*TODO Type: 'array' not found.*/, mParameters: Object, aSorters: /*TODO Type: 'array' not found.*/): TreeBinding = js.native
  def checkFilterOperation(vFilters: Filter | js.Array[Filter])
  def createBindingContext(sPath: String, oContext: Object, mParameters: Object, fnCallBack: js.Function1[Event[EventProps], Unit], bReload: Boolean)
  override def destroy()
  def destroyBindingContext(oContext: Object)
  def detachParseError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def detachPropertyChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def detachRequestCompleted(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def detachRequestFailed(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def detachRequestSent(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object)
  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit])
  def fireParseError(mArguments: Object)
  def firePropertyChange(mArguments: Object)
  def fireRequestCompleted(mArguments: Object)
  def fireRequestFailed(mArguments: Object)
  def fireRequestSent(mArguments: Object)
  def getDefaultBindingMode()
  def getMessagesByPath(sPath: String)
  def getMetadata()
  def getMetaModel()
  def getObject(sPath: String, oContext: Object, mParameters: Object)
  //  def getOriginalProperty(sPath: String, oContext: Object): /*TODO Type: 'any' not found.*/ = js.native
  def getProperty(sPath: String, oContext: Object)
  def isBindingModeSupported(sMode: BindingMode)
  def isLegacySyntax()
  def refresh(bForceUpdate: Boolean)
  def setDefaultBindingMode(sMode: BindingMode)
  def setLegacySyntax(bLegacySyntax: Boolean)
  override def setMessages(mMessages: Object)
  def setSizeLimit(iSizeLimit: Int)
}
