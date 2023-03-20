package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.basic.Generic;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Personal_Details_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class Myprofile_testcases extends BrowserFactory {

	@Test //(priority = 11, groups = { "Smoke", "Regression" })
	public void validate_myprofile_with_valid_details_testcase() throws InterruptedException {
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.fullName_field();
		pdpa.EnterfullName();
		pdpa.Gender_radio_button();
		pdpa.Email_field();
		pdpa.enter_valid_email();
		pdpa.Date_field();
		pdpa.Address_field();
		pdpa.enter_address();
		pdpa.Pincode_field();
		pdpa.enter_pincode();
		pdpa.click_Save_button();
		mppa.profile_details_after_saving_validation();
		mppa.click_back_icon();
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_myprofile_with_valid_details_testcase Passed");
	}

	@Test //(priority = 12, groups = { "Regression", "Negative" })
	public void validate_saving_with_blank_fullName_field_testcase() throws InterruptedException {
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
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.fullName_field();
		pdpa.click_Save_button();
		pdpa.validation_of_blank_fullName_field();
		pdpa.EnterfullName();
		System.out.println("**********************");
		System.out.println("validate_saving_with_blank_fullName_field_testcase Passed");
	}

	/*
	 * @Test (priority = 13, groups = { "Regression", "Negative" }) public void
	 * validate_saving_with_blank_email_field() throws InterruptedException {
	 * Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
	 * pdpa.fullName_field(); pdpa.EnterfullName(); pdpa.Email_field();
	 * pdpa.click_Save_button(); System.out.println("**********************");
	 * System.out.println("Validate_saving_with_blank_fullName_field Passed"); }
	 */

	@Test // (priority = 13, groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_email_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Email_field();
		pdpa.enter_invalid_email();
		pdpa.click_Save_button();
		pdpa.validation_of_enter_invalid_email_field();
		pdpa.enter_valid_email();
		System.out.println("**********************");
		System.out.println("validate_saving_with_invalid_email_field_testcase Passed");
	}

	@Test // (priority = 14, groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_dateofbirth_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.invalid_date();
		pdpa.validation_of_invalid_date();
		pdpa.Date_field();
		System.out.println("**********************");
		System.out.println("validate_saving_with_invalid_dateofbirth_field_testcase Passed");
	}

	@Test // (priority = 15, groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_address_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Address_field();
		pdpa.enter_invalid_address();
		pdpa.validation_of_address();
		pdpa.enter_address();
		System.out.println("**********************");
		System.out.println("validate_saving_with_invalid_address_field_testcase Passed");
	}

	@Test // (priority = 16, groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_pincode_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Pincode_field();
		pdpa.enter_invalid_pincode();
		pdpa.validation_of_invalid_pincode();
		pdpa.enter_pincode();
		pdpa.click_Save_button();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.click_back_icon();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_saving_with_invalid_pincode_field_testcase Passed");
	}

	@Test // (priority = 17, groups = { "Regression", "Negative" })
	public void validate_save_button_with_no_internet_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.turning_OFF_the_internet();
		pdpa.click_Save_button();
		pdpa.validation_of_saving_without_internet();
		pdpa.turning_ON_the_internet();
		pdpa.click_Save_button();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.click_back_icon();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_save_button_with_no_internet_testcase Passed");
	}

}
