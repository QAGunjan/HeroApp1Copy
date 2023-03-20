package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Privacy_policy_Page_action;

/*
 * Validate mobile number field with valid data.
 * Validate mobile number with invalid data
 * Validate min length of the mobile number field
 * Validate that mobile no. field accepted till 10 digits.
 * Validate the continue button should be enabled after entering valid 10 digits mob no.
 * Validate the  continue button is tapable if it's enabled
 * Validate login if mobile number is already registered
 * Validate login if mobile number is not  registred
 * Validate link "Term Of Use" & "Privacy Policy"
 * Validate link "Know more".
 */


@Listeners(com.oneapp.basic.MyListeners.class)

public class Login_testcases extends BrowserFactory {

	@Test (priority = 1, groups = { "Smoke", "Regression" })
	public void validate_validLogin_testcase() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.valid_login();
		lpa.assertion_of_valid_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.click_edit();
	}

	@Test (priority = 2, dependsOnMethods = {"validate_validLogin_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_invalidLogin_testcase() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.invalid_login();
		lpa.assertion_of_invalid_login();
	}

	@Test (priority = 3, dependsOnMethods = {"validate_validLogin_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_mininum_length_field_testcase() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Mininum_length_field();
		lpa.assertion_of_commom_login_page();
	}

	@Test //(priority = 4, groups = { "Regression", "Negative" })
	public void validate_continue_with_no_internet_testcase() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.continue_with_no_internet();
	}

	@Test
	public void Privacy_validation_004() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Privacypage();
	}

	@Test // (priority =1, groups = { "negative" })
	public void validation_privacypage_with_no_internet() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Privacypage_with_no_internet();
		Privacy_policy_Page_action pppa = new Privacy_policy_Page_action(ad);
		pppa.assertion_privacy_policy_page();
	}

	@Test (priority = 5, dependsOnMethods = {"validate_validLogin_testcase"} ,groups = { "Regression", "Negative" })
	public void validation_app_working_expected_after_minimizing_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.App_minimizing_after_loggedin();
//		lpa.assertion_of_valid_login();
//		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
//		opa.Click_edit();
	}

	@Test
	public void T_and_C_validation_005() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Terms_and_Conditionspage();
	}

	@Test
	public void Contact_Us_005() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Contact_Us();
	}

}
