package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WinnerOfTheMonth_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/winner_name")
	private WebElement WinnerName_OfTheMonth;

	public WinnerOfTheMonth_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getWinnerName_OfTheMonth() {
		return WinnerName_OfTheMonth;
	}

	
	
	
}
