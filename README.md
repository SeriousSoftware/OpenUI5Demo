# Scala + OpenUI5 Demo

The demo is an initial attempt to create a Scala application that uses OpenUI5 for its user interface.  The idea is for developers to follow this workflow:

1. Use the SAP Scala Façade Generator tool to create the required Scala.JS façade files based on published OpenUI5 metadata.  This tool is in the process of being made Open Source.  Until this process is complete, the tool can be found [here](https://github.wdf.sap.corp/Marmolata/FacadeGenerator) (Internal SAP link only)
1. Create a Scala project and import the generated façade files. (***WARNING***, in its current state, the files created by this tool will almost certainly need to be adapted before they will work correctly in an application!)
1. Create an application that uses these Scala.JS façades

This sounds easy enough, but its early days and this basic demo is the first attempt at following the above workflow.

### OpenUI5 Façade Generator

This tool is experimental!  The ScalaJS façade files it generates are known to be incomplete and will consequently require manual alteration before they will function correctly in your application.

It is known that not all OpenUI5 classes, enumerations or libraries can be translated automatically into working Scala.  This is because JavaScript's dynamic typing means that under certain circumstances, it is impossible for the parser to determine what data type will be used during a function call.

One example of this is event handlers.  An OpenUI5 event handler function receives a function as one of its arguments.  This argument function handles the data received from the UI element when the event is raised.  The issue for the façade generator is that each UI element supplies its own unique set of values when each of its events is raised, and there is no way for the parser to be able to calculate this.  Consequently, a manual work around has had to be written in which a generic `EventProps` object is used as the data type for all events handled by an event handler.

Other omissions from the generated code include:

* JavaScript types defined in an OpenUI5 library's `library.js` file.  At the moment, `library.js` files are not parsed by the façade generator, so widely used data types such as `sap.ui.core.ID`, `sap.ui.core.CSSSIZE` or `sap.ui.layout.GridSpan` must be created manually.
* No attempt has been made to create façades for JavaScript interfaces such a `sap.ui.core.ToolBar`.


## Running the demo

This app uses the [Scala.JS Workbench](https://github.com/lihaoyi/workbench) to connect IntelliJ to the app instance running in your browser.

Compile the program using either:
 
* `sbt ~fastOptJS` then point your browser to `http://localhost:12345/target/scala-2.12/classes/index-dev.html`, or
* `sbt ~fullOptJS` then point your browser to `http://localhost:12345/target/scala-2.12/classes/index-opt.html`

Once the Workbench has started in your browser, the app should refresh automatically each time you save your changes in IntelliJ (assuming of course that the code compiles!)

