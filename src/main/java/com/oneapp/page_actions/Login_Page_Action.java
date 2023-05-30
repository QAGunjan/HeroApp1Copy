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
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Privacy_Policy_Page_Object;
import com.oneapp.pageobjects.Terms_and_condition_Page_Object;
import com.oneapp.utils.ConfigData;
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

public class Login_Page_Action{

	public AppiumDriver ad;
	public ExcelData exceldata;
	public Login_Page_Object lpo;
	public TouchAction ta;
	public Privacy_Policy_Page_Object pppo;
	public Terms_and_condition_Page_Object tcpo;
	public Contact_Us_page_object cupo;
	public CommonElements_Page_object cepo;
	public OTP_Page_Object opo;
	public ConfigData configdata;
	public Generic generic;

	public Login_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		lpo = new Login_Page_Object(ad2);
		pppo = new Privacy_Policy_Page_Object(ad2);
		tcpo = new Terms_and_condition_Page_Object(ad2);
		cupo = new Contact_Us_page_object(ad2);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad2);
		opo = new OTP_Page_Object(ad2);
		configdata	= new ConfigData();
		generic = new Generic();
		

	}

	public void validLoginAction() {
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
				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
			}
		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.clickOnWebElement(cepo.getbutton());
	}
	
//	public void validLoginAction(String SheetName)
//	{
//		try {
//			if (cepo.getNotification_pop_up_samsung().isDisplayed() == true) {
//				Generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//			}
//		} catch (Exception e) {
////			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}
//
//		Generic.clearOnWebElement(lpo.getMobile_num_field());
//		Generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData(SheetName, 1, 1));
//		Generic.clickOnWebElement(cepo.getbutton());
//		
//	}

	public void validLoginAssertionAction() throws InterruptedException {
		generic.hardAssertion(opo.getVerify_with_OTP(), configdata.getValidLoginExpected());
	}

	public void invalidLoginAction() throws InterruptedException {

		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 2, 1));
		generic.clickOnWebElement(cepo.getbutton());
	}

	public void invalidLoginAssertionAction() {
		generic.hardAssertion(cepo.getHerologo(), configdata.getCommonLoginPageExpected());
	}

	public void commonAssertionLoginPageAction() {
		generic.hardAssertion(cepo.getHerologo(), configdata.getCommonLoginPageExpected());
	}

	public void minimumLengthFieldAction() throws InterruptedException {
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 3, 1));
		generic.isClickable(cepo.getbutton());
	}

	public void continueWithNoInternetAction() throws InterruptedException {
		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.WifiOff();
		generic.clickOnWebElement(cepo.getbutton());
		commonAssertionLoginPageAction();
		generic.WifiOn();
	}

	public void PrivacypageAction() throws InterruptedException {
		generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
		WebElement get_privacy_text = pppo.getPrivacytext_val().get(21);
		boolean Privacy_displaying = get_privacy_text.isDisplayed();
		System.out.println(Privacy_displaying);
	}

	public void privacyPageWithNoInternetAction() throws InterruptedException {
		generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
	}

	public void termsAndConditionsPageAction() throws InterruptedException {
		generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getTerm_and_condition_link().get(5))))
				.perform();
		WebElement get_T_and_C_text = tcpo.getTerms_and_conditions_text_val().get(21);
		boolean T_and_C_displaying = get_T_and_C_text.isDisplayed();
		System.out.println(T_and_C_displaying);
	}

	public void contactUsAction() throws InterruptedException {
		generic.swiping(573, 1618, 569, 1126, 4000);
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getContact_us_link().get(9)))).perform();
		Thread.sleep(12000);
		WebElement get_contact_us_text = cupo.getContact_us_text_val().get(1);
		boolean Contact_us_displaying = get_contact_us_text.isDisplayed();
		System.out.println(Contact_us_displaying);
	}

	public void applicationMinimizingAfterLogInAction() throws InterruptedException {
		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.runningApplicationBackground();
		generic.clickOnWebElement(cepo.getbutton());

	}

}
