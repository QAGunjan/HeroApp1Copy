package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Goodlife_Dashboard_Non_mem_Page_Actions;
import com.oneapp.page_actions.Goodlife_Insurance_Details_Form_299_Page_Action;
import com.oneapp.page_actions.Goodlife_Plans_Page_Actions;
import com.oneapp.page_actions.Goodlife_Profile_Details_Form_199_Page_Action;
import com.oneapp.page_actions.Goodlife_Profile_Details_Form_299_Page_Action;
import com.oneapp.page_actions.Goodlife_Select_Your_Plan_Page_Action;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class GoodLife_testcases extends BrowserFactory {
	
	@Test //(priority = 36, groups = {"Smoke", "Regression" })
	public void validate_Goodlife_Non_member_199Plan_testcase() throws InterruptedException {
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
		dpa.Handling_Dashboard_All_Popups();
		dpa.Goodlife_icon();
		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa = new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
		gdnmpa.Goodlife_dashboard_button();
		Goodlife_Plans_Page_Actions gppa = new Goodlife_Plans_Page_Actions(ad);
		gppa.click_on_view_all_benefits_199Plan();
		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
		gsyppa.Selecting_Plan();
		Goodlife_Profile_Details_Form_199_Page_Action gpdf_199_pa = new Goodlife_Profile_Details_Form_199_Page_Action(
				ad);
		gpdf_199_pa.Profile_form_199_checkboxes_and_tap_pay_199_button();
		System.out.println("**********************");
		System.out.println("Goodlife_Nonmember_Owner_testcase Passed");

	}

	@Test //(priority = 36, groups = {"Smoke", "Regression" })
	public void validate_Goodlife_Non_member_299Plan_asOwner_testcase() throws InterruptedException {
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
//		dpa.Handling_Dashboard_All_Popups();
		dpa.Goodlife_icon();
		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa = new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
		gdnmpa.Goodlife_dashboard_button();
		Goodlife_Plans_Page_Actions gppa = new Goodlife_Plans_Page_Actions(ad);
		gppa.click_on_view_all_benefits_299Plan();
		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
		gsyppa.Selecting_Plan();
		Goodlife_Profile_Details_Form_299_Page_Action gpdf_299_pa= new Goodlife_Profile_Details_Form_299_Page_Action(ad);
		gpdf_299_pa.validation_of_299Plan_owner_radio_button();
		gpdf_299_pa.validation_of_299plan_mobileNumber_field();
		gpdf_299_pa.validation_of_299Plan_address_field();
		gpdf_299_pa.tapping_on_continue_button();
		Goodlife_Insurance_Details_Form_299_Page_Action gidf_299_pa= new Goodlife_Insurance_Details_Form_299_Page_Action(ad);
		gidf_299_pa.enter_nomineeName();
		gidf_299_pa.Nominee_relationship_dropdown();
		gidf_299_pa.NomineeContactNumber_field();
		gidf_299_pa.Nominee_address_same_as_member_checkbox();
		gidf_299_pa.validation_of_address_field();
		gidf_299_pa.selecting_relationType();
		gidf_299_pa.enter_relativeName();
		gidf_299_pa.My_immediate_family_member_checkbox();
		gidf_299_pa.terms_and_condition_checkbox();
		gidf_299_pa.tap_on_pay299_button();
		System.out.println("**********************");
		System.out.println("validate_Goodlife_Non_member_299Plan_asOwner_testcase Passed");

	}
	
	
}
