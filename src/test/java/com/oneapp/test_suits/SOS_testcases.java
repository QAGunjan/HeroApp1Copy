package com.oneapp.test_suits;

import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.SOS_alert_window_page_actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

public class SOS_testcases extends BrowserFactory {
	
	@Test //(priority = 31, groups = {"Smoke", "Regression" })
	public void validate_SOS_message_sending_testcase() throws InterruptedException {
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
		dpa.tapping_on_SOS_icon();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.taping_on_send_alert_now_button();
		sosawpa.assert_SOS_message();
		System.out.println("**********************");
		System.out.println("validate_SOS_message_sending_testcase Passed");
	}
	
	@Test //(priority = 32, groups = {"Regression" })
	public void validate_dont_send_link_testcase() throws InterruptedException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.tapping_on_SOS_icon();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.taping_on_dont_send_link();
		sosawpa.assertion_of_closing_and_dont_send();
		System.out.println("**********************");
		System.out.println("validate_dont_send_link_testcase Passed");
	}
	
	
	@Test //(priority = 33, groups = {"Regression" })
	public void validate_closing_alert_window_testcase() throws InterruptedException {
		
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.tapping_on_SOS_icon();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.tapping_on_close_icon();
		sosawpa.assertion_of_closing_and_dont_send();
		System.out.println("**********************");
		System.out.println("validate_closing_alert_window_testcase Passed");
	}

	@Test //(priority = 34, groups = {"Regression" })
	public void validate_sending_SOS_alert_without_internet_testcase() throws InterruptedException {
		
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.tapping_on_SOS_icon();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.turning_off_the_internet();
		sosawpa.taping_on_send_alert_now_button();
		sosawpa.assertion_of_sending_SOS_without_internet();
		sosawpa.turning_ON_the_internet();
		System.out.println("**********************");
		System.out.println("validate_sending_SOS_alert_without_internet_testcase Passed");
	}
	

}
