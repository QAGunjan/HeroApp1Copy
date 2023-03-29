package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Dashboard_Non_mem_Page_Object {
	
	@FindBy(id = "com.customerapp.hero:id/btn_lay")
	private WebElement goodlife_dashboard_btn;
	
	
	public Goodlife_Dashboard_Non_mem_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);
	}


	public WebElement getGoodlife_dashboard_btn() {
		return goodlife_dashboard_btn;
	}

	
}
