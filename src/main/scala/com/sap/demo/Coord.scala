package com.sap.demo

import scala.scalajs.js

// Latitude and longitude of a city
class Coord(coord: js.Dynamic) {
  val lon = coord.lon.asInstanceOf[Double]
  val lat = coord.lat.asInstanceOf[Double]
}
