package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait BarDesign extends js.Object

object BarDesign{
  @JSGlobal("sap.m.BarDesign.Auto")
  @js.native
  object Auto extends BarDesign

  @JSGlobal("sap.m.BarDesign.Footer")
  @js.native
  object Footer extends BarDesign

  @JSGlobal("sap.m.BarDesign.Header")
  @js.native
  object Header extends BarDesign

  @JSGlobal("sap.m.BarDesign.SubHeader")
  @js.native
  object SubHeader extends BarDesign
}

/* copy to Enum.scala
sealed trait BarDesign{
  private[ui] def toFacade: sap.m.BarDesign
}

object BarDesign {
  def fromFacade(s: m.BarDesign): BarDesign = s match {
    case m.BarDesign.Auto => BarDesign.Auto
    case m.BarDesign.Footer => BarDesign.Footer
    case m.BarDesign.Header => BarDesign.Header
    case m.BarDesign.SubHeader => BarDesign.SubHeader
   case _ =>
     throw new UnsupportedOperationException(s"Unknown BarDesign: $s")
  }
  
  object Auto extends BarDesign {
    override private[ui] def toFacade: m.BarDesign = m.BarDesign.Auto
  }

  object Footer extends BarDesign {
    override private[ui] def toFacade: m.BarDesign = m.BarDesign.Footer
  }

  object Header extends BarDesign {
    override private[ui] def toFacade: m.BarDesign = m.BarDesign.Header
  }

  object SubHeader extends BarDesign {
    override private[ui] def toFacade: m.BarDesign = m.BarDesign.SubHeader
  }

}
*/
