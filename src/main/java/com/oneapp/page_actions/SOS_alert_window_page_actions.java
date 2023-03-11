package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.SOS_page_object;

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
	
	public void tapping_on_close_icon()
	{
		Generic.Tap_on_WebElement(908, 732);
	}

	public void taping_on_dont_send_link()
	{
		Generic.Tap_on_WebElement(484, 1472);
	}
	
	public void taping_on_send_alert_now_button()
	{
		Generic.click_on_WebElement(SOSawpo.getSend_alert_now_button());
	}
	
	public void turning_off_the_internet()
	{
		Generic.WifiOff();
	}
	
	public void turning_ON_the_internet()
	{
		Generic.WifiOn();
	}
	
	public void assertion_of_closing_and_dont_send()
	{
		Generic.Soft_assertion_validation(dpo.getKey_action_text(), "Key Actions");
		}
	
	
	public void assertion_of_sending_SOS_without_internet()
	{
//		Generic.assertion_validation(CommonElements_Page_object.getToast_message(), "Please check your network connection.");
	}
	
	public void assert_SOS_message()
	{	
		Generic.Hard_assertion_validation(cepo.getToast_message(), "We have sent alert SMS successfully");
//		Generic.assertion_validation(SOSawpo.getToast_message(), "We have sent alert SMS successfully");
	}
	
}
