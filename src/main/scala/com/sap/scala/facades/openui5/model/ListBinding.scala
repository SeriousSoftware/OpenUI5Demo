
package com.sap.scala.facades.openui5.model

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.model.{Context,FilterType,Sorter}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.model.ListBinding")
@js.native
class ListBinding() extends Binding {
  def attachFilter(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def attachSort(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachFilter(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
  def detachSort(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def filter(aFilters: /*TODO Type: 'object[]' not found.*/, sFilterType: FilterType): this.type = js.native
  def getContexts(iStartIndex: Int, iLength: Int): js.Array[Context] = js.native
  def getCurrentContexts(): js.Array[Context] = js.native
//  def getDistinctValues(sPath: String): /*TODO Type: 'Array' not found.*/ = js.native
  def getGroup(oContext: Context): Object = js.native
  def getLength(): Int = js.native
//  def getMetadata(): Metadata = js.native
  def isGrouped(): Boolean = js.native
  def isLengthFinal(): Boolean = js.native
//  def sort(aSorters: Sorter | /*TODO Type: 'Array' not found.*/): this.type = js.native
}
     