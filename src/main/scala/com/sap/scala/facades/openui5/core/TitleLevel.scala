package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait TitleLevel extends js.Object

object TitleLevel{
  @JSGlobal("sap.ui.core.TitleLevel.Auto")
  @js.native
  object Auto extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H1")
  @js.native
  object H1 extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H2")
  @js.native
  object H2 extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H3")
  @js.native
  object H3 extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H4")
  @js.native
  object H4 extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H5")
  @js.native
  object H5 extends TitleLevel

  @JSGlobal("sap.ui.core.TitleLevel.H6")
  @js.native
  object H6 extends TitleLevel
}

/* copy to Enum.scala
sealed trait TitleLevel{
  private[ui] def toFacade: sap.ui.core.TitleLevel
}

object TitleLevel {
  def fromFacade(s: ui.core.TitleLevel): TitleLevel = s match {
    case ui.core.TitleLevel.Auto => TitleLevel.Auto
    case ui.core.TitleLevel.H1 => TitleLevel.H1
    case ui.core.TitleLevel.H2 => TitleLevel.H2
    case ui.core.TitleLevel.H3 => TitleLevel.H3
    case ui.core.TitleLevel.H4 => TitleLevel.H4
    case ui.core.TitleLevel.H5 => TitleLevel.H5
    case ui.core.TitleLevel.H6 => TitleLevel.H6
   case _ =>
     throw new UnsupportedOperationException(s"Unknown TitleLevel: $s")
  }

  object Auto extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.Auto
  }

  object H1 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H1
  }

  object H2 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H2
  }

  object H3 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H3
  }

  object H4 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H4
  }

  object H5 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H5
  }

  object H6 extends TitleLevel {
    override private[ui] def toFacade: ui.core.TitleLevel = ui.core.TitleLevel.H6
  }

}
*/