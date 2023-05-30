package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Select_Your_Plan_Page_Object {

	@FindBy(xpath = "//*[@text='Select Plan']")
	private WebElement goodlife_select_Plan_btn;
	
	
	public Goodlife_Select_Your_Plan_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}


	public WebElement getGoodlife_select_Plan_btn() {
		return goodlife_select_Plan_btn;
	}
	
	
}
