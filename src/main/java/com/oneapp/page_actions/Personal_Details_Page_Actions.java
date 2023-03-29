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
import com.oneapp.utils.TestUtils;

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

	public void fullNameFieldAction() throws InterruptedException {
		Generic.clearOnWebElement(pdpo.getFullname_textfield());
	}

	public void enterfullNameAction() {
		
		Generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 1, 1));
	}

	public void blankFullNameFieldAction() {
		Generic.assertion_notEquals_validation(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 24, 1));
	}

	public void enterInvalidEmailFieldAction() {
		Generic.assertion_notEquals_validation(pdpo.getEmailfield(), exceldata.getStringData("My Profile", 25, 1));
	}

	public void savingWithNoInternetAction() {
		Generic.softAssertion(cepo.getbutton(), exceldata.getStringData("My Profile", 26, 1));
	}

	public void genderRadioButtonAction() throws InterruptedException {
		WebElement gender_selection = pdpo.getGender_checkbox();

		if (gender_selection.isSelected()) {
			TestUtils.log().debug("Female is already selected");
		}

		else {
			gender_selection.click();
			TestUtils.log().debug("Female was not selected earlier but now it has been selected");
		}
	}

	public void emailFieldAction() throws InterruptedException {
		Generic.clearOnWebElement(pdpo.getEmailfield());
	}

	public void enterValidEmailAction() throws InterruptedException {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100000);
		String email = exceldata.getStringData("My Profile", 2, 1);
		String front_email = email.substring(0, 6);
		String end_email = email.substring(9, 19);
		pdpo.getEmailfield().sendKeys(front_email + randomInt + end_email);
//		Generic.swiping(534, 1349, 538, 792, 4000);    - for emulator
		Generic.swiping(513, 1794, 517, 1147, 4000);   // for real device Samsung
	}

	public void enterInvalidEmailAction() {
		Generic.sendKeysOnTextfields(pdpo.getEmailfield(), exceldata.getStringData("My Profile", 14, 1));
	}

	public void dateFieldAction() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		Generic.tappingOnWebelement(955, 1287);
		Generic.clickOnWebElement(pdpo.getEdit_under_date_field());
		Generic.sendKeysOnTextfields(pdpo.getEditing_date(),exceldata.getStringData("My Profile", 3, 1) );
		Generic.clickOnWebElement(pdpo.getOk_text());
//		Generic.swiping(530, 1413, 519, 608, 3000);     - for emulator
//		Generic.swiping(513,1698,508,1256, 3000);   //   for real device
	}

	public void invalidDateAction() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		Generic.tappingOnWebelement(955, 1287);
		Generic.clickOnWebElement(pdpo.getEdit_under_date_field());
		Generic.sendKeysOnTextfields(pdpo.getEditing_date(), exceldata.getStringData("My Profile", 15, 1));
		Generic.clickOnWebElement(pdpo.getOk_text());
	}

	public void invalidDateAssertionAction() {
		Generic.softAssertion(pdpo.getAge_error_message(), exceldata.getStringData("My Profile", 27, 1));
	}  

	public void addressFieldAction() throws InterruptedException {
		Generic.clearOnWebElement(pdpo.getAddress_field());
	}

	public void enterAddressAction() {
		Generic.sendKeysOnTextfields(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 4, 1));
		Generic.swiping(572, 1657, 559, 1218, 4000); 
	}

	public void addressAssertionAction() {
		Generic.softAssertion(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 28, 1));
	}

	public void enterInvalidAddressAssertionAction() {
		Generic.sendKeysOnTextfields(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 16, 1));
	}

	public void invalidPincodeAssertionAction() {
		Generic.softAssertion(cepo.getToast_message(), exceldata.getStringData("My Profile", 29, 1));
	}

	public void pincodeFieldAction() throws InterruptedException {
		if (pdpo.getPincode_field().getText().contains("11"))
		{
			Generic.clearOnWebElement(pdpo.getPincode_field());
		}
		
	}
	
	public void savingWithNoInternetAction1()
	{
		Generic.WifiOff();
		Generic.clickOnWebElement(cepo.getbutton());
		savingWithNoInternetAction();
		Generic.WifiOn();
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void enterPincodeAction() throws InterruptedException {
		Generic.sendKeysOnTextfields(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 5, 1));
	}

	public void enterInvalidPincodeAssertionAction() throws InterruptedException {
		
		Generic.sendKeysOnTextfields(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 17, 1));
	}

	public void clickSaveButton() throws InterruptedException {
		Generic.clickOnWebElement(cepo.getbutton());
	}
	
	
}
