package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Actions {
	public ExcelData exceldata;

//	public String str = "MBLHA10EWBGE54873";
//	public String str1="MBLHA10EWBGE54873";
	public AndroidDriver ad;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;

	public Selected_Vehicle_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		svpo = new Selected_Vehicle_Page_Object(ad);
		 exceldata= new ExcelData();
	}
	
	public void Assertion_selected_vehicle_page() throws InterruptedException
	{	
		Generic.waitForVisibility(svpo.getbook_service_PAID_vin());
		Generic.Hard_assertion_validation(svpo.getbook_service_PAID_vin(), exceldata.getStringData("Selected Vehicle Page", 1, 1));
	}
	public void Vehicle_Select() throws InterruptedException {
		String vin=exceldata.getStringData("Selected Vehicle Page", 1, 1);

		if (svpo.getbook_service_PAID_vin().getText().equalsIgnoreCase(vin))
		{
			Generic.click_on_WebElement(svpo.getbook_service_PAID_vin());
			System.out.println("Book service PAID Vin selected");
		}
		
		else
		{
			System.out.println("Book service PAID Vin is not selected");
		}
		
		Generic.click_on_WebElement(svpo.getContinuebtn_selected_vehicle());
	}

	}
