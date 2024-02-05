package com.oneapp.test_suits;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;

public class WotTestCases extends BaseClass {

	Login_Page_Object Login_PO;
	public OTP_Page_Object otp_PO;
	public Selected_Vehicle_Page_Object sv_PO;
	public Dashboard_Page_object dashboard_PO;
	public Menu_Bar_Page_Object menuBar_PO;
	public Logout_Page_Object logout_PO;
	public CommonElements_Page_object cepo_PO;
	public SoftAssert sa = new SoftAssert();
	public ConfigData configData = new ConfigData();
	public Generic generic = new Generic();
	public SOS_alert_window_page_object sosAlertWindow_PO;
	public ExcelData exceldata = new ExcelData();

	@Test(priority = 1202, groups = { "Regression" })

	public void TC503_ValidateVehicleExchangeTestcase() throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(exceldata.getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		dashboard_PO.clickOnExchangeIcon();

		Thread.sleep(15000);

	}

}
