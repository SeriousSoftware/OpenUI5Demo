
package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.base._
//import com.sap.scala.facades.openui5.m.PopinDisplay
import com.sap.scala.facades.openui5.core.{Element,CSSSize,Control,TextAlign,VerticalAlign}


import scala.scalajs.js
import scala.scalajs.js.{Array, |}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSGlobal}

@JSGlobal("sap.m.Column")
@js.native
class Column() extends Element {
//  def applyAlignTo(oControl: Control, sAlign: /*TODO Type: 'String' not found.*/): Control = js.native
  def clearLastValue(): this.type = js.native
  def destroyFooter(): this.type = js.native
  def destroyHeader(): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getCssAlign(sAlign: /*TODO Type: 'String' not found.*/): /*TODO Type: 'String' not found.*/ = js.native
  def getDemandPopin(): Boolean = js.native
  def getFooter(): Control = js.native
  def getHAlign(): TextAlign = js.native
  def getHeader(): Control = js.native
  def getInitialOrder(): Int = js.native
  def getLastValue(): Unit = js.native
  def getMergeDuplicates(): Boolean = js.native
  def getMergeFunctionName(): String = js.native
//  def getMetadata(): Metadata = js.native
  def getMinScreenWidth(): String = js.native
  def getOrder(): Int = js.native
  def getPopinDisplay(): PopinDisplay = js.native
  def getPopinHAlign(): TextAlign = js.native
  def getStyleClass(): String = js.native
  def getVAlign(): VerticalAlign = js.native
  def getVisible(): Boolean = js.native
  def getWidth(): CSSSize = js.native
  def isHidden(): Unit = js.native
  def isPopin(): Unit = js.native
  def onItemsRemoved(): Unit = js.native
  def setDemandPopin(bDemandPopin: Boolean): this.type = js.native
//  def setDisplay(oTableDomRef: /*TODO Type: 'Object' not found.*/, bDisplay: Boolean): Unit = js.native
//  def setDisplayViaMedia(oTableDomRef: /*TODO Type: 'Object' not found.*/): Unit = js.native
  def setFooter(oFooter: Control): this.type = js.native
  def setHAlign(sHAlign: TextAlign): this.type = js.native
  def setHeader(oHeader: Control): this.type = js.native
  def setIndex(nIndex: Int): Unit = js.native
  def setInitialOrder(nOrder: Int): Unit = js.native
//  def setLastValue(value: /*TODO Type: 'any' not found.*/): this.type = js.native
  def setMergeDuplicates(bMergeDuplicates: Boolean): this.type = js.native
  def setMergeFunctionName(sMergeFunctionName: String): this.type = js.native
  def setMinScreenWidth(sMinScreenWidth: String): this.type = js.native
  def setOrder(nOrder: Int): Unit = js.native
  def setPopinDisplay(sPopinDisplay: PopinDisplay): this.type = js.native
  def setPopinHAlign(sPopinHAlign: TextAlign): this.type = js.native
  def setStyleClass(sStyleClass: String): this.type = js.native
  def setVAlign(sVAlign: VerticalAlign): this.type = js.native
  def setVisible(bVisible: Boolean): this.type = js.native
  def setWidth(sWidth: CSSSize): this.type = js.native
}
     