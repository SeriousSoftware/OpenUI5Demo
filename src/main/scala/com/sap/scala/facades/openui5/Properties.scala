package com.sap.scala.facades.openui5

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.{Item, URI}
import com.sap.scala.facades.openui5.m.ColumnListItem

import scala.scalajs.js
import scala.scalajs.js.Function1
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait TextProp extends core.Element {
  self =>
  def getText(): String = js.native
  def setText(text: String): self.type = js.native
}

@js.native
trait EnabledProp extends core.Element {
  self =>
  def getEnabled(): Boolean = js.native
  def setEnabled(b: Boolean): self.type = js.native
}

@js.native
trait EditableProp extends core.Control {
  self =>
  def getEditable(): Boolean = js.native
  def setEditable(b: Boolean): self.type = js.native
}

@js.native
trait NameProp extends js.Object {
  self =>
  def getName(): String = js.native
  def setName(s: String): self.type = js.native
}

@js.native
trait PlaceholderProp extends js.Object {
  self =>
  def getPlaceholder(): String = js.native
  def setPlaceholder(text: String): self.type  = js.native
}

@js.native
trait IconProp extends core.Element {
  self =>
  def getIcon(): URI = js.native

  def setIcon(icon: URI): self.type = js.native
}


@js.native
trait StringValueProp extends core.Control {
  self =>
  type EventPropType <: StringValueEventProps

  def getValue(): String = js.native
  def setValue(b: String): self.type = js.native
  def attachChange(fnFunction: js.Function1[Event[EventPropType], Unit]): Unit = js.native
  def detachChange(fnFunction: js.Function1[Event[EventPropType], Unit]): Unit = js.native
}

@js.native
trait SelectedProp extends core.Control{
  def getSelected(): Boolean = js.native
  def setSelected(b: Boolean): Unit = js.native
  def attachSelect(fnFunction: js.Function1[Event[SelectedEventProps], Unit]): Unit = js.native
  def detachSelect(fnFunction: js.Function1[Event[SelectedEventProps], Unit]): Unit = js.native
  def fireSelect(): this.type = js.native
}


@js.native
trait LiveValueProp extends core.Control {
  self =>
  def attachLiveChange(fn: js.Function1[Event[StringValueEventProps], Unit]): self.type = js.native
  def detachLiveChange(fn: js.Function1[Event[StringValueEventProps], Unit]): self.type = js.native
}

@js.native
trait DateValueProp extends StringValueProp {
  override type EventPropType = DateValueEventProps
}

/*
             EVENT TYPES
 */
@js.native
trait SelectedEventProps extends EventProps{
  def selected: Boolean = js.native
}

@js.native
trait ExpandEventProps extends EventProps{
  def expand: Boolean = js.native
}

@js.native
trait SuggestEventProps extends EventProps{
  def suggestValue: String
}

@js.native
trait StringValueEventProps extends EventProps{
  def value : String = js.native
  def newValue: String = js.native
}

@js.native
trait TokenUpdateEventProps extends EventProps {
  def `type`: String = js.native
  def addedTokens: js.Array[m.Token]
  def removedTokens: js.Array[m.Token]
}

@js.native
trait SelectionChangeProps extends EventProps{
  def selectedItem : Item
}

@js.native
trait ColumnListItemSelected extends EventProps{
  def selectedRow : ColumnListItem
}

@js.native
trait DateValueEventProps extends StringValueEventProps{
  def valid : Boolean = js.native
}

@ScalaJSDefined
//@PropsCompanionObject
trait FireSelectProps extends js.Object {
  val selected: Boolean
}
