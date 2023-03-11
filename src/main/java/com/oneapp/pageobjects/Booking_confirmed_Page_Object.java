package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Booking_confirmed_Page_Object {
	
	@FindBy(id="com.customerapp.hero:id/tvBookingSrNo")
	private WebElement SR_Number;
	
	@FindBy(id="com.customerapp.hero:id/tvHome")
	private WebElement go_back_to_home_link;
	
	public Booking_confirmed_Page_Object(AppiumDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}

	public WebElement getSR_Number() {
		return SR_Number;
	}

	public WebElement getGo_back_to_home_link() {
		return go_back_to_home_link;
	}
	
	
	

}
