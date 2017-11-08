
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base.ManagedObject
import com.sap.scala.facades.openui5.model.Binding

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportAll, JSGlobal}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.core.Element.html
  */
@JSGlobal("sap.ui.core.Element")
@js.native
abstract class Element extends ManagedObject {
  def addCustomData(oCustomData: CustomData): Element = js.native
  def addDependent(oDependent: Control): Element = js.native
  def addEventDelegate(oDelegate: js.Object, oThis: js.UndefOr[js.Object] = js.undefined): Element =  js.native
  def bindElement(vPath: String, mParameters: js.Dictionary[js.Any]): ManagedObject = js.native
  def bindElement(vPath: VPath): ManagedObject = js.native
  def data(sKey: String, oValue: js.Any, bWriteToDom: Boolean): js.Any = js.native
  def data(sKey: String, oValue: js.Any): js.Any = js.native
  def data(sKey: String): js.Any = js.native
  def data(): js.Dictionary[js.Any] = js.native
  def destroy(bSuppressInvalidate: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def destroyCustomData(): Element = js.native
  def destroyDependents(): Element = js.native
  def destroyLayoutData(): Element = js.native
  def destroyTooltip(): Element = js.native
  def enhanceAccessibilityState(oElement: Element, mAriaProps: js.Dictionary[js.Any]): js.Object = js.native
  def exit(): Unit = js.native
  def findElements(bRecursive: Boolean): js.Array[Element] = js.native
  def fireEvent(sEventId: String, mParameters: js.Dictionary[js.Any]): Element = js.native
  def focus(): Unit = js.native
  def getCustomData(): js.Array[CustomData] = js.native
  def getDependents(): js.Array[Control] = js.native
  def getDomRef(sSuffix: String): org.scalajs.dom.Element = js.native
  def getElementBinding(sModelName: String): Binding = js.native
  def getFocusDomRef(): org.scalajs.dom.Element = js.native
  def getFocusInfo(): js.Any = js.native
  def getLayoutData(): LayoutData = js.native
  override def getMetadata(): js.Object = js.native
  def getTooltip(): js.Any = js.native
  def getTooltip_AsString(): String = js.native
  def getTooltip_Text(): String = js.native
  def indexOfDependent(oDependent: Control): Int = js.native
  def init(): Unit = js.native
  def insertCustomData(oCustomData: CustomData, iIndex: Int): Element = js.native
  def insertDependent(oDependent: Control, iIndex: Int): Element = js.native
  def removeAllCustomData(): js.Array[CustomData] = js.native
  def removeAllDependents(): js.Array[Control] = js.native
  def removeCustomData(vCustomData: Int): CustomData = js.native
  def removeCustomData(vCustomData: String): CustomData = js.native
  def removeCustomData(vCustomData: CustomData): CustomData = js.native
  def removeDependent(vDependent: Int): Control = js.native
  def removeDependent(vDependent: String): Control = js.native
  def removeDependent(vDependent: Control): Control = js.native
  def removeEventDelegate(oDelegate: js.Object): Element = js.native
  def rerender(): Unit = js.native
  def setLayoutData(oLayoutData: LayoutData): Unit = js.native
  def setTooltip(vTooltip: String): Unit = js.native
  override def toString(): String = js.native
  def ubindElement(sModelName: String): ManagedObject = js.native
}

@JSExportAll
case class VPath(path: String, parameters: js.Dictionary[js.Any], model: js.UndefOr[String], events: js.Dictionary[js.Any])
