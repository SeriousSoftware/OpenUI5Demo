
package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.model.{BindingMode, Type}

import scala.scalajs.js
import scala.scalajs.js.{Array, Object, |}
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

//@JSGlobal("sap.ui.model.PropertyBinding")
//@js.native
//class PropertyBinding() extends Binding {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getBindingMode(): BindingMode = js.native
//  def getExternalValue(): Object = js.native
//  def getFormatter(): js.Function1[Event[EventProps], Unit] = js.native
//  def getMetadata(): Metadata = js.native
//  def getType(): Type = js.native
//  def getValue(): Object = js.native
//  def resume(): Unit = js.native
//  def setBindingMode(sBindingMode: BindingMode): Unit = js.native
//  def setExternalValue(oValue: Object): Unit = js.native
//  def setFormatter(fnFormatter: js.Function1[Event[EventProps], Unit]): Unit = js.native
////  def setType(oType: Type, sInternalType: /*TODO Type: 'String' not found.*/): Unit = js.native
//  def setValue(oValue: Object): Unit = js.native
//}

/**
  * Wrapper for https://sapui5.hana.ondemand.com/#docs/api/symbols/sap.ui.model.PropertyBinding.html
  */
@JSGlobal("sap.ui.model.PropertyBinding")
@js.native
abstract class PropertyBinding extends Binding {
  def getBindingMode()                              : BindingMode = js.native
  def getExternalValue()                            : Object      = js.native
  def getFormatter()                                : Object      = js.native
  def getType()                                     : Type        = js.native
  def getValue()                                    : Object      = js.native
  def setBindingMode(sBindingMode : BindingMode)    : Unit        = js.native
  def setExternalValue(oValue : Object)             : Unit        = js.native
  def setFormatter(fnFormatter : Object)            : Unit        = js.native
  def setType(oType : Type, sInternalType : String) : Unit        = js.native
  def setValue(oValue : Object)                     : Unit        = js.native
}
