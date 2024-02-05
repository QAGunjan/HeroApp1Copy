package com.oneapp.test_suits;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.BookServiceDetailsPage_page_object;
import com.oneapp.pageobjects.BookServiceMainScreen_page_object;
import com.oneapp.pageobjects.CancelServiceWindow_Page_Object;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Logout_Page_Object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.ReferToFriend_Page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.pageobjects.ServiceBookedScreen_page_object;
import com.oneapp.pageobjects.ServiceRescheduled_Page_Object;
import com.oneapp.pageobjects.ServiceRescheduling_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;

public class BookServiceTestCases extends BaseClass {

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
	BookServiceMainScreen_page_object bookServiceMainScreen_PO;
	BookServiceDetailsPage_page_object bookServiceDetails_PO;
	ServiceBookedScreen_page_object ServiceBookedScreen_PO;
	ServiceRescheduling_Page_Object ServiceRescheduling_PO;
	ServiceRescheduled_Page_Object ServiceRescheduled_PO;
	public ExcelData exceldata = new ExcelData();
	public CancelServiceWindow_Page_Object CancelServiceWindow_PO;

	@Test(priority = 600, groups = { "Smoke", "Regression" })
	public void TC601_ValidateBookServiceTestcase() throws InterruptedException {

		Login_PO = new Login_Page_Object(ad);

		Login_PO.enterLoginMobileNumber(exceldata.getStringData("Login Page", 1, 1));

		otp_PO = new Login_Page_Object(ad).clickOnContinuebutton();

		otp_PO.TypeInField();

		sv_PO = otp_PO.clickOnVerifyButton();

		dashboard_PO = sv_PO.vinSelection();

		dashboard_PO.DashboardAllPopUp();

		bookServiceMainScreen_PO = dashboard_PO.clickOnServicesTab();

		bookServiceDetails_PO = bookServiceMainScreen_PO.clickOnBookServiceButton();

		SoftAssertion(bookServiceDetails_PO.getSelectaTimeText(), bookServiceDetails_PO.getSelectaTimeText().getText(),
				"Select a Time");

		bookServiceDetails_PO.SliderMoving();

		SoftAssertion(bookServiceDetails_PO.getServiceCenterText(),
				bookServiceDetails_PO.getServiceCenterText().getText(), "Service Centre");

		bookServiceDetails_PO.SelectingSeviceCenter();

		sa.assertTrue(bookServiceDetails_PO.getDealerNameAfterSelected().getText().contains("AUTO RIDERS"));

		generic.Scrolling("Additional Instructions");

		SoftAssertion(bookServiceDetails_PO.getCustomerRequestText(),
				bookServiceDetails_PO.getCustomerRequestText().getText(), "Customer Requests");

		bookServiceDetails_PO.clickOncustomerRequestCheckbox();

		SoftAssertion(bookServiceDetails_PO.getAdditionalInstructionsText(),
				bookServiceDetails_PO.getAdditionalInstructionsText().getText(), "Additional Instructions");

		bookServiceDetails_PO.enterAdditionalInstructions("123912731!@#!@#ADASDASD");

		bookServiceDetails_PO.clickOnReviewServiceDetailsButton();

		SoftAssertion(bookServiceDetails_PO.getServiceScheduledText(),
				bookServiceDetails_PO.getServiceScheduledText().getText(), "Service Scheduled");

		ServiceBookedScreen_PO = bookServiceDetails_PO.clickOnBookServiceButton();

		SoftAssertion(ServiceBookedScreen_PO.getServiceBookedTitle(),
				ServiceBookedScreen_PO.getServiceBookedTitle().getText(), "Service booked");

		SoftAssertion(ServiceBookedScreen_PO.getServiceBookedText(),
				ServiceBookedScreen_PO.getServiceBookedText().getText(), "Service booked!");

		sa.assertTrue(ServiceBookedScreen_PO.getSerialNumberText().getText().contains("Serial Number"));

		SoftAssertion(ServiceBookedScreen_PO.getKindlyRateYourExperienceText(),
				ServiceBookedScreen_PO.getKindlyRateYourExperienceText().getText(), "Kindly rate your experience.");

		SoftAssertion(ServiceBookedScreen_PO.getSubmitButton(), ServiceBookedScreen_PO.getSubmitButton().getText(),
				"Submit");

		ServiceBookedScreen_PO.clickOnSubmitButton();

		Thread.sleep(2000);
		ad.terminateApp("com.android.vending");
		Thread.sleep(4000);
		ad.activateApp("com.customerapp.hero");

		dashboard_PO.clickOnServicesTab();

		Assert.assertTrue(bookServiceDetails_PO.getServiceScheduledText().getText().equals("Service Scheduled"));

		sa.assertAll();
	}

	@Test(priority = 602, groups = { "Smoke", "Regression" }, dependsOnMethods = "TC601_ValidateBookServiceTestcase")
	public void ValidateServiceRescheduled() throws InterruptedException {

		Assert.assertTrue(bookServiceMainScreen_PO.getRescheduledButton().getText().equals("Reschedule"));

		ServiceRescheduling_PO = bookServiceMainScreen_PO.clickOnRescheduledButton();

		SoftAssertion(ServiceRescheduling_PO.getReschedulingTitle_Text(),
				ServiceRescheduling_PO.getReschedulingTitle_Text().getText(), "Service Rescheduling");

		ServiceRescheduled_PO = ServiceRescheduling_PO.clickOnConfirmButton();

		SoftAssertion(ServiceRescheduled_PO.getServiceRescheduled_Text(),
				ServiceRescheduled_PO.getServiceRescheduled_Text().getText(), "Service rescheduled!");

		sa.assertTrue(ServiceRescheduled_PO.getSerialNumberText().getText().contains("Serial Number"));

		SoftAssertion(ServiceRescheduled_PO.getKindlyRateYourExperienceText(),
				ServiceRescheduled_PO.getKindlyRateYourExperienceText().getText(), "Kindly rate your experience.");

		SoftAssertion(ServiceRescheduled_PO.getSubmitButton(), ServiceRescheduled_PO.getSubmitButton().getText(),
				"Submit");

		ServiceRescheduled_PO.clickOnSubmitButton();

		Thread.sleep(2000);
		ad.terminateApp("com.android.vending");
		Thread.sleep(4000);
		ad.activateApp("com.customerapp.hero");

		dashboard_PO.clickOnServicesTab();

		sa.assertAll();
	}

	@Test(priority = 603, groups = { "Smoke", "Regression" }, dependsOnMethods = "ValidateServiceRescheduled")
	public void ValidateServiceCancelled() throws InterruptedException {

		CancelServiceWindow_PO = bookServiceMainScreen_PO.clickOnCancelButton();

		SoftAssertion(CancelServiceWindow_PO.getCancelService_Text(),
				CancelServiceWindow_PO.getCancelService_Text().getText(), "Cancel Service?");

		SoftAssertion(CancelServiceWindow_PO.getAreYouSureYouWantToCancelThisService_Text(),
				CancelServiceWindow_PO.getAreYouSureYouWantToCancelThisService_Text().getText(),
				"Are you sure you want to cancel this service?");

		SoftAssertion(CancelServiceWindow_PO.getNoButton(), CancelServiceWindow_PO.getNoButton().getText(), "No");

		SoftAssertion(CancelServiceWindow_PO.getYesButton(), CancelServiceWindow_PO.getYesButton().getText(), "Yes");

		CancelServiceWindow_PO.clickOnNoButton();

		SoftAssertion(bookServiceMainScreen_PO.getCancelButton(), bookServiceMainScreen_PO.getCancelButton().getText(),
				"Cancel Service");

		bookServiceMainScreen_PO.clickOnCancelButton();

		CancelServiceWindow_PO.clickOnYesButton();

		SoftAssertion(CancelServiceWindow_PO.getServiceCancelled_Text(),
				CancelServiceWindow_PO.getServiceCancelled_Text().getText(), "Service Cancelled");

		SoftAssertion(CancelServiceWindow_PO.getYourServiceHasBeenCancelled_Text(),
				CancelServiceWindow_PO.getYourServiceHasBeenCancelled_Text().getText(),
				"Your service has been cancelled");

		CancelServiceWindow_PO.clickOnCloseIcon();

		dashboard_PO.clickOnServicesTab();

		HardAssertion(bookServiceMainScreen_PO.getBookServiceButton(),
				bookServiceMainScreen_PO.getBookServiceButton().getText(), "Book Service");

		dashboard_PO.clickOnHomeTab();

		LoggingOut();

	}

	public void LoggingOut() throws InterruptedException {

		menuBar_PO = dashboard_PO.clickOnMenuBarIcon();

		generic.Scrolling("Logout");

		logout_PO = menuBar_PO.clickOnLogoutOut_Text();

		cepo_PO = logout_PO.clickOnYes();

		generic.waitForVisibility(cepo_PO.getHerologo());

		HardAssertion(cepo_PO.getHerologo(), cepo_PO.getHerologo().getText(), configData.getCommonLoginPageExpected());
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