package com.oneapp.test_suits;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

public class DashboardTestCases extends BaseClass {

	SoftAssert sa = new SoftAssert();

	protected String val;

	@Test(priority = 200, groups = { "Smoke", "Regression" })
	public void TC601_ValidateDashboardVideo() {
//		try {
//			if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
//				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//			}
//		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.clickOnWebElement(cepo.getbutton());

		generic.waitForVisibility(opo.getVerify_with_OTP());

		sa.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

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

//		try {
//			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//				Thread.sleep(5000);
//			}
//		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}

		try {

			if (generic.elementDisplaying(dpo.getDashboardVideo())) {
				TestUtils.log().debug("Dashboard video is present");
				generic.clickOnWebElement(dpo.getDashboardVideoCloseIcon());
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());

			TestUtils.log().debug(
					Console_Colors.Red_color() + "Dasdhboard video is not displaying " + Console_Colors.Reset_color());
			Assert.fail();
		}
		
		sa.assertAll();
	}

	@Test(priority = 201, groups = { "Smoke", "Regression" })
	public void TC602_ValidateRelationShipManager() throws InterruptedException {
		if (dpo.getKey_action_text().isDisplayed() == true) {
			if (dpo.getRelationshipManagertext().isDisplayed() == true) {

				List<WebElement> options = dpo.getImageIconUnderKeyAction();
				for (int i = 1; i <= options.size(); i++) {
					if (i == 3)

						Thread.sleep(3000);

					generic.clickOnWebElement(dpo.getRelationshipManagerImageIcon());
					break;
				}

			}
		}

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getrelationshipManagerPageTitleExpected());

		if (generic.elementDisplaying(dpo.getRelationshipManagertext())) {

			try {
				if (generic.elementDisplaying(rmpo.getTSM_text())) {

					String email = rmpo.getTSM_email().getText();
					email.contains("@heromotocorp.com");
					Assert.assertTrue(email.contains("@heromotocorp.com"));
					TestUtils.log().debug(email);
					generic.clickOnWebElement(cepo.getBack_icon());
				}
			} catch (Exception e) {
				{
					String noData = rmpo.getNoDataFound().getText();
					Assert.assertTrue(noData.equalsIgnoreCase(" no Data found"));
					TestUtils.log().debug(noData);
					generic.clickOnWebElement(cepo.getBack_icon());

				}

			}

		}

		sa.assertAll();
	}

	@Test(priority = 202, groups = { "Smoke", "Regression" })
	public void TC603_ValidateRSA() {
		if (generic.elementDisplaying(dpo.getRSAtext())) {

			List<WebElement> options = dpo.getImageIconUnderKeyAction();
			for (int i = 1; i <= options.size(); i++) {
				if (i == 4)
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				generic.clickOnWebElement(dpo.getRSAImageIcon());
				break;
			}

		}

		generic.waitForVisibility(cepo.getPageTitleText());
		
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getrSAPageTitleExpected());

		String RSAPageText = rsapo.getRSAPage_Text().getText();
		TestUtils.log().debug(RSAPageText);
		Assert.assertTrue(RSAPageText.equalsIgnoreCase(configdata.getrSAPageTextExpected()));
		generic.clickOnWebElement(cepo.getBack_icon());

		sa.assertAll();
	}

	@Test(priority = 203, groups = { "Smoke", "Regression" })
	public void TC604_ValidateDealerLocator() throws InterruptedException {

		Thread.sleep(3000);

		if (generic.elementDisplaying(dpo.getKey_action_text())) {

			if (generic.elementDisplaying(dpo.getDealerLocatortext())) {
				// Generic.itratingOnWebelements(dpo.getDealerLocatortext(), "Dealer Locator");
				List<WebElement> options = dpo.getImageIconUnderKeyAction();
				for (int i = 1; i <= options.size(); i++) {
					if (i == 6)
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					generic.clickOnWebElement(dpo.getDealerLocatorImageIcon());

					break;
				}
			}
		}

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getdealerLocatorPageTitleExpected());

		try {
			if (generic.elementDisplaying(dealerlocatorpo.getSomethingWentWrong_text())) {

				TestUtils.log().debug(Console_Colors.Red_color()
						+ "We are getting Something Went wrong in Dealer Locator" + Console_Colors.Reset_color());
				Assert.fail();
			}
		}

		catch (Exception e) {
			generic.clickOnWebElement(cepo.getState_box());
			List<WebElement> options = cepo.getState_typedropdown();
			generic.itratingOnWebelements(options, "Delhi");
			generic.clickOnWebElement(cepo.getCity_box());
			List<WebElement> options1 = cepo.getCity_typedropdown();
			generic.itratingOnWebelements(options1, "Delhi");
			generic.clickOnWebElement(dealerlocatorpo.getListViewicon());

			TestUtils.log().debug("BELOW ARE THE LIST OF DEALER LOCATORS WHICH ARE IN DELHI STATE");
			List<WebElement> elements = dealerlocatorpo.getDealerLocatorsName();
			for (WebElement element : elements) {
				val = element.getText();
				TestUtils.log().debug(val);
			}

			if (generic.elementDisplaying(dealerlocatorpo.getHansMotorsDealerLocatorName())) {
				generic.clickOnWebElement(dealerlocatorpo.getCallIconBesidesHansMotorsDealer());
				Thread.sleep(2000);
				ad.terminateApp("com.customerapp.hero");
				Thread.sleep(4000);
				ad.activateApp("com.samsung.android.dialer");
				generic.waitForVisibility(dealerlocatorpo.getDialerPad());
				sa.assertEquals(dealerlocatorpo.getDialerPad().getText(), configdata.getdialerPadPageExpected());
				Thread.sleep(3000);
				ad.terminateApp("com.samsung.android.dialer");
				Thread.sleep(3000);
				ad.activateApp("com.customerapp.hero");
				Thread.sleep(10000);

			}
		}
		sa.assertAll();
	}

}
