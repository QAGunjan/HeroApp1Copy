package com.oneapp.interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;

public interface GenericInterface {
	
	public static final long ImpWait = 30;
	public static final long WAIT = 20;
	
	public void sendKeysOnTextfields(WebElement element, String text);
	public void waitForVisibility(WebElement element);
	public void clearOnTexBox(WebElement element);
	public void itratingOnWebelements(List<WebElement> elements, String text);
	public void tappingOnWebelement(int startx, int starty);
	public void swiping(int startx, int starty, int endx, int endy, long wait);
    public void runningApplicationBackground();
    public void WifiOn();
    public void WifiOff();
    public void hardAssertion(WebElement element, String expected_message);
    public void softAssertion(WebElement element, String expected_message);
	public String getTextOfWebelement(WebElement element);
	public boolean elementDisplaying(WebElement element);
	public boolean elementSelecting(WebElement element);
	public  boolean elementEnable(WebElement element);
}
