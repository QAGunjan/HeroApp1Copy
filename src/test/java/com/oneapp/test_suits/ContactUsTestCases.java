package com.oneapp.test_suits;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

public class ContactUsTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	@Test(priority = 700, groups = { "Smoke", "Regression" })
	public void TC701_ValidateContactUSlink() throws InterruptedException {
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

		try {
			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clickOnWebElement(dpo.getMenu_bar_icon());
		
		*/
		generic.clickOnWebElement(mbpo.getContactUs_menu_bar_txt());

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getContactUsPageTitleExpected());

		generic.clickOnWebElement(cupo.getWhatsapp_text());

		if (generic.elementDisplaying(cupo.getWhatsapp_text())) {
			TestUtils.log().debug("We can’t find WhatsApp on your device. Please install for better experience");
			generic.waitForVisibility(cupo.getWhatsapp_text());
			Assert.assertEquals(cupo.getWhatsapp_text().getText(), configdata.getwhatsappUnderContactUSExpected());
		}

		sa.assertAll();
		Thread.sleep(6000);
		generic.clickOnWebElement(cepo.getBack_icon());
	}

}
