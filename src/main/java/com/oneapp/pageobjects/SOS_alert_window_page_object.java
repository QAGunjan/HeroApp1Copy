package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SOS_alert_window_page_object {

	@FindBy(id = "com.customerapp.hero:id/button_red")
	private WebElement Send_alert_now_button;
	
	@FindBy(xpath = "//*[@text='Don't send.']")
	private WebElement dont_send_link;

	@FindBy(id = "com.customerapp.hero:id/custom_radius_close")
	private WebElement close_icon;

	public SOS_alert_window_page_object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getSend_alert_now_button() {
		return Send_alert_now_button;
	}

	public WebElement getDont_send_link() {
		return dont_send_link;
	}

	public WebElement getClose_icon() {
		return close_icon;
	}
	

}
