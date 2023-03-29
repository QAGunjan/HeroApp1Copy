package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Privacy_Policy_Page_Object;
import com.oneapp.pageobjects.Terms_and_condition_Page_Object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Login_Page_Action {

	public AndroidDriver ad;
	public ExcelData exceldata;
	public Login_Page_Object lpo;
	public TouchAction ta;
	public Privacy_Policy_Page_Object pppo;
	public Terms_and_condition_Page_Object tcpo;
	public Contact_Us_page_object cupo;
	public CommonElements_Page_object cepo;
	public OTP_Page_Object opo;

	public Login_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		lpo = new Login_Page_Object(ad);
		pppo = new Privacy_Policy_Page_Object(ad);
		tcpo = new Terms_and_condition_Page_Object(ad);
		cupo = new Contact_Us_page_object(ad);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);
		opo = new OTP_Page_Object(ad);

	}

	public void validLoginAction() throws InterruptedException {
//		try {
//		Generic.click_on_WebElement(cepo.getNonOfTheAbove());
//		Generic.click_on_WebElement(cepo.getallowing_commom_popup_honor());
//		Generic.click_on_WebElement(cepo.getAllowing_commom_popup_samsung());
//		}
//		catch(Exception e)
//		{
//		}
		try {
			if (cepo.getNotification_pop_up_samsung().isDisplayed() == true) {
				Generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
			}
		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		Generic.clearOnWebElement(lpo.getMobile_num_field());
		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void validLoginAssertionAction() throws InterruptedException {
		Generic.hardAssertion(opo.getVerify_with_OTP(), exceldata.getStringData("Login Page", 11, 1));
	}

	public void invalidLoginAction() throws InterruptedException {

		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 2, 1));
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void invalidLoginAssertionAction() {
		Generic.hardAssertion(cepo.getHerologo(), exceldata.getStringData("Login Page", 13, 1));
	}

	public void commonAssertionLoginPageAction() {
		Generic.hardAssertion(cepo.getHerologo(), "Login");
	}

	public void minimumLengthFieldAction() throws InterruptedException {
		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 3, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void continueWithNoInternetAction() throws InterruptedException {
		Generic.clearOnWebElement(lpo.getMobile_num_field());
		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.WifiOff();
		Generic.clickOnWebElement(cepo.getbutton());
		commonAssertionLoginPageAction();
		Generic.WifiOn();
	}

	public void PrivacypageAction() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
		WebElement get_privacy_text = pppo.getPrivacytext_val().get(21);
		boolean Privacy_displaying = get_privacy_text.isDisplayed();
		System.out.println(Privacy_displaying);
	}

	public void privacyPageWithNoInternetAction() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
	}

	public void termsAndConditionsPageAction() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getTerm_and_condition_link().get(5))))
				.perform();
		WebElement get_T_and_C_text = tcpo.getTerms_and_conditions_text_val().get(21);
		boolean T_and_C_displaying = get_T_and_C_text.isDisplayed();
		System.out.println(T_and_C_displaying);
	}

	public void contactUsAction() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getContact_us_link().get(9)))).perform();
		Thread.sleep(12000);
		WebElement get_contact_us_text = cupo.getContact_us_text_val().get(1);
		boolean Contact_us_displaying = get_contact_us_text.isDisplayed();
		System.out.println(Contact_us_displaying);
	}

	public void applicationMinimizingAfterLogInAction() throws InterruptedException {
		Generic.clearOnWebElement(lpo.getMobile_num_field());
		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.runningApplicationBackground();
		Generic.clickOnWebElement(cepo.getbutton());

	}

}
