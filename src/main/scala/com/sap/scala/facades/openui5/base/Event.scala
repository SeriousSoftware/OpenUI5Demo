package com.sap.scala.facades.openui5.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//@JSGlobal("sap.ui.base.Event")
//@js.native
//class Event() extends Object {
//  def cancelBubble(): Unit = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def getId(): String = js.native
//  def getMetadata(): Metadata = js.native
////  def getParameter(sName: String): /*TODO Type: 'any' not found.*/ = js.native
////  def getParameters(): /*TODO Type: 'map' not found.*/ = js.native
//  def getSource(): EventProvider = js.native
//  def preventDefault(): Unit = js.native
//}

@JSGlobal("sap.ui.base.Event")
@js.native
class Event[+EP <: EventProps]() extends BaseObject {
  def cancelBubble()             : Unit       = js.native
  def getId()                    : String     = js.native
  def getParameter(sName: String): js.Dynamic = js.native
  def getParameters()            : EP         = js.native
  def getSource()                : js.Any     = js.native
}


object Event {
  // TODO: I believe `js.Function1[Event, Unit]` not the best choice
  // because js.Function extends js.Any which causes warning "Members of
  // traits, classes and objects extending js.Any may only contain members that
  // call js.native. This will be enforced in 1.0." on every usage attempt
  type Fn = js.Function1[Event[EventProps], Unit]
}