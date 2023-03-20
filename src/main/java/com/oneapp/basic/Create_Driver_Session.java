package com.oneapp.basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import com.oneapp.utils.TestUtils;

import io.appium.java_client.remote.MobileCapabilityType;

public class Create_Driver_Session {

	public static DesiredCapabilities dcap;

	public static AndroidDriver Androidsession(String BrowserName) {
		AndroidDriver ad = null;
		try {

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
			dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
			dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dcap.setCapability(MobileCapabilityType.UDID, "RZCT904J89D");
			dcap.setCapability("appium:newCommandTimeout", 800);
			String appURL = "D:\\JAVA\\Eclipse- workspace\\oneapp\\myfiles\\app-debug.apk";
			TestUtils.log().info("app URL is" + appURL);
			dcap.setCapability(MobileCapabilityType.APP, appURL);
//			dcap.setCapability("appPackage", "com.customerapp.hero");
//			dcap.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");

			URL url = new URL("http://0.0.0.0:4723/wd/hub");

//		URL url = new URL("http://127.0.0.1:4723");

			// AndroidDriver ad= new AndroidDriver(url, dcap);

			ad = new AndroidDriver(url, dcap);
			ad.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ad;

	}
}