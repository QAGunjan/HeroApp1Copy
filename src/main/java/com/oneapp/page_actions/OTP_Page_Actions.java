package com.oneapp.page_actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OTP_Page_Actions {

	public AppiumDriver ad;

	public OTP_Page_Object opo;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public ConfigData configdata;
	public Generic generic;

	public OTP_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		opo = new OTP_Page_Object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		exceldata = new ExcelData();
		configdata = new ConfigData();
		generic = new Generic();

	}

	public void validOTPAction() {
		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

	}

	public void invalidOTPAction() {
		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("8");
	}

	public void clickVerifyButtonAction() {
		generic.clickOnWebElement(cepo.getbutton());
	}

	public void invalidOTPAssertionAction() {
		generic.hardAssertion(opo.getVerify_with_OTP(), configdata.getInvalidOTPExpected());
	}

	public void validOTPWithNoInternetAction() {

		generic.hardAssertion(opo.getVerify_with_OTP(), configdata.getValidOTPWithNoInternet());
	}

	public void clickEditAction() {
		generic.clickOnWebElement(opo.getEdit_button());
	}

	public void clickResendLinkAction() {
		generic.clickOnWebElement(opo.getResend_link());
	}

	public void continueWithNoInternetAction() throws InterruptedException {
		validOTPAction();
		generic.WifiOff();
		generic.clickOnWebElement(cepo.getbutton());
		validOTPWithNoInternetAction();
		generic.WifiOn();
	}
	
	public void applicationMinimizing() throws InterruptedException {
		generic.runningApplicationBackground();
		generic.clickOnWebElement(cepo.getbutton());

	}

}
