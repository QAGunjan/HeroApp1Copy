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
import com.oneapp.page_actions.PaymentPage_page_action;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class GoodLife_testcases extends BrowserFactory {
	
	@Test //(priority = 43, groups = {"Smoke", "Regression" })
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
		dpa.dashboardAllPopUpAction();
		dpa.clickGoodlifeIconAction();
		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa = new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
		gdnmpa.clickGoodlifeButtonAction();
		Goodlife_Plans_Page_Actions gppa = new Goodlife_Plans_Page_Actions(ad);
		gppa.clickViewAllBenefits199PlanAction();
		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
		gsyppa.clickSelectingPlanAction();
		Goodlife_Profile_Details_Form_199_Page_Action gpdf_199_pa = new Goodlife_Profile_Details_Form_199_Page_Action(
				ad);
		gpdf_199_pa.profileForm199PlanProcessAction();
	}

	@Test (priority = 46, groups = {"Smoke", "Regression" })
	public void validate_Goodlife_Non_member_299Plan_asOwner_testcase() throws InterruptedException {
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
		dpa.clickGoodlifeIconAction();
		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa = new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
		gdnmpa.clickGoodlifeButtonAction();
		Goodlife_Plans_Page_Actions gppa = new Goodlife_Plans_Page_Actions(ad);
		gppa.clickViewAllBenefits299PlanAction();
		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
		gsyppa.clickSelectingPlanAction();
		Goodlife_Profile_Details_Form_299_Page_Action gpdf_299_pa= new Goodlife_Profile_Details_Form_299_Page_Action(ad);
		gpdf_299_pa.validation299PlanOwnerRadioButtonAction();
		gpdf_299_pa.valition299PlanMobileNumberFieldAssertionAction();
		gpdf_299_pa.addressField299PlanAssertionAction();
		gpdf_299_pa.clickContinueButtonAction();
		Goodlife_Insurance_Details_Form_299_Page_Action gidf_299_pa= new Goodlife_Insurance_Details_Form_299_Page_Action(ad);
		gidf_299_pa.enterNomineeNameAction();
		gidf_299_pa.selectingNomineeFromRelationshipDropdownAction();
		gidf_299_pa.enterNomineeContactNumberAction();
		gidf_299_pa.nomineeAddressSameAsMemberCheckboxActon();
		gidf_299_pa.addressFieldAssertionAction();
		gidf_299_pa.selectingRelationFromRelationTypeDropdownAction();
		gidf_299_pa.enterRelativeNameAction();
		gidf_299_pa.myImmediateFamilyMemberCheckboxAction();
		gidf_299_pa.termsAndConditionCheckboxAction();
		gidf_299_pa.tappingPay299ButtonAction();
		PaymentPage_page_action pppa= new PaymentPage_page_action(ad);
		pppa.PaymentpageAssertionAction();
	

	}
	
	
}
