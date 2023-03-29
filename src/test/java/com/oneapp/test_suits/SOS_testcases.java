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
	
	@Test (priority = 31, groups = {"Smoke", "Regression" })
	public void validate_SOS_message_sending_testcase() throws InterruptedException {
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
		dpa.clickSOSIconAction();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.tapingSendAlertNowButtonAction();
		sosawpa.succesfullySOSMessageAssertion();
		
	}
	
	@Test (priority = 32, dependsOnMethods = {"validate_SOS_message_sending_testcase"} ,groups = {"Regression" })
	public void validate_dont_send_link_testcase() throws InterruptedException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.clickSOSIconAction();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.tappingDontSendLinkAction();
		sosawpa.commonAssertionSOSAlertWindowAction();
		
	}
	
	
	@Test (priority = 33, dependsOnMethods = {"validate_SOS_message_sending_testcase"} ,groups = {"Regression" })
	public void validate_closing_alert_window_testcase() throws InterruptedException {
		
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.clickSOSIconAction();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.tappingCloseIconAction();
		sosawpa.commonAssertionSOSAlertWindowAction();
	
	}

	@Test //(priority = 34, groups = {"Regression" })
	public void validate_sending_SOS_alert_without_internet_testcase() throws InterruptedException {
		
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.clickSOSIconAction();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.turnOFFInternetAction();
		sosawpa.tapingSendAlertNowButtonAction();
		sosawpa.continueWithNoInternetAction();
		sosawpa.turnONInternetAction();

	}
	

}
