package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SOS_alert_window_page_actions {
	
	public AppiumDriver ad;
	public SOS_alert_window_page_object SOSawpo;
	public CommonElements_Page_object cepo;
	public Dashboard_Page_object dpo;
	public ConfigData configdata;
	public Generic generic;


	
	public SOS_alert_window_page_actions(AppiumDriver ad2) {
		this.ad = ad2;
		SOSawpo = new SOS_alert_window_page_object(ad2);
		cepo= new CommonElements_Page_object(ad2);
		dpo = new Dashboard_Page_object(ad2);
		configdata	= new ConfigData();
		generic = new Generic();

	}
	
	public void tappingCloseIconAction()
	{
		generic.tappingOnWebelement(882, 813);
	}

	public void tappingDontSendLinkAction()
	{
		generic.tappingOnWebelement(512, 1510);
	}
	
	public void tapingSendAlertNowButtonAction()
	{
		generic.clickOnWebElement(SOSawpo.getSend_alert_now_button());
	}
	
	public void turnOFFInternetAction()
	{
		generic.WifiOff();
	}
	
	public void turnONInternetAction()
	{
		generic.WifiOn();
	}
	
	public void commonAssertionSOSAlertWindowAction()
	{
		generic.softAssertion(dpo.getKey_action_text(), configdata.getcommonAssertionSOSAlertWindowExpected() );
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
