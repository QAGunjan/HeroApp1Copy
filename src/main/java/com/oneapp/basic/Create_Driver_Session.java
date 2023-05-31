package com.oneapp.basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import com.oneapp.utils.TestUtils;

import io.appium.java_client.remote.MobileCapabilityType;

public class Create_Driver_Session {

	public static DesiredCapabilities dcap;

	public static AppiumDriver Androidsession(String BrowserName) {
		AppiumDriver ad = null;
		
		try {
			if (BrowserName.equalsIgnoreCase("Android"))
			{

			dcap = new DesiredCapabilities();
//	    For Android Emulator

//		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, BrowserName);
//		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel 3");
//		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//		dcap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		dcap.setCapability("appium:avd", "pixel_3");
//		dcap.setCapability("appium:avdLaunchTimeout", 400000);
//		dcap.setCapability("appium:readyTimeout", 400000);

//		for unlocking device
//		dcap.setCapability("unlockType", "pin");
//		dcap.setCapability("unlockKey", "1111");

//	    For Real device - Honor
//	    dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, BrowserName);
//		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "1");
//		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//		dcap.setCapability(MobileCapabilityType.UDID, "7GT7N18908022678");

//		For Real device - Samsung 

			dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, BrowserName);
			TestUtils.log().info("PLATFORM NAME IS --> " + BrowserName);
			dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
			TestUtils.log().info("DEVICE NAME IS --> " + "Samsung");
//			dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
//			TestUtils.log().info("PLATFORM VERSION IS --> " + "13.0");
			dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			TestUtils.log().info("AUTOMATION NAME IS --> " + "UiAutomator2");
			dcap.setCapability(MobileCapabilityType.UDID, "RZCT904J89D");
			TestUtils.log().info("UDID IS --> " + "RZCT904J89D");
			dcap.setCapability("appium:newCommandTimeout", 1200);
//			String appURL = "D:\\ECLIPSE_LATEST\\HeroApp1\\myfiles\\app-debug.apk";
//			String AppNewURL = "https://hero-one-app-hero-one-app-sit.azurewebsites.net/";
//			TestUtils.log().info("App Location is " + appURL);
//			TestUtils.log().info("App URL is " + AppNewURL);
//			dcap.setCapability(MobileCapabilityType.APP, appURL);
			dcap.setCapability("appPackage", "com.customerapp.hero");
			dcap.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");
			
			TestUtils.log().debug("Android Real device gets opened");
//			URL url = new URL("http://0.0.0.0:4723/wd/hub");
//			URL url = new URL("http://localhost:4723/wd/hub");

//			URL url = new URL("http://127.0.1.1:4723");

			// AndroidDriver ad= new AndroidDriver(url, dcap);

//			ad = new AndroidDriver(url, dcap);
			
			}
			
			else if (BrowserName.equalsIgnoreCase("ios"))  {
				
				dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, BrowserName);
				TestUtils.log().info("PLATFORM NAME IS --> " + BrowserName);
				dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
				TestUtils.log().info("DEVICE NAME IS --> " + "Samsung");
				dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
				TestUtils.log().info("AUTOMATION NAME IS --> " + "XCUITest");
				dcap.setCapability(MobileCapabilityType.UDID, "RZCT904J89D");
				TestUtils.log().info("UDID IS --> " + "RZCT904J89D");
				
				TestUtils.log().debug("IOS Simulator gets opened");
				
//				URL url = new URL("http://0.0.0.0:4723/wd/hub");
				
//				ad = new IOSDriver(url, dcap);
			}
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			ad = new AppiumDriver(url,dcap);
			ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String sessionID = ad.getSessionId().toString();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ad;

	}
}