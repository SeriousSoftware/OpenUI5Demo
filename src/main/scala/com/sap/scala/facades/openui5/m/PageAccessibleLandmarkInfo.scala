
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
import com.sap.scala.facades.openui5.core.{Element,AccessibleLandmarkRole}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.PageAccessibleLandmarkInfo")
@js.native
class PageAccessibleLandmarkInfo() extends Element {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getContentLabel(): String = js.native
  def getContentRole(): AccessibleLandmarkRole = js.native
  def getFooterLabel(): String = js.native
  def getFooterRole(): AccessibleLandmarkRole = js.native
  def getHeaderLabel(): String = js.native
  def getHeaderRole(): AccessibleLandmarkRole = js.native
//  def getMetadata(): Metadata = js.native
  def getRootLabel(): String = js.native
  def getRootRole(): AccessibleLandmarkRole = js.native
  def getSubHeaderLabel(): String = js.native
  def getSubHeaderRole(): AccessibleLandmarkRole = js.native
  def setContentLabel(sContentLabel: String): this.type = js.native
  def setContentRole(sContentRole: AccessibleLandmarkRole): this.type = js.native
  def setFooterLabel(sFooterLabel: String): this.type = js.native
  def setFooterRole(sFooterRole: AccessibleLandmarkRole): this.type = js.native
  def setHeaderLabel(sHeaderLabel: String): this.type = js.native
  def setHeaderRole(sHeaderRole: AccessibleLandmarkRole): this.type = js.native
  def setRootLabel(sRootLabel: String): this.type = js.native
  def setRootRole(sRootRole: AccessibleLandmarkRole): this.type = js.native
  def setSubHeaderLabel(sSubHeaderLabel: String): this.type = js.native
  def setSubHeaderRole(sSubHeaderRole: AccessibleLandmarkRole): this.type = js.native
}
     