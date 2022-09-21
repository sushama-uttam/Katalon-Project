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
import org.openqa.selenium.WebElement as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.actitime.com/login.do')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_pwd'), 'RVfeMFa65gU=')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_remember'))

WebUI.verifyTextPresent('actiTIME', false)

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Login/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Enter Time-Track/div_Tasks_container_tasks'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Add New_downIcon'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_New Tasks'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_- Select Customer -'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Big Bang Company'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_- Select Project -'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Flight operations'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder'), 
    'Test Demo')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder_1'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/img'))

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/textarea_'), 'Demo testing')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input__nscbutton'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/button_set deadline'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/span_19'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder_1'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/a_Type of Work_descriptionElement'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input__nscbutton'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_engineering'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Create New Tasks                       _b884d6'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Create Tasks'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div__img'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Delete'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/span_Delete permanently'))

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/input'), 'Test Demo')

WebUI.sendKeys(findTestObject('Object Repository/Page_actiTIME - Task List/input'), Keys.chord(Keys.ENTER))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.actitime.com/login.do')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_pwd'), 'RVfeMFa65gU=')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_remember'))

WebUI.verifyTextPresent('actiTIME', false)

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Login/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Enter Time-Track/div_Tasks_container_tasks'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Add New_downIcon'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_New Tasks'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_- Select Customer -'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Big Bang Company'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_- Select Project -'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Flight operations'))

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder'), 
    'Test Demo')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder_1'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/img'))

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/textarea_'), 'Demo testing')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input__nscbutton'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/button_set deadline'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/span_19'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input_Type of Work_inputFieldWithPlaceholder_1'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/a_Type of Work_descriptionElement'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/input__nscbutton'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_engineering'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Create New Tasks                       _b884d6'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Create Tasks'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div__img'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Delete'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/span_Delete permanently'))

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Task List/input'), 'Test Demo')

WebUI.sendKeys(findTestObject('Object Repository/Page_actiTIME - Task List/input'), Keys.chord(Keys.ENTER))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.actitime.com/login.do')

WebUI.setText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_actiTIME - Login/input_trainee_pwd'), 'RVfeMFa65gU=')

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Login/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Big Bang Company'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Flight operations'))

WebUI.click(findTestObject('Object Repository/Page_actiTIME - Task List/div_Customer                               _b6edc8'))

