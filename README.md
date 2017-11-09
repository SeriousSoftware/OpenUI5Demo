# Scala + OpenUI5 Demo

The demo is an initial attempt to create a Scala application that uses OpenUI5 for its user interface.  The idea is for developers to follow this workflow:

1. Use the SAP Scala Façade Generator tool to create the required Scala.JS façade files based on published OpenUI5 metadata.  (This tool is in the process of being mode Open Source, but until such time as this process is complete, the tool can be found [here](https://github.wdf.sap.corp/Marmolata/FacadeGenerator))
1. Create a Scala project and import the generated façade files. (***WARNING***, in its current state, the façade files created by this tool will almost certainly need to be adapted before they will work correctly in an application!)
1. Create an application that uses these Scala.JS façades

This sounds easy enough, but its early days and this basic demo is the first attempt at following the above workflow.

***IMPORTANT***  
Certain generated façade files needed to be heavily modified or even rewritten in order to:
* Simplify the coding down to the minimum required by this application
* Just get it to compile!
* Account for the fact that certain JavaScript function parameters cannot be translated into Scala.  E.G. The event properties object passed to an event handler function is completely dynamic and therefore cannot be defined in any usefully generic manner. (Hence the use of the `EventProps` object seen in the coding)

## Running the demo

When in development, this app uses the Scala.JS Workbench.

Compile the program using `sbt ~fastOptJS` then connect your browser to `http://localhost:12345/target/scala-2.12/classes/index-dev.html`

Once the Workbench has started in your browser, it should refresh each time you save your changes in IntelliJ (assuming of course that they compile!)
 