package com.sap.scala.facades.openui5.layout

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait BlockRowColorSets extends js.Object

object BlockRowColorSets{
  @JSGlobal("sap.ui.layout.BlockRowColorSets.ColorSet1")
  @js.native
  object ColorSet1 extends BlockRowColorSets

  @JSGlobal("sap.ui.layout.BlockRowColorSets.ColorSet2")
  @js.native
  object ColorSet2 extends BlockRowColorSets

  @JSGlobal("sap.ui.layout.BlockRowColorSets.ColorSet3")
  @js.native
  object ColorSet3 extends BlockRowColorSets

  @JSGlobal("sap.ui.layout.BlockRowColorSets.ColorSet4")
  @js.native
  object ColorSet4 extends BlockRowColorSets
}

/* copy to Enum.scala
sealed trait BlockRowColorSets{
  private[ui] def toFacade: sap.ui.layout.BlockRowColorSets
}

object BlockRowColorSets {
  def fromFacade(s: ui.layout.BlockRowColorSets): BlockRowColorSets = s match {
    case ui.layout.BlockRowColorSets.ColorSet1 => BlockRowColorSets.ColorSet1
    case ui.layout.BlockRowColorSets.ColorSet2 => BlockRowColorSets.ColorSet2
    case ui.layout.BlockRowColorSets.ColorSet3 => BlockRowColorSets.ColorSet3
    case ui.layout.BlockRowColorSets.ColorSet4 => BlockRowColorSets.ColorSet4
   case _ =>
     throw new UnsupportedOperationException(s"Unknown BlockRowColorSets: $s")
  }

  object ColorSet1 extends BlockRowColorSets {
    override private[ui] def toFacade: ui.layout.BlockRowColorSets = ui.layout.BlockRowColorSets.ColorSet1
  }

  object ColorSet2 extends BlockRowColorSets {
    override private[ui] def toFacade: ui.layout.BlockRowColorSets = ui.layout.BlockRowColorSets.ColorSet2
  }

  object ColorSet3 extends BlockRowColorSets {
    override private[ui] def toFacade: ui.layout.BlockRowColorSets = ui.layout.BlockRowColorSets.ColorSet3
  }

  object ColorSet4 extends BlockRowColorSets {
    override private[ui] def toFacade: ui.layout.BlockRowColorSets = ui.layout.BlockRowColorSets.ColorSet4
  }

}*/