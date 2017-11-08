
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.core.{URI,TitleLevel}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.core.Title")
@js.native
class Title() extends Element {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getEmphasized(): Boolean = js.native
  def getIcon(): URI = js.native
  def getLevel(): TitleLevel = js.native
//  def getMetadata(): Metadata = js.native
  def getText(): String = js.native
  def setEmphasized(bEmphasized: Boolean): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setLevel(sLevel: TitleLevel): this.type = js.native
  def setText(sText: String): this.type = js.native
}
     