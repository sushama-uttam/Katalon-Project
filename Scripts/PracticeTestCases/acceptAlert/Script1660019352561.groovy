import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/alerts')

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me'))

not_run: WebUI.navigateToUrl('https://demoqa.com/alerts')

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1'))

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2'))

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2'))

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2_3'))

WebDriver driver = DriverFactory.getWebDriver()
 
String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'Please enter your name')

driver.switchTo().alert().sendKeys('sushama')

WebUI.closeBrowser()
