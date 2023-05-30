package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.ReferToFriend_Page_object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ReferToFriend_page_Actions {

	public AppiumDriver ad;
	public ExcelData exceldata;
	public ReferToFriend_Page_object rtfpo;
	public Menu_Bar_Page_Object mbpo;
	public CommonElements_Page_object cepo;
	public Dashboard_Page_object dpo;
	public ConfigData configdata;
	public Generic generic;


	public ReferToFriend_page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		rtfpo = new ReferToFriend_Page_object(ad2);
		mbpo = new Menu_Bar_Page_Object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		dpo = new Dashboard_Page_object(ad2);
		exceldata = new ExcelData();
		configdata	= new ConfigData();
		 generic = new Generic();

	}

	public void referToFriendPageAssertionAction() {
		generic.hardAssertion(cepo.getPageTitleText(), configdata.getreferToFriendPageTitleExpected());
	}

	public void referToFriendProcessAction() {
		generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), "Race");
		generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), "8130998133");
		generic.clickOnWebElement(cepo.getState_box());
		List<WebElement> options = cepo.getState_typedropdown();
		generic.itratingOnWebelements(options, "delhi");
		generic.clickOnWebElement(cepo.getCity_box());
		List<WebElement> options1 = cepo.getCity_typedropdown();
		generic.itratingOnWebelements(options1, "new delhi");
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, "Destini 125");
		generic.clickOnWebElement(cepo.getbutton());

		if (rtfpo.getSuccessfullyReferral_PopUp().isDisplayed() == true) {
			generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}

	}

	public void referSuccessfullyAssertionAction() {
		generic.hardAssertion(dpo.getKey_action_text(), configdata.getreferSuccessfullyExpected());
	}

	public void tryToSubmitingWithBlankFieldsAction() {
		generic.clickOnWebElement(cepo.getbutton());
	}

	public void commonReferToFriendPageAsserstionAction()

	{
		generic.softAssertion(cepo.getPageTitleText(), configdata.getreferToFriendPageTitleExpected());
	}

	public void tryToReferYourselfAction() {
		generic.clickOnWebElement(rtfpo.getReferYourself_link());
		generic.softAssertion(rtfpo.getFriendName_field(), exceldata.getStringData("My Profile", 1, 1));
		generic.softAssertion(rtfpo.getMobileNumber_field(), "9958592171");
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, "Destini 125");
		generic.clickOnWebElement(cepo.getbutton());

		if (rtfpo.getSuccessfullyReferral_PopUp().isDisplayed() == true) {
			generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}
	}

	public void tryToReferWithInvalidDetailsAction() {
		generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), "asdas@#$#$%%^&%^");
		generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), "880099");
		generic.clickOnWebElement(cepo.getbutton());
	}

	public void tryToReferWithNoInternet() {
		generic.clickOnWebElement(rtfpo.getReferYourself_link());
		generic.softAssertion(rtfpo.getFriendName_field(), exceldata.getStringData("My Profile", 1, 1));
		generic.softAssertion(rtfpo.getMobileNumber_field(), "9958592171");
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, "Destini 125");
		generic.WifiOff();
		generic.clickOnWebElement(cepo.getbutton());
		commonReferToFriendPageAsserstionAction();
		generic.WifiOn();
	}
}
