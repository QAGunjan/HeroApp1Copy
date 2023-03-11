package com.oneapp.page_actions;

import org.openqa.selenium.WebDriver;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.Booking_confirmed_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Booking_confirmed_Page_Action {

	public WebDriver driver;
	public AndroidDriver ad;
	public TouchAction action;
	public Booking_confirmed_Page_Object bcpo;

	public Booking_confirmed_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		bcpo = new Booking_confirmed_Page_Object(ad);
	}
	
	public void fetching_SR_number()
	{
		System.out.println(bcpo.getSR_Number().getText());
	}
	
	
	public void click_go_back_to_home() throws InterruptedException
	{
		Generic.click_on_WebElement(bcpo.getGo_back_to_home_link());
		Thread.sleep(10000);
	}

}
