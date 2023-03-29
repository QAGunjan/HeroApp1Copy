package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Book_service_selfJobCard_page_actions;
import com.oneapp.page_actions.Book_service_service_center_page_actions;
import com.oneapp.page_actions.Booking_confirmed_Page_Action;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Select_Service_Center_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;
import com.oneapp.page_actions.Vehicle_Service_Page_actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class BookService_testcases extends BrowserFactory {

	@Test //(priority = 35, groups = {"Smoke", "Regression" })
	public void validate_Bookservice_Paid_testcase() throws InterruptedException {
//		Login_Page_Action lpa = new Login_Page_Action(ad);
//		lpa.valid_login();
//		lpa.assertion_of_valid_login();
//		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
//		opa.validate_OTP();
//		opa.click_verify_button();
//		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
//		svpa.Assertion_selected_vehicle_page();
//		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickServiceIconAction();
		Vehicle_Service_Page_actions vspa = new Vehicle_Service_Page_actions(ad);
		vspa.bookServiceButtonAction();
		Book_service_service_center_page_actions bsscpa = new Book_service_service_center_page_actions(ad);
		bsscpa.clickServiceCenterfieldAction();
		Select_Service_Center_Page_Actions sscpa = new Select_Service_Center_Page_Actions(ad);
		sscpa.selectingServiceCenterProcessAction();
		bsscpa.serviceTypeRadioButtonAction();
		bsscpa.turnOFFInternetAction();
		bsscpa.clickContinueButtonAction();
		bsscpa.continueWithNoInterneAction();
//		bsscpa.turning_ON_the_internet();
		bsscpa.clickContinueButtonAction();
		bsscpa.validatingServiceTypeAction();
		Book_service_selfJobCard_page_actions bssjcpa = new Book_service_selfJobCard_page_actions(ad);
		bssjcpa.selfJobCardAction();
		bssjcpa.turnOFFInternetAction();
		bssjcpa.tappingBookServiceButtonAction();
		bssjcpa.continueBookServiceWithNoInternetAction();
		bssjcpa.tappingBookServiceButtonAction();
		Booking_confirmed_Page_Action bcpa = new Booking_confirmed_Page_Action(ad);
		bcpa.fetchingSRNumberAction();
		bcpa.clickGoBackToHomeAction();
//		dpa.MenubarList();
//		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.logout_Menu_bar();
//		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
//		lgpa.click_yes_under_logout();
//		lgpa.assertion_of_logout();
		
	}
	
	/*
	@Test (priority = 35, groups = { "Regression", "Negative" })
	public void validate_continue_on_service_center_page_without_internet_testcase() throws InterruptedException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.Services_icon();
		Vehicle_Service_Page_actions vspa = new Vehicle_Service_Page_actions(ad);
		vspa.Book_service_button();
		Book_service_service_center_page_actions bsscpa = new Book_service_service_center_page_actions(ad);
		bsscpa.Select_Service_Center();
		Select_Service_Center_Page_Actions sscpa = new Select_Service_Center_Page_Actions(ad);
		sscpa.Selecting_Service_center_process();
		bsscpa.selecting_ServiceType();
		bsscpa.turning_OFF_the_internet();
		bsscpa.tapping_on_continue_button();
		bsscpa.turning_ON_the_internet();
		System.out.println("**********************");
		System.out.println("validate_continue_on_service_center_page_without_internet_testcase Passed");
	}
	
	@Test (priority = 36, groups = { "Regression", "Negative" })
	public void validate_continue_on_self_job_card_page_without_internet_testcase() throws InterruptedException {
		Book_service_service_center_page_actions bsscpa = new Book_service_service_center_page_actions(ad);
		bsscpa.tapping_on_continue_button();
		bsscpa.Verifying_service_type();
		Book_service_selfJobCard_page_actions bssjcpa = new Book_service_selfJobCard_page_actions(ad);
		bssjcpa.Self_Job_Card_Page();
		bssjcpa.Turning_OFF_the_internet();
		bssjcpa.Tapping_on_book_service_button();
		bssjcpa.assertion_on_bookService_button_without_internet();
		bssjcpa.Turning_ON_the_internet();
		bssjcpa.Tapping_on_back_icon();
		System.out.println("**********************");
		System.out.println("validate_continue_on_self_job_card_page_without_internet_testcase Passed");
	}
	*/

}
