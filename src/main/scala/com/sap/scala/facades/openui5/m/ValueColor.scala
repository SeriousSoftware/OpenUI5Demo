package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ValueColor extends js.Object

object ValueColor{
  @JSGlobal("sap.m.ValueColor.Critical")
  @js.native
  object Critical extends ValueColor

  @JSGlobal("sap.m.ValueColor.Error")
  @js.native
  object Error extends ValueColor

  @JSGlobal("sap.m.ValueColor.Good")
  @js.native
  object Good extends ValueColor

  @JSGlobal("sap.m.ValueColor.Neutral")
  @js.native
  object Neutral extends ValueColor
}

/* copy to Enum.scala
sealed trait ValueColor{
  private[ui] def toFacade: sap.m.ValueColor
}

object ValueColor {
  def fromFacade(s: m.ValueColor): ValueColor = s match {
    case m.ValueColor.Critical => ValueColor.Critical
    case m.ValueColor.Error => ValueColor.Error
    case m.ValueColor.Good => ValueColor.Good
    case m.ValueColor.Neutral => ValueColor.Neutral
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ValueColor: $s")
  }

  object Critical extends ValueColor {
    override private[ui] def toFacade: m.ValueColor = m.ValueColor.Critical
  }

  object Error extends ValueColor {
    override private[ui] def toFacade: m.ValueColor = m.ValueColor.Error
  }

  object Good extends ValueColor {
    override private[ui] def toFacade: m.ValueColor = m.ValueColor.Good
  }

  object Neutral extends ValueColor {
    override private[ui] def toFacade: m.ValueColor = m.ValueColor.Neutral
  }

}*/