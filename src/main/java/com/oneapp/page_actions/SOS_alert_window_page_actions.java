package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;

import io.appium.java_client.android.AndroidDriver;

public class SOS_alert_window_page_actions {
	
	public AndroidDriver ad;
	public SOS_alert_window_page_object SOSawpo;
	public CommonElements_Page_object cepo;
	public Dashboard_Page_object dpo;

	
	public SOS_alert_window_page_actions(AndroidDriver ad) {
		this.ad = ad;
		SOSawpo = new SOS_alert_window_page_object(ad);
		cepo= new CommonElements_Page_object(ad);
		dpo = new Dashboard_Page_object(ad);
	}
	
	public void tappingCloseIconAction()
	{
		Generic.tappingOnWebelement(882, 813);
	}

	public void tappingDontSendLinkAction()
	{
		Generic.tappingOnWebelement(512, 1510);
	}
	
	public void tapingSendAlertNowButtonAction()
	{
		Generic.clickOnWebElement(SOSawpo.getSend_alert_now_button());
	}
	
	public void turnOFFInternetAction()
	{
		Generic.WifiOff();
	}
	
	public void turnONInternetAction()
	{
		Generic.WifiOn();
	}
	
	public void commonAssertionSOSAlertWindowAction()
	{
		Generic.softAssertion(dpo.getKey_action_text(), "Key Actions");
		}
	
	
	public void continueWithNoInternetAction()
	{
//		Generic.assertion_validation(CommonElements_Page_object.getToast_message(), "Please check your network connection.");
	}
	
	public void succesfullySOSMessageAssertion()
	{	
		commonAssertionSOSAlertWindowAction();
//		if (cepo.getToast_message().isDisplayed() == true)
//		{
//		Generic.hardAssertion(cepo.getToast_message(), "We have sent alert SMS successfully");
//		Generic.assertion_validation(SOSawpo.getToast_message(), "We have sent alert SMS successfully");
//		}
//		else
//		{
//			commonAssertionSOSAlertWindowAction();
//		}
	}
	
}
