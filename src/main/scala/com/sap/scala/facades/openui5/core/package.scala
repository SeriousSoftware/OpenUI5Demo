package com.sap.scala.facades.openui5

// This package object needs to be created manually!!

package object core {
  type URI = String
  type ID = String

  type BackgroundDesign = String

  object BackgroundDesign {
    val Solid = "Solid"
    val Translucent = "Translucent"
    val Transparent = "Transparent"
  }

  type CSSSize = String

  object CSSSize{
    val Auto : CSSSize = "auto"
    val Inherit : CSSSize = "inherit"
    def rem(count: Double) = s"${count}rem"
  }

  type CSSColor = String

  object CSSColor{
    val black     = "black"
    val white     = "white"
    val red       = "red"
    val yellow    = "yellow"
    val green     = "green"
    val blue      = "blue"
    val lightgray = "lightgray"

    def fromRGB(red: Int, green: Int, blue: Int): CSSColor = {
      if (Seq(red,green,blue).map(v => v < 256 && v >= 0).reduce(_ && _))
        "#" + red.toHexString.toUpperCase + green.toHexString.toUpperCase + blue.toHexString.toUpperCase
      else
        throw new Exception("Color parameter outside of expected range (0 to 255):")
    }

    //TODO def fromHexString(hexString: String): CSSColor
  }

}
