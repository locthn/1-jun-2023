import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_automated-testing-for-automotive-manufacturer'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/automated-testing-for-automotive-manufacturer')

'step 2: Add visual checkpoint at Page_resources-center_blog_automated-testing-for-automotive-manufacturer'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00152_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
