package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Contact_Us_page_Action {
	
	public AndroidDriver ad;
	public TouchAction ta;
	public Contact_Us_page_object cupo;
	public CommonElements_Page_object cepo;


	public Contact_Us_page_Action(AndroidDriver ad) {
		this.ad = ad;
		cupo = new Contact_Us_page_object(ad);
	       cepo = new CommonElements_Page_object(ad);

	}

	public void clickWhatsappAction()
	{
	Generic.clickOnWebElement(cupo.getWhatsapp_text());
	}
	
	public void ContactUsPageAssertionAction()
	{
		Generic.hardAssertion(cepo.getPageTitleText(), "Contact Us"); 
	}
	public void whatsappUnderContactUSAssertionAction()
	{
		if (cupo.getWhatsapp_text().isDisplayed() == true)
		{
			TestUtils.log().debug("We can’t find WhatsApp on your device. Please install for better experience");
			Generic.hardAssertion(cupo.getWhatsapp_text(), "Whatsapp");
		}
		
	}
	
}
