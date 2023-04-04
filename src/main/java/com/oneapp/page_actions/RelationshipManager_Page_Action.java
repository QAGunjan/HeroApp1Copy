package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.basic.Generic;
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

	public RelationshipManager_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		rmpo = new RelationshipManager_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
	}

	public void relationshipManagerPageAssertionAction() {
		Generic.hardAssertion(cepo.getPageTitleText(), "Relationship Manager");
	}

	public void relationshipManagerProcessAction() {
		if (cepo.getPageTitleText().isDisplayed() == true) {
			cepo.getPageTitleText().getText().equalsIgnoreCase("Relationship Manager");

			if (rmpo.getTSM_text().isDisplayed() == true) {
				String email = rmpo.getTSM_email().getText();
				email.contains("@heromotocorp.com");
				Assert.assertTrue(email.contains("@heromotocorp.com"));
				TestUtils.log().debug(email);
				Generic.clickOnWebElement(cepo.getBack_icon());

			}

			else {
				String noData = rmpo.getNoDataFound().getText();
				Assert.assertTrue(noData.equalsIgnoreCase(" no Data found"));
				TestUtils.log().debug(noData);
				Generic.clickOnWebElement(cepo.getBack_icon());

			}

		}
	}

}
