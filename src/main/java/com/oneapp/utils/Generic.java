package com.oneapp.utils;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.interfaces.GenericInterface;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Generic extends BrowserFactory implements GenericInterface {

	public static WebDriverWait wait;
	public static TouchAction ta;

	public void hardAssertion(WebElement element, String expected_message) {
		waitForVisibility(element);
		String expected = expected_message;
		String actual = element.getText();
		Assert.assertEquals(expected, actual);
		TestUtils.log().debug("Actual element --> " + actual);
	}

	public void softAssertion(WebElement element, String expected_message) {
		waitForVisibility(element);
		SoftAssert sa = new SoftAssert();
		String expected = expected_message;
		String actual = element.getText();
		sa.assertEquals(actual, expected);
		TestUtils.log().debug("Actual element --> " + actual);
		sa.assertAll();
	}

	public void assertion_notEquals_validation(WebElement element, String expected_toast) {
		waitForVisibility(element);
		String expected_toast_message = expected_toast;
		String actual_toast_message = element.getText();
		TestUtils.log().debug("Actual element --> " + actual_toast_message);
		Assert.assertNotEquals(actual_toast_message, expected_toast_message);
	}

	public boolean isClickable(WebElement element) {
		try {
			waitForVisibility(element);
			clickOnWebElement(element);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void WifiOff() {
		try {
			Thread.sleep(2000);
			ad.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
			TestUtils.log().debug("Interet has been switch OFF");
		} catch (Exception e) {
			TestUtils.log().debug("Connection could not be switch OFF");
		}
	}

	public void WifiOn() {
		try {
			Thread.sleep(2000);
			ad.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
			TestUtils.log().debug("Interet has been switch ON");
		} catch (Exception e) {
			TestUtils.log().debug("Connection could not be switch ON" + e);
		}
	}

	public void runningApplicationBackground() {
		((AndroidDriver) ad).runAppInBackground(Duration.ofSeconds(5));
		TestUtils.log().debug("Application goes in background");

	}

	public void swiping(int startx, int starty, int endx, int endy, long wait) {
		ta = new TouchAction(ad);
		try {
			Thread.sleep(4000);
			TestUtils.log().debug("Swiped successfully");
			ta.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait))).release().perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

	}

	public void tappingOnWebelement(int startx, int starty) {
		try {
			Thread.sleep(4000);
			ta = new TouchAction(ad);
			TestUtils.log().debug("Tap action performs succesfully");
			ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(startx, starty))).perform();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

	}

	public void itratingOnWebelements(List<WebElement> elements, String text) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TestUtils.log().debug("Itration of the elements starts");
		for (WebElement element : elements) {
			String val = element.getText();
			if (val.equalsIgnoreCase(text)) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				TestUtils.log().debug("This element gets clicked ----> " + val);
				element.click();
				break;
			}
		}
	}

	public void clickOnWebElement(WebElement element) {
		waitForVisibility(element);
		try {
			wait = new WebDriverWait(ad, Generic.WAIT);
			wait.until(ExpectedConditions.elementToBeClickable(element));

			TestUtils.log().debug("Successfully Clicked  ----> " + element.getText());
			element.click();

		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

	}

	public void waitForVisibility(WebElement element) {

		try {
			wait = new WebDriverWait(ad, Generic.WAIT);
			wait.until(ExpectedConditions.visibilityOf(element));
			if (element.isDisplayed() == true) {
				String text = element.getText();
				TestUtils.log().debug("Successfully Visibility  ----> " + text);
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		finally {
			ad.manage().timeouts().implicitlyWait(ImpWait, TimeUnit.SECONDS);
		}
	}

	public void clearOnTexBox(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("Successfully cleared textbox");
		element.clear();
	}

	public void sendKeysOnTextfields(WebElement element, String text) {
		clearOnTexBox(element);
		TestUtils.log().debug("Successfully enter value ----> " + text);
		element.sendKeys(text);
	}

	public String getTextOfWebelement(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("This is the element text  ----> " + element.getText());
		return element.getText();
	}

	public boolean elementDisplaying(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug(" element is displaying ----> ");
		return element.isDisplayed();

	}

	public boolean elementSelecting(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("element is selecting ----> ");
		return element.isSelected();
	}

	public boolean elementEnable(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("element is Enable ----> ");
		return element.isEnabled();

	}

}
