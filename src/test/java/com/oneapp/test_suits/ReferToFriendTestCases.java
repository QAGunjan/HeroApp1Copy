package com.oneapp.test_suits;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.MobileElement;

public class ReferToFriendTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	@Test(priority = 800, groups = { "Smoke", "Regression" })
	public void TC901_ValidateValidReferToFriend() throws InterruptedException {

//		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//			try {
//				if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
//					generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//				}
//			} catch (Exception e) {
//				TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//			}
//		}
//
//		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
//
//		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//			generic.clickOnWebElement(cepo.getbutton());
//		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
//			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
//		}
//
//		generic.waitForVisibility(opo.getVerify_with_OTP());
//
//		sa.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());
//
//		opo.getFirsttxtbox().sendKeys("1");
//		opo.getSecondtxtbox().sendKeys("2");
//		opo.getThirdtxtbox().sendKeys("3");
//		opo.getFourthtxtbox().sendKeys("4");
//		opo.getFifthtxtbox().sendKeys("5");
//		opo.getSixthtxtbox().sendKeys("6");
//
//		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//			generic.clickOnWebElement(cepo.getbutton());
//
//			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
//				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
//				TestUtils.log().debug("Book service PAID vin selected");
//				generic.clickOnWebElement(cepo.getbutton());
//
//				base.dashboardAllPopUp(dpo.getDevice_location_popup_samsung(), cepo.getOnlyThisTime_popup_samsung(),
//						dpo.getAcessYourPhoneCallLogsPopUp(), cepo.getAllowing_commom_popup_samsung(),
//						dpo.getAcessYourContactsPopUp(), dpo.getManagePhoneCallsPopUp(),
//						dpo.getSendAndViewSMSMessagesPopUp(), dpo.getNearby_devices_popup());
//			}
//		}
//
//		else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
//			generic.clickOnWebElement(cepo.getVerifybuttonIOS());
//
//			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
//				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
//				generic.clickOnWebElement(cepo.getsavebuttonIOS());
//				TestUtils.log().debug("Book service PAID vin selected");
//				generic.clickOnWebElement(cepo.getContinuebuttonIOS());
//			}
//		}
//
//		generic.clickOnWebElement(dpo.getMenu_bar_icon());

		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getreferToFriendPageTitleExpected());

		generic.clickOnWebElement(cepo.getbutton());

		HashMap<String, String> testD = exceldata.hashmapping("Refer a friend", 10);
		for (Entry<String, String> map : testD.entrySet()) {
			generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), map.getValue()); // "Refer a friend"
			Thread.sleep(3000);
			String FriendNameField = rtfpo.getFriendName_field().getText();
			Assert.assertFalse(FriendNameField.contains("++++++++++++@#%@#%#^$%&&)*)!#$!"));
			Assert.assertFalse(FriendNameField.contains("@"));
			Assert.assertFalse(FriendNameField.contains("//"));
			Assert.assertFalse(FriendNameField.contains("</>"));
		}

		generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), exceldata.getStringData("Refer a friend", 1, 1));
		generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), exceldata.getStringData("Refer a friend", 2, 1));
		generic.clickOnWebElement(cepo.getState_box());
		List<WebElement> options = cepo.getState_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Refer a friend", 3, 1));
		generic.clickOnWebElement(cepo.getCity_box());
		List<WebElement> options1 = cepo.getCity_typedropdown();
		generic.itratingOnWebelements(options1, exceldata.getStringData("Refer a friend", 4, 1));
		generic.clickOnWebElement(rtfpo.getSelectModel_box());
		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
		generic.itratingOnWebelements(options3, exceldata.getStringData("Refer a friend", 5, 1));
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
		 */
//		try {
//			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//				Thread.sleep(5000);
//			}
//		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}

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
