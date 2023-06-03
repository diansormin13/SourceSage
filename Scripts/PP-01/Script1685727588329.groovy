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

WebUI.navigateToUrl('https://staging-demo-marketplace.sourcesage.co/')

WebUI.setText(findTestObject('Object Repository/New_OBJ/Page_Login  Demo/input_Please login with your username and p_96afab'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/New_OBJ/Page_Login  Demo/input_Please login with your username and p_8ee08b'), 
    GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/New_OBJ/Page_Login  Demo/input_Please login with your username and p_8ee08b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Demo/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo/li_Accessories  Peripherals'))

WebUI.click(findTestObject('Object Repository/Page_Demo/svg'))

WebUI.click(findTestObject('Object Repository/Page_Demo/button_Sort By_ant-btn ant-tooltip-open ant_857359'))

WebUI.getText(findTestObject('Object Repository/Page_Demo/span_Add item to cart successfully'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Demo/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/svg'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/li_testdivision'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/div_Select Entityentity fachru'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/li_entity fachru'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/div_testtest'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/p_1. 7500A Beach Road 09-317M, The Plaza'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/button_Create Purchase Request'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/li_for company'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/button_Confirm Reason and Create Purchase Request'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/button_OK'))

WebUI.getText(findTestObject('Object Repository/Page_Dashboard  Demo Marketplace/span_My Purchase Requests'), FailureHandling.STOP_ON_FAILURE)

