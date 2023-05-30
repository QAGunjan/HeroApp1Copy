package com.oneapp.page_actions;

import org.openqa.selenium.WebDriver;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.Booking_confirmed_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Booking_confirmed_Page_Action {

	public WebDriver driver;
	public AppiumDriver ad;
	public TouchAction action;
	public Booking_confirmed_Page_Object bcpo;
	public Generic generic;

	public Booking_confirmed_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		bcpo = new Booking_confirmed_Page_Object(ad2);
		generic = new Generic();
	}
	
	public void fetchingSRNumberAction()
	{
		System.out.println(bcpo.getSR_Number().getText());
	}
	
	
	public void clickGoBackToHomeAction() throws InterruptedException
	{
		generic.clickOnWebElement(bcpo.getGo_back_to_home_link());
		Thread.sleep(10000);
	}

}
