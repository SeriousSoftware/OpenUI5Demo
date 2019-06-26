package com.sap.scala.facades.openui5.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait BindingMode extends js.Object

object BindingMode{
  @JSGlobal("sap.ui.model.BindingMode.Default")
  @js.native
  object Default extends BindingMode

  @JSGlobal("sap.ui.model.BindingMode.OneTime")
  @js.native
  object OneTime extends BindingMode

  @JSGlobal("sap.ui.model.BindingMode.OneWay")
  @js.native
  object OneWay extends BindingMode

  @JSGlobal("sap.ui.model.BindingMode.TwoWay")
  @js.native
  object TwoWay extends BindingMode
}

/* copy to Enum.scala
sealed trait BindingMode{
  private[ui] def toFacade: sap.ui.model.BindingMode
}

object BindingMode {
  def fromFacade(s: ui.model.BindingMode): BindingMode = s match {
    case ui.model.BindingMode.Default => BindingMode.Default
    case ui.model.BindingMode.OneTime => BindingMode.OneTime
    case ui.model.BindingMode.OneWay => BindingMode.OneWay
    case ui.model.BindingMode.TwoWay => BindingMode.TwoWay
   case _ =>
     throw new UnsupportedOperationException(s"Unknown BindingMode: $s")
  }

  object Default extends BindingMode {
    override private[ui] def toFacade: ui.model.BindingMode = ui.model.BindingMode.Default
  }

  object OneTime extends BindingMode {
    override private[ui] def toFacade: ui.model.BindingMode = ui.model.BindingMode.OneTime
  }

  object OneWay extends BindingMode {
    override private[ui] def toFacade: ui.model.BindingMode = ui.model.BindingMode.OneWay
  }

  object TwoWay extends BindingMode {
    override private[ui] def toFacade: ui.model.BindingMode = ui.model.BindingMode.TwoWay
  }

}
*/