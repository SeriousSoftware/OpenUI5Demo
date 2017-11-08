
package com.sap.scala.facades.openui5.layout.form

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.LayoutData

import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.layout.form.GridContainerData")
@js.native
class GridContainerData() extends LayoutData {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getHalfGrid(): Boolean = js.native
//  def getMetadata(): Metadata = js.native
  def setHalfGrid(bHalfGrid: Boolean): this.type = js.native
}
     