import com.lihaoyi.workbench.Plugin.{bootSnippet, updateBrowsers}

enablePlugins(ScalaJSPlugin)

workbenchSettings

name         := "openui5demo"
version      := "0.1"
scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
   "org.scala-js"   %%% "scalajs-dom"       % "0.9.7"
  ,"org.scala-js"   %%% "scalajs-java-time" % "0.2.5"
  ,"be.doeraene"    %%% "scalajs-jquery"    % "0.9.5"
  ,"org.querki"     %%% "querki-jsext"      % "0.8"
  ,"org.scala-lang"   % "scala-reflect"     % scalaVersion.value
  ,"com.lihaoyi"     %% "sourcecode"        % "0.1.7" // Scala-JVM
  ,"com.lihaoyi"    %%% "sourcecode"        % "0.1.7" // Scala.js / Scala Native
)

jsDependencies ++= Seq(
   "org.webjars.npm" % "leaflet" % "0.7.7" / "dist/leaflet.js"
  ,"org.webjars"     % "jquery"  % "2.1.3" / "2.1.3/jquery.js"
)

// bootSnippet is used by SBT to auto-reload the web page
bootSnippet := "OpenUI5Demo.main('weatherDiv');"

updateBrowsers := updateBrowsers.triggeredBy(fastOptJS in Compile).value

publishArtifact in packageDoc:= false
publishArtifact in packageSrc:= false
