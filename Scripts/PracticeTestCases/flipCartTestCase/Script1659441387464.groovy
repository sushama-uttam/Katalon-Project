import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.switchToWindowTitle('Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_'))
WebDriver driver = DriverFactory.getWebDriver()
List<WebElement> element = driver.findElements(By.cssSelector("._3704LK"))
println("Size="+element.size())
for(WebElement e : element) {
	System.out.println(e.getText())
}

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Plus_q'), 'samsung ')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/a_samsung mobilesin Mobiles'))

WebUI.setText(findTestObject('Object Repository/Page_Samsung Mobiles- Buy Products Online a_0225c6/input_Plus_q'), 'samsung')

WebUI.click(findTestObject('Object Repository/Page_Samsung Mobiles- Buy Products Online a_0225c6/div_samsung a13'))

