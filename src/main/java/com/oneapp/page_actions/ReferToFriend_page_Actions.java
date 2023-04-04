package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.ReferToFriend_Page_object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class ReferToFriend_page_Actions {

	public AndroidDriver ad;
	public ExcelData exceldata;
	public ReferToFriend_Page_object rtfpo;
	public Menu_Bar_Page_Object mbpo;
	public CommonElements_Page_object cepo;
	public Dashboard_Page_object dpo;

	public ReferToFriend_page_Actions(AndroidDriver ad) {
		this.ad = ad;
		rtfpo = new ReferToFriend_Page_object(ad);
		mbpo = new Menu_Bar_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
		dpo = new Dashboard_Page_object(ad);
		exceldata = new ExcelData();

	}

	public void referToFriendPageAssertionAction() {
		Generic.hardAssertion(cepo.getPageTitleText(), "Vehicle purchase referral");
	}

	public void referToFriendProcessAction() {
		Generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), "Race");
		Generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), "8130998133");
		Generic.clickOnWebElement(cepo.getState_box());
		List<WebElement> options = cepo.getState_typedropdown();
		Generic.itratingOnWebelements(options, "delhi");
		Generic.clickOnWebElement(cepo.getCity_box());
		List<WebElement> options1 = cepo.getCity_typedropdown();
		Generic.itratingOnWebelements(options1, "new delhi");
		Generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		Generic.itratingOnWebelements(options3, "Destini 125");
		Generic.clickOnWebElement(cepo.getbutton());

		if (rtfpo.getSuccessfullyReferral_PopUp().isDisplayed() == true) {
			Generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}

	}

	public void referSuccessfullyAssertionAction() {
		Generic.hardAssertion(dpo.getKey_action_text(), "Key Actions");
	}

	public void tryToSubmitingWithBlankFieldsAction() {
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void commonReferToFriendPageAsserstionAction()

	{
		Generic.softAssertion(cepo.getPageTitleText(), "Vehicle purchase referral");
	}

	public void tryToReferYourselfAction() {
		Generic.clickOnWebElement(rtfpo.getReferYourself_link());
		Generic.softAssertion(rtfpo.getFriendName_field(), exceldata.getStringData("My Profile", 1, 1));
		Generic.softAssertion(rtfpo.getMobileNumber_field(), "9958592171");
		Generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		Generic.itratingOnWebelements(options3, "Destini 125");
		Generic.clickOnWebElement(cepo.getbutton());

		if (rtfpo.getSuccessfullyReferral_PopUp().isDisplayed() == true) {
			Generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}
	}

	public void tryToReferWithInvalidDetailsAction() {
		Generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), "asdas@#$#$%%^&%^");
		Generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), "880099");
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void tryToReferWithNoInternet() {
		Generic.clickOnWebElement(rtfpo.getReferYourself_link());
		Generic.softAssertion(rtfpo.getFriendName_field(), exceldata.getStringData("My Profile", 1, 1));
		Generic.softAssertion(rtfpo.getMobileNumber_field(), "9958592171");
		Generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		Generic.itratingOnWebelements(options3, "Destini 125");
		Generic.WifiOff();
		Generic.clickOnWebElement(cepo.getbutton());
		commonReferToFriendPageAsserstionAction();
		Generic.WifiOn();
	}
}
