package com.oneapp.page_actions;

import java.util.HashMap;

import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Feedback_page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.Generic;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Feedback_page_actions {

	public ExcelData exceldata;

	public AndroidDriver ad;

	public Feedback_page_object fbpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public Generic generic;

	public Feedback_page_actions(AndroidDriver ad) {
		this.ad = ad;
		fbpo = new Feedback_page_object(ad);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);
		generic = new Generic();
	}
	
	
	

}
