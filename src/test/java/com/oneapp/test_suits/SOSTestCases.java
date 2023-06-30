package com.oneapp.test_suits;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

public class SOSTestCases extends BaseClass {

	@Test(priority = 300, groups = { "Smoke", "Regression" })
	public void TC501_ValidateSendSOSAlertTestcase() throws InterruptedException {
		/*
		try {
			if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.clickOnWebElement(cepo.getbutton());

		generic.waitForVisibility(opo.getVerify_with_OTP());

		Assert.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

		generic.clickOnWebElement(cepo.getbutton());

		if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
			generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
			TestUtils.log().debug("Book service PAID vin selected");
			generic.clickOnWebElement(cepo.getbutton());
		}
		*/

		try {
			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clickOnWebElement(dpo.getSOS_icon());
		generic.clickOnWebElement(soswpo.getSend_alert_now_button());

		generic.waitForVisibility(dpo.getKey_action_text());
		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getcommonAssertionSOSAlertWindowExpected());
        Thread.sleep(3000);	
	}

	@Test(priority = 301, groups = { "Regression" })
	public void TC502_ValidateDontSentLinkTestcase() {
		generic.clickOnWebElement(dpo.getSOS_icon());
		generic.tappingOnWebelement(512, 1510);

		generic.waitForVisibility(dpo.getKey_action_text());
		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getcommonAssertionSOSAlertWindowExpected());

	}

	@Test(priority = 302, groups = { "Regression" })
	public void TC503_ValidatecloseIconTestcase() {
		generic.clickOnWebElement(dpo.getSOS_icon());
		generic.tappingOnWebelement(882, 813);

		generic.waitForVisibility(dpo.getKey_action_text());
		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getcommonAssertionSOSAlertWindowExpected());

	}

}
