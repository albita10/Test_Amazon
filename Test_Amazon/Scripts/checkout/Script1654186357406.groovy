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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com. Spend less. Smile more/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 'abifamilia20@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'eX8+vQD4xvA=')

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/Amazon/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), 
    'audifonos')

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com  audifonos/span_Tiksounds Auriculares Bluetooth, intra_8063ea'))

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com Tiksounds Auriculares Bluet_c494d2/input_Se produjo un error al procesar su so_b25829'))

WebUI.click(findTestObject('Object Repository/Amazon/Page_Carrito de compras de amazon.com/input__proceedToRetailCheckout'))

WebUI.click(findTestObject('Object Repository/Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Learn more_ppw-widgetEventSetPaymentP_39502f'))

WebUI.closeBrowser()

