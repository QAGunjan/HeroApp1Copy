package com.oneapp.page_actions;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Vehicle_Service_page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Vehicle_Service_Page_actions {
	
	public AppiumDriver ad;
	public Vehicle_Service_page_object vspo;
	public Generic generic;

	public Vehicle_Service_Page_actions(AppiumDriver ad2) {
		this.ad = ad2;
		vspo = new Vehicle_Service_page_object(ad2);
		 generic = new Generic();
	}
	
	public void bookServiceButtonAction()
	{
	   if(vspo.getBook_service_btn().isDisplayed())
	   {
		   generic.clickOnWebElement(vspo.getBook_service_btn());
	   }
	   
	   else
	   {
		   System.out.println("Book service button is disabled");
	   }
	   
	}
	
	
	
	
}
