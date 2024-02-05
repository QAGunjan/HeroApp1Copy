package com.oneapp.utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.pageobjects.Dashboard_Page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.android.connection.HasNetworkConnection;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Generic extends BaseClass {

	public static WebDriverWait wait;
	public static TouchAction ta;
	public static final int ImpWait = 20;
	public static final int WAIT = 20;

	public void JavaScriptExecutor(WebElement webElement) {
		JavascriptExecutor executor = (JavascriptExecutor) ad;
		executor.executeScript("arguments[0].click();", webElement); // for click
		executor.executeScript("arguments[0].scrollIntoView(true);", webElement); // for scrollUp
		executor.executeScript("arguments[0].scrollIntoView(false);", webElement); // for scroll down
		executor.executeScript("arguments[0].setAttribute('value','input text'", webElement); // for intput value in
																								// textbox
	}

	public void verticalScrollBy1500() {
		JavascriptExecutor js = (JavascriptExecutor) ad;
		js.executeScript("window.scrollBy(0,1500)");
	}

	public void horizontalScrollBy() {
		JavascriptExecutor js = (JavascriptExecutor) ad;
		js.executeScript("window.scrollBy(600,0)");
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) ad;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public void scrollToEnd() {
		JavascriptExecutor js = (JavascriptExecutor) ad;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight");
	}

	public void scrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor) ad;
		js.executeScript("window.scrollTo(0,0)");
	}

	public void Scrolling(String text) throws InterruptedException {

		Thread.sleep(8000);

		ad.findElement(MobileBy
				.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))"));
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

	public void clickOnWebElement(WebElement webElement) {
		waitForVisibility(webElement);
		try {
			wait = new WebDriverWait(ad, Generic.WAIT);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));

			TestUtils.log().debug("Successfully Clicked  ----> " + webElement.getText());
			webElement.click();

		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) ad;
			executor.executeScript("arguments[0].click();", webElement);
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

	}

	public void clearOnTexBox(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("Successfully cleared textbox");
		element.clear();
	}

	public void getTextOfElement(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("This is the element text  ----> " + element.getText());
		getAttribute(element);
	}

//	public void getText(WebElement element)
//	{
//		getAttribute(element);
//	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("text");
	}

	public boolean elementDisplaying(WebElement webElement) {
		waitForVisibility(webElement);
		TestUtils.log().debug("Successfully Displaying ----> " + webElement.getText());
		return webElement.isDisplayed();
	}

	public boolean elementSelecting(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("Successfully Selecting ----> " + element.getText());
		return element.isSelected();
	}

	public boolean elementEnable(WebElement element) {
		waitForVisibility(element);
		TestUtils.log().debug("Successfully Enabled ----> ");
		return element.isEnabled();

	}

	public void scrollingToWebElement(String text) {
		MobileElement Address = (MobileElement) ad.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
						+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + text + "\").instance(0))"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void sendKeysOnTextfields(WebElement element, String text) {
		clearOnTexBox(element);
		TestUtils.log().debug("Successfully enter value ----> " + text);
		element.sendKeys(text);
	}

	public void waitForVisibility(WebElement webElement) {

		try {
			wait = new WebDriverWait(ad, Generic.WAIT);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			if (webElement.isDisplayed()) {
				String text = webElement.getText();
				TestUtils.log().debug("Successfully Visibility  ----> " + text);
			}

		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		finally {
			ad.manage().timeouts().implicitlyWait(ImpWait, TimeUnit.SECONDS);

		}

	}

	public void swiping(int startx, int starty, int endx, int endy, long wait) {
		// TODO Auto-generated method stub

	}

}
