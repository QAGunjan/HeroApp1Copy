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

import io.appium.java_client.TouchAction;

public class EmergencyContactTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	@Test(priority = 500, groups = { "Smoke", "Regression" })
	public void TC301_ValidateValidAndInValidAdddingEmergencyContactTestcase() throws InterruptedException {

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
//		generic.clickOnWebElement(mbpo.getMyprofile_menu_bar_txt());
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getprofileDetailsPageTitleExpected());

		generic.clickOnWebElement(mppo.getEmergency_contact_txt());
		generic.clickOnWebElement(ecpo.getAdd_emergency_contact_link());
		try {
			if (ecpo.getContact_acess_popUpSamsung().isDisplayed()) {
				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
			}
		} catch (Exception e) {
			TestUtils.log().debug("Contact Acess pop up is not displaying");
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clickOnWebElement(ecpo.getCreate_text());

		generic.clickOnWebElement(cepo.getbutton());

		String fullNameText = ecdpo.getFullName_text().getText();
		Assert.assertTrue(fullNameText.equalsIgnoreCase("full name"));

		HashMap<String, String> testD = exceldata.hashmapping("Emergency_contact", 9);
		for (Entry<String, String> map : testD.entrySet()) {
			generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), map.getValue()); // "Emergency_contact"
			Thread.sleep(3000);
			String FullNameField = ecdpo.getFullname_textbox().getText();
			Assert.assertFalse(FullNameField.contains("++++++++++++@#%@#%#^$%&&)*)!#$!"));
			Assert.assertFalse(FullNameField.contains("@"));
			Assert.assertFalse(FullNameField.contains("//"));
			Assert.assertFalse(FullNameField.contains("</>"));
		}

//		HashMap<String, String> testD1 = exceldata.hashmapping("Emergency_contact", 17);
//		for (Entry<String, String> map1 : testD1.entrySet()) {
//			generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), map1.getValue()); // "Emergency_contact"
//			Thread.sleep(3000);
//			String MobileNumberField = ecdpo.getMob_number_txtbox().getText();
//			Assert.assertFalse(MobileNumberField.contains("ABCD"));
//			Assert.assertFalse(MobileNumberField.contains("//"));
//			Assert.assertFalse(MobileNumberField.contains("</h2>"));
//			Assert.assertFalse(MobileNumberField.contains("+!@#$%^&*()"));
//			Assert.assertFalse(MobileNumberField.contains("Yes"));
//		}

		generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		generic.clickOnWebElement(ecdpo.getRelation_type());

		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		generic.clickOnWebElement(cepo.getbutton());
		generic.waitForVisibility(ecpo.getSaved_mob_number_contact());
		Assert.assertEquals(ecpo.getSaved_mob_number_contact().getText(),
				exceldata.getStringData("Emergency_contact", 4, 1));

		sa.assertAll();
	}

	@Test(priority = 501, groups = { "Smoke", "Regression" })
	public void TC302_ValidateValidDeletingEmergencyContactTestcase() throws InterruptedException {

		generic.clickOnWebElement(ecpo.getThreedots_besides_contact_num());
		generic.tappingOnWebelement(769, 614);
		generic.clickOnWebElement(ecpo.getDelete_btn());

		generic.waitForVisibility(ecpo.getAdd_emergency_contact_link());
		Assert.assertEquals(ecpo.getAdd_emergency_contact_link().getText(),
				configdata.getdeletingContactPageExpected());
		Thread.sleep(5000);
		generic.clickOnWebElement(cepo.getBack_icon());
		generic.clickOnWebElement(cepo.getBack_icon());

		generic.clickOnWebElement(mbpo.getLogout_menu_bar_txt());

		try {
			generic.clickOnWebElement(lopo.getYes_text());
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.waitForVisibility(cepo.getHerologo());
		Assert.assertEquals(cepo.getHerologo().getText(), configdata.getCommonLoginPageExpected());
	}

}
