import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_test-data-management-with-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/test-data-management-with-katalon')

'step 2: Add visual checkpoint at Page_resources-center_blog_test-data-management-with-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00090_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
