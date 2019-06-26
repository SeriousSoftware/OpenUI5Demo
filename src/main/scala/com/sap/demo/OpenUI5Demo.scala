package com.sap.demo

import com.sap.scala.facades.openui5.base.{Event, EventProps}
import com.sap.scala.facades.openui5.core.HTML
import com.sap.scala.facades.openui5.layout.form.{Form, FormContainer, FormElement, GridElementData, GridLayout}
import com.sap.scala.facades.openui5.layout.{Grid, GridData}
import com.sap.scala.facades.openui5.m.{Button, Input, MessageToast, Text}
import com.sap.scala.facades.openui5.ui
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("OpenUI5Demo")
object OpenUI5Demo {
  import Utils.{formatCoords, formatHeading, formatPercentage, formatPressure,
    formatVelocity, formatVisibility, isHexStr, kelvinToDegStr, owmQueryParams, weatherEndpoint}

  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // Main program
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  @JSExport
  def main(weatherDivId: String): Unit = {
    val uiCore      = ui.getCore()
    var gridCounter = 0

    uiCore.attachInit(() => {
      val cityNameInput = new Input().setWidth("200px").setValueLiveUpdate(true)
      val goBtn         = new Button().setText("Ok")

      goBtn.setLayoutData(new GridElementData().setHCells("1"))

      cityNameInput.setPlaceholder("Enter a city name")
      cityNameInput.setValue(owmQueryParams("q"))

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      // Is there already a form in the DOM?  If so, its left over from the last
      // time the program was run in test mode.
      // TODO This code doesn't work reliably...
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      try {
        if (uiCore.byId(weatherDivId).isDefined) {
          println("Destroying contents of first 'weatherDiv' form.")
          uiCore.byId(weatherDivId).get.destroyDependents()
        }
      }
      catch {
        case _: NoSuchElementException => println("That's weird - can't find weatherDiv.")
      }

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      // Create form
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      val form = createForm("Weather Report")

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      // Check for missing API Key.
      // This check assumes that all OpenWeatherMap API Keys are just hex strings
      // As long as an API Key is present, assign button onclick and input field
      // onkeyup event handlers to the UI controls
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      def apiKeyPresent = isHexStr(owmQueryParams("apikey"))

      // Has the user created their own API Key?
      if (apiKeyPresent) {
        // Yup, so define the Button onPress event handler
        def onButtonPress: js.Function1[Event[EventProps], Unit] =
          (_: Event[EventProps]) => {
            println(s"User entered '${cityNameInput.getValue()}'")
            owmQueryParams += ("q" -> cityNameInput.getValue())

            def queryStr = owmQueryParams.map { case (k, v) => s"$k=$v" }.mkString("?", "&", "")

            val xhr = new dom.XMLHttpRequest
            xhr.open("GET", weatherEndpoint.concat(queryStr))

            xhr.onload = (_: dom.Event) => {
              val data = js.JSON.parse(xhr.responseText)

              // Delete any previous grid that might exist
              val oldGrid = uiCore.byId(s"__grid$gridCounter")

              if (oldGrid.isDefined) {
                oldGrid.get.destroy()
                gridCounter += 1
              }

              // Can the city be found?
              if (data.cod.toString == "404") {
                // Nope, so show error message
                MessageToast.show(s"City ${cityNameInput.getValue()} not found")
              }
              else {
                val report = new WeatherReportBuilder(data)
                buildWeatherReport(report, 0).placeAt(weatherDivId)
                SlippyMap.buildSlippyMap(s"mapDiv$gridCounter", report)
              }
            }

            // Send XHR request to OpenWeather
            xhr.send()
          }

        goBtn.attachPress(onButtonPress)
      }
      else {
        // Nope, so display a missing API key error message
        def feErr = {
          def errMsg = new Text().setText("API Key missing.  Please register with http://openweathermap.org and create" +
            " yourself an API key.  This key must then be entered into the source code in file Utils.scala at line 19.")

          new FormElement().setLabel("ERROR").addField(errMsg)
        }

        form.addFormContainer(new FormContainer().addFormElement(feErr))
      }

      {
        def fc4 = {
          def fe4 = new FormElement().setLabel("City name").addField(cityNameInput)

          new FormContainer().addFormElement(fe4)
        }

        def fc5 = {
          def fe5 = new FormElement().setLabel("").addField(goBtn)

          new FormContainer().addFormElement(fe5)
        }

        // Add contents to form and place form on the screen
        form
          .addFormContainer(fc4)
          .addFormContainer(fc5)
          .placeAt(weatherDivId)
      }
    })
  }

  def createForm(title: String) =
    new Form().setEditable(true).addStyleClass("sapUiResponsiveMargin").
      setLayout(new GridLayout().setSingleColumn(true)).setWidth("auto").setTitle(title)

  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // Build HTML weather report
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  def buildWeatherReport(report: WeatherReportBuilder, counter: Int): Grid = {
    val weatherForm = new Form().
      setEditable(true).
      addStyleClass("sapUiResponsiveMargin").
      setLayout(new GridLayout().setSingleColumn(true)).
      setWidth("auto").
      setTitle(s"${report.cityName}, ${report.weatherSys.country} (${formatCoords(report.coord.lat, report.coord.lon)})")

    def fieldFactory(label: String, output: String) = {
      val outputField = new Input().setValue(output).setEnabled(false)
      new FormContainer().addFormElement(new FormElement().setLabel(label).addField(outputField))
    }

    /*// If ground level and sea level pressures are not available, then use the general atmospheric pressure
    if (report.main.grnd_level == 0)
      fc2.addFormElement(new FormElement().setLabel("Atmospheric Pressure").addField(pressureOutput1))
    else {
      fc2.addFormElement(new FormElement().setLabel("Atmospheric Pressure (Ground Level)").addField(pressureOutput2))
      fc2.addFormElement(new FormElement().setLabel("Atmospheric Pressure (Sea Level)").addField(pressureOutput3))
    }*/

    val fields = Seq(("Temperature", kelvinToDegStr(report.main.temp, report.main.temp_min, report.main.temp_max))
      , ("Atmospheric Pressure", formatPressure(report.main.airPressure))
      , ("Atmospheric Pressure (Ground Level)", formatPressure(report.main.grnd_level))
      , ("Atmospheric Pressure (Sea Level)", formatPressure(report.main.sea_level))
      , ("Humidity", formatPercentage(report.main.humidity))
      , ("Visibility", formatVisibility(report.visibility))
      , ("Wind Speed", formatVelocity(report.wind.speed))
      , ("Wind Direction", formatHeading(report.wind.heading))
      , ("Cloud Cover", formatPercentage(report.clouds)))

    fields.foreach { case (label, content) => weatherForm.addFormContainer(fieldFactory(label, content)) }

    def weatherGrid = new Grid().setDefaultSpan("L6 M6 S6")

    def onAfterRenderingHandler = {
      def propDescriptor = js.Dynamic.literal(
        configurable = true,
        enumerable = true,
        value = SlippyMap.buildSlippyMap("mapDiv" + counter, report),
        writable = true
      ).asInstanceOf[js.PropertyDescriptor]

      js.Object.defineProperty(new js.Object(), "onAfterRendering", propDescriptor)
    }

    val mapDiv = new HTML().
      setContent("<div id=\"mapDiv" + counter + "\" style=\"float: right; width: 500px; height: 500px; margin: 1rem; margin-top: 4rem\"></div>")

    mapDiv.addEventDelegate(onAfterRenderingHandler)
    mapDiv.setLayoutData(new GridData().setSpanL(6).setSpanM(6).setSpanS(6))

    weatherGrid.addContent(weatherForm).addContent(mapDiv)
  }
}