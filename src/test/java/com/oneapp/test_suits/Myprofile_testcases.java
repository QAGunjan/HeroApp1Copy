package com.oneapp.test_suits;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.utils.Generic;
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

	
	@DataProvider(name ="TestData")
//	public Object[][] getProfileDetails()
//	{
//		Object [][] data= {
//				{"Gunjan","gunjanRawat0001@gmail.com","F-30,galinumber-1","110091"},
//				{"    ","@@2@gmail.com","312","110"},
//				{"123","0001","   ","00sdasdaadf"},
//				{"@@@@","    "," @#$@#4","#$@#$"},
//				{"Gunjas123241%$^&$^","SDFFSDkjsdhfkjshdkjfsdkjfhskjdfhksdjf","F-30,galinumber-1","ad34@3"},
//				
//		}; 
//		return data;
//	}
	
	
	
	
	
	@Test (priority = 11, groups = { "Smoke", "Regression" })
	public void validate_myprofile_with_valid_details_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.vehicleSelectionAction();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickMyProfileFromMenuBarAction();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.profileDetailsvalidateAction();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.fullNameFieldAction();
		pdpa.enterfullNameAction();
		pdpa.genderRadioButtonAction();
		pdpa.emailFieldAction();
		pdpa.enterValidEmailAction();
		pdpa.dateFieldAction();
		pdpa.addressFieldAction();
		pdpa.enterAddressAction();
		pdpa.pincodeFieldAction();
		pdpa.enterPincodeAction();
		pdpa.clickSaveButton();
		mppa.profileDetailsAfterSavingValidationAction();
		mppa.clickBackIconAction();
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	
	}

	@Test (priority = 12, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_saving_with_blank_fullName_field_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.vehicleSelectionAction();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickMyProfileFromMenuBarAction();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.profileDetailsvalidateAction();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.fullNameFieldAction();
		pdpa.clickSaveButton();
		pdpa.blankFullNameFieldAssertionAction();
		pdpa.enterfullNameAction();
		
	}

	/*
	 * @Test (priority = 13, groups = { "Regression", "Negative" }) public void
	 * validate_saving_with_blank_email_field() throws InterruptedException {
	 * Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
	 * pdpa.fullName_field(); pdpa.EnterfullName(); pdpa.Email_field();
	 * pdpa.click_Save_button(); System.out.println("**********************");
	 * System.out.println("Validate_saving_with_blank_fullName_field Passed"); }
	 */

	@Test  (priority = 13, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_email_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.emailFieldAction();
		pdpa.enterInvalidEmailAction();
		pdpa.clickSaveButton();
		pdpa.enterInvalidEmailFieldAssertionAction();
		pdpa.enterValidEmailAction();
		
	}

	@Test  (priority = 14, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_dateofbirth_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.invalidDateAction();
		pdpa.invalidDateAssertionAction();
		pdpa.dateFieldAction();
	
	}

	@Test  (priority = 15, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_address_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.addressFieldAction();
		pdpa.enterInvalidAddressAssertionAction();
		pdpa.addressAssertionAction();
		pdpa.enterAddressAction();
	
	}

	@Test  (priority = 16, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_saving_with_invalid_pincode_field_testcase() throws InterruptedException {
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.pincodeFieldAction();
		pdpa.enterInvalidPincodeAction();
		pdpa.invalidPincodeAssertionAction();
		pdpa.enterPincodeAction();
//		pdpa.click_Save_button();
//		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
//		mppa.click_back_icon();
//		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.logout_Menu_bar();
//		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
//		lgpa.click_yes_under_logout();
//		lgpa.assertion_of_logout();
	}

	@Test // (priority = 17, dependsOnMethods = {"validate_myprofile_with_valid_details_testcase"} ,groups = { "Regression", "Negative" })
	public void validate_save_button_with_no_internet_testcase() throws InterruptedException {
		
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.savingWithNoInternetAction1();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.clickBackIconAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	
	}

}
