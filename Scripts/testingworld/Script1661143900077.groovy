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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.thetestingworld.com/testings/')

WebUI.maximizeWindow()

WebUI.verifyTextPresent('Testing', false)

WebUI.setText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_fld_username'), 'sushama chavan')

WebUI.setText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_fld_email'), 'sushama.salokhe@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_fld_password'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_fld_cpassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_dob'))

WebUI.click(findTestObject('Object Repository/Page_testingworld/a_19'))

WebUI.setText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_phone'), '1234567892')

WebUI.setText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_address'), 'pune')

WebUI.click(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_add_type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_testingworld/select_Choose Gender                  Male _4c15ff'), 
    '2', true)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_testingworld/select_Select CountryAfghanistanAlbaniaAlge_9a933d'), 
    '101', true)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_testingworld/select_Select StateAndaman and Nicobar Isla_0dbc9e'), 
    '22', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_testingworld/select_Select CityAchalpurAheriAhmadnagar C_dc3744'), 
    '2763', true)

WebUI.setText(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_zip'), '411027')

WebUI.click(findTestObject('Object Repository/Page_testingworld/input_Address type HomeOffice_terms'))

WebUI.click(findTestObject('Object Repository/Page_testingworld/input'))

WebUI.click(findTestObject('Object Repository/Page_testingworld/label_Login'))

WebUI.click(findTestObject('Object Repository/Page_testingworld/label_Register'))

WebUI.closeBrowser()

WebUI.openBrowser('https://demoqa.com/alerts')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_HandlingAlerts/button_Click me_1_2_3'))

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'Please enter your name')

driver.switchTo().alert().sendKeys('sushama')

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.closeBrowser()

