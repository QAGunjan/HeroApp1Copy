package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Vehicle_Service_page_object {
	
	@FindBy(id="com.customerapp.hero:id/btn_lbl")
	private WebElement book_service_btn;
	
	@FindBy(id="com.customerapp.hero:id/btn_lbl")
	private WebElement verifybtn;
	
	public Vehicle_Service_page_object(AppiumDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}

	public WebElement getBook_service_btn() {
		return book_service_btn;
	}
	
	

	
	
	

}
