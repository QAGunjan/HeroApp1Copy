package com.oneapp.interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public interface GenericInterface {

	public static final long ImpWait = 30;
	public static final long WAIT = 15;

	public void sendKeysOnTextfields(MobileElement element, String text);

	public void waitForVisibility(MobileElement element);

	public void clearOnTexBox(MobileElement element);

	public void itratingOnWebelements(List<WebElement> elements, String text);

	public void tappingOnWebelement(int startx, int starty);

	public void swiping(int startx, int starty, int endx, int endy, long wait);

	public void getTextOfElement(MobileElement element);

	public boolean elementDisplaying(MobileElement element);

	public boolean elementSelecting(MobileElement element);

	public boolean elementEnable(MobileElement element);

	public void scrollingToWebElement(String text);
	
}
