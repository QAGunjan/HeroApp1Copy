package com.oneapp.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bson.internal.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BrowserFactory {

	public static AndroidDriver ad;// Global AndroidDriver
	public static ExtentTest extentTest;


//	@Parameters({ "PLATFORM_NAME", "DEVICE_NAME", "AUTOMATION_NAME", "UDID" })
	
	 @BeforeClass(alwaysRun = true)
	public void Browsers_open() throws MalformedURLException {
		// This is origional
		ad = Create_Driver_Session.Androidsession("Android");
		TestUtils.log().debug("Android Real device gets opened");
		ad.resetApp();
		TestUtils.log().debug("Application has been reset");
		// For Pcloudy

//            	ad = Pcloudy_Create_Driver_Session.creating_session("ios");
//            	Reporter.log("Android emulator gets opened", true);

	}
	 
	 @AfterClass (alwaysRun = true)
	 public void Quit_session()
	 {
		 ad.quit();
		 TestUtils.log().debug("Android Real device gets closed");
		 TestUtils.log().debug("++++++++++++++++++++++++++++++++");
	 }
	 
	 @BeforeMethod
	 public void pre_condition()
	 {
		
	 }
	 
	 @AfterMethod
	 public void post_condition()
	 {
		 
	 }
	 
}
	 
	/*	private static String RTDataPortal_Url="https://202.56.244.135/siebel/app/edealer/enu?SWECmd=Start&SWEHo=202.56.244.135"; 
		public static WebDriver launch_Browser(WebDriver driver)
		{
		
			System.setProperty("webdriver.chrome.driver", "./myfiles/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			driver= new ChromeDriver();
			
			driver.navigate().to(RTDataPortal_Url);
			
			return driver;
		}*/
	 
	 

//	 @AfterMethod(alwaysRun = true)
//	public void Browsers_teardown(ITestResult result) 
//	 {
//		 String methodName = result.getMethod().getMethodName();
//		 if (result.getStatus()== ITestResult.FAILURE)
//		 {
//			  String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
//			  extentTest.fail("<details><summary><b><font color=red>Exception Occured, click to see details:"
//					  + "</font></b><summary>" + exceptionMessage.replaceAll(",","<br>") + "</details> \n");
//			  
//			  String path = takeScreenshot(result.getMethod().getMethodName());
//			  try
//			  {
//				  extentTest.fail("<b><font color=red>" + "Screenshot of failure" + "</font></b>",
//						  MediaEntityBuilder.createScreenCaptureFromPath(path).build());
//			  } catch(IOException e)
//			  {
//				  extentTest.fail("Test Failed, cannnot attach screenshot");
//			  }
//			  
//			  String logText = "<b>Test Method " + methodName + " Failed</b>";
//			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
//			  extentTest.log(Status.FAIL,m);
//		 } 
//		 else if(result.getStatus()== ITestResult.SUCCESS)
//		 {
//			 String logText = "<b>Test Method " + methodName + " Successful</b>";
//			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
//			  extentTest.log(Status.PASS, m );
//		 }
//		 else if(result.getStatus()== ITestResult.SUCCESS)
//		 {
//			 String logText = "<b>Test Method " + methodName + " Skipped</b>";
//			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
//			  extentTest.log(Status.SKIP,m);
//		 }
//		 
//	}
//	 
//	 public String takeScreenshot(String methodName)
//	 {
//		 String fileName = getScreenshotName(methodName);
//		String directory = System.getProperty("user.dir") + "/screenshots/";
//		new File(directory).mkdir();
//		String path = directory + fileName;
//		
//		try
//		{
//			File screenshot = ((TakesScreenshot)ad).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(screenshot, new File(path));
//			System.out.println("********************");
//			System.out.println("Screenshot stored at: " + path);
//			System.out.println("********************");
//			
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		 return path;
//	 }
//	 
//	 public static String getScreenshotName(String methodName)
//	 {
//		 Date d= new Date();
//		 String fileName = methodName + "_"+ d.toString().replace(":", "_").replace("", "_") + ".png";
//		 return fileName;
//	 }
	 
//	 @AfterClass (alwaysRun = true)
//	 public void tearn_down()
//	 {
//		 System.out.println("****************************");
//		 System.out.println("All test cases have executed");
//	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


