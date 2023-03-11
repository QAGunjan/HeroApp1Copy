package com.oneapp.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.android.connection.HasNetworkConnection;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Generic extends BrowserFactory {

	public static TouchAction ta;
	public static WebDriverWait wait;
	public static final long WAIT= 25;
	public static AndroidElement element;

	
	public static WebElement scrollToElement(String m) {
		  return  element =  (AndroidElement) ad.findElement(MobileBy.AndroidUIAutomator(
				  "new UiScrollable(new UiSelector()).scrollIntoView("
						  + "new UiSelector().description(\""+ m +"\"));"));
	  } 
	
	public static void Hard_assertion_validation(WebElement element, String expected_message) {
		waitForVisibility(element);
		String expected = expected_message;
		String actual = element.getText();
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	public static void Soft_assertion_validation(WebElement element, String expected_message)
	{
		waitForVisibility(element);
		SoftAssert sa= new SoftAssert();
		String expected = expected_message;
		String actual = element.getText();
		System.out.println(actual);
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
	
	public static void assertion_notEquals_validation(WebElement element, String expected_toast) {
		String expected_toast_message = expected_toast;
		String actual_toast_message = element.getText();
		System.out.println(actual_toast_message);
		Assert.assertNotEquals(actual_toast_message, expected_toast_message);
	}
	
	public static boolean isClickable(WebElement element) 
    {
        try{
        	waitForVisibility(element);
        	click_on_WebElement(element);
            return true;
        }
        catch (Exception e){
        	 System.out.println("Exception Handled");
            return false;
        }
    }

	public static void WifiOff() {
		try {
			ad.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
		} catch (Exception e) {
			System.out.println("Connection could not be switch OFF");
		}
	}

	public  static void WifiOn() {
		try {
			ad.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
		} catch (Exception e) {
			System.out.println("Connection could not be switch ON");
		}
	}

	public static void Run_app_in_background() throws InterruptedException {
		((AndroidDriver) ad).runAppInBackground(Duration.ofSeconds(5));
	}

	public static void swiping(int startx, int starty, int endx, int endy, long wait) {
		ta = new TouchAction(ad);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ta.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait))).release().perform();
		System.out.println("Swiped succesfully");
	}
	
	public static void Tap_on_WebElement(int startx, int starty) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ta = new TouchAction(ad);
		ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(startx, starty))).perform();
	}

	public static void looping_on_webelement(List<WebElement> elements, String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (WebElement element : elements) {
			String val = element.getText();
			if (val.equalsIgnoreCase(text)) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				element.click();
				break;
			}
		}
	}

	public static void click_on_WebElement(WebElement element) {
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibility(element);
		element.click();
	}
	
	public static void waitForVisibility(WebElement element)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait = new WebDriverWait(ad, Generic.WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	 public static void clear_on_WebElement(WebElement element)  {
		 try {
			 Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  waitForVisibility(element);
		  element.clear();
	  } 
	
	 public static void sendKeys(WebElement element, String text)  {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  waitForVisibility(element);
		  element.sendKeys(text);
	  }

	
	
}
