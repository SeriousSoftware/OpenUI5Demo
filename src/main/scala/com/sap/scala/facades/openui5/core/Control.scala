
package com.sap.scala.facades.openui5.core



import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

//@JSGlobal("sap.ui.core.Control")
//@js.native
//class Control() extends Element {
//  def addStyleClass(sStyleClass: String): this.type = js.native
//  def allowTextSelection(bAllow: Boolean): this.type = js.native
//  def attachBrowserEvent(sEventType: String, fnHandler: js.Function1[QEvent, Unit]): this.type = js.native
//  def attachBrowserEvent(sEventType: String, fnHandler: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def attachValidateFieldGroup(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def checkFieldGroupIds(vFieldGroupIds: String | /*TODO Type: 'string[]' not found.*/): Boolean = js.native
//  def clone(sIdSuffix: String, aLocalIds: /*TODO Type: 'string[]' not found.*/): Element = js.native
//  def detachBrowserEvent(sEventType: String, fnHandler: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def detachValidateFieldGroup(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireValidateFieldGroup(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Object = js.native
//  def getBusy(): Boolean = js.native
//  def getBusyIndicatorDelay(): Int = js.native
//  def getControlsByFieldGroupId(vFieldGroupIds: String | /*TODO Type: 'string[]' not found.*/): js.Array[Control] = js.native
//  def getFieldGroupIds(): /*TODO Type: 'string[]' not found.*/ = js.native
//  def getIdForLabel(): String = js.native
//  def getMetadata(): Metadata = js.native
//  def getRenderer(): Object = js.native
//  def getVisible(): Boolean = js.native
//  def hasStyleClass(sStyleClass: String): Boolean = js.native
//  def invalidate(oOrigin: ManagedObject): Unit = js.native
//  def isBusy(): Unit = js.native
//  def onAfterRendering(): Unit = js.native
//  def onBeforeRendering(): Unit = js.native
//  def placeAt(oRef: String | /*TODO Type: 'Element' not found.*/ | this.type, vPosition: String | Int): this.type = js.native
//  def removeStyleClass(sStyleClass: String): this.type = js.native
//  def rerender(): Unit = js.native
//  def setBusy(bBusy: Boolean): this.type = js.native
//  def setBusyIndicatorDelay(iDelay: Int): this.type = js.native
//  def setFieldGroupIds(sFieldGroupIds: /*TODO Type: 'string[]' not found.*/): this.type = js.native
//  def setVisible(bVisible: Boolean): this.type = js.native
//  def toggleStyleClass(sStyleClass: String, bAdd: Boolean): this.type = js.native
//  def triggerValidateFieldGroup(): Unit = js.native
//}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.core.Control.html
  */
@JSGlobal("sap.ui.core.Control")
@js.native
abstract class Control extends Element {
  def placeAt(tag: String): Unit = js.native
  def placeAt(oRef: Any, oPosition: AnyVal = 0): Unit = js.native
  def addStyleClass(sStyleClass: String): Control = js.native
  def removeStyleClass(sStyleClass: String): Control = js.native
  def hasStyleClass(sStyleClass: String): Boolean = js.native
  def setBusy(busy: Boolean): Control = js.native
  def setVisible(isVisible: Boolean): Control = js.native
  def getVisible(): Boolean = js.native
  def attachBrowserEvent(sEventType: String, fnHandler: js.Function1[QEvent, Unit]): Control = js.native

  def getAccessibilityInfo(): Object = js.native
}

//TODO: Not entirely sure where this belongs...
@js.native
trait QEvent extends js.Object {
  val `type`: String = js.native
  val keyCode: Int = js.native
}