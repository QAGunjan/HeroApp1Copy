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
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

public class SOSTestCases extends BaseClass {

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
	

	@Test(priority = 300, groups = { "Smoke", "Regression" })
	public void TC501_ValidateSendSOSAlertMessageSendTestcase() throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(exceldata.getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		sosAlertWindow_PO = dashboard_PO.clickOnSOSIcon();

		generic.waitForVisibility(sosAlertWindow_PO.getPanicAlert_Text());
		sa.assertEquals(sosAlertWindow_PO.getPanicAlert_Text().getText(), configData.getPanicAlert_TextExpected());

		generic.waitForVisibility(
				sosAlertWindow_PO.getTheappwillalertwithyouremergencycontactswithyourcurrentlocation_Text());
		sa.assertEquals(
				sosAlertWindow_PO.getTheappwillalertwithyouremergencycontactswithyourcurrentlocation_Text().getText(),
				configData.getWehavesentanSMStoemergencycontact_TextExpected_TextExpected());

		generic.waitForVisibility(sosAlertWindow_PO.getImsafe_Text());
		sa.assertEquals(sosAlertWindow_PO.getImsafe_Text().getText(), configData.getImsafe_TextExpected());

		sa.assertEquals(sosAlertWindow_PO.getSendAlertNow_Text().getText(), configData.getSendAlertNow_TextExpected());

		generic.clickOnWebElement(sosAlertWindow_PO.getSend_alert_now_button());

		generic.waitForVisibility(dashboard_PO.getKey_action_text());
		Assert.assertEquals(dashboard_PO.getKey_action_text().getText(),
				configData.getcommonAssertionSOSAlertWindowExpected());
		Thread.sleep(3000);

		sa.assertAll();
	}

	@Test(priority = 301, groups = { "Regression" }, dependsOnMethods = {
			"TC501_ValidateSendSOSAlertMessageSendTestcase" })
	public void TC502_ValidateDontSentLinkTestcase() {

		sosAlertWindow_PO = dashboard_PO.clickOnSOSIcon();

		generic.waitForVisibility(sosAlertWindow_PO.getDontsend_Text());
		sa.assertEquals(sosAlertWindow_PO.getDontsend_Text().getText(), configData.getDontsend_TextExpected());

		generic.tappingOnWebelement(512, 1510);

		generic.waitForVisibility(dashboard_PO.getKey_action_text());
		Assert.assertEquals(dashboard_PO.getKey_action_text().getText(),
				configData.getcommonAssertionSOSAlertWindowExpected());

		sa.assertAll();
	}

	@Test(priority = 302, groups = { "Regression" }, dependsOnMethods = {
			"TC501_ValidateSendSOSAlertMessageSendTestcase" })
	public void TC503_ValidatecloseIconTestcase() {

		sosAlertWindow_PO = dashboard_PO.clickOnSOSIcon();

		generic.tappingOnWebelement(882, 813);

		generic.waitForVisibility(dashboard_PO.getKey_action_text());
		Assert.assertEquals(dashboard_PO.getKey_action_text().getText(),
				configData.getcommonAssertionSOSAlertWindowExpected());
		sa.assertAll();
	}

}
