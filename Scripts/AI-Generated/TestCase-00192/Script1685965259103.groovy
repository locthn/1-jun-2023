import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_katalon-vs-selenium-for-test-automation'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/katalon-vs-selenium-for-test-automation')

'step 2: Add visual checkpoint at Page_webinars_katalon-vs-selenium-for-test-automation'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00192_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
