
package com.sap.scala.facades.openui5.core

import com.sap.scala.facades.openui5.base.BaseObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("sap.ui.core.Core")
@js.native
class Core extends BaseObject {
//  def applyChanges(): Unit = js.native
  def applyTheme(sThemeName: String, sThemeBaseUrl: String = ""): Unit = js.native
//  def attachControlEvent(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def attachFormatError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
  def attachInit(fnFunction: js.Function0[Unit]): Unit = js.native
//  def attachInit(fnFunction: js.Function1[Event[EventProps], Unit]): Unit = js.native
//  def attachInitEvent(fnFunction: js.Function1[Event[EventProps], Unit]): Unit = js.native
//  def attachIntervalTimer(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def attachLocalizationChanged(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def attachParseError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def attachThemeChanged(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def attachValidationError(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def attachValidationSuccess(oData: Object, fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def byFieldGroupId(vFieldGroupIds: String | /*TODO Type: 'string[]' not found.*/): js.Array[Control] = js.native
  def byId(sId: String): js.UndefOr[Control] = js.native
//  def createComponent(vComponent: String | Object, sUrl: String, sId: String, mSettings: Object): Unit = js.native
//  def createRenderManager(): RenderManager = js.native
//  def createUIArea(oDomRef: String | /*TODO Type: 'Element' not found.*/): UIArea = js.native
//  def detachControlEvent(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def detachFormatError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachIntervalTimer(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def detachLocalizationChanged(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def detachParseError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachThemeChanged(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): Unit = js.native
//  def detachValidationError(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def detachValidationSuccess(fnFunction: js.Function1[Event[EventProps], Unit], oListener: Object): this.type = js.native
//  def extend(sClassName: String, oClassInfo: Object, FNMetaImpl: js.Function1[Event[EventProps], Unit]): js.Function1[Event[EventProps], Unit] = js.native
//  def fireFormatError(mArguments: /*TODO Type: 'Map' not found.*/): this.type = js.native
//  def fireParseError(mArguments: /*TODO Type: 'Map' not found.*/): this.type = js.native
//  def fireThemeChanged(mParameters: Object): Unit = js.native
//  def fireValidationError(mArguments: /*TODO Type: 'Map' not found.*/): this.type = js.native
//  def fireValidationSuccess(mArguments: /*TODO Type: 'Map' not found.*/): this.type = js.native
//  def getApplication(): Application = js.native
//  def getComponent(sId: String): Component = js.native
  def getConfiguration(): Configuration = js.native
//  def getControl(sId: String): Element = js.native
//  def getCurrentFocusedControlId(): String = js.native
//  def getElementById(sId: String): Element = js.native
//  def getEventBus(): EventBus = js.native
//  def getLibraryResourceBundle(sLibraryName: String, sLocale: String): /*TODO Type: 'jQuery.sap.util.ResourceBundle' not found.*/ = js.native
//  def getLoadedLibraries(): /*TODO Type: 'map' not found.*/ = js.native
//  def getMessageManager(): MessageManager = js.native
//  def getMetadata(): Metadata = js.native
//  def getModel(sName: String | /*TODO Type: 'undefined' not found.*/): Model = js.native
//  def getRenderManager(): Unit = js.native
//  def getRootComponent(): Component = js.native
//  def getStaticAreaRef(): /*TODO Type: 'Element' not found.*/ = js.native
//  def getTemplate(sId: String): Component = js.native
//  def getUIArea(o: String | /*TODO Type: 'Element' not found.*/): UIArea = js.native
//  def getUIDirty(): Boolean = js.native
//  def hasModel(): Boolean = js.native
//  def includeLibraryTheme(sLibName: String, sVariant: String, sQuery: String): Unit = js.native
//  def initLibrary(oLibInfo: Object): Unit = js.native
//  def isInitialized(): Boolean = js.native
//  def isLocked(): Boolean = js.native
//  def isMobile(): Boolean = js.native
//  def isStaticAreaRef(oDomRef: Object): Boolean = js.native
//  def isThemeApplied(): Boolean = js.native
//  def loadLibraries(aLibraries: /*TODO Type: 'string[]' not found.*/, mOptions: Object): /*TODO Type: 'Promise' not found.*/ | /*TODO Type: 'undefined' not found.*/ = js.native
//  def loadLibrary(sLibrary: String, vUrl: String | Boolean | Object): /*TODO Type: 'Object' not found.*/ | /*TODO Type: 'Promise' not found.*/ = js.native
//  def lock(): Unit = js.native
//  def registerPlugin(oPlugin: Object): Unit = js.native
//  def setModel(oModel: Model, sName: String): this.type = js.native
//  def setRoot(oDomRef: String | /*TODO Type: 'Element' not found.*/, oControl: Interface | Control): Unit = js.native
//  def setThemeRoot(sThemeName: String, aLibraryNames: /*TODO Type: 'string[]' not found.*/, sThemeBaseUrl: String): this.type = js.native
//  def unlock(): Unit = js.native
//  def unregisterPlugin(oPlugin: Object): Unit = js.native
}