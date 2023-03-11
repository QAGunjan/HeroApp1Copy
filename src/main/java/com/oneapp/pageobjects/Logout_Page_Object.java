package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Logout_Page_Object {
	
	@FindBy(id = "android:id/button1")
	private WebElement yes_text;

	
	public Logout_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);
	}

	public WebElement getYes_text() {
		return yes_text;
	}

	
	


}
