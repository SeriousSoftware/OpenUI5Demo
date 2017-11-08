package com.sap.scala.facades.openui5.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
sealed trait GenericTileMode extends js.Object

object GenericTileMode{
  @JSGlobal("sap.m.GenericTileMode.ContentMode")
  @js.native
  object ContentMode extends GenericTileMode

  @JSGlobal("sap.m.GenericTileMode.HeaderMode")
  @js.native
  object HeaderMode extends GenericTileMode

  @JSGlobal("sap.m.GenericTileMode.LineMode")
  @js.native
  object LineMode extends GenericTileMode
}

/* copy to Enum.scala
sealed trait GenericTileMode{
  private[ui] def toFacade: sap.m.GenericTileMode
}

object GenericTileMode {
  def fromFacade(s: m.GenericTileMode): GenericTileMode = s match {
    case m.GenericTileMode.ContentMode => GenericTileMode.ContentMode
    case m.GenericTileMode.HeaderMode => GenericTileMode.HeaderMode
    case m.GenericTileMode.LineMode => GenericTileMode.LineMode
   case _ =>
     throw new UnsupportedOperationException(s"Unknown GenericTileMode: $s")
  }
  
  object ContentMode extends GenericTileMode {
    override private[ui] def toFacade: m.GenericTileMode = m.GenericTileMode.ContentMode
  }

  object HeaderMode extends GenericTileMode {
    override private[ui] def toFacade: m.GenericTileMode = m.GenericTileMode.HeaderMode
  }

  object LineMode extends GenericTileMode {
    override private[ui] def toFacade: m.GenericTileMode = m.GenericTileMode.LineMode
  }

}
*/
