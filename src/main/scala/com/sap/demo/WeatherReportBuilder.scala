package com.sap.demo

import java.lang.{Long => JLong}

import scala.scalajs.js

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// Class initialiser extracts weather data from JSON response
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
class WeatherReportBuilder(data: js.Dynamic) {

  // Multiple weather conditions might be supplied for one location
  lazy val weatherConditions: Seq[WeatherCond] = data.weather.map {
    weatherItem: js.Dynamic => new WeatherCond(weatherItem)
  }.asInstanceOf[js.Array[WeatherCond]].toSeq
  // Optional rain and snow fall information
  lazy val rain = if (data.rain == null || data.rain.toString == "undefined") 0.0
  else data.rain.`3h`.asInstanceOf[Double]
  lazy val snow = if (data.snow == null || data.snow.toString == "undefined") 0.0
  else data.snow.`3h`.asInstanceOf[Double]
  // City Id and Name.  HTTP response code
  lazy val cityId = data.id.asInstanceOf[Int]
  lazy val cityName = data.name.asInstanceOf[String]
  lazy val returnCode = if (data.cod.toString == "undefined") -1 else data.cod.asInstanceOf[Int]
  // City coordinates
  val coord = new Coord(data.coord)
  // Extract basic atmospheric conditions:
  val main = new WeatherMain(data.main)

  // Wind speed and optional direction (given as a heading in degrees)
  val wind = new Wind(data.wind)
  // UTC timestamp showing when measurements were taken
  val measuredAt = JLong.parseLong(data.dt.toString)
  // Country, sunrise and sunset times.
  val weatherSys = new WeatherSys(data.sys)

  // Optional visibility information
  def visibility: Int = if (data.visibility.toString == "undefined") 0 else data.visibility.asInstanceOf[Int]

  // Percentage cloud cover
  def clouds = data.clouds.all.asInstanceOf[Int]

  // Latitude and longitude of a city
  class Coord(coord: js.Dynamic) {
    val lon = coord.lon.asInstanceOf[Double]
    val lat = coord.lat.asInstanceOf[Double]
  }

  // A set of weather conditions.  Each city will have one or more
  // of these objects
  class WeatherCond(weatherItem: js.Dynamic) {
    val weatherId = weatherItem.id.asInstanceOf[Int]
    val main = weatherItem.main.asInstanceOf[String]
    val desc = weatherItem.description.asInstanceOf[String]
    val icon = weatherItem.icon.asInstanceOf[String]
  }

  // Basic atmospheric conditions:
  // o Air temperature plus optional max/min variation values
  // o Humidity
  // o Air pressure.  This is either a simple value in hPa, or it is a
  //   pair of values: air pressure at sea level and air pressure at
  //   ground level
  class WeatherMain(weatherMain: js.Dynamic) {
    val temp = weatherMain.temp.asInstanceOf[Double]
    val airPressure = weatherMain.pressure.asInstanceOf[Double]
    val humidity = weatherMain.humidity.asInstanceOf[Int]
    val temp_min = weatherMain.temp_min.asInstanceOf[Double]
    val temp_max = weatherMain.temp_max.asInstanceOf[Double]

    val sea_level = if (weatherMain.sea_level.toString == "undefined") 0.0
    else weatherMain.sea_level.asInstanceOf[Double]

    val grnd_level = if (weatherMain.grnd_level.toString == "undefined") 0.0
    else weatherMain.grnd_level.asInstanceOf[Double]
  }

  // Country, sunrise and sunset times.
  class WeatherSys(sys: js.Dynamic) {
    val country = sys.country.asInstanceOf[String]

    val sunrise = if (sys.sunrise.toString == "undefined") 0
    else JLong.parseLong(sys.sunrise.toString)

    val sunset = if (sys.sunset.toString == "undefined") 0
    else JLong.parseLong(sys.sunset.toString)
  }

  // Wind speed and optional direction (given as a heading in degrees)
  class Wind(w: js.Dynamic) {
    val speed = w.speed.asInstanceOf[Double]
    val heading = if (w.deg.toString == "undefined")
      0.0
    else
      w.deg.asInstanceOf[Double]
  }

}