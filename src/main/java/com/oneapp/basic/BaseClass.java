package com.oneapp.basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.DealerLocator_Page_object;
import com.oneapp.pageobjects.Driving_License_Page_Object;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;
import com.oneapp.pageobjects.RSA_Page_object;
import com.oneapp.pageobjects.ReferToFriend_Page_object;
import com.oneapp.pageobjects.RelationshipManager_Page_Object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.pageobjects.TipsAndDIYVideos_page_object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.ReadPDFText;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {

	// -------------------- Appium Server Details ----------------------------
	public static String NodePath = "C:\\Program Files\\nodejs\\node.exe";
	public static String appiummainJSPath = "C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	public static String ServerAddress = "0.0.0.0";
	public AppiumDriverLocalService service;
	public SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static AppiumDriver ad;// Global AndroidDriver
		
	public static ExtentTest extentTest;
	BaseClass baseclass;

	// -------------------------- Desired capabilites -----------------------
	public DesiredCapabilities dcap;
	public String PLATFORM_NAME = "Android";
	public String DEVICE_NAME = "Samsung";
	public String AUTOMATION_NAME = "UiAutomator2";
	public String UDID = "RZCT904J89D";
	public int AndroidConnectionTimeout = 1200;

//	

//	public DesiredCapabilities dcap;
//	public String PLATFORM_NAME = "Android";
//	public String DEVICE_NAME = "Pixel 3";
//	public String AUTOMATION_NAME = "UiAutomator2";
//	public String UDID = "emulator-5554";

	// -------------------------- IOS Desired capabilites -----------------------
//		public DesiredCapabilities dcap;
//		public String PLATFORM_NAME = "iOS";
//		public String AUTOMATION_NAME = "XCUITest";
//		public String DEVICE_NAME = "iPhone 14";
//		public String UDID = "B0CE327B-3A79-4C2B-A162-97D9C43A202C";

	// --------- Real Device info -----
//		public String DEVICE_NAME = "iPhone 13";
//		public String UDID = "00008110-001E24A20180401E";

//	@BeforeClass(alwaysRun = true)
//	public void beforeclass() throws MalformedURLException {
//
//		baseclass = new BaseClass();
//		baseclass.BrowserSetUp("Android");

//		CommonElements_Page_object  cepo_PO =new CommonElements_Page_object(ad);
//		
//		cepo_PO.clickOnAllowPopUp();
//	}

	@AfterClass(alwaysRun = true)
	public void afterclass() {
		baseclass.Quit_session();
	}

//	@BeforeTest(alwaysRun = true)
//
//	public void beforeTest() {
//		new CommonElements_Page_object(ad).clickOnAllowPopUp("android");
//	}

	
	@Parameters({"PLATFORM_NAME","pCloudy_DeviceFullName","platformVersion"})
	@BeforeClass(alwaysRun = true)
	public AppiumDriver BrowserSetUp(String PLATFORM_NAME, String pCloudy_DeviceFullName, String platformVersion ) {

//		 AppiumDriver ad=null;

		try {

			if (PLATFORM_NAME.equalsIgnoreCase("Android")) {

//		+++++++++++++++++++++++++ For Real device - Samsung ++++++++++++++++++++++++++++ 
				dcap = new DesiredCapabilities();

				
				/*
				
				  dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
				  dcap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
				  dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
				  dcap.setCapability(MobileCapabilityType.UDID, UDID);
				  dcap.setCapability("appium:newCommandTimeout", AndroidConnectionTimeout); //
//				 dcap.setCapability(MobileCapabilityType.APP, appURL);
				  dcap.setCapability("appPackage", "com.customerapp.hero");
				  dcap.setCapability("appActivity",
				  "com.customerapp.hero.views.activity.splash.SplashActivity");
				 dcap.setCapability("autoGrantPermissions", "true");
				  
				  URL url = new URL("http://0.0.0.0:4723/wd/hub"); // URL url = new
				
				ad = new AndroidDriver(url, dcap);
				ad.resetApp();
*/
				
				//  SAMSUNG_GalaxyS10_Android_12.0.0_01e83
				//  12.0.0
				dcap.setCapability("pCloudy_Username", "randhir.kumar@heromotocorp.com");
				dcap.setCapability("pCloudy_ApiKey", "2gdc5pv55mh54mqtwmvj4xbr");
				dcap.setCapability("pCloudy_DurationInMinutes", 10);
				dcap.setCapability("newCommandTimeout", 600);
				dcap.setCapability("launchTimeout", 90000);
				dcap.setCapability("pCloudy_DeviceFullName", pCloudy_DeviceFullName);
				dcap.setCapability("platformVersion", platformVersion);
				dcap.setCapability("platformName", PLATFORM_NAME);
				dcap.setCapability("automationName", "uiautomator2");
				dcap.setCapability("pCloudy_ApplicationName", "app-debug.apk");
				dcap.setCapability("appPackage", "com.customerapp.hero");
				dcap.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");
				dcap.setCapability("autoGrantPermissions", "true");
				dcap.setCapability("pCloudy_WildNet", "false");
				dcap.setCapability("pCloudy_EnableVideo", "false");
				dcap.setCapability("pCloudy_EnablePerformanceData", "false");
				dcap.setCapability("pCloudy_EnableDeviceLogs", "false");
				dcap.setCapability("project", "Hero app");
				dcap.setCapability("build", "Android latest APK - 9.0.5");
				dcap.setCapability("name", "Invalid login");
				dcap.setCapability("tag", "newtag");

				URL url = new URL("https://device.pcloudy.com/appiumcloud/wd/hub");
				ad = new AndroidDriver(url, dcap);
				ad.resetApp();
			}

			else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {

				dcap = new DesiredCapabilities();

				dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
				TestUtils.log().info("PLATFORM NAME IS --> " + PLATFORM_NAME);
				dcap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
				TestUtils.log().info("DEVICE NAME IS --> " + DEVICE_NAME);
				dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
				TestUtils.log().info("AUTOMATION NAME IS --> " + AUTOMATION_NAME);
				dcap.setCapability(MobileCapabilityType.UDID, UDID);
				TestUtils.log().info("UDID IS --> " + UDID);

				dcap.setCapability("bundleId", "com.customerapp.hero");

				dcap.setCapability("autoAcceptAlerts", "true");
				TestUtils.log().debug("IOS Simulator gets opened");
				dcap.setCapability("noReset", true);

				URL url = new URL("http://127.0.0.1:4723");

				ad = new IOSDriver(url, dcap);
				ad.resetApp();
			}
			
			
				
			
				
			

//			URL url = new URL("http://0.0.0.0:4723/wd/hub");
//
//			ad = new AppiumDriver<MobileElement>(url, dcap);
			String sessionID = ad.getSessionId().toString();

			TestUtils.log().debug(sessionID);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ad;

	}

//	@AfterTest(alwaysRun = true)
	public void Quit_session() {
		ad.quit();
//		TestUtils.log().debug("Session gets closed");
		TestUtils.log().debug("++++++++++++++++++++++++++++++++");
	}

	@BeforeSuite(alwaysRun = true)
	public void AppiumServerStarts() throws InterruptedException {

		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File(NodePath)).withAppiumJS(new File(appiummainJSPath))
				.withIPAddress(ServerAddress).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub").usingPort(4723));

		TestUtils.log().debug("Starting the Appium Service...." + "\n" + df.format(new Date())
				+ "\n--------------------------------------------------------------");
		service.start();
		Thread.sleep(5000);
		service.clearOutPutStreams();
		Thread.sleep(5000);

	}

	@AfterSuite(alwaysRun = true)
	public void AppiumServiceStops() {

		if (service.isRunning() == true) {
			service.stop();

			TestUtils.log().debug("\n----------------------------------------" + "\nStopping the Appium Server....."
					+ "\n" + df.format(new Date()));

		}

	}

}