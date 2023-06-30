package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SOS_alert_window_page_object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/button_red")
	private MobileElement Send_alert_now_button;

	@AndroidFindBy(xpath = "//*[@text='Don't send.']")
	private MobileElement dont_send_link;

	@AndroidFindBy(id = "com.customerapp.hero:id/custom_radius_close")
	private MobileElement close_icon;

	public MobileElement getSend_alert_now_button() {
		return Send_alert_now_button;
	}

	public MobileElement getDont_send_link() {
		return dont_send_link;
	}

	public MobileElement getClose_icon() {
		return close_icon;
	}

}
