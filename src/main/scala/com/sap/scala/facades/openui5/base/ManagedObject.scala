
package com.sap.scala.facades.openui5.base

//import com.sap.scala.facades.openui5.base.{ManagedObject,ManagedObjectMetadata,EventProvider}
import com.sap.scala.facades.openui5.model.{Model,Context,Binding}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.base.ManagedObject")
@js.native
class ManagedObject() extends EventProvider {
  def _onContextualSettingsChanged(): Unit = js.native
  def addAggregation(sAggregationName: String, oObject: this.type, bSuppressInvalidate: Boolean): this.type = js.native
  def addAssociation(sAssociationName: String, sId: String | this.type, bSuppressInvalidate: Boolean): this.type = js.native
  def addPropagationListener(listener: js.Function1[Event[EventProps], Unit]): this.type = js.native
  def applySettings(mSettings: Object, oScope: Object): this.type = js.native
  def attachFormatError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachModelContextChange(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachParseError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachValidationError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachValidationSuccess(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindAggregation(sName: String, oBindingInfo: Object): this.type = js.native
  def bindContext(sPath: String): this.type = js.native
  def bindObject(vPath: String | Object, mParameters: Object): this.type = js.native
  def bindProperty(sName: String, oBindingInfo: Object): this.type = js.native
//  def clone(sIdSuffix: String, aLocalIds: /*TODO Type: 'string[]' not found.*/, oOptions: /*TODO Type: 'Object' not found.*/, cloneChildren: Boolean, cloneBindings: Boolean): this.type = js.native
  def create(vData: this.type | Object, oKeyInfo: Object, oScope: Object): Unit = js.native
  def destroy(bSuppressInvalidate: Boolean): Unit = js.native
  def destroyAggregation(sAggregationName: String, bSuppressInvalidate: Boolean): this.type = js.native
  def detachFormatError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachModelContextChange(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachParseError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachValidationError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachValidationSuccess(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def findAggregatedObjects(bRecursive: Boolean, fnCondition: Boolean): js.Array[ManagedObject] = js.native
  def fireFormatError(mParameters: Object): this.type = js.native
  def fireModelContextChange(mParameters: Object): this.type = js.native
  def fireParseError(mParameters: Object): this.type = js.native
  def fireValidationError(mParameters: Object): this.type = js.native
  def fireValidationSuccess(mParameters: Object): this.type = js.native
//  def getAggregation(sAggregationName: String, oDefaultForCreation: this.type | /*TODO Type: 'Array' not found.*/): this.type | /*TODO Type: 'Array' not found.*/ = js.native
//  def getAssociation(sAssociationName: String, oDefaultForCreation: Object): String | /*TODO Type: 'string[]' not found.*/ = js.native
  def getBinding(sName: String): Binding = js.native
  def getBindingContext(sModelName: String): Context = js.native
  def getBindingInfo(sName: String): Object = js.native
  def getBindingPath(sName: String): String = js.native
  override def getEventingParent(): EventProvider = js.native
  def getId(): String = js.native
  def getMetadata(): Object = js.native
//  def getModel(sName: String | /*TODO Type: 'undefined' not found.*/): Model = js.native
  def getObjectBinding(sModelName: String): Binding = js.native
  def getOriginInfo(sPropertyName: String): Object = js.native
  def getParent(): this.type = js.native
//  def getPropagationListeners(): /*TODO Type: 'array' not found.*/ = js.native
//  def getProperty(sPropertyName: String): /*TODO Type: 'any' not found.*/ = js.native
  def hasModel(): Boolean = js.native
  def indexOfAggregation(sAggregationName: String, oObject: this.type): Int = js.native
  def insertAggregation(sAggregationName: String, oObject: this.type, iIndex: Int, bSuppressInvalidate: Boolean): this.type = js.native
  def invalidate(): Unit = js.native
  def isBound(sName: String): Boolean = js.native
  def isInvalidateSuppressed(): Unit = js.native
  def isPropertyInitial(sPropertyName: String): Boolean = js.native
  def isTreeBinding(sName: String): Boolean = js.native
//  def propagateMessages(sName: String, aMessages: /*TODO Type: 'array' not found.*/): Unit = js.native
  def refreshAggregation(sName: String): Unit = js.native
  def removeAggregation(sAggregationName: String, vObject: Int | String | this.type, bSuppressInvalidate: Boolean): this.type = js.native
//  def removeAllAggregation(sAggregationName: String, bSuppressInvalidate: Boolean): /*TODO Type: 'Array' not found.*/ = js.native
//  def removeAllAssociation(sAssociationName: String, bSuppressInvalidate: Boolean): /*TODO Type: 'Array' not found.*/ = js.native
//  def removeAssociation(sAssociationName: String, vObject: Int | String | this.type, bSuppressInvalidate: Boolean): String | /*TODO Type: 'null' not found.*/ = js.native
  def removePropagationListener(listener: js.Function1[Event[EventProps], Unit]): this.type = js.native
  def resetProperty(sPropertyName: String): this.type = js.native
  def setAggregation(sAggregationName: String, oObject: Object, bSuppressInvalidate: Boolean): this.type = js.native
  def setAssociation(sAssociationName: String, sId: String | this.type, bSuppressInvalidate: Boolean): this.type = js.native
  def setBindingContext(oContext: Context, sModelName: String): this.type = js.native
  def setModel(oModel: Model, sName: String): this.type = js.native
//  def setProperty(sPropertyName: String, oValue: /*TODO Type: 'any' not found.*/, bSuppressInvalidate: Boolean): this.type = js.native
  override def toString(): String = js.native
  def unbindAggregation(sName: String, bSuppressReset: Boolean): this.type = js.native
  def unbindContext(sModelName: String): this.type = js.native
  def unbindObject(sModelName: String): this.type = js.native
  def unbindProperty(sName: String, bSuppressReset: Boolean): this.type = js.native
  def updateAggregation(sName: String): Unit = js.native
//  def validateAggregation(sAggregationName: String, oObject: this.type | /*TODO Type: 'any' not found.*/, bMultiple: Boolean): this.type | /*TODO Type: 'any' not found.*/ = js.native
//  def validateProperty(sPropertyName: String, oValue: /*TODO Type: 'any' not found.*/): /*TODO Type: 'any' not found.*/ = js.native
}
     