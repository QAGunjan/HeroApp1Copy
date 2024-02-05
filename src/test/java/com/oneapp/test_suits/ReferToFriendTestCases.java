package com.oneapp.test_suits;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.ReferToFriend_Page_object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.MobileElement;

public class ReferToFriendTestCases extends BaseClass {

	public Login_Page_Object Login_PO;
	public OTP_Page_Object otp_PO;
	public Selected_Vehicle_Page_Object sv_PO;
	public Dashboard_Page_object dashboard_PO;
	public Menu_Bar_Page_Object menuBar_PO;
	public Logout_Page_Object logout_PO;
	public CommonElements_Page_object cepo_PO;
	public ReferToFriend_Page_object ReferToFriend_PO;
	public SoftAssert sa = new SoftAssert();
	public ConfigData configData = new ConfigData();
	public Generic generic = new Generic();
	ExcelData exceldata = new ExcelData();

	@DataProvider(name = "referAFriendTestData")
	public Object[][] GetReferAFriendData() {

		return new Object[][] {

				{ "valid", "Randhir Kumar", "8505803061", "PUNJAB", "BEAS", "Duet" },
				{ "valid", "Randhir", "8800996768", "SIKKIM", "PELLING", "HF 100" },
				{ "valid", "Randhir", "9891803084", "HARYANA", "KARNAL", "Xpulse 200" }

		};
	}

	@Test(priority = 800, groups = { "Smoke", "Regression" }, dataProvider = "referAFriendTestData")
	public void TC901_ValidateValidReferToFriend(String scenario, String friendName, String mobileNumber,
			String stateName, String cityName, String modelName) throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(exceldata.getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		menuBar_PO = dashboard_PO.clickOnMenuBarIcon();

		ReferToFriend_PO = menuBar_PO.clickOnReferToFriend();

		ReferToFriend_PO.ReferAFriend(friendName, mobileNumber, stateName, cityName, modelName);

		if (scenario.equalsIgnoreCase("valid")) {
			generic.waitForVisibility(dashboard_PO.getKey_action_text());
			sa.assertEquals(dashboard_PO.getKey_action_text().getText(),
					configData.getcommonAssertionSOSAlertWindowExpected());

			LoggingOut();
			
			sa.assertAll();
		}

	}

	public void LoggingOut() throws InterruptedException {

		dashboard_PO.clickOnMenuBarIcon();

		generic.Scrolling("Logout");

		logout_PO = menuBar_PO.clickOnLogoutOut_Text();

		cepo_PO = logout_PO.clickOnYes();

//		new Generic().clickOnWebElement(new CommonElements_Page_object(ad).getClosePopUp());
		generic.waitForVisibility(cepo_PO.getHerologo());

		Assert.assertEquals(cepo_PO.getHerologo().getText(), configData.getCommonLoginPageExpected());
	}

}

//		generic.waitForVisibility(cepo_PO.getPageTitleText());
//		sa.assertEquals(cepo_PO.getPageTitleText().getText(), configData.getreferToFriendPageTitleExpected());
//
//		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getreferToFriendPageTitleExpected());
//
//		generic.clickOnWebElement(cepo.getbutton());
//
//		HashMap<String, String> testD = exceldata.hashmapping("Refer a friend", 10);
//		for (Entry<String, String> map : testD.entrySet()) {
//			generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), map.getValue()); // "Refer a friend"
//			Thread.sleep(3000);
//			String FriendNameField = rtfpo.getFriendName_field().getText();
//			Assert.assertFalse(FriendNameField.contains("++++++++++++@#%@#%#^$%&&)*)!#$!"));
//			Assert.assertFalse(FriendNameField.contains("@"));
//			Assert.assertFalse(FriendNameField.contains("//"));
//			Assert.assertFalse(FriendNameField.contains("</>"));
//		}
//
//		generic.sendKeysOnTextfields(rtfpo.getFriendName_field(), exceldata.getStringData("Refer a friend", 1, 1));
//		generic.sendKeysOnTextfields(rtfpo.getMobileNumber_field(), exceldata.getStringData("Refer a friend", 2, 1));
//		generic.clickOnWebElement(cepo.getState_box());
//		List<WebElement> options = cepo.getState_typedropdown();
//		generic.itratingOnWebelements(options, exceldata.getStringData("Refer a friend", 3, 1));
//		generic.clickOnWebElement(cepo.getCity_box());
//		List<WebElement> options1 = cepo.getCity_typedropdown();
//		generic.itratingOnWebelements(options1, exceldata.getStringData("Refer a friend", 4, 1));
//		generic.clickOnWebElement(rtfpo.getSelectModel_box());
//		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
//		generic.itratingOnWebelements(options3, exceldata.getStringData("Refer a friend", 5, 1));
//		generic.clickOnWebElement(cepo.getbutton());
//
//		if (generic.elementDisplaying(rtfpo.getSuccessfullyReferral_PopUp())) {
//			generic.clickOnWebElement(rtfpo.getOk_text());
//
//		}
//
//		else {
//			TestUtils.log().debug("PopUp is not displaying");
//			Assert.fail();
//		}
//
//		generic.waitForVisibility(dpo.getKey_action_text());
//		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getreferSuccessfullyExpected());
//
//		sa.assertAll();
//	}
//
//	@Test(priority = 801, groups = { "Regression" })
//	public void TC902_ValidateReferToYourSelfLink() {
//
//		/*
//		 * try { if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung()))
//		 * { generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung()); } }
//		 * catch (Exception e) { TestUtils.log().debug(Console_Colors.Red_color() + e +
//		 * Console_Colors.Reset_color()); }
//		 * 
//		 * generic.clearOnTexBox(lpo.getMobile_num_field());
//		 * generic.sendKeysOnTextfields(lpo.getMobile_num_field(),
//		 * exceldata.getStringData("Login Page", 1, 1));
//		 * generic.clickOnWebElement(cepo.getbutton());
//		 * 
//		 * generic.waitForVisibility(opo.getVerify_with_OTP());
//		 * 
//		 * Assert.assertEquals(opo.getVerify_with_OTP().getText(),
//		 * configdata.getValidLoginExpected());
//		 * 
//		 * opo.getFirsttxtbox().sendKeys("1"); opo.getSecondtxtbox().sendKeys("2");
//		 * opo.getThirdtxtbox().sendKeys("3"); opo.getFourthtxtbox().sendKeys("4");
//		 * opo.getFifthtxtbox().sendKeys("5"); opo.getSixthtxtbox().sendKeys("6");
//		 * 
//		 * generic.clickOnWebElement(cepo.getbutton());
//		 * 
//		 * if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
//		 * generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
//		 * TestUtils.log().debug("Book service PAID vin selected");
//		 * generic.clickOnWebElement(cepo.getbutton()); }
//		 */
////		try {
////			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
////				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
////				Thread.sleep(5000);
////			}
////		} catch (Exception e) {
////			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
////		}
//
//		generic.clickOnWebElement(dpo.getMenu_bar_icon());
//		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getreferToFriendPageTitleExpected());
//
//		generic.clickOnWebElement(rtfpo.getReferYourself_link());
//		generic.waitForVisibility(rtfpo.getFriendName_field());
//		sa.assertEquals(rtfpo.getFriendName_field().getText(), exceldata.getStringData("My Profile", 5, 1));
//		generic.waitForVisibility(rtfpo.getMobileNumber_field());
//		sa.assertEquals(rtfpo.getMobileNumber_field().getText(), exceldata.getStringData("Login Page", 1, 1));
//		generic.clickOnWebElement(rtfpo.getSelectModel_box());
//		List<WebElement> options3 = rtfpo.getSelectModel_typedropdown();
//		generic.itratingOnWebelements(options3, "Destini 125");
//		generic.clickOnWebElement(cepo.getbutton());
//
//		if (generic.elementDisplaying(rtfpo.getSuccessfullyReferral_PopUp())) {
//			generic.clickOnWebElement(rtfpo.getOk_text());
//
//		}
//
//		else {
//			TestUtils.log().debug("PopUp is not displaying");
//			Assert.fail();
//		}
//
//		generic.waitForVisibility(dpo.getKey_action_text());
//		Assert.assertEquals(dpo.getKey_action_text().getText(), configdata.getreferSuccessfullyExpected());
//
//		sa.assertAll();
//	}
//	}
//}
