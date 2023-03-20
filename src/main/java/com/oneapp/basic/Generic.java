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

import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

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
	public static final long WAIT= 20;
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
		Assert.assertEquals(expected, actual);
		TestUtils.log().debug("This is the actual element --> " + actual);
	}

	public static void Soft_assertion_validation(WebElement element, String expected_message)
	{
		waitForVisibility(element);
		SoftAssert sa= new SoftAssert();
		String expected = expected_message;
		String actual = element.getText();
		sa.assertEquals(actual, expected);
		TestUtils.log().debug("This is the actual element --> " + actual);
		sa.assertAll();
	}
	
	public static void assertion_notEquals_validation(WebElement element, String expected_toast) {
		String expected_toast_message = expected_toast;
		String actual_toast_message = element.getText();
		TestUtils.log().debug("This is the toast element --> " + actual_toast_message);
		Assert.assertNotEquals(actual_toast_message, expected_toast_message);
	}
	
	public static boolean isClickable(WebElement element) 
    {
        try{
        	waitForVisibility(element);
        	click_on_WebElement(element);
        	 TestUtils.log().debug("This element is clickable ----> " + element.getText());
            return true;
        }
        catch (Exception e){
        	TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
            return false;
        }
    }

	public static void WifiOff() {
		try {
			ad.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
		} catch (Exception e) {
			TestUtils.log().debug("Connection could not be switch OFF");
		}
	}

	public  static void WifiOn() {
		try {
			ad.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
		} catch (Exception e) {
			TestUtils.log().debug("Connection could not be switch ON");
		}
	}

	public static void Run_app_in_background() throws InterruptedException {
		((AndroidDriver) ad).runAppInBackground(Duration.ofSeconds(5));
		TestUtils.log().debug("App goes in background");
		
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
		TestUtils.log().debug("Swiped successfully");
	}
	
	public static void Tap_on_WebElement(int startx, int starty) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ta = new TouchAction(ad);
		ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(startx, starty))).perform();
		TestUtils.log().debug("Tap action performs succesfully");

	}

	public static void looping_on_webelement(List<WebElement> elements, String text) {
		TestUtils.log().debug("Itration of the elements starts");
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
				TestUtils.log().debug("This element gets clicked ----> " + element.getText());
				break;
			}
		}
	}

	public static void click_on_WebElement(WebElement element) {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibility(element);
		element.click();
		TestUtils.log().debug("This element gets clicked ----> " + element);

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
		TestUtils.log().debug("Waiting for Visibility of this element ----> " + element);
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
		  TestUtils.log().debug("This element textbox field has cleared ---> " + element.getText());
		  
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
		  TestUtils.log().debug("This element gets input ----> " + text);
	  }

	
	
}
