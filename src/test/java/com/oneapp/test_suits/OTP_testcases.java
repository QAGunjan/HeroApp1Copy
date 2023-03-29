package com.oneapp.test_suits;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.basic.Generic;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)


public class OTP_testcases extends BrowserFactory {
	
	@Test (priority = 6, groups = { "Regression", "Negative" })
	public void validate_valid_OTP_testcase() throws InterruptedException {
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
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	
	}
	
	
	@Test (priority = 7, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_invalid_OTP_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.invalidOTPAction();
		opa.clickVerifyButtonAction();
		opa.invalidOTPAssertionAction();
		
	}
	
	@Test (priority = 8, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_OTP_after_resend_testcase() throws InterruptedException {
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.clickResendLinkAction();
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.selectedVehicleAssertion();
		svpa.vehicleSelectionAction();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	}
	
	@Test (priority = 9, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_valid_OTP_with_no_internet_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.continueWithNoInternetAction();	
	}
	
	@Test (priority = 10, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validation_valid_OTP_working_expected_after_minimizing_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		Generic.runningApplicationBackground();
		opa.clickVerifyButtonAction();
	}
	
	

}
