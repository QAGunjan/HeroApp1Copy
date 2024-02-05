//package com.oneapp.test_suits;
//
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import com.oneapp.basic.BaseClass;
//import com.oneapp.basic.ExcelData;
//import com.oneapp.pageobjects.CommonElements_Page_object;
//import com.oneapp.pageobjects.Dashboard_Page_object;
//import com.oneapp.pageobjects.Login_Page_Object;
//import com.oneapp.pageobjects.Logout_Page_Object;
//import com.oneapp.pageobjects.Menu_Bar_Page_Object;
//import com.oneapp.pageobjects.OTP_Page_Object;
//import com.oneapp.pageobjects.RelationshipManager_Page_Object;
//import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
//import com.oneapp.utils.ConfigData;
//import com.oneapp.utils.Console_Colors;
//import com.oneapp.utils.Generic;
//import com.oneapp.utils.TestUtils;
//
//public class DashboardTestCases extends BaseClass {
//
//	protected String val;
//	OTP_Page_Object otp_PO;
//	Selected_Vehicle_Page_Object sv_PO;
//	Dashboard_Page_object dashboard_PO;
//	Menu_Bar_Page_Object menuBar_PO;
//	Logout_Page_Object logout_PO;
//	CommonElements_Page_object cepo_PO;
//	 RelationshipManager_Page_Object rm_PO;
//
//	@Test(priority = 200, groups = { "Smoke", "Regression" })
//	public void TC601_ValidateDashboardVideo() throws InterruptedException {
//
//
//		new Generic()
//				.waitForVisibility(new Login_Page_Object(ad).getPleaseProceedWithYourRegisteredHeroMobileNumber_Text());
//		new SoftAssert().assertEquals(
//				new Login_Page_Object(ad).getPleaseProceedWithYourRegisteredHeroMobileNumber_Text().getText(),
//				new ConfigData().getPleaseProceedWithYourRegisteredHeroMobileNumberExpected());
//
//		new Generic()
//				.waitForVisibility(new Login_Page_Object(ad).getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text());
//		new SoftAssert().assertEquals(
//				new Login_Page_Object(ad).getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text().getText(),
//				new ConfigData().getByTappingOnLoginOrRegisterYouAreAgreeingToHeroExpected());
//
//		new Login_Page_Object(ad).enterLoginMobileNumber(new ExcelData().getStringData("Login Page", 1, 1));
//
//		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();
//
//		new Generic().waitForVisibility(otp_PO.getVerify_with_OTP());
//		new SoftAssert().assertEquals(otp_PO.getVerify_with_OTP().getText(), new ConfigData().getValidLoginExpected());
//
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getWelcomeToHero_Text().getText(),
//				new ConfigData().getWelcomeToHero_TextExpected());
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getEnter6digitOTPsentto_Text().getText(),
//				new ConfigData().getEnter6digitOTPsentto_TextExpected());
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getResendOTPin_Text().getText(),
//				new ConfigData().getResendOTPin_TextExpected());
//
//		otp_PO.TypeInField("123456");
//
//		new SoftAssert().assertEquals(new CommonElements_Page_object(ad).getButton().getText(),
//				new ConfigData().getVerify_TextExpected());
//
//		sv_PO = otp_PO.clickOnVerifyButton();
//
//		new SoftAssert().assertEquals(sv_PO.getYouWillAlwaysSeePrimaryVehicleDetails_Text().getText(),
//				new ConfigData().getYouWillAlwaysSeePrimaryVehicleDetails_TextExpected());
//
//		dashboard_PO = sv_PO.vinSelection();
//
//		dashboard_PO.DashboardAllPopUp();
//
//		dashboard_PO.toCheckDashboardVideoOrNot();
//
//		logout_PO = menuBar_PO.clickOnLogoutOut_Text();
//
//		new Generic().waitForVisibility(logout_PO.getLogoutWindow_text());
//		new SoftAssert().assertEquals(logout_PO.getLogoutWindow_text().getText(),
//				new ConfigData().getLogoutWindow_textExpected());
//		new Generic().waitForVisibility(logout_PO.getAreyousuretologout_text());
//		new SoftAssert().assertEquals(logout_PO.getAreyousuretologout_text().getText(),
//				new ConfigData().getAreyousuretologout_textExpected());
//
//		cepo_PO = logout_PO.clickOnYes();
//
//		new Generic().clickOnWebElement(new CommonElements_Page_object(ad).getClosePopUp());
//		new Generic().waitForVisibility(cepo_PO.getHerologo());
//
//		Assert.assertEquals(cepo_PO.getHerologo().getText(), new ConfigData().getCommonLoginPageExpected());
//
//		new SoftAssert().assertAll();
//	}
//
//	@Test(priority = 201, groups = { "Smoke", "Regression" })
//	public void TC602_ValidateRelationShipManager() throws InterruptedException {
//
//		new CommonElements_Page_object(ad).clickOnAllowPopUp("android");
//
//		new Generic()
//				.waitForVisibility(new Login_Page_Object(ad).getPleaseProceedWithYourRegisteredHeroMobileNumber_Text());
//		new SoftAssert().assertEquals(
//				new Login_Page_Object(ad).getPleaseProceedWithYourRegisteredHeroMobileNumber_Text().getText(),
//				new ConfigData().getPleaseProceedWithYourRegisteredHeroMobileNumberExpected());
//
//		new Generic()
//				.waitForVisibility(new Login_Page_Object(ad).getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text());
//		new SoftAssert().assertEquals(
//				new Login_Page_Object(ad).getByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text().getText(),
//				new ConfigData().getByTappingOnLoginOrRegisterYouAreAgreeingToHeroExpected());
//
//		new Login_Page_Object(ad).enterLoginMobileNumber(new ExcelData().getStringData("Login Page", 1, 1));
//
//		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();
//
//		new Generic().waitForVisibility(otp_PO.getVerify_with_OTP());
//		new SoftAssert().assertEquals(otp_PO.getVerify_with_OTP().getText(), new ConfigData().getValidLoginExpected());
//
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getWelcomeToHero_Text().getText(),
//				new ConfigData().getWelcomeToHero_TextExpected());
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getEnter6digitOTPsentto_Text().getText(),
//				new ConfigData().getEnter6digitOTPsentto_TextExpected());
//		new SoftAssert().assertEquals(new OTP_Page_Object(ad).getResendOTPin_Text().getText(),
//				new ConfigData().getResendOTPin_TextExpected());
//
//		otp_PO.TypeInField("123456");
//
//		new SoftAssert().assertEquals(new CommonElements_Page_object(ad).getButton().getText(),
//				new ConfigData().getVerify_TextExpected());
//
//		sv_PO = otp_PO.clickOnVerifyButton();
//
//		new SoftAssert().assertEquals(sv_PO.getYouWillAlwaysSeePrimaryVehicleDetails_Text().getText(),
//				new ConfigData().getYouWillAlwaysSeePrimaryVehicleDetails_TextExpected());
//
//		dashboard_PO = sv_PO.vinSelection();
//
//		dashboard_PO.DashboardAllPopUp();
//
//		  rm_PO = dashboard_PO.clickOnRelationShipManager();
//
//		new Generic().waitForVisibility(cepo_PO.getPageTitleText());
//		new SoftAssert().assertEquals(cepo_PO.getPageTitleText().getText(), new ConfigData().getrelationshipManagerPageTitleExpected());
//
//		if (new Generic().elementDisplaying(dashboard_PO.getRelationshipManagertext())) {
//
//			try {
//				if (new Generic().elementDisplaying(rm_PO.getTSM_text())) {
//
//					new Generic().waitForVisibility(rm_PO.getOtherContact_Text());
//					new SoftAssert().assertEquals(rm_PO.getOtherContact_Text().getText(), new ConfigData().getotherContact_TextExpected());
//
//					new Generic().waitForVisibility(rm_PO.getAreaSalesManager_Text());
//					new SoftAssert().assertEquals(rm_PO.getAreaSalesManager_Text().getText(),
//							new ConfigData().getAreaSalesManager_TextExpected());
//
//					String email = rm_PO.getTSM_email().getText();
//					email.contains("@heromotocorp.com");
//					Assert.assertTrue(email.contains("@heromotocorp.com"));
//					TestUtils.log().debug(email);
//					new Generic().clickOnWebElement(cepo_PO.getBack_icon());
//				}
//			} catch (Exception e) {
//				{
//					String noData = rm_PO.getNoDataFound().getText();
//					Assert.assertTrue(noData.equalsIgnoreCase(" no Data found"));
//					TestUtils.log().debug(noData);
//					new Generic().clickOnWebElement(cepo_PO.getBack_icon());
//
//				}
//
//			}
//
//		}
//
//		new SoftAssert().assertAll();
//	}
//
//	@Test(priority = 202, groups = { "Smoke", "Regression" })
//	public void TC603_ValidateRSA() {
//		if (generic.elementDisplaying(dpo.getRSAtext())) {
//
//			List<WebElement> options = dpo.getImageIconUnderKeyAction();
//			for (int i = 1; i <= options.size(); i++) {
//				if (i == 4)
//					try {
//						Thread.sleep(3000);
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				generic.clickOnWebElement(dpo.getRSAImageIcon());
//				break;
//			}
//
//		}
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getrSAPageTitleExpected());
//
//		String RSAPageText = rsapo.getRSAPage_Text().getText();
//		TestUtils.log().debug(RSAPageText);
//		sa.assertTrue(RSAPageText.equalsIgnoreCase(configdata.getrSAPageTextExpected()));
//
//		generic.waitForVisibility(rsapo.getLocatenearestdealer_Text());
//		sa.assertEquals(rsapo.getLocatenearestdealer_Text().getText(),
//				configdata.getLocatenearestdealer_TextExpected());
//
//		generic.clickOnWebElement(cepo.getBack_icon());
//
//		sa.assertAll();
//	}
//
//	@Test(priority = 203, groups = { "Smoke", "Regression" })
//	public void TC604_ValidateDealerLocator() throws InterruptedException {
//
//		Thread.sleep(3000);
//
//		if (generic.elementDisplaying(dpo.getKey_action_text())) {
//
//			if (generic.elementDisplaying(dpo.getDealerLocatortext())) {
//				// Generic.itratingOnWebelements(dpo.getDealerLocatortext(), "Dealer Locator");
//				List<WebElement> options = dpo.getImageIconUnderKeyAction();
//				for (int i = 1; i <= options.size(); i++) {
//					if (i == 6)
//						try {
//							Thread.sleep(3000);
//						} catch (InterruptedException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//					generic.clickOnWebElement(dpo.getDealerLocatorImageIcon());
//
//					break;
//				}
//			}
//		}
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getdealerLocatorPageTitleExpected());
//
//		try {
//			if (generic.elementDisplaying(dealerlocatorpo.getSomethingWentWrong_text())) {
//
//				TestUtils.log().debug(Console_Colors.Red_color()
//						+ "We are getting Something Went wrong in Dealer Locator" + Console_Colors.Reset_color());
//				Assert.fail();
//			}
//		}
//
//		catch (Exception e) {
//
//			generic.clickOnWebElement(dealerlocatorpo.getListViewicon());
//
//			generic.waitForVisibility(dealerlocatorpo.getNodealerfound_Text());
//			sa.assertEquals(dealerlocatorpo.getNodealerfound_Text().getText(),
//					configdata.getNodealerfound_TextExpected());
//
//			generic.clickOnWebElement(cepo.getState_box());
//			List<WebElement> options = cepo.getState_typedropdown();
//			generic.itratingOnWebelements(options, "Delhi");
//			generic.clickOnWebElement(cepo.getCity_box());
//			List<WebElement> options1 = cepo.getCity_typedropdown();
//			generic.itratingOnWebelements(options1, "Delhi");
//
//			TestUtils.log().debug("BELOW ARE THE LIST OF DEALER LOCATORS WHICH ARE IN DELHI STATE");
//			List<WebElement> elements = dealerlocatorpo.getDealerLocatorsName();
//			for (WebElement element : elements) {
//				Thread.sleep(4000);
//				val = element.getText();
//				TestUtils.log().debug(val);
//			}
//
//			if (generic.elementDisplaying(dealerlocatorpo.getHansMotorsDealerLocatorName())) {
//				generic.clickOnWebElement(dealerlocatorpo.getCallIconBesidesHansMotorsDealer());
//				Thread.sleep(2000);
//				ad.terminateApp("com.customerapp.hero");
//				Thread.sleep(4000);
//				ad.activateApp("com.samsung.android.dialer");
//				generic.waitForVisibility(dealerlocatorpo.getDialerPad());
//				sa.assertEquals(dealerlocatorpo.getDialerPad().getText(), configdata.getdialerPadPageExpected());
//				Thread.sleep(3000);
//				ad.terminateApp("com.samsung.android.dialer");
//				Thread.sleep(3000);
//				ad.activateApp("com.customerapp.hero");
//				Thread.sleep(10000);
//
//			}
//		}
//		sa.assertAll();
//	}
//
//}
