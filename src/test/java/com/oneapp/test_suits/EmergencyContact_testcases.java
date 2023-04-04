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

	@Test (priority = 18, groups = { "Smoke", "Regression" })
	public void validate_emergency_contact_added_succesfully_testcase() throws InterruptedException {
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
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickMyProfileFromMenuBarAction();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.clickEmergencyContactAction();
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.clickAddingEmergencyContactLinkAction();
		ecpa.clickCreateNewContactAction();
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.enterValidEmergencyContactDetailsAction();
		ecpa.contactValidationAction();
	

	}

	@Test (priority = 19, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Smoke", "Regression" })
	public void validate_emergency_contact_deleted_succesfully_testcase() throws InterruptedException {
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.deletingSavedContactAction();
		ecpa.deletingContactAction();
		ecpa.clickBackIconAction();
		mppa.clickBackIconAction();
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	
	}

	@Test (priority = 20, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_fullName_testcase() throws InterruptedException {
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
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickMyProfileFromMenuBarAction();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.clickEmergencyContactAction();
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.clickAddingEmergencyContactLinkAction();
		ecpa.clickCreateNewContactAction();
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.savingContactWithBlankFullNameAction();
		ecdpa.commonAssertionEmergencyContact();
	

	}

	@Test (priority = 21, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_MobileNumber_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.savingContactWithBlankMobileNumberAction();
		ecdpa.commonAssertionEmergencyContact();
	
	}

	@Test (priority = 22, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_with_blank_relationType_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.savingContactWithBlankRelationTypeAction();
		ecdpa.commonAssertionEmergencyContact();
	}

	@Test  (priority = 23, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_saving_with_no_internet_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.savingContactWithNoInternetAction();
		ecdpa.commonAssertionEmergencyContact();
	}

	@Test  (priority = 24, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_saving_with_invalid_details_testcase() throws InterruptedException {
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.savingWithInvalidFullNameAction();
		ecdpa.commonAssertionEmergencyContact();
		ecdpa.savingWithInvalidMobNumberAction();
		ecdpa.commonAssertionEmergencyContact();
		
	}

	@Test  (priority = 25, dependsOnMethods = {"validate_emergency_contact_added_succesfully_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_emergency_contact_already_exist_testcase() throws InterruptedException {
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.clickBackIconAction();
//		ecdpa.filling_emergency_contact_details();
		ecpa.tappingNewContactPlusIconAction();
		ecpa.clickCreateNewContactAction();
		ecdpa.enterValidEmergencyContactDetailsAction();
		ecpa.tappingNewContactPlusIconAction();
		ecpa.clickCreateNewContactAction();
		ecdpa.enterValidEmergencyContactDetailsAction();
//		ecdpa.alreadyExistContactAssertionAction();
		ecdpa.commonAssertionEmergencyContact();
		ecdpa.clickBackIconAction();
		ecpa.clickBackIconAction();
		ecpa.deletingSavedContactAction();
		ecpa.clickBackIconAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.clickBackIconAction();
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	
	}

}
