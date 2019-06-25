
package com.sap.scala.facades.openui5.base

import com.sap.scala.facades.openui5.m.ColumnListItem
import com.sap.scala.facades.openui5.model.{Binding, Context, Model}

import scala.scalajs.js
import scala.scalajs.js.{Any, Array, Function1, Object, |}
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}

@JSGlobal("sap.ui.base.ManagedObject")
@js.native
class ManagedObject() extends EventProvider {
  def addAggregation(sAggregationName: String,
                     oObject: Object,
                     bSuppressInvalidate: Boolean): ManagedObject = js.native
  def addAssociation(sAssociationName: String,
                     sId: String,
                     bSuppressInvalidate: Boolean): ManagedObject = js.native
  def applySettings(mSettings: Object,
                    oScope: Object): ManagedObject = js.native
  def attachFormatError(oData: Object,
                        fnFunction: Function1[Object, Unit],
                        oListener: Object): ManagedObject = js.native
  def attachParseError(oData: Object,
                       fnFunction: Function1[Object, Unit],
                       oListener: Object): ManagedObject = js.native
  def attachValidationError(oData: Object,
                            fnFunction: Function1[Object, Unit],
                            oListener: Object): ManagedObject = js.native
  def attachValidationSuccess(oData: Object,
                              fnFunction: Function1[Object, Unit],
                              oListener: Object): ManagedObject = js.native

  def attachModelContextChange(fnFunction: js.Function): Unit = js.native

  // This method is undocumented. Need it to make tabular suggestions for MultiInput work
  // TODO: investigate it
  def bindAggregation(sName: String,
                      oBindingInfo: Object): this.type = js.native
  def bindAggregation(sName: String,
                      oBindingInfo: String,
                      columnListItem: ColumnListItem): this.type = js.native
  def bindObject(vPath: Object,
                 mParameters: Object): this.type = js.native
  def bindProperty(sName: String, oBindingInfo: BindingInfo): this.type = js.native
  def clone(sIdSuffix: String,
            aLocalIds: Array[String],
            oOptions: Object): ManagedObject = js.native
  def destroy(bSuppressInvalidate: Boolean): Unit = js.native
  def destroyAggregation(sAggregationName: String,
                         bSuppressInvalidate: Boolean): this.type = js.native
  def detachFormatError(fnFunction: Function1[Object, Unit],
                        oListener: Object): this.type = js.native
  def detachParseError(fnFunction: Function1[Object, Unit],
                       oListener: Object): this.type = js.native
  def detachValidationError(fnFunction: Function1[Object, Unit],
                            oListener: Object): this.type = js.native
  def detachValidationSuccess(fnFunction: Function1[Object, Unit],
                              oListener: Object): this.type = js.native
  def findAggregatedObjects(bRecursive: Boolean,
                            fnCondition: Function1[ManagedObject, Boolean]): Array[ManagedObject] = js.native
  def fireFormatError(mArguments: Object): this.type = js.native
  def fireParseError(mArguments: Object): this.type = js.native
  def fireValidationError(mArguments: Object): this.type = js.native
  def fireValidationSuccess(mArguments: Object): this.type = js.native
  def getAggregation(sAggregationName: String,
                     oDefaultForCreation: Object): Object = js.native //ManagedObject | Array[ManagedObject]
  def getAssociation(sAssociationName: String,
                     oDefaultForCreation: Object): Object = js.native //String | Array[String]
  def getBinding(sName: String): Binding = js.native
  def getBindingContext(): js.UndefOr[Context] = js.native
  def getBindingContext(sModelName: String): Context = js.native
  def getBindingInfo(sName: String): Object = js.native
  def getBindingPath(sName: String): String = js.native
  override def getEventingParent(): EventProvider = js.native
  def getId(): String = js.native
  def getMetadata(): Object = js.native
  def getModel(sName: String): Model = js.native
  def getObjectBinding(sModelName: String): Binding = js.native
  def getOriginInfo(sPropertyName: String): Object = js.native
  def getParent(): js.UndefOr[ManagedObject] = js.native
  def getProperty(sPropertyName: String): Any = js.native
  def hasModel(): Boolean = js.native
  def indexOfAggregation(sAggregationName: String,
                         oObject: Object): Int = js.native
  def insertAggregation(sAggregationName: String,
                        oObject: Object,
                        iIndex: Integer,
                        bSuppressInvalidate: Boolean): ManagedObject = js.native
  def invalidate(): Unit = js.native
  def isBound(sName: String): Boolean = js.native
  def isInvalidateSuppressed(): Boolean = js.native
  def propagateMessages(sName: String,
                        aMessages: Array[String]): Unit = js.native
  def removeAggregation(sAggregationName: String,
                        vObject: Int|String|ManagedObject,
                        bSuppressInvalidate: Boolean): ManagedObject = js.native
  def removeAllAggregation(sAggregationName: String,
                           bSuppressInvalidate: Boolean): Unit = js.native
  def removeAllAssociation(sAggregationName: String,
                           bSuppressInvalidate: Boolean): Unit = js.native
  def removeAssociation(sAssociationName: String,
                        vObject: Object,
                        bSuppressInvalidate: Boolean): Unit = js.native
  def setAggregation(sAggregationName: String,
                     oObject: Object,
                     bSuppressInvalidate: Boolean): this.type = js.native
  def setAssociation(sAssociationName: String,
                     sId: String|ManagedObject,
                     bSuppressInvalidate: Boolean): this.type = js.native
  def setBindingContext(oContext: Object,
                        sModelName: String): this.type = js.native
  def setModel(oModel: js.Object, sName: js.UndefOr[String] = js.undefined): this.type = js.native
  def setProperty(sPropertyName: String,
                  oValue: Object,
                  bSuppressInvalidate: Boolean): this.type = js.native
  override def toString: String = js.native
  def unbindAggregation(sName: String,
                        bSuppressReset: Boolean): this.type = js.native
  def unbindObject(sModelName: String): this.type = js.native
  def unbindProperty(sName: String,
                     bSuppressReset: Boolean): this.type = js.native
  def validateAggregation(sAggregationName: String,
                          oObject: Object,
                          bMultiple: Boolean): Any = js.native //ManagedObject | Any
  def validateProperty(sPropertyName: String,
                       oValue: Object): Any = js.native
  @deprecated("Use bindElement instead.", "1.11.1")
  def bindContext(sPath: String): ManagedObject = js.native
  @deprecated("Use bindElement instead.", "1.11.1")
  def unbindContext(sModelName: String): ManagedObject = js.native
}