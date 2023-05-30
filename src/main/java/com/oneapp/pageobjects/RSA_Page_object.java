package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RSA_Page_object {
	
	@FindBy(xpath = "//*[@text='To purchase a RSA policy please contact your nearest dealer']") 	
	private WebElement RSAPage_Text;

	public RSA_Page_object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getRSAPage_Text() {
		return RSAPage_Text;
	}
	
	

}
