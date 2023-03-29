package com.oneapp.page_actions;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
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


	public Book_service_selfJobCard_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bssjcpo = new Book_service_selfJobCard_page_object(ad);
		exceldata = new ExcelData();
		cepo= new CommonElements_Page_object(ad);

	}
	
	
	public void turnOFFInternetAction()
	{
		Generic.WifiOff();
	}
	
	public void turnONInternetAction()
	{
		Generic.WifiOn();
	}
	
	
	public void selfJobCardAction() throws InterruptedException {
		Generic.softAssertion(bssjcpo.getSelf_job_card_text(), "Self Job Card");
		Generic.softAssertion(bssjcpo.getKey_issues_text(), "Key Issues");
		
		String str3 = "Service";
		if (bssjcpo.getService_text().getText().equals(str3)) {
			Generic.clickOnWebElement(bssjcpo.getService_radio_button());
		}

		else {
			System.out.println("Service text is not avaiable on the page");
		}
		
		Generic.clickOnWebElement(bssjcpo.getKey_issues_text());
		Generic.sendKeysOnTextfields(bssjcpo.getOther_issues_textbox(), exceldata.getStringData("Book Service", 1, 1));
		Generic.softAssertion(cepo.getbutton(), "Book Service");
	}
	
	public void tappingBookServiceButtonAction()
	{
		Generic.clickOnWebElement(cepo.getbutton());
	}
	
	public void turningOFFInternetAction()
	{
		Generic.WifiOff();
	}
	
	public void turningONInternetAction()
	{
		Generic.WifiOn();
	}
	
	public void continueBookServiceWithNoInternetAction()
	{
		Generic.hardAssertion(cepo.getToast_message(), "Please check your network connection.");
	}
	
	public void clickBackIconAction()
	{
		Generic.clickOnWebElement(cepo.getBack_icon());
	}

}
