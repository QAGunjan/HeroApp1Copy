package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Privacy_Policy_Page_Object {
	
	@FindBys
	({
	@FindBy(className= "android.view.View")
	})
	private List<WebElement> privacytext_val;
	
	
	@FindBy (xpath="//*[@text='Webpage not available']")
	private WebElement webpage_not_available_text;
	
	
	public Privacy_Policy_Page_Object(AppiumDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public List<WebElement> getPrivacytext_val() {
		return privacytext_val;
	}

	public WebElement getWebpage_not_available_text() {
		return webpage_not_available_text;
	}

	
	
	
	
}
