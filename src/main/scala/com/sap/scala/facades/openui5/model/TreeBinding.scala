package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.base.{Event, EventProps}
//import com.sap.scala.facades.openui5.model.{Filter,FilterType,Sorter}


import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.model.TreeBinding")
@js.native
class TreeBinding() extends Binding {
  def attachFilter(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachFilter(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
// def filter(aFilters: js.Array[Filter], sFilterType: FilterType): Unit = js.native
  def filter(aFilters: js.Array[Filter], sFilterType: String): Unit = js.native
//  def getChildCount(oContext: /*TODO Type: 'Object' not found.*/): Int = js.native
//  def getMetadata(): Metadata = js.native
//  def getNodeContexts(oContext: /*TODO Type: 'Object' not found.*/, iStartIndex: Int, iLength: Int): /*TODO Type: 'Array' not found.*/ = js.native
//  def getRootContexts(iStartIndex: Int, iLength: Int): /*TODO Type: 'Array' not found.*/ = js.native
//  def hasChildren(oContext: /*TODO Type: 'Object' not found.*/): Boolean = js.native
  def sort(aSorters: js.Array[Sorter]): Unit = js.native
}