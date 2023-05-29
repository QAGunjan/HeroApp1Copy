package com.oneapp.page_actions;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
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
	public ConfigData configdata;
	public Generic generic;



	public Contact_Us_page_Action(AndroidDriver ad) {
		this.ad = ad;
		cupo = new Contact_Us_page_object(ad);
	       cepo = new CommonElements_Page_object(ad);
			configdata = new ConfigData();
			generic = new Generic();


	}

	public void clickWhatsappAction()
	{
		generic.clickOnWebElement(cupo.getWhatsapp_text());
	}
	
	public void ContactUsPageAssertionAction()
	{
		generic.hardAssertion(cepo.getPageTitleText(),configdata.getContactUsPageTitleExpected() ); 
	}
	public void whatsappUnderContactUSAssertionAction()
	{
		if (cupo.getWhatsapp_text().isDisplayed() == true)
		{
			TestUtils.log().debug("We can’t find WhatsApp on your device. Please install for better experience");
			generic.hardAssertion(cupo.getWhatsapp_text(), configdata.getwhatsappUnderContactUSExpected());
		}
		
	}
	
}
