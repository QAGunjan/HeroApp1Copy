package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.RelationshipManager_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class RelationshipManager_Page_Action {

	public AndroidDriver ad;
	public RelationshipManager_Page_Object rmpo;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;


	public RelationshipManager_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		rmpo = new RelationshipManager_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
		configdata	= new ConfigData();
		 generic = new Generic();
	}

	public void relationshipManagerPageAssertionAction() {
		generic.hardAssertion(cepo.getPageTitleText(), configdata.getrelationshipManagerPageTitleExpected() );
	}

	public void relationshipManagerProcessAction() {
		if (cepo.getPageTitleText().isDisplayed() == true) {
			cepo.getPageTitleText().getText().equalsIgnoreCase("Relationship Manager");

			try {
			if (rmpo.getTSM_text().isDisplayed() == true ) {
				
				String email = rmpo.getTSM_email().getText();
				email.contains("@heromotocorp.com");
				Assert.assertTrue(email.contains("@heromotocorp.com"));
				TestUtils.log().debug(email);
				generic.clickOnWebElement(cepo.getBack_icon());
			}
			}
                catch (Exception e) {
			 {
				String noData = rmpo.getNoDataFound().getText();
				Assert.assertTrue(noData.equalsIgnoreCase(" no Data found"));
				TestUtils.log().debug(noData);
				generic.clickOnWebElement(cepo.getBack_icon());

			}

		}}
	}

}
