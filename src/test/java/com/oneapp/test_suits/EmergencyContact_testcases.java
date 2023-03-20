package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Emergency_contact_details_page_actions;
import com.oneapp.page_actions.Emergency_contact_page_actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class EmergencyContact_testcases extends BrowserFactory {

	@Test //(priority = 18, groups = { "Smoke", "Regression" })
	public void validate_emergency_contact_added_succesfully_testcase() throws InterruptedException {
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
		mppa.Emergency_contact();
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.Adding_emergency_contact();
		ecpa.click_create_new_contact();
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.filling_emergency_contact_details();
		ecpa.saved_contact_val();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_added_succesfully_testcase Passed");

	}

	@Test //(priority = 19, groups = { "Smoke", "Regression" })
	public void validate_emergency_contact_deleted_succesfully_testcase() throws InterruptedException {
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.deleting_contact();
		ecpa.validation_of_deleting_contact();
		ecpa.click_back_icon();
		mppa.click_back_icon();
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_deleted_succesfully_testcase Passed");
	}

	@Test //(priority = 20, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_fullName_testcase() throws InterruptedException {
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
		mppa.Emergency_contact();
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.Adding_emergency_contact();
		ecpa.click_create_new_contact();
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.Saving_contact_with_blank_fullName();
		ecdpa.Validation_of_saving_blank_and_invalid_field();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_with_blank_fullName_testcase Passed");

	}

	@Test //(priority = 21, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_MobileNumber_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.Saving_contact_with_blank_MobileNumber();
		ecdpa.Validation_of_saving_blank_and_invalid_field();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_with_blank_MobileNumber_testcase Passed");
	}

	@Test //(priority = 22, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_relationType_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.Saving_contact_with_blank_relationType();
		ecdpa.Validation_of_saving_blank_and_invalid_field();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_with_blank_relationType_testcase Passed");
	}

	@Test // (priority = 23, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_saving_with_no_internet_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.saving_contact_with_noInternet();
		ecdpa.validation_saving_with_no_internet();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_saving_with_no_internet_testcase Passed");
	}

	@Test // (priority = 24, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_saving_with_invalid_details_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.Saving_with_invalid_fullName();
		ecdpa.validation_of_invalid_fullName();
		ecdpa.Saving_with_invalid_mobNumber();
		ecdpa.Validation_of_saving_blank_and_invalid_field();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_saving_with_invalid_details_testcase Passed");
	}

	@Test // (priority = 25, groups = { "Regression", "Negative" })
	public void validate_emergency_contact_already_exist_testcase() throws InterruptedException {
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.click_on_back_icon();
//		ecdpa.filling_emergency_contact_details();
//		ecdpa.adding_new_contact_Plus_icon();
		ecpa.click_create_new_contact();
		ecdpa.filling_emergency_contact_details();
		ecpa.Tapping_on_new_contact_plus_icon();
		ecpa.click_create_new_contact();
		ecdpa.filling_emergency_contact_details();
		ecdpa.assertion_of_already_exist_contact();
		ecdpa.click_on_back_icon();
		ecpa.click_back_icon();
		ecpa.deleting_contact();
		ecpa.click_back_icon();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.click_back_icon();
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
		System.out.println("**********************");
		System.out.println("validate_emergency_contact_already_exist_testcase Passed");
	}

}
