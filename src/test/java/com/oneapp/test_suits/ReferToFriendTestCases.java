package com.oneapp.test_suits;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

public class ReferToFriendTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	@Test(priority = 800, groups = { "Smoke", "Regression" })
	public void TC901_ValidateValidReferToFriend() {
 
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

		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getreferToFriendPageTitleExpected());

		generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), "Race");
		generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), "8130998133");
		generic.clickOnWebElement(cepo.getState_box());
		List<WebElement> options = cepo.getState_typedropdown();
		generic.itratingOnWebelements(options, "delhi");
		generic.clickOnWebElement(cepo.getCity_box());
		List<WebElement> options1 = cepo.getCity_typedropdown();
		generic.itratingOnWebelements(options1, "new delhi");
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, "Destini 125");
		generic.clickOnWebElement(cepo.getbutton());

		if (generic.elementDisplaying(rtfpo.getSuccessfullyReferral_PopUp())) {
			generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}

		generic.waitForVisibility(dpo.getKey_action_text());
		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getreferSuccessfullyExpected());

		sa.assertAll();
	}

	@Test(priority = 801, groups = { "Regression" })
	public void TC902_ValidateReferToYourSelfLink() {

		/*
		 * try { if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung()))
		 * { generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung()); } }
		 * catch (Exception e) { TestUtils.log().debug(Console_Colors.Red_color() + e +
		 * Console_Colors.Reset_color()); }
		 * 
		 * generic.clearOnTexBox(lpo.getMobile_num_field());
		 * generic.sendKeysOnTextfields(lpo.getMobile_num_field(),
		 * exceldata.getStringData("Login Page", 1, 1));
		 * generic.clickOnWebElement(cepo.getbutton());
		 * 
		 * generic.waitForVisibility(opo.getVerify_with_OTP());
		 * 
		 * Assert.assertEquals(opo.getVerify_with_OTP().getText(),
		 * configdata.getValidLoginExpected());
		 * 
		 * opo.getFirsttxtbox().sendKeys("1"); opo.getSecondtxtbox().sendKeys("2");
		 * opo.getThirdtxtbox().sendKeys("3"); opo.getFourthtxtbox().sendKeys("4");
		 * opo.getFifthtxtbox().sendKeys("5"); opo.getSixthtxtbox().sendKeys("6");
		 * 
		 * generic.clickOnWebElement(cepo.getbutton());
		 * 
		 * if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
		 * generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
		 * TestUtils.log().debug("Book service PAID vin selected");
		 * generic.clickOnWebElement(cepo.getbutton()); }
		 * 
		 * try { if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung()))
		 * { generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
		 * Thread.sleep(5000); } } catch (Exception e) {
		 * TestUtils.log().debug(Console_Colors.Red_color() + e +
		 * Console_Colors.Reset_color()); }
		 * 
		 */

		generic.clickOnWebElement(dpo.getMenu_bar_icon());
		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getreferToFriendPageTitleExpected());

		generic.clickOnWebElement(rtfpo.getReferYourself_link());
		generic.waitForVisibility(rtfpo.getFriendName_field());
		sa.assertEquals(rtfpo.getFriendName_field().getText(), exceldata.getStringData("My Profile", 5, 1));
		generic.waitForVisibility(rtfpo.getMobileNumber_field());
		sa.assertEquals(rtfpo.getMobileNumber_field().getText(), exceldata.getStringData("Login Page", 1, 1));
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, "Destini 125");
		generic.clickOnWebElement(cepo.getbutton());

		if (generic.elementDisplaying(rtfpo.getSuccessfullyReferral_PopUp())) {
			generic.clickOnWebElement(rtfpo.getOk_text());

		}

		else {
			TestUtils.log().debug("PopUp is not displaying");
			Assert.fail();
		}

		generic.waitForVisibility(dpo.getKey_action_text());
		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getreferSuccessfullyExpected());

		sa.assertAll();
	}
}
