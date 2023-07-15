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
import org.testng.annotations.AfterClass;
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
import com.oneapp.utils.Generic;
import com.oneapp.utils.ReadPDFText;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	// -------------------- Appium Server Details ----------------------------
	public static String NodePath = "C:\\Program Files\\nodejs\\node.exe";
	public String appiummainJSPath = "C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	public AppiumDriverLocalService service;
	public SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static AppiumDriver ad;// Global AndroidDriver
	public static ExtentTest extentTest;

	// -------------------------- Desired capabilites -----------------------
	public DesiredCapabilities dcap;
	public String PLATFORM_NAME = "Android";
	public String DEVICE_NAME = "Samsung";
	public String AUTOMATION_NAME = "UiAutomator2";
	public String UDID = "RZCT904J89D";
	public int AndroidConnectionTimeout = 1200;
	
	// -------------------------- Desired capabilites -----------------------
		// public DesiredCapabilities dcap;
		// public String PLATFORM_NAME = "iOS";
		// public String AUTOMATION_NAME = "XCUITest";
//		public String DEVICE_NAME = "iPhone 13";
//		public String UDID = "00008110-001E24A20180401E";
		// public String DEVICE_NAME = "iPhone 14";
		// public String UDID = "B0CE327B-3A79-4C2B-A162-97D9C43A202C";

	// -------------------- Page objects variables -----------------------------
	public Login_Page_Object lpo;
	public Generic generic;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public OTP_Page_Object opo;
	public Selected_Vehicle_Page_Object svpo;
	public Dashboard_Page_object dpo;
	public Menu_Bar_Page_Object mbpo;
	public Logout_Page_Object lopo;
	public ConfigData configdata;
	public Personal_Details_Page_Object pdpo;
	public MyProfile_Page_Object mppo;
	public Emerygency_contacts_page_objects ecpo;
	public Emergency_contact_details_page_object ecdpo;
	public TouchAction ta;
	public Driving_License_Page_Object dlpo;
	public SOS_alert_window_page_object soswpo;
	public RelationshipManager_Page_Object rmpo;
	public RSA_Page_object rsapo;
	public DealerLocator_Page_object dealerlocatorpo;
	public Contact_Us_page_object cupo;
	public TipsAndDIYVideos_page_object tadpo;
	public ReadPDFText readpdf;
	public ReferToFriend_Page_object rtfpo;

	public BaseClass() {

		PageFactory.initElements(new AppiumFieldDecorator(ad), this);

	}

	@BeforeMethod(alwaysRun = true)
	public void PreConditions() {
		lpo = new Login_Page_Object();
		generic = new Generic();
		cepo = new CommonElements_Page_object();
		opo = new OTP_Page_Object();
		exceldata = new ExcelData();
		svpo = new Selected_Vehicle_Page_Object();
		dpo = new Dashboard_Page_object();
		mbpo = new Menu_Bar_Page_Object();
		lopo = new Logout_Page_Object();
		configdata = new ConfigData();
		pdpo = new Personal_Details_Page_Object();
		mppo = new MyProfile_Page_Object();
		ecpo = new Emerygency_contacts_page_objects();
		ecdpo = new Emergency_contact_details_page_object();
		ta = new TouchAction(ad);
		dlpo = new Driving_License_Page_Object();
		soswpo = new SOS_alert_window_page_object();
		rmpo = new RelationshipManager_Page_Object();
		rsapo = new RSA_Page_object();
		dealerlocatorpo = new DealerLocator_Page_object();
		cupo = new Contact_Us_page_object();
		tadpo = new TipsAndDIYVideos_page_object();
		readpdf = new ReadPDFText();
		rtfpo = new ReferToFriend_Page_object();
	}

	@BeforeTest(alwaysRun = true)

	public AppiumDriver BrowserSetUp() {

//		 AppiumDriver ad=null;

		try {

			if (PLATFORM_NAME.equalsIgnoreCase("Android")) {

				dcap = new DesiredCapabilities(); 

//		+++++++++++++++++++++++++ For Real device - Samsung ++++++++++++++++++++++++++++ 

				dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
				TestUtils.log().info("PLATFORM NAME IS --> " + PLATFORM_NAME);
				dcap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
				TestUtils.log().info("DEVICE NAME IS --> " + DEVICE_NAME);
				dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
				TestUtils.log().info("AUTOMATION NAME IS --> " + AUTOMATION_NAME);
				dcap.setCapability(MobileCapabilityType.UDID, UDID);
				TestUtils.log().info("UDID IS --> " + UDID);
				dcap.setCapability("appium:newCommandTimeout", AndroidConnectionTimeout);
//			String appURL = "D:\\ECLIPSE_LATEST\\HeroApp1\\myfiles\\app-debug.apk";
//			String AppNewURL = "https://hero-one-app-hero-one-app-sit.azurewebsites.net/";
//			TestUtils.log().info("App Location is " + appURL);
//			TestUtils.log().info("App URL is " + AppNewURL);
//			dcap.setCapability(MobileCapabilityType.APP, appURL);
				dcap.setCapability("appPackage", "com.customerapp.hero");
				dcap.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");

				TestUtils.log().info("Android Real device gets opened");
				URL url = new URL("http://0.0.0.0:4723/wd/hub");
//			URL url = new URL("http://localhost:4723/wd/hub");

//			URL url = new URL("http://127.0.1.1:4723");

				// AndroidDriver ad= new AndroidDriver(url, dcap);
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

	@AfterTest(alwaysRun = true)
	public void Quit_session() {
		ad.quit();
		TestUtils.log().debug("Session gets closed");
		TestUtils.log().debug("++++++++++++++++++++++++++++++++");
	}

	@BeforeSuite(alwaysRun = true)
	public void AppiumServerStarts() throws InterruptedException {
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(NodePath))
						.withAppiumJS(new File(appiummainJSPath)).withIPAddress("0.0.0.0").usingPort(4723));

		TestUtils.log().debug("Starting the Appium Service...." + "\n" + df.format(new Date())
				+ "\n--------------------------------------------------------------");
		service.start();
		service.clearOutPutStreams();
		Thread.sleep(10000);
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
