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
		lpa.valid_login();
		lpa.assertion_of_valid_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validate_OTP();
		opa.click_verify_button();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.Assertion_selected_vehicle_page();
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.Handling_Dashboard_All_Popups();
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("Validate_OTP_testcase100 Passed");
	}
	
	
	@Test (priority = 7, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_invalid_OTP_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.valid_login();
		lpa.assertion_of_valid_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.invalid_Validate_OTP();
		opa.click_verify_button();
		opa.assertion_invalid_OTP();
		System.out.println("**********************");
		System.out.println("validate_invalid_OTP_testcase Passed");
	}
	
	@Test (priority = 8, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_OTP_after_resend_testcase() throws InterruptedException {
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.click_resend_link();
		opa.validate_OTP();
		opa.click_verify_button();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.Assertion_selected_vehicle_page();
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_OTP_after_resend_testcase Passed");
	}
	
	@Test //(priority = 9, groups = { "Regression", "Negative" })
	public void validate_valid_OTP_with_no_internet_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.valid_login();
		lpa.assertion_of_valid_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validate_OTP();
		Generic.WifiOff();
		opa.click_verify_button();
		opa.assertion_valid_OTP_with_no_internet();
		Generic.WifiOn();
		System.out.println("**********************");
		System.out.println("validate_valid_OTP_with_no_internet_testcase Passed");
	}
	
	@Test (priority = 10, dependsOnMethods = {"validate_valid_OTP_testcase"} ,groups = { "Regression", "Negative" })
	public void validation_valid_OTP_working_expected_after_minimizing_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.valid_login();
		lpa.assertion_of_valid_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		Generic.Run_app_in_background();
		opa.validate_OTP();
		opa.click_verify_button();
		System.out.println("**********************");
		System.out.println("validation_valid_OTP_working_expected_after_minimizing Passed");
	}
	
	

}
