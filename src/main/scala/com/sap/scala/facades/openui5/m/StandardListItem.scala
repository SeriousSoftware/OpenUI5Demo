package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core.{TextDirection, URI, ValueState}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.StandardListItem")
@js.native
class StandardListItem() extends ListItemBase {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getActiveIcon(): URI = js.native
  def getAdaptTitleSize(): Boolean = js.native
  def getDescription(): String = js.native
  def getIcon(): URI = js.native
  def getIconDensityAware(): Boolean = js.native
  def getIconInset(): Boolean = js.native
  def getInfo(): String = js.native
  def getInfoState(): ValueState = js.native
  def getInfoTextDirection(): TextDirection = js.native
//  def getMetadata(): Metadata = js.native
  def getTitle(): String = js.native
  def getTitleTextDirection(): TextDirection = js.native
  def setActiveIcon(sActiveIcon: URI): this.type = js.native
  def setAdaptTitleSize(bAdaptTitleSize: Boolean): this.type = js.native
  def setDescription(sDescription: String): this.type = js.native
  def setIcon(sIcon: URI): this.type = js.native
  def setIconDensityAware(bIconDensityAware: Boolean): this.type = js.native
  def setIconInset(bIconInset: Boolean): this.type = js.native
  def setInfo(sInfo: String): this.type = js.native
  def setInfoState(sInfoState: ValueState): this.type = js.native
  def setInfoTextDirection(sInfoTextDirection: TextDirection): this.type = js.native
  def setTitle(sTitle: String): this.type = js.native
  def setTitleTextDirection(sTitleTextDirection: TextDirection): this.type = js.native
}