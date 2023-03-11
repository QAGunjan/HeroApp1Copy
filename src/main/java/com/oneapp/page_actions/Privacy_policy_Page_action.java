package com.oneapp.page_actions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Privacy_Policy_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Privacy_policy_Page_action {
	
	public AndroidDriver ad;
	public TouchAction ta;
	public Privacy_Policy_Page_Object pppo;

	public Privacy_policy_Page_action(AndroidDriver ad) {
		this.ad = ad;
		pppo = new Privacy_Policy_Page_Object(ad);
	}
	
	public void assertion_privacy_policy_page()
	{
		Generic.Soft_assertion_validation(pppo.getWebpage_not_available_text(), "Webpage not available");
	}

}
