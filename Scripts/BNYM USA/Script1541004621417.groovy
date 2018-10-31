import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bnymellon.com/us/en/careers/index.jsp')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Who We Are  BNY Mellon/a_WHAT WE DO'))

WebUI.click(findTestObject('Object Repository/Page_What We Do  BNY Mellon/a_WHO WE ARE'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Who We Are  BNY Mellon/a_WHO WE SERVE'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Who We Serve/a_OUR THINKING'))

WebUI.delay(4)

WebUI.closeBrowser()

