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

	@Test (priority = 26, groups = { "Smoke", "Regression" })
	public void validation_uploading_licence_testcase() throws InterruptedException, IOException {
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
		mppa.clickManageLicenceAction();
		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.clickThreeDotsAction();
		dlpa.uploadingLicenseProcessAction();
//		dlpa.uploadedLicenseAssertionAction();
		
//		dlpa.click_back_button();
//		mppa.click_back_icon();
//		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.closing_menubar_icon();
	}

	@Test (priority = 27, dependsOnMethods = {"validation_uploading_licence_testcase"} ,groups = {"Smoke", "Regression"})
	public void validation__downloading_the_uploaded_license_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.downloadingLicenceprocessAction();
//		dlpa.downloadedLicenseAssertionAction();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		dlpa.clickBackIconAction();
		mppa.clickBackIconAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
//		Menu_Bar_Page_Actions mbpa=new Menu_Bar_Page_Actions(ad);
//		mbpa.closing_menubar_icon();
	}

	
	@Test //(priority = 28, dependsOnMethods = {"validation_uploading_licence_testcase"} ,groups = {"Smoke", "Regression" })
	public void validation__sharing_the_uploaded_license_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.clickThreeDotsAction();
		dlpa.sharingLicenseAction();
		dlpa.sharingLicenseAssertionAction();
	}

	@Test //(priority = 29, groups = { "Regression", "Negative" })
	public void validation_uploading_license_without_internet_testcase() throws InterruptedException, IOException {
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
		mppa.clickManageLicenceAction();
		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.turnOFFInternetAction();
		dlpa.clickThreeDotsAction();
		dlpa.uploadingLicenseProcessAction();
		dlpa.uploadingLicenseWithNoInternetAction();
	
	}
	
	@Test //(priority = 30, groups = { "Regression", "Negative" })
	public void validation_download_license_without_internet_testcase() throws InterruptedException, IOException {

		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.clickThreeDotsAction();
		dlpa.downloadingLicenceprocessAction();
		dlpa.downloadingLicenseWithNoInternetAction();
		dlpa.turnONInternetAction();
	
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		dlpa.clickBackIconAction();
		mppa.clickBackIconAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickLogoutFromMenuBarAction();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.clickYesUnderLogoutAction();
		lgpa.logoutAssertionAction();
	}
	
	
	
	
	
	
	
	
	
}
