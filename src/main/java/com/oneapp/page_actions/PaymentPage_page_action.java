package com.oneapp.page_actions;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class PaymentPage_page_action {

	public AndroidDriver ad;
	public ExcelData exceldata;
	public CommonElements_Page_object cepo;
	
	public PaymentPage_page_action(AndroidDriver ad) {
		this.ad = ad;
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);
	}
	
	public void PaymentpageAssertionAction()
	{
		Generic.hardAssertion(cepo.getPageTitleText(), "Payment");
	}

	
}
