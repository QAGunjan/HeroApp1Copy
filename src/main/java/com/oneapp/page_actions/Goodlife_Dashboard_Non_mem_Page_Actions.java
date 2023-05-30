package com.oneapp.page_actions;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Goodlife_Dashboard_Non_mem_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Dashboard_Non_mem_Page_Actions {
	public AppiumDriver ad;
	public Goodlife_Dashboard_Non_mem_Page_Object gdnmpo;
	public Generic generic;

	
	public Goodlife_Dashboard_Non_mem_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		gdnmpo = new Goodlife_Dashboard_Non_mem_Page_Object(ad2);
		generic = new Generic();
	}

	
	public void clickGoodlifeButtonAction()
	{
		generic.clickOnWebElement(gdnmpo.getGoodlife_dashboard_btn());
	}
	
	
	
	
	
	
}
