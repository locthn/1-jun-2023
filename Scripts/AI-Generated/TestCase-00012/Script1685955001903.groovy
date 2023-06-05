import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/katalon-studio')

'step 2: At Page_katalon-studio click on hyperlink_sign_up --> navigate to Page_sign-up'

testObj = findTestObject('Object Repository/Page_katalon-studio/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/katalon-studio(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_sign-up click on hyperlink_sign_in_ --> navigate to Page_sign-in'

testObj = findTestObject('Object Repository/Page_sign-up/hyperlink_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/sign-up(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_sign-in'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00012_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
