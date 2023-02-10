package com.oneapp.basic;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;
import com.oneapp.page_actions.Login_Page_Action;

import io.appium.java_client.android.AndroidDriver;

public class MyListeners extends BrowserFactory implements ITestListener {


	
	ExtentReports extent= Extent_Reports_Generator.getreports();
	ThreadLocal<ExtentTest> extent_test=new ThreadLocal<ExtentTest>();
	

		public void onTestStart(ITestResult result) {
//			ExtentTest test = extent.createTest(result.getTestClass().getName() + " :: " + 
//		result.getMethod().getMethodName());
			
			ExtentTest test = extent.createTest(result.getMethod().getMethodName());
			extent_test.set(test);
		}
	
		
		
		public void onTestSuccess(ITestResult result) {
			String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Successful</b>";
			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			  extent_test.get().log(Status.PASS,m);
		}
		
		
		
		
	
		public void onTestFailure(ITestResult result) {
			String methodName = result.getMethod().getMethodName();
			String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			extent_test.get().fail("<details><summary><b><font color=red>Exception Occured, Please see details:"
					  + "</font></b><summary>" + exceptionMessage.replaceAll(",","<br>") + "</details> \n");
			  
			  String path = takeScreenshot(result.getMethod().getMethodName());
			  try
			  {
				  extent_test.get().fail("<b><font color=red>" + "Screenshot of failure" + "</font></b>",
						  MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			  } catch(IOException e)
			  {
				  extent_test.get().fail("Test Failed, cannnot attach screenshot");
			  }
			  
			  String logText = "<b>Test Method " + methodName + " Failed</b>";
			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			  extent_test.get().log(Status.FAIL,m);
			
		}
	
		public void onTestSkipped(ITestResult result) {
			String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Skipped</b>";
			  Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			  extent_test.get().log(Status.SKIP,m);
		}
	
	
		public void onFinish(ITestContext context) {
			if (extent != null)
			{
				extent.flush();
			}
			
		}
		
		
		public String takeScreenshot(String methodName)
		 {
			 String fileName = getScreenshotName(methodName);
			String directory = System.getProperty("user.dir") + "/screenshots/";
			new File(directory).mkdir();
			String path = directory + fileName;
			
			try
			{
				File screenshot = ((TakesScreenshot)ad).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot, new File(path));
				System.out.println("********************");
				System.out.println("Screenshot stored at: " + path);
				System.out.println("********************");
				
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			 return path;
		 }
		 
		 public static String getScreenshotName(String methodName)
		 {
			 Date d= new Date();
			 String fileName = methodName + "_"+ d.toString().replace(":", "_").replace("", "_") + ".png";
			 return fileName;
		 }
		
	
}
	