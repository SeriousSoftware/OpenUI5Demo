package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait FlexJustifyContent extends js.Object

object FlexJustifyContent{
  @JSGlobal("sap.m.FlexJustifyContent.Center")
  @js.native
  object Center extends FlexJustifyContent

  @JSGlobal("sap.m.FlexJustifyContent.End")
  @js.native
  object End extends FlexJustifyContent

  @JSGlobal("sap.m.FlexJustifyContent.Inherit")
  @js.native
  object Inherit extends FlexJustifyContent

  @JSGlobal("sap.m.FlexJustifyContent.SpaceAround")
  @js.native
  object SpaceAround extends FlexJustifyContent

  @JSGlobal("sap.m.FlexJustifyContent.SpaceBetween")
  @js.native
  object SpaceBetween extends FlexJustifyContent

  @JSGlobal("sap.m.FlexJustifyContent.Start")
  @js.native
  object Start extends FlexJustifyContent
}

/* copy to Enum.scala
sealed trait FlexJustifyContent{
  private[ui] def toFacade: sap.m.FlexJustifyContent
}

object FlexJustifyContent {
  def fromFacade(s: m.FlexJustifyContent): FlexJustifyContent = s match {
    case m.FlexJustifyContent.Center => FlexJustifyContent.Center
    case m.FlexJustifyContent.End => FlexJustifyContent.End
    case m.FlexJustifyContent.Inherit => FlexJustifyContent.Inherit
    case m.FlexJustifyContent.SpaceAround => FlexJustifyContent.SpaceAround
    case m.FlexJustifyContent.SpaceBetween => FlexJustifyContent.SpaceBetween
    case m.FlexJustifyContent.Start => FlexJustifyContent.Start
   case _ =>
     throw new UnsupportedOperationException(s"Unknown FlexJustifyContent: $s")
  }

  object Center extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.Center
  }

  object End extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.End
  }

  object Inherit extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.Inherit
  }

  object SpaceAround extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.SpaceAround
  }

  object SpaceBetween extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.SpaceBetween
  }

  object Start extends FlexJustifyContent {
    override private[ui] def toFacade: m.FlexJustifyContent = m.FlexJustifyContent.Start
  }

}
*/