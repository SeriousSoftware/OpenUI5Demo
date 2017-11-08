package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait ListSeparators extends js.Object

object ListSeparators{
  @JSGlobal("sap.m.ListSeparators.All")
  @js.native
  object All extends ListSeparators

  @JSGlobal("sap.m.ListSeparators.Inner")
  @js.native
  object Inner extends ListSeparators

  @JSGlobal("sap.m.ListSeparators.None")
  @js.native
  object None extends ListSeparators
}

/* copy to Enum.scala
sealed trait ListSeparators{
  private[ui] def toFacade: sap.m.ListSeparators
}

object ListSeparators {
  def fromFacade(s: m.ListSeparators): ListSeparators = s match {
    case m.ListSeparators.All => ListSeparators.All
    case m.ListSeparators.Inner => ListSeparators.Inner
    case m.ListSeparators.None => ListSeparators.None
   case _ =>
     throw new UnsupportedOperationException(s"Unknown ListSeparators: $s")
  }
  
  object All extends ListSeparators {
    override private[ui] def toFacade: m.ListSeparators = m.ListSeparators.All
  }

  object Inner extends ListSeparators {
    override private[ui] def toFacade: m.ListSeparators = m.ListSeparators.Inner
  }

  object None extends ListSeparators {
    override private[ui] def toFacade: m.ListSeparators = m.ListSeparators.None
  }

}
*/
