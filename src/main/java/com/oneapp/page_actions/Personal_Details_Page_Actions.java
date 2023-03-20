package com.oneapp.page_actions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Personal_Details_Page_Actions {

	public AndroidDriver ad;
	public ExcelData exceldata;
	public Personal_Details_Page_Object pdpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;


	public Personal_Details_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		pdpo = new Personal_Details_Page_Object(ad);
		exceldata = new ExcelData();
		cepo= new CommonElements_Page_object(ad);

	}

	public void fullName_field() throws InterruptedException {
		Generic.clear_on_WebElement(pdpo.getFullname_textfield());
	}

	public void EnterfullName() {
		
		Generic.sendKeys(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 1, 1));
	}

	public void validation_of_blank_fullName_field() {
		Generic.assertion_notEquals_validation(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 24, 1));
	}

	public void validation_of_enter_invalid_email_field() {
		Generic.assertion_notEquals_validation(pdpo.getEmailfield(), exceldata.getStringData("My Profile", 25, 1));
	}

	public void validation_of_saving_without_internet() {
		Generic.Soft_assertion_validation(cepo.getToast_message(), exceldata.getStringData("My Profile", 26, 1));
	}

	public void Gender_radio_button() throws InterruptedException {
		WebElement gender_selection = pdpo.getGender_checkbox();

		if (gender_selection.isSelected()) {
			System.out.println("Female is already selected");
		}

		else {
			gender_selection.click();
			System.out.println("Female was not selected earlier but now it has been selected");
		}
	}

	public void Email_field() throws InterruptedException {
		Generic.clear_on_WebElement(pdpo.getEmailfield());
	}

	public void enter_valid_email() throws InterruptedException {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100000);
		String email = exceldata.getStringData("My Profile", 2, 1);
		String front_email = email.substring(0, 6);
		String end_email = email.substring(9, 19);
		pdpo.getEmailfield().sendKeys(front_email + randomInt + end_email);
//		Generic.swiping(534, 1349, 538, 792, 4000);    - for emulator
		Generic.swiping(513, 1794, 517, 1147, 4000);   // for real device Samsung
	}

	public void enter_invalid_email() {
		Generic.sendKeys(pdpo.getEmailfield(), exceldata.getStringData("My Profile", 14, 1));
	}

	public void Date_field() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		Generic.Tap_on_WebElement(955, 1287);
		Generic.click_on_WebElement(pdpo.getEdit_under_date_field());
		Generic.sendKeys(pdpo.getEditing_date(),exceldata.getStringData("My Profile", 3, 1) );
		Generic.click_on_WebElement(pdpo.getOk_text());
//		Generic.swiping(530, 1413, 519, 608, 3000);     - for emulator
//		Generic.swiping(513,1698,508,1256, 3000);   //   for real device
	}

	public void invalid_date() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		Generic.Tap_on_WebElement(955, 1287);
		Generic.click_on_WebElement(pdpo.getEdit_under_date_field());
		Generic.sendKeys(pdpo.getEditing_date(), exceldata.getStringData("My Profile", 15, 1));
		Generic.click_on_WebElement(pdpo.getOk_text());
	}

	public void validation_of_invalid_date() {
		Generic.Soft_assertion_validation(pdpo.getAge_error_message(), exceldata.getStringData("My Profile", 27, 1));
	}  

	public void Address_field() throws InterruptedException {
		Generic.clear_on_WebElement(pdpo.getAddress_field());
	}

	public void enter_address() {
		Generic.sendKeys(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 4, 1));
		Generic.swiping(572, 1657, 559, 1218, 4000); 
	}

	public void validation_of_address() {
		Generic.Soft_assertion_validation(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 28, 1));
	}

	public void enter_invalid_address() {
		Generic.sendKeys(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 16, 1));
	}

	public void validation_of_invalid_pincode() {
		Generic.Soft_assertion_validation(cepo.getToast_message(), exceldata.getStringData("My Profile", 29, 1));
	}

	public void Pincode_field() throws InterruptedException {
		if (pdpo.getPincode_field().getText().contains("11"))
		{
			Generic.clear_on_WebElement(pdpo.getPincode_field());
		}
		
	}
	
	public void turning_OFF_the_internet()
	{
		Generic.WifiOff();
	}

	public void turning_ON_the_internet()
	{
		Generic.WifiOn();
	}

	public void enter_pincode() throws InterruptedException {
		Generic.sendKeys(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 5, 1));
	}

	public void enter_invalid_pincode() throws InterruptedException {
		
		Generic.sendKeys(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 17, 1));
	}

	public void click_Save_button() throws InterruptedException {
		Generic.click_on_WebElement(pdpo.getSave_btn());
	}
}
