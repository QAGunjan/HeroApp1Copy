package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Driving_License_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class ManageLicense_testcases extends BrowserFactory {

	@Test// (priority = 26, groups = { "Smoke", "Regression" })
	public void validation_uploading_licence_testcase() throws InterruptedException, IOException {
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
		mppa.click_manage_licence();
		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.click_three_dots();
		dlpa.uploading_new();
		System.out.println("**********************");
		System.out.println("validation_uploading_licence_testcase Passed");
//		dlpa.click_back_button();
//		mppa.click_back_icon();
//		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.closing_menubar_icon();
	}

	@Test// (priority = 27, groups = {"Smoke", "Regression"})
	public void validation__downloading_the_uploaded_license_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.click_three_dots();
		dlpa.downloading_licence();
//		dlpa.assertion_of_downloaded_license();
		System.out.println("**********************");
		System.out.println("validation__downloading_the_uploaded_license_testcase Passed");
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		dlpa.click_back_button();
		mppa.click_back_icon();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
//		Menu_Bar_Page_Actions mbpa=new Menu_Bar_Page_Actions(ad);
//		mbpa.closing_menubar_icon();
	}

	/*
	@Test (priority = 28, groups = {"Smoke", "Regression" })
	public void validation__sharing_the_uploaded_license_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.click_three_dots();
		dlpa.sharing_license();
		dlpa.assertion_of_sharing_license();
		System.out.println("**********************");
		System.out.println("validation__sharing_the_uploaded_license_testcase Passed");
	}
*/
	@Test //(priority = 29, groups = { "Regression", "Negative" })
	public void validation_uploading_license_without_internet_testcase() throws InterruptedException, IOException {
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
		mppa.click_manage_licence();
		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.Turning_off_the_internet();
		dlpa.click_three_dots();
		dlpa.uploading_new();
		dlpa.assertion_of_uploading_license_without_internet();
		System.out.println("**********************");
		System.out.println("validation_uploading_license_without_internet_testcase Passed");
	}
	
	@Test //(priority = 30, groups = { "Regression", "Negative" })
	public void validation_download_license_without_internet_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.click_three_dots();
		dlpa.downloading_licence();
		dlpa.assertion_of_downloading_license_without_internet();
		dlpa.turning_ON_the_internet();
		System.out.println("**********************");
		System.out.println("validation_download_license_without_internet_testcase Passed");
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		dlpa.click_back_button();
		mppa.click_back_icon();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		lgpa.assertion_of_logout();
	}
	
	
	
	
	
	
	
	
	
}
