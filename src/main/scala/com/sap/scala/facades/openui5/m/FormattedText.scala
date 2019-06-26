package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core.{CSSSize, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.m.FormattedText")
@js.native
class FormattedText() extends Control {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getConvertedLinksDefaultTarget(): String = js.native
  def getConvertLinksToAnchorTags(): LinkConversion = js.native
  def getHeight(): CSSSize = js.native
  def getHtmlText(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getWidth(): CSSSize = js.native
  def setConvertedLinksDefaultTarget(sConvertedLinksDefaultTarget: String): this.type = js.native
  def setConvertLinksToAnchorTags(sConvertLinksToAnchorTags: LinkConversion): this.type = js.native
  def setHeight(sHeight: CSSSize): this.type = js.native
  def setHtmlText(sText: String): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}