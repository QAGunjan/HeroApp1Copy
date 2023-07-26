package com.oneapp.test_suits;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

public class OtpTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	@Test(priority = 100, groups = { "Smoke", "Regression" })
	public void TC101_ValidOtpTestcase() {
		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			try {
				if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
					generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
				}
			} catch (Exception e) {
				TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
			}
		}

		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());
		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
		}

		generic.waitForVisibility(opo.getVerify_with_OTP());

		sa.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());

			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
				TestUtils.log().debug("Book service PAID vin selected");
				generic.clickOnWebElement(cepo.getbutton());

//				try {
//					if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//						generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//					}
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}
//				try {
//					if (generic.elementDisplaying(dpo.getAcessYourPhoneCallLogsPopUp())) {
//						generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//					}
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}
//
//				try {
//					if (generic.elementDisplaying(dpo.getAcessYourContactsPopUp())) {
//						generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//					}
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}
//
//				try {
//					if (generic.elementDisplaying(dpo.getManagePhoneCallsPopUp())) {
//						generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//					}
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}
//				try {
//					if (generic.elementDisplaying(dpo.getSendAndViewSMSMessagesPopUp())) {
//						generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//					}
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}
//
//				try {
//					if (generic.elementDisplaying(dpo.getNearby_devices_popup())) {
//						generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//					}
//
//				} catch (Exception e) {
//					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//				}

				base.dashboardAllPopUp(dpo.getDevice_location_popup_samsung(), cepo.getOnlyThisTime_popup_samsung(),
						dpo.getAcessYourPhoneCallLogsPopUp(), cepo.getAllowing_commom_popup_samsung(),
						dpo.getAcessYourContactsPopUp(), dpo.getManagePhoneCallsPopUp(),
						dpo.getSendAndViewSMSMessagesPopUp(), dpo.getNearby_devices_popup());
			}
		}

		else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getVerifybuttonIOS());

			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
				generic.clickOnWebElement(cepo.getsavebuttonIOS());
				TestUtils.log().debug("Book service PAID vin selected");
				generic.clickOnWebElement(cepo.getContinuebuttonIOS());
			}

//			if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//				generic.clickOnWebElement(cepo.getbutton());
//			} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
//				generic.clickOnWebElement(cepo.getContinuebuttonIOS());
//			}
		}

//		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//
//			try {
//				if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//					generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//					Thread.sleep(5000);
//				}
//			} catch (Exception e) {
//				TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//			}
//		}

		generic.clickOnWebElement(dpo.getMenu_bar_icon());
		generic.clickOnWebElement(mbpo.getLogout_menu_bar_txt());

		try {
			generic.clickOnWebElement(lopo.getYes_text());
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.waitForVisibility(cepo.getHerologo());

		Assert.assertEquals(cepo.getHerologo().getText(), configdata.getCommonLoginPageExpected());

		sa.assertAll();
	}

	@Test(priority = 101, groups = { "Regression" })
	public void TC102_InValidOtpTestcase() {
		/*
		 * 
		 * try { if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung()))
		 * { generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung()); } }
		 * catch (Exception e) { TestUtils.log().debug(Console_Colors.Red_color() + e +
		 * Console_Colors.Reset_color()); }
		 * 
		 */

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());
		} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getContinuebuttonIOS());
		}

		generic.waitForVisibility(opo.getVerify_with_OTP());

		sa.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("8");

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());

		}

		else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getVerifybuttonIOS());

		}

		generic.waitForVisibility(opo.getVerify_with_OTP());
		Assert.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

	}

	@Test(priority = 102, groups = { "Regression" })
	public void TC103_ResendLinkTestcase() {

		generic.clickOnWebElement(opo.getResend_link());

		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
			generic.clickOnWebElement(cepo.getbutton());

			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
				TestUtils.log().debug("Book service PAID vin selected");
				generic.clickOnWebElement(cepo.getbutton());

				try {
					if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
						generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
						Thread.sleep(5000);
					}
				} catch (Exception e) {
					TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
				}

			}
		}

		else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
			generic.clickOnWebElement(cepo.getVerifybuttonIOS());

			if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
				generic.clickOnWebElement(cepo.getsavebuttonIOS());
				TestUtils.log().debug("Book service PAID vin selected");
				generic.clickOnWebElement(cepo.getContinuebuttonIOS());
			}

//			if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//				generic.clickOnWebElement(cepo.getbutton());
//			} else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {
//				generic.clickOnWebElement(cepo.getContinuebuttonIOS());
//			}
		}

//		if (PLATFORM_NAME.equalsIgnoreCase("android")) {
//
//			try {
//				if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//					generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//					Thread.sleep(5000);
//				}
//			} catch (Exception e) {
//				TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//			}
//		}

		generic.clickOnWebElement(dpo.getMenu_bar_icon());
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
