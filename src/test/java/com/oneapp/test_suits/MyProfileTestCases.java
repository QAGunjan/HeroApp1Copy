package com.oneapp.test_suits;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
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
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MyProfileTestCases extends BaseClass {

	Login_Page_Object Login_PO;
	public OTP_Page_Object otp_PO;
	public Selected_Vehicle_Page_Object sv_PO;
	public Dashboard_Page_object dashboard_PO;
	public Logout_Page_Object logout_PO;
	public CommonElements_Page_object cepo_PO;
	public SoftAssert sa = new SoftAssert();
	public ConfigData configData = new ConfigData();
	public Generic generic = new Generic();
	public Menu_Bar_Page_Object menuBar_PO;
	public MyProfile_Page_Object MyProfile_PO;
	public Personal_Details_Page_Object Personal_Details_PO;

	@DataProvider(name = "profiletestdata")
	public Object[][] GetDataProvider() {

		return new Object[][] {

				{ "valid", "Randhir", "Randhir@gmail.com", "28/12/2000", "asdaskdhasd", "110091" },
//				{ "InvalidWithBlankData", "  ", "   ", "28/12/2000", " ", "  " },

		};
	}

	@Test(dataProvider = "profiletestdata", priority = 400, groups = { "Smoke", "Regression" })
	public void TC201_ValidateValidProfileDetailsTestcase(String scenario, String fullName, String email, String dob,
			String address, String pincode) throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(new ExcelData().getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		menuBar_PO = dashboard_PO.clickOnMenuBarIcon();

		MyProfile_PO = menuBar_PO.clickOnMyProfile();

		MyProfile_PO.clickOnMoreDetails();

		Personal_Details_PO = MyProfile_PO.clickOnEditProfileDetails();
		Personal_Details_PO.enterFullName(fullName);
		Personal_Details_PO.enterEmail(email);
		Personal_Details_PO.enterDate(dob);

		Thread.sleep(6000);

		TouchAction actions = new TouchAction(ad);
		actions.press(PointOption.point(555, 1803)).moveTo(PointOption.point(555, 813)).release().perform();

		Thread.sleep(6000);

		Personal_Details_PO.enterAddress(address);
		Personal_Details_PO.enterPinCode(pincode);
		Personal_Details_PO.clickOnSaveButton();

		if (scenario.equalsIgnoreCase("valid")) {
			sa.assertEquals(MyProfile_PO.getSavedFullName().getText(), "Randhir");
			sa.assertEquals(MyProfile_PO.getSavedEmail().getText(), "Randhir@gmail.com");

			LoggingOut();
		}

		else if (scenario.equalsIgnoreCase("InvalidWithBlankData")) {
			sa.assertTrue(Personal_Details_PO.getSave_btn().getText().equalsIgnoreCase("Save"));

			Personal_Details_PO.clickOnBackIcon();

			LoggingOut();

		}

		sa.assertAll();
	}

	public void LoggingOut() throws InterruptedException {
		MyProfile_PO.clickOnBackIcon();

		menuBar_PO = dashboard_PO.clickOnMenuBarIcon();

		generic.Scrolling("Logout");

		logout_PO = menuBar_PO.clickOnLogoutOut_Text();

		cepo_PO = logout_PO.clickOnYes();

//		new Generic().clickOnWebElement(new CommonElements_Page_object(ad).getClosePopUp());
		generic.waitForVisibility(cepo_PO.getHerologo());

		Assert.assertEquals(cepo_PO.getHerologo().getText(), configData.getCommonLoginPageExpected());
	}

}
