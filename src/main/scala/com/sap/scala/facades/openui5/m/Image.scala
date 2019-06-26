package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{CSSSize, Control, URI}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ImageMode extends js.Object

object ImageMode {
  @JSGlobal("sap.m.ImageMode.Background")
  @js.native
  object Background extends ImageMode

  @JSGlobal("sap.m.ImageMode.Image")
  @js.native
  object Image extends ImageMode
}


@JSGlobal("sap.m.Image")
@js.native
class Image() extends Control {
  def attachError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachLoad(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachPress(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachTap(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def bindDetailBox(oBindingInfo: Object): this.type = js.native
  def destroyDetailBox(): this.type = js.native
  def detachError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachLoad(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachPress(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def detachTap(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def fireError(mParameters: Object): this.type = js.native
  def fireLoad(mParameters: Object): this.type = js.native
  def firePress(mParameters: Object): this.type = js.native
  def fireTap(mParameters: Object): this.type = js.native
//  def getAccessibilityInfo(): Unit = js.native
  def getActiveSrc(): URI = js.native
  def getAlt(): String = js.native
  def getBackgroundPosition(): String = js.native
  def getBackgroundRepeat(): String = js.native
  def getBackgroundSize(): String = js.native
  def getDecorative(): Boolean = js.native
  def getDensityAware(): Boolean = js.native
//  def getDetailBox(): LightBox = js.native
  def getHeight(): CSSSize = js.native
//  def getMetadata(): Metadata = js.native
  def getMode(): ImageMode = js.native
  def getSrc(): URI = js.native
  def getUseMap(): String = js.native
  def getWidth(): CSSSize = js.native
  def setActiveSrc(sActiveSrc: URI): this.type = js.native
  def setAlt(sAlt: String): this.type = js.native
  def setBackgroundPosition(sBackgroundPosition: String): this.type = js.native
  def setBackgroundRepeat(sBackgroundRepeat: String): this.type = js.native
  def setBackgroundSize(sBackgroundSize: String): this.type = js.native
  def setDecorative(bDecorative: Boolean): this.type = js.native
  def setDensityAware(bDensityAware: Boolean): this.type = js.native
//  def setDetailBox(oDetailBox: LightBox): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setMode(sMode: ImageMode): this.type = js.native
  def setSrc(sSrc: URI): Unit = js.native
  def setUseMap(sUseMap: String): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
  def unbindDetailBox(): this.type = js.native
}