package com.sap.demo

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("Utils")
object Utils {
  val owmQueryParams = scala.collection.mutable.Map[String, String](
    "q" -> ""
    , "type" -> "like"
    , "mode" -> "json"
    //,"apikey" -> "<Paste your API Key value here>"
    , "apikey" -> "9ff16c79edd6ad12396c22ed8a7996ec"
  )
  val mbQueryParams = scala.collection.Map[String, String](
    "access_token" -> "pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
  )

  // OpenWeatherMap endpoint details
  def weatherBaseURL = {
    def openWeatherMapHost = "openweathermap.org"
    def openWeatherMapAPI = "https://api.".concat(openWeatherMapHost)

    openWeatherMapAPI.concat("/data/2.5/weather")
  }

  def mapBoxBaseURL = {
    def mapBoxHost = "https://api.tiles.mapbox.com"

    mapBoxHost.concat("/v4/{id}/{z}/{x}/{y}.png")
  }

  // Check if a character string is a valid hex number
  def isHexStr(s: String): Boolean = {
    val hexSet = ('0' to '9').toSet ++ ('a' to 'f').toSet

    s.toLowerCase.forall(c => hexSet contains c)
  }

  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // Various text string constants
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /*private def months = Array(
    "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
  )

  private def ordinalTxt = Array("th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th")
*/

  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // Various string formatting functions
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

  // All temperatures are returned in Kelvin
  def kelvinToDegStr(k: Double, min: Double, max: Double): String = {
    val variation = (max - min) / 2
    (k - 272.15).toInt + "˚C" + (if (variation > 0) s" ±${variation}˚C" else "")
  }

  // Format the lat/lon coordinates into a text string
  def formatCoords(lat: Double, lon: Double): String = {
    val latStr = s"${Math.abs(lat)}˚${if (lat >= 0) "N" else "S"}"
    val lonStr = s"${Math.abs(lon)}˚${if (lon >= 0) "E" else "W"}"

    s"$latStr, $lonStr"
  }

  // Convert the wind direction heading in degrees to the nearest compass point
  def formatHeading(h: Double): String = {
    val upper = Math.floor((h + 12.25) / 22.5).toInt % 16
    val lower = Math.floor((h - 12.25) / 22.5).toInt % 16

    def compassPoints = Seq(
      "N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE",
      "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"
    )

    h + s"˚ (${compassPoints(Math.max(upper, lower))})"
  }

  // Add the appropriate unit string after various values
  def formatVisibility(v: Int): String = v + " m"

  def formatVelocity(v: Double): String = v + " m/s"

  def formatPercentage(p: Double): String = p + "%"

  def formatPressure(p: Double): String = p + " hPa"
}