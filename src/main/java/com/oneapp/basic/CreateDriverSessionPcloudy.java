package com.oneapp.basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class CreateDriverSessionPcloudy {

	public static AppiumDriver ad;

	public static AppiumDriver creating_session(String Platform_name) throws MalformedURLException {
		AppiumDriver ad = null;

		if (Platform_name.equalsIgnoreCase("android")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("pCloudy_Username", "randhir.kumar@heromotocorp.com");
			capabilities.setCapability("pCloudy_ApiKey", "2gdc5pv55mh54mqtwmvj4xbr");
			capabilities.setCapability("pCloudy_DurationInMinutes", 10);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("launchTimeout", 90000);
			capabilities.setCapability("pCloudy_DeviceFullName", "SAMSUNG_GalaxyS20Ultra_Android_13.0.0_fbb18");
			capabilities.setCapability("platformVersion", "13.0.0");
			capabilities.setCapability("platformName", Platform_name);
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("pCloudy_ApplicationName", "app-debug.apk");
			capabilities.setCapability("appPackage", "com.customerapp.hero");
			capabilities.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");
			capabilities.setCapability("pCloudy_WildNet", "false");
			capabilities.setCapability("pCloudy_EnableVideo", "false");
			capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
			capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
			capabilities.setCapability("project", "Hero app");
			capabilities.setCapability("build", "Android latest APK - 9.0.5");
			capabilities.setCapability("name", "Invalid login");
			capabilities.setCapability("tag", "newtag");

			URL url = new URL("https://device.pcloudy.com/appiumcloud/wd/hub");

			System.out.println("Pcloudy device is being launching");

			ad = new AndroidDriver(url, capabilities);
		}

		return ad;

	}

	public static void quitSession() {
		ad.quit();
	}

}
