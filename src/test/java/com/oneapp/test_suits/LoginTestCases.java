package com.oneapp.test_suits;

import static org.testng.Assert.fail;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginTestCases extends BaseClass {

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

	@Test(dataProvider = "logintestData", priority = 0, groups = { "Smoke", "Regression" })

	// retryAnalyzer = com.oneapp.utils.RetryAnalyzer.class

	public void TC001_ValidLoginTestCase(String scenario, String mobileNumber) throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);
		cepo_PO = new CommonElements_Page_object(ad);

		generic.waitForVisibility(Login_PO.getPleaseProceedWithYourRegisteredHeroMobileNumber_Text());
		sa.assertEquals(Login_PO.getPleaseProceedWithYourRegisteredHeroMobileNumber_Text().getText(),
				configData.getPleaseProceedWithYourRegisteredHeroMobileNumberExpected());

		generic.Scrolling("By tapping on login or register, you are agreeing to Hero");

		SoftAssertion(Login_PO.getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text(),
				Login_PO.getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text().getText(),
				configData.getByTappingOnLoginOrRegisterYouAreAgreeingToHeroExpected());

		Login_PO.enterLoginMobileNumber(mobileNumber);

		otp_PO = Login_PO.clickOnContinuebutton();

		if (scenario.equalsIgnoreCase("valid")) {

			SoftAssertion(otp_PO.getVerify_with_OTP(), otp_PO.getVerify_with_OTP().getText(),
					configData.getValidLoginExpected());

			generic.clickOnWebElement(otp_PO.getEdit_button());

			sa.assertAll();

		}

		else if (scenario.equalsIgnoreCase("inValid")) {

			SoftAssertion(Login_PO.getNumberNotRegisteredWithAnyHeroVehicle_Text(),
					Login_PO.getNumberNotRegisteredWithAnyHeroVehicle_Text().getText(),
					"Number not registered with any Hero vehicle");

			SoftAssertion(Login_PO.getUpdateRegisteredMobileNumberForYourHeroVehicleOrTryWithAnotherNumber_Text(),
					Login_PO.getUpdateRegisteredMobileNumberForYourHeroVehicleOrTryWithAnotherNumber_Text().getText(),
					"Update registered mobile number for your Hero vehicle or try with another number.");

			SoftAssertion(Login_PO.getUpdateNumberButton(), Login_PO.getUpdateNumberButton().getText(),
					"Update Number");

			Login_PO.clickOnCloseIcon();

			sa.assertAll();

		}

		else if (scenario.equalsIgnoreCase("minimumLen")) {

			SoftAssertion(cepo_PO.getHerologo(), cepo_PO.getHerologo().getText(),
					configData.getCommonLoginPageExpected());

			sa.assertAll();
		}

	}

	@DataProvider(name = "logintestData")
	public Object[][] GetData() {

		return new Object[][] {

				{ "valid", "6666600022" }, { "inValid", "6666600004" }, { "minimumLen", "666660002" } };
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
