package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.RSA_Page_object;
import com.oneapp.pageobjects.RelationshipManager_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RSA_Page_Action {
	
	public AppiumDriver ad;
	public RSA_Page_object RSApo;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;

	
	public RSA_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		RSApo = new RSA_Page_object(ad2);
       cepo = new CommonElements_Page_object(ad2);
		configdata	= new ConfigData();
		 generic = new Generic();

	}
	
	public void RSAPageAssertionAction()
	{
		generic.hardAssertion(cepo.getPageTitleText(), configdata.getrSAPageTitleExpected());	
		
	}
	
	public void RSAProcessAction()
	{
		if (cepo.getPageTitleText().isDisplayed())
		{
			String RSAPageText = RSApo.getRSAPage_Text().getText();
			TestUtils.log().debug(RSAPageText);
			Assert.assertTrue(RSAPageText.equalsIgnoreCase(configdata.getrSAPageTextExpected()));
		}
	}

}
