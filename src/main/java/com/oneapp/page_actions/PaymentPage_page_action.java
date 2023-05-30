package com.oneapp.page_actions;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PaymentPage_page_action {

	public AppiumDriver ad;
	public ExcelData exceldata;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;

	
	public PaymentPage_page_action(AppiumDriver ad2) {
		this.ad = ad2;
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad2);
		configdata = new ConfigData();
		generic = new Generic();

	}
	
	public void PaymentpageAssertionAction()
	{
		generic.hardAssertion(cepo.getPageTitleText(), configdata.getPaymentpageTitleExpected());
	}

	
}
