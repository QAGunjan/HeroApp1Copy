package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.RSA_Page_object;
import com.oneapp.pageobjects.RelationshipManager_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class RSA_Page_Action {
	
	public AndroidDriver ad;
	public RSA_Page_object RSApo;
	public CommonElements_Page_object cepo;
	
	public RSA_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		RSApo = new RSA_Page_object(ad);
       cepo = new CommonElements_Page_object(ad);
	}
	
	public void RSAPageAssertionAction()
	{
		Generic.hardAssertion(cepo.getPageTitleText(), "RSA");	
		
	}
	
	public void RSAProcessAction()
	{
		if (cepo.getPageTitleText().isDisplayed())
		{
			String RSAPageText = RSApo.getRSAPage_Text().getText();
			TestUtils.log().debug(RSAPageText);
			Assert.assertTrue(RSAPageText.equalsIgnoreCase("To purchase a RSA policy please contact your nearest dealer"));
		}
	}

}
