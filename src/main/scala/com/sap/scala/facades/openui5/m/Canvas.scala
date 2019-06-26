package com.sap.scala.facades.openui5.m

import com.sap.scala.facades.openui5.core.{CSSColor, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Wrapper for sap.marmolata.ui.Canvas
  */
@JSGlobal("sap.marmolata.ui.Canvas")
@js.native
class Canvas() extends Control {
  def clear(): Unit = js.native
  def doWithContext(f: js.Function1[js.Dynamic, Unit]): Unit = js.native
  def getBackgroundColor(): CSSColor = js.native
  def setBackgroundColor(c: CSSColor): Unit = js.native
}