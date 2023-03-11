package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Book_service_service_center_page_object {
	
	@FindBy(id="com.customerapp.hero:id/centerName")
	private WebElement select_service_center_textbox;
	
	@FindBy(xpath="//*[@text='Free Service']")
	private WebElement free_service_radio_button;
	
	@FindBy(xpath="//*[@text='Continue']")
	private WebElement continue_btn;
	
	@FindBy(xpath="//*[@text='Paid Service']")
	private WebElement paid_service_radio_button;
	
	public Book_service_service_center_page_object(AppiumDriver ad)
	{	
		PageFactory.initElements(ad, this);	
	}


	public WebElement getSelect_service_center_textbox() {
		return select_service_center_textbox;
	}


	public WebElement getService_Type_radio_button() {
		return free_service_radio_button;
	}


	public WebElement getContinue_btn() {
		return continue_btn;
	}


	public WebElement getPaid_service_radio_button() {
		return paid_service_radio_button;
	}
	
	
	
	
	

}
