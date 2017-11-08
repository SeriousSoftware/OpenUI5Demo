
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base._


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.ui.core.Locale")
@js.native
class Locale() extends js.Object {
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
  def getExtension(): String = js.native
//  def getExtensionSubtags(): /*TODO Type: 'string[]' not found.*/ = js.native
  def getLanguage(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getPrivateUse(): String = js.native
//  def getPrivateUseSubtags(): /*TODO Type: 'string[]' not found.*/ = js.native
  def getRegion(): String = js.native
  def getSAPLogonLanguage(): String = js.native
  def getScript(): String = js.native
  def getVariant(): String = js.native
//  def getVariantSubtags(): /*TODO Type: 'string[]' not found.*/ = js.native
}
     