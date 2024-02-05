package com.oneapp.test_suits;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class OtpTestCases extends BaseClass {

	public Login_Page_Object Login_PO;
	public OTP_Page_Object otp_PO;
	public Selected_Vehicle_Page_Object sv_PO;
	public Dashboard_Page_object dashboard_PO;
	public Menu_Bar_Page_Object menuBar_PO;
	public Logout_Page_Object logout_PO;
	public CommonElements_Page_object cepo_PO;
	public SoftAssert sa = new SoftAssert();
	public ConfigData configData = new ConfigData();
	public Generic generic = new Generic();

	@Test(priority = 100, groups = { "Smoke", "Regression" })
	public void TC101_ValidOtpTestcase() throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);
		cepo_PO = new CommonElements_Page_object(ad);

		Login_PO.enterLoginMobileNumber(new ExcelData().getStringData("Login Page", 1, 1));

		otp_PO = Login_PO.clickOnContinuebutton();

		SoftAssertion(otp_PO.getVerify_with_OTP(), otp_PO.getVerify_with_OTP().getText(),
				configData.getValidLoginExpected());

		SoftAssertion(otp_PO.getWelcomeToHero_Text(), otp_PO.getWelcomeToHero_Text().getText(),
				configData.getWelcomeToHero_TextExpected());

		SoftAssertion(otp_PO.getEnter6digitOTPsentto_Text(), otp_PO.getEnter6digitOTPsentto_Text().getText(),
				configData.getEnter6digitOTPsentto_TextExpected());

//		SoftAssertion(otp_PO.getResendOTPin_Text(), otp_PO.getResendOTPin_Text().getText(),
//				configData.getResendOTPin_TextExpected());

		otp_PO.TypeInField();

		sa.assertEquals(cepo_PO.getButton().getText(), configData.getVerify_TextExpected());

		sv_PO = otp_PO.clickOnVerifyButton();

//		sa.assertEquals(sv_PO.getYouWillAlwaysSeePrimaryVehicleDetails_Text().getText(),
//				configData.getYouWillAlwaysSeePrimaryVehicleDetails_TextExpected());

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		sa.assertEquals(dashboard_PO.getEditList_Text().getText(), configData.geteditList_TextExpected());

		generic.clickOnWebElement(dashboard_PO.getEditList_Text());

		sa.assertEquals(dashboard_PO.getEditList_Text().getText(), configData.getsaveList_TextExpected());

		generic.clickOnWebElement(dashboard_PO.getEditList_Text());

		menuBar_PO = dashboard_PO.clickOnMenuBarIcon();

		generic.waitForVisibility(menuBar_PO.getHello_text());

		sa.assertTrue(menuBar_PO.getHello_text().getText().contains(configData.getHello_textExpected()));

		generic.waitForVisibility(menuBar_PO.getYouAreUsing_text());

		sa.assertEquals(menuBar_PO.getYouAreUsing_text().getText(), configData.getyouAreUsing_textExpected());

		generic.waitForVisibility(menuBar_PO.getVehicleDetails_text());

		sa.assertEquals(menuBar_PO.getVehicleDetails_text().getText(), configData.getVehicleDetails_textExpected());

		generic.waitForVisibility(menuBar_PO.getWheelsOfTrust_text());
		sa.assertEquals(menuBar_PO.getWheelsOfTrust_text().getText(), configData.getWheelsOfTrust_textExpected());

		generic.waitForVisibility(menuBar_PO.getJoyride_text());
		sa.assertEquals(menuBar_PO.getJoyride_text().getText(), configData.getJoyride_textExpected());

		generic.Scrolling("Logout");

		generic.waitForVisibility(menuBar_PO.getAppVersion_text());
		sa.assertTrue(menuBar_PO.getAppVersion_text().getText().contains(configData.getAppVersion_textExpected()));

		logout_PO = menuBar_PO.clickOnLogoutOut_Text();

		generic.waitForVisibility(logout_PO.getLogoutWindow_text());
		sa.assertEquals(logout_PO.getLogoutWindow_text().getText(), configData.getLogoutWindow_textExpected());
		generic.waitForVisibility(logout_PO.getAreyousuretologout_text());
		sa.assertEquals(logout_PO.getAreyousuretologout_text().getText(),
				configData.getAreyousuretologout_textExpected());

		cepo_PO = logout_PO.clickOnYes();

		generic.waitForVisibility(cepo_PO.getHerologo());

		Assert.assertEquals(cepo_PO.getHerologo().getText(), configData.getCommonLoginPageExpected());

		sa.assertAll();
	}

	public void SoftAssertion(WebElement element, String actualText, String expectedText) {
		generic.waitForVisibility(element);
		sa.assertEquals(actualText, expectedText);
	}

	public void HardAssertion(WebElement element, String actualText, String expectedText) {
		generic.waitForVisibility(element);
		Assert.assertEquals(actualText, expectedText);
	}

}
