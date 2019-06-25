package com.felstar.scalajs

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

package object leaflet {

  type LatLngArray=js.Array[LatLng]

  implicit def toLatLng(tup: (Double,Double) ):LatLng=L.latLng(tup._1, tup._2)

  implicit def toLatLng(points: List[(Double,Double)]): js.Array[LatLng]=points.toJSArray.map(toLatLng)

  implicit def toPoint(tup: (Int,Int) ):Point=L.point(tup._1, tup._2)
}