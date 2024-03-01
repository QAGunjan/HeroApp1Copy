package com.oneapp.test_suits;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.ExchangejouneyDashboardScreen_page_object;
import com.oneapp.pageobjects.FinalScreenExchangeJourney_page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.pageobjects.VehicleConditionScreenExchangeJourney_page_object;
import com.oneapp.pageobjects.VehicleDetailsScreenExchangeJourney_page_object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class WotTestCases extends BaseClass {

	Login_Page_Object Login_PO;
	public OTP_Page_Object otp_PO;
	public Selected_Vehicle_Page_Object sv_PO;
	public Dashboard_Page_object dashboard_PO;
	public Menu_Bar_Page_Object menuBar_PO;
	public Logout_Page_Object logout_PO;
	public CommonElements_Page_object cepo_PO;
	public SoftAssert sa = new SoftAssert();
	public ConfigData configData = new ConfigData();
	public Generic generic = new Generic();
	public ExcelData exceldata = new ExcelData();
	public ExchangejouneyDashboardScreen_page_object ExchangejouneyDashboardScreen_PO;
	public VehicleDetailsScreenExchangeJourney_page_object VehicleDetailsScreenExchangeJourney_PO;
	public VehicleConditionScreenExchangeJourney_page_object VehicleConditionScreenExchangeJourney_PO;
	public FinalScreenExchangeJourney_page_object FinalScreenExchangeJourney_PO;

	public MobileElement workingScrollToElement() throws InterruptedException {

		Thread.sleep(6000);

		String country = "Front Tyre";
		MobileElement element = (MobileElement) ad
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + country + "\"))"));

		return element;
	}

	@Test(priority = 1202, groups = { "Regression" })

	public void TC503_ValidateVehicleExchangeTestcase() throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(exceldata.getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		ExchangejouneyDashboardScreen_PO = dashboard_PO.clickOnExchangeIcon();

		VehicleDetailsScreenExchangeJourney_PO = ExchangejouneyDashboardScreen_PO.SelectVehicle();

		VehicleDetailsScreenExchangeJourney_PO.enterCityToSellVehicle();
		VehicleDetailsScreenExchangeJourney_PO.clickOnSuggestions();

		VehicleDetailsScreenExchangeJourney_PO.enterPinCode();
		VehicleConditionScreenExchangeJourney_PO = VehicleDetailsScreenExchangeJourney_PO.clickOnNextButton();

//		workingScrollToElement();

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(1, "Smoke");
		map.put(2, "Starting");
		map.put(3, "Light Indicator");
		map.put(4, "Front Tyre");
		map.put(5, "Rear Tyre");
		map.put(6, "Body Part");

		for (Entry<Integer, String> element : map.entrySet()) {

			String value = element.getValue();

			System.out.println(value);
			VehicleConditionScreenExchangeJourney_PO.identifyVehicleConditions(value);
		}

		FinalScreenExchangeJourney_PO = VehicleConditionScreenExchangeJourney_PO.clickOnNextButton();

		SoftAssertion(FinalScreenExchangeJourney_PO.getVehicleNameText(),
				FinalScreenExchangeJourney_PO.getVehicleNameText().getText(), "SPLENDOR+ XTEC");

		SoftAssertion(FinalScreenExchangeJourney_PO.getMonthAndYearText(),
				FinalScreenExchangeJourney_PO.getMonthAndYearText().getText(), "June, 2023");

		SoftAssertion(FinalScreenExchangeJourney_PO.getLocationText(),
				FinalScreenExchangeJourney_PO.getLocationText().getText(), "NEW DELHI");

	}

	public void SoftAssertion(WebElement element, String actualText, String expectedText) {
		generic.waitForVisibility(element);
		sa.assertEquals(actualText, expectedText);
	}

	public void HardAssertion(WebElement element, String actualText, String expectedText) {
		generic.waitForVisibility(element);
		Assert.assertEquals(actualText, expectedText);
	}

}
