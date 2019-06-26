package com.sap.demo

import java.lang.{Long => JLong}

import scala.scalajs.js

// Country, sunrise and sunset times.
class WeatherSys(sys: js.Dynamic) {
  val country = sys.country.asInstanceOf[String]

  val sunrise = {
    if (sys.sunrise.toString == "undefined")
      0
    else
      JLong.parseLong(sys.sunrise.toString)
  }

  val sunset = {
    if (sys.sunset.toString == "undefined")
      0
    else
      JLong.parseLong(sys.sunset.toString)
  }
}