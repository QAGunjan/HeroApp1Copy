package com.oneapp.test_suits;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginTestCases extends BaseClass {

	@Test(priority = 0, groups = { "Smoke", "Regression" })
	public void TC001_ValidLoginTestCase() throws InterruptedException {

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			try {
				if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
					generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
				}
			} catch (Exception e) {
				TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
			}
		}

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());
		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
		}

		generic.waitForVisibility(opo.getVerify_with_OTP());
		Assert.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());
		generic.clickOnWebElement(opo.getEdit_button());
	}

	@Test(priority = 1, groups = { "Regression" })
	public void TC002_InValidLoginTestCase() {
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 2, 1));
		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());
		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
		}

		generic.waitForVisibility(cepo.getHerologo());
		Assert.assertEquals(cepo.getHerologo().getText(), configdata.getCommonLoginPageExpected());
	}

	@Test(priority = 2, groups = { "Regression" })
	public void TC003_MinimumLengthLoginTestCase() {

		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 3, 1));

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());
		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
		}

		generic.waitForVisibility(cepo.getHerologo());
		Assert.assertEquals(cepo.getHerologo().getText(), configdata.getCommonLoginPageExpected());
	}

}
