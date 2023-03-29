package com.oneapp.page_actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OTP_Page_Actions {

	public AndroidDriver ad;

	public OTP_Page_Object opo;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;


	public OTP_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		opo = new OTP_Page_Object(ad);
		cepo= new CommonElements_Page_object(ad);
		exceldata = new ExcelData();

	}

	public void validOTPAction()  {		
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
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void invalidOTPAssertionAction() {
		Generic.hardAssertion(opo.getVerify_with_OTP(), exceldata.getStringData("OTP Page", 8, 1));
	}

	public void validOTPWithNoInternetAction() {
		
		Generic.hardAssertion(opo.getVerify_with_OTP(), exceldata.getStringData("OTP Page", 8, 1));
	}

	public void clickEditAction() {
		Generic.clickOnWebElement(opo.getEdit_button());
	}

	public void clickResendLinkAction() {
		Generic.clickOnWebElement(opo.getResend_link());
	}
	
	public void continueWithNoInternetAction() throws InterruptedException {
		validOTPAction();
		Generic.WifiOff();
		Generic.clickOnWebElement(cepo.getbutton());
		validOTPWithNoInternetAction();
		Generic.WifiOn();
	}
	
	
}
