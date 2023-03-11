package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Goodlife_Dashboard_Non_mem_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Dashboard_Non_mem_Page_Actions {
	public AndroidDriver ad;
	public Goodlife_Dashboard_Non_mem_Page_Object gdnmpo;

	
	public Goodlife_Dashboard_Non_mem_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		gdnmpo = new Goodlife_Dashboard_Non_mem_Page_Object(ad);
	}

	
	public void Goodlife_dashboard_button()
	{
		Generic.click_on_WebElement(gdnmpo.getGoodlife_dashboard_btn());
	}
	
	
	
	
	
	
}
