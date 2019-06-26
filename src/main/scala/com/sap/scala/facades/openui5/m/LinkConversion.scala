package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait LinkConversion extends js.Object

object LinkConversion{
  @JSGlobal("sap.m.LinkConversion.All")
  @js.native
  object All extends LinkConversion

  @JSGlobal("sap.m.LinkConversion.None")
  @js.native
  object None extends LinkConversion

  @JSGlobal("sap.m.LinkConversion.ProtocolOnly")
  @js.native
  object ProtocolOnly extends LinkConversion
}

/* copy to Enum.scala
sealed trait LinkConversion{
  private[ui] def toFacade: sap.m.LinkConversion
}

object LinkConversion {
  def fromFacade(s: m.LinkConversion): LinkConversion = s match {
    case m.LinkConversion.All => LinkConversion.All
    case m.LinkConversion.None => LinkConversion.None
    case m.LinkConversion.ProtocolOnly => LinkConversion.ProtocolOnly
   case _ =>
     throw new UnsupportedOperationException(s"Unknown LinkConversion: $s")
  }

  object All extends LinkConversion {
    override private[ui] def toFacade: m.LinkConversion = m.LinkConversion.All
  }

  object None extends LinkConversion {
    override private[ui] def toFacade: m.LinkConversion = m.LinkConversion.None
  }

  object ProtocolOnly extends LinkConversion {
    override private[ui] def toFacade: m.LinkConversion = m.LinkConversion.ProtocolOnly
  }

}
*/