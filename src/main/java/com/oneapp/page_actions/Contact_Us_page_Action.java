package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Contact_Us_page_Action {
	
	public AndroidDriver ad;
	public TouchAction ta;
	public Contact_Us_page_object cupo;


	public Contact_Us_page_Action(AndroidDriver ad) {
		this.ad = ad;
		cupo = new Contact_Us_page_object(ad);
	}

	public void Tapping_on_whatsapp()
	{
	Generic.click_on_WebElement(cupo.getWhatsapp_text());
	}
	
	public void Assertion_on_whatsapp_under_contactUS_page()
	{
		Generic.Hard_assertion_validation(cupo.getWhatsapp_text(), "Whatsapp");
	}
	
}
