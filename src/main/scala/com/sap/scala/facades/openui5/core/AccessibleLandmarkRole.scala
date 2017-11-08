package com.sap.scala.facades.openui5.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait AccessibleLandmarkRole extends js.Object

object AccessibleLandmarkRole{
  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Banner")
  @js.native
  object Banner extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Complementary")
  @js.native
  object Complementary extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Main")
  @js.native
  object Main extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Navigation")
  @js.native
  object Navigation extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.None")
  @js.native
  object None extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Region")
  @js.native
  object Region extends AccessibleLandmarkRole

  @JSGlobal("sap.ui.core.AccessibleLandmarkRole.Search")
  @js.native
  object Search extends AccessibleLandmarkRole
}

/* copy to Enum.scala
sealed trait AccessibleLandmarkRole{
  private[ui] def toFacade: sap.ui.core.AccessibleLandmarkRole
}

object AccessibleLandmarkRole {
  def fromFacade(s: ui.core.AccessibleLandmarkRole): AccessibleLandmarkRole = s match {
    case ui.core.AccessibleLandmarkRole.Banner => AccessibleLandmarkRole.Banner
    case ui.core.AccessibleLandmarkRole.Complementary => AccessibleLandmarkRole.Complementary
    case ui.core.AccessibleLandmarkRole.Main => AccessibleLandmarkRole.Main
    case ui.core.AccessibleLandmarkRole.Navigation => AccessibleLandmarkRole.Navigation
    case ui.core.AccessibleLandmarkRole.None => AccessibleLandmarkRole.None
    case ui.core.AccessibleLandmarkRole.Region => AccessibleLandmarkRole.Region
    case ui.core.AccessibleLandmarkRole.Search => AccessibleLandmarkRole.Search
   case _ =>
     throw new UnsupportedOperationException(s"Unknown AccessibleLandmarkRole: $s")
  }
  
  object Banner extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Banner
  }

  object Complementary extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Complementary
  }

  object Main extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Main
  }

  object Navigation extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Navigation
  }

  object None extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.None
  }

  object Region extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Region
  }

  object Search extends AccessibleLandmarkRole {
    override private[ui] def toFacade: ui.core.AccessibleLandmarkRole = ui.core.AccessibleLandmarkRole.Search
  }

}
*/
