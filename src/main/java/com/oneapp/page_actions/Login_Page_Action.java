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

	public void valid_login() throws InterruptedException {
		try {
		cepo.getNonOfTheAbove().click();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled" + e);
		}
		Generic.clear_on_WebElement(lpo.getMobile_num_field());
		Generic.sendKeys(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.click_on_WebElement(lpo.getlogin_btn());
	}

	public void assertion_of_valid_login() throws InterruptedException {
		Generic.Hard_assertion_validation(opo.getVerify_with_OTP(), exceldata.getStringData("Login Page", 11, 1));
}

	public void invalid_login() throws InterruptedException {

		Generic.sendKeys(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 2, 1));
		Generic.click_on_WebElement(lpo.getlogin_btn());
	}

	public void assertion_of_invalid_login() {
		Generic.Hard_assertion_validation(cepo.getToast_message(), exceldata.getStringData("Login Page", 12, 1));
	}

	public void assertion_of_commom_login_page()
	{
		Generic.Hard_assertion_validation(cepo.getHerologo(), "Login");
	}
	public void Mininum_length_field() throws InterruptedException {
		Generic.sendKeys(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 3, 1));
		Generic.isClickable(lpo.getlogin_btn());
	}

	public void continue_with_no_internet() throws InterruptedException {
		Generic.clear_on_WebElement(lpo.getMobile_num_field());
		Generic.sendKeys(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.WifiOff();
		Generic.click_on_WebElement(lpo.getlogin_btn());
		Generic.WifiOn();
	}

	public void Privacypage() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
		Thread.sleep(10000);
		WebElement get_privacy_text = pppo.getPrivacytext_val().get(21);
		boolean Privacy_displaying = get_privacy_text.isDisplayed();
		System.out.println(Privacy_displaying);
	}

	public void Privacypage_with_no_internet() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
	}

	public void Terms_and_Conditionspage() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getTerm_and_condition_link().get(5))))
				.perform();
		Thread.sleep(15000);
		WebElement get_T_and_C_text = tcpo.getTerms_and_conditions_text_val().get(21);
		System.out.println("FIRSE_HOGYA");
		boolean T_and_C_displaying = get_T_and_C_text.isDisplayed();
		System.out.println(T_and_C_displaying);
	}

	public void Contact_Us() throws InterruptedException {
		Generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getContact_us_link().get(9)))).perform();
		Thread.sleep(12000);
		WebElement get_contact_us_text = cupo.getContact_us_text_val().get(1);
		boolean Contact_us_displaying = get_contact_us_text.isDisplayed();
		System.out.println(Contact_us_displaying);
	}

	public void App_minimizing_after_loggedin() throws InterruptedException {
		Generic.clear_on_WebElement(lpo.getMobile_num_field());
		Generic.sendKeys(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		Generic.Run_app_in_background();
		Generic.click_on_WebElement(lpo.getlogin_btn());

	}

}
