package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait Wrapping extends js.Object

object Wrapping{
  @JSGlobal("sap.ui.core.Wrapping.Hard")
  @js.native
  object Hard extends Wrapping

  @JSGlobal("sap.ui.core.Wrapping.None")
  @js.native
  object None extends Wrapping

  @JSGlobal("sap.ui.core.Wrapping.Off")
  @js.native
  object Off extends Wrapping

  @JSGlobal("sap.ui.core.Wrapping.Soft")
  @js.native
  object Soft extends Wrapping
}

/* copy to Enum.scala
sealed trait Wrapping{
  private[ui] def toFacade: sap.ui.core.Wrapping
}

object Wrapping {
  def fromFacade(s: ui.core.Wrapping): Wrapping = s match {
    case ui.core.Wrapping.Hard => Wrapping.Hard
    case ui.core.Wrapping.None => Wrapping.None
    case ui.core.Wrapping.Off => Wrapping.Off
    case ui.core.Wrapping.Soft => Wrapping.Soft
   case _ =>
     throw new UnsupportedOperationException(s"Unknown Wrapping: $s")
  }
  
  object Hard extends Wrapping {
    override private[ui] def toFacade: ui.core.Wrapping = ui.core.Wrapping.Hard
  }

  object None extends Wrapping {
    override private[ui] def toFacade: ui.core.Wrapping = ui.core.Wrapping.None
  }

  object Off extends Wrapping {
    override private[ui] def toFacade: ui.core.Wrapping = ui.core.Wrapping.Off
  }

  object Soft extends Wrapping {
    override private[ui] def toFacade: ui.core.Wrapping = ui.core.Wrapping.Soft
  }

}
*/
