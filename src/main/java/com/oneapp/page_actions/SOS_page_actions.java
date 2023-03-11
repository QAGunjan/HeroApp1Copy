package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.SOS_page_object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SOS_page_actions {

	public AndroidDriver ad;
	public SOS_page_object SOS_po;

	public SOS_page_actions(AndroidDriver ad) {
		this.ad = ad;
		SOS_po = new SOS_page_object(ad);
	}

	public void tapping_on_SOS_icon()
	{
		Generic.click_on_WebElement(SOS_po.getSOS_icon());
	}
	
}
