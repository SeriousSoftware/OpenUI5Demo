package com.sap.demo

import com.felstar.scalajs.leaflet.{L, LMapOptions, MarkerOptions, TileLayerOptions}
import com.sap.demo.Utils.{mapBoxEndpoint, mbQueryParams}

import scala.scalajs.js.annotation.JSExport

object SlippyMap {
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // Create a slippy map of the current city and as a side-effect, directly
  // updates the DOM element received as a parameter
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  @JSExport
  def buildSlippyMap(mapDiv: String, report: WeatherReportBuilder): () => Unit = {
    () => {
      // Centre the map on the city's coordinates with a default zoom level of 12
      // Then place the slippy map inside the just-created div called mapDiv
      val mapOpts = LMapOptions.zoom(12).center((report.coord.lat, report.coord.lon))
      val map = L.map(mapDiv, mapOpts)

      val queryStr = (for (p <- mbQueryParams.keys)
        yield s"$p=${mbQueryParams(p)}"
        ).mkString("?", "&", "")

      val tileLayer = L.tileLayer(
        mapBoxEndpoint.concat(queryStr),
        TileLayerOptions
          .id("mapbox.streets")
          .maxZoom(19)
          .attribution(
            """Map data © <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
              |<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
              |Imagery © <a href="http://mapbox.com">Mapbox</a>""".stripMargin)
      )

      tileLayer.addTo(map)

      L.marker(
        (report.coord.lat, report.coord.lon),
        MarkerOptions.title(s"${report.cityName}, ${report.weatherSys.country}"))
        .addTo(map)
    }
  }

}
