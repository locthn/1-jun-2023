import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_api-testing-tips'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/api-testing-tips')

'step 2: At Page_resources-center_blog_api-testing-tips click on li_object'

testObj = findTestObject('Object Repository/Page_resources-center_blog_api-testing-tips/li_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/resources-center/blog/api-testing-tips(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_resources-center_blog_api-testing-tips'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
