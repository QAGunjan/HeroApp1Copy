package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Vehicle_Service_page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Vehicle_Service_Page_actions {
	
	public AndroidDriver ad;
	public Vehicle_Service_page_object vspo;

	public Vehicle_Service_Page_actions(AndroidDriver ad) {
		this.ad = ad;
		vspo = new Vehicle_Service_page_object(ad);
	}
	
	public void Book_service_button()
	{
	   if(vspo.getBook_service_btn().isEnabled())
	   {
		   Generic.click_on_WebElement(vspo.getBook_service_btn());
	   }
	   
	   else
	   {
		   System.out.println("Book service button is disabled");
	   }
	   
	}
	
	
	
	
}
