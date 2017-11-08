package com.sap.scala.facades.openui5.layout

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait BlockBackgroundType extends js.Object

object BlockBackgroundType{
  @JSGlobal("sap.ui.layout.BlockBackgroundType.Accent")
  @js.native
  object Accent extends BlockBackgroundType

  @JSGlobal("sap.ui.layout.BlockBackgroundType.Dashboard")
  @js.native
  object Dashboard extends BlockBackgroundType

  @JSGlobal("sap.ui.layout.BlockBackgroundType.Default")
  @js.native
  object Default extends BlockBackgroundType

  @JSGlobal("sap.ui.layout.BlockBackgroundType.Light")
  @js.native
  object Light extends BlockBackgroundType

  @JSGlobal("sap.ui.layout.BlockBackgroundType.Mixed")
  @js.native
  object Mixed extends BlockBackgroundType
}

/* copy to Enum.scala
sealed trait BlockBackgroundType{
  private[ui] def toFacade: sap.ui.layout.BlockBackgroundType
}

object BlockBackgroundType {
  def fromFacade(s: ui.layout.BlockBackgroundType): BlockBackgroundType = s match {
    case ui.layout.BlockBackgroundType.Accent => BlockBackgroundType.Accent
    case ui.layout.BlockBackgroundType.Dashboard => BlockBackgroundType.Dashboard
    case ui.layout.BlockBackgroundType.Default => BlockBackgroundType.Default
    case ui.layout.BlockBackgroundType.Light => BlockBackgroundType.Light
    case ui.layout.BlockBackgroundType.Mixed => BlockBackgroundType.Mixed
   case _ =>
     throw new UnsupportedOperationException(s"Unknown BlockBackgroundType: $s")
  }
  
  object Accent extends BlockBackgroundType {
    override private[ui] def toFacade: ui.layout.BlockBackgroundType = ui.layout.BlockBackgroundType.Accent
  }

  object Dashboard extends BlockBackgroundType {
    override private[ui] def toFacade: ui.layout.BlockBackgroundType = ui.layout.BlockBackgroundType.Dashboard
  }

  object Default extends BlockBackgroundType {
    override private[ui] def toFacade: ui.layout.BlockBackgroundType = ui.layout.BlockBackgroundType.Default
  }

  object Light extends BlockBackgroundType {
    override private[ui] def toFacade: ui.layout.BlockBackgroundType = ui.layout.BlockBackgroundType.Light
  }

  object Mixed extends BlockBackgroundType {
    override private[ui] def toFacade: ui.layout.BlockBackgroundType = ui.layout.BlockBackgroundType.Mixed
  }

}
*/
