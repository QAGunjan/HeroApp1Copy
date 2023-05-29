package com.oneapp.page_actions;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Select_Service_Center_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Book_service_selfJobCard_page_actions {

	public AndroidDriver ad;
	public TouchAction action;
	public ExcelData exceldata;
	public Book_service_selfJobCard_page_object bssjcpo;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;



	public Book_service_selfJobCard_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bssjcpo = new Book_service_selfJobCard_page_object(ad);
		exceldata = new ExcelData();
		cepo= new CommonElements_Page_object(ad);
		configdata = new ConfigData();
		generic = new Generic();

	}
	
	
	public void turnOFFInternetAction()
	{
		generic.WifiOff();
	}
	
	public void turnONInternetAction()
	{
		generic.WifiOn();
	}
	
	
	public void selfJobCardAction() throws InterruptedException {
		generic.softAssertion(bssjcpo.getSelf_job_card_text(), configdata.getselfJobCardPageTextExpected());
		generic.softAssertion(bssjcpo.getKey_issues_text(), configdata.getkeyissuesTextExpected());
		
		String str3 = "Service";
		if (bssjcpo.getService_text().getText().equals(str3)) {
			generic.clickOnWebElement(bssjcpo.getService_radio_button());
		}

		else {
			System.out.println("Service text is not avaiable on the page");
		}
		
		generic.clickOnWebElement(bssjcpo.getKey_issues_text());
		generic.sendKeysOnTextfields(bssjcpo.getOther_issues_textbox(), exceldata.getStringData("Book Service", 1, 1));
		generic.softAssertion(cepo.getbutton(), configdata.getbookServiceButtonExpected());
	}
	
	public void tappingBookServiceButtonAction()
	{
		generic.clickOnWebElement(cepo.getbutton());
	}
	
	public void turningOFFInternetAction()
	{
		generic.WifiOff();
	}
	
	public void turningONInternetAction()
	{
		generic.WifiOn();
	}
	
	public void continueBookServiceWithNoInternetAction()
	{
		generic.hardAssertion(cepo.getToast_message(), configdata.getcontinueWithNoInternetExpected());
	}
	
	public void clickBackIconAction()
	{
		generic.clickOnWebElement(cepo.getBack_icon());
	}

}
