package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.ReferToFriend_page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class ReferToFriend_testcases extends BrowserFactory {

	@Test(priority = 35, groups = { "Smoke", "Regression" })
	public void validate_ReferToFriend_successfully() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.selectedVehicleAssertion();
		svpa.vehicleSelectionAction();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickReferToFriendFromMenuBarAction();
		ReferToFriend_page_Actions rtfpa = new ReferToFriend_page_Actions(ad);
		rtfpa.referToFriendPageAssertionAction();
		rtfpa.referToFriendProcessAction();
		rtfpa.referSuccessfullyAssertionAction();
	}

	@Test(priority = 36, dependsOnMethods = {"validate_ReferToFriend_successfully"} ,groups = { "Regression", "Negative" })
	public void validate_ReferToFriend_with_blank_fields_testcase() throws InterruptedException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickReferToFriendFromMenuBarAction();
		ReferToFriend_page_Actions rtfpa = new ReferToFriend_page_Actions(ad);
		rtfpa.referToFriendPageAssertionAction();
		rtfpa.tryToSubmitingWithBlankFieldsAction();
		rtfpa.commonReferToFriendPageAsserstionAction();
	}

	@Test(priority = 37, dependsOnMethods = {"validate_ReferToFriend_successfully"} ,groups = { "Regression", "Negative" })
	public void validate_ReferToFriend_with_Invalid_details_testcase() throws InterruptedException {
		ReferToFriend_page_Actions rtfpa = new ReferToFriend_page_Actions(ad);
		rtfpa.referToFriendPageAssertionAction();
		rtfpa.tryToReferWithInvalidDetailsAction();
		rtfpa.commonReferToFriendPageAsserstionAction();
	}

	@Test(priority = 38, dependsOnMethods = {"validate_ReferToFriend_successfully"} ,groups = { "Regression", "Negative" })
	public void validate_ReferToFriend_with_No_Internet_testcase() throws InterruptedException {
		ReferToFriend_page_Actions rtfpa = new ReferToFriend_page_Actions(ad);
		rtfpa.referToFriendPageAssertionAction();
		rtfpa.tryToReferWithNoInternet();
	}

	@Test(priority = 39, dependsOnMethods = {"validate_ReferToFriend_successfully"} ,groups = { "Regression", "Negative" })
	public void validate_referYourself_testcase() throws InterruptedException {
		ReferToFriend_page_Actions rtfpa = new ReferToFriend_page_Actions(ad);
		rtfpa.referToFriendPageAssertionAction();
		rtfpa.tryToReferYourselfAction();
		rtfpa.referSuccessfullyAssertionAction();
	}

}
