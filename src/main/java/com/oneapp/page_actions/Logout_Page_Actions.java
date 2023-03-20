package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Logout_Page_Actions {
	public AndroidDriver ad;
	public TouchAction ta;
	public Logout_Page_Object lgpo;
	public CommonElements_Page_object cepo;


	public Logout_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		lgpo = new Logout_Page_Object(ad);
		cepo= new CommonElements_Page_object(ad);
	}
	
	public void click_yes_under_logout() throws InterruptedException {
		Generic.click_on_WebElement(lgpo.getYes_text());
		
		try {
		if (cepo.getNonOfTheAbove().isDisplayed()) {
			Generic.click_on_WebElement(cepo.getNonOfTheAbove());
		}
		}
		catch(Exception e)
		{
        	TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}
	}

	public void assertion_of_logout() {
		
        
		Generic.Hard_assertion_validation(cepo.getHerologo(), "Login");
	}

}
