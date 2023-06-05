package com.oneapp.page_actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Personal_Details_Page_Actions extends Myprofile_Page_Actions{

	public AppiumDriver ad;
	public ExcelData exceldata;
	public Personal_Details_Page_Object pdpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;
	public JavascriptExecutor js;
	Entry<String, String> map;
	public String  value="Personal Details";

	public Personal_Details_Page_Actions(AppiumDriver ad2) {
		super(ad2);
		this.ad = ad2;
		pdpo = new Personal_Details_Page_Object(ad2);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad2);
		configdata = new ConfigData();
		generic = new Generic();

	}

	
	
	public void fullNameFieldAction() throws InterruptedException {
		generic.clearOnTexBox(pdpo.getFullname_textfield());
		
		
//		List<String> al= new ArrayList<String>(testD.keySet());
//		
//		for(String t:al)
//		{
//			System.out.println(t);
//			Thread.sleep(5000);
//			generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), t);
//			Thread.sleep(5000);
//		}
		
	}

	public void enterfullNameAction() {
		HashMap<String, String> testD = exceldata.hashmapping("My Profile");
		for (Entry<String, String> map:testD.entrySet())
		{
			generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), map.getValue()); //"My Profile"
			generic.clickOnWebElement(cepo.getbutton());
			
		if(!value.equalsIgnoreCase(pdpo.getPersonalDetails().getText()))
		{
			super.clickMoreDetailsLink();
			generic.clickOnWebElement(cepo.getbutton());
		}
		
		}
//		generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 1, 1));
	}

	public void blankFullNameFieldAssertionAction() {
		generic.assertion_notEquals_validation(pdpo.getFullname_textfield(),
				configdata.getblankFullNameFieldExpected());
	}

	public void enterInvalidEmailFieldAssertionAction() {
		generic.assertion_notEquals_validation(pdpo.getEmailfield(), configdata.getinvalidEmailFieldExpected());
	}

	public void savingWithNoInternetAssertionAction() {
		generic.softAssertion(cepo.getbutton(), configdata.getsavingWithoutInternetExpected());
	}

	public void genderRadioButtonAction() throws InterruptedException {
		WebElement gender_selection = pdpo.getGender_checkbox();

		if (generic.elementSelecting(gender_selection)) {
			TestUtils.log().debug("Female is already selected");
		}

		else {
			gender_selection.click();
			TestUtils.log().debug("Female was not selected earlier but now it has been selected");
		}
	}

	public void emailFieldAction() throws InterruptedException {
//		generic.clickOnWebElement(pdpo.getEmailfield());
		generic.clearOnTexBox(pdpo.getEmailfield());
	}

	public void enterValidEmailAction() throws InterruptedException {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100000);
		String email = exceldata.getStringData("My Profile", 2, 1);
		String front_email = email.substring(0, 6);
		String end_email = email.substring(9, 19);
		pdpo.getEmailfield().sendKeys(front_email + randomInt + end_email);
//		Generic.swiping(534, 1349, 538, 792, 4000);    - for emulator
//		generic.swiping(513, 1794, 517, 1147, 4000); // for real device Samsung
		generic.scrollingToWebElement("Address");
		
	}

	public void enterInvalidEmailAction() {
		generic.sendKeysOnTextfields(pdpo.getEmailfield(), exceldata.getStringData("My Profile", 14, 1));
	}

	public void dateFieldAction() throws InterruptedException {

		WebElement date = pdpo.getDatefield();
		generic.clickOnWebElement(date);
//		generic.tappingOnWebelement(955, 1287);
		generic.clickOnWebElement(pdpo.getEdit_under_date_field());
		generic.sendKeysOnTextfields(pdpo.getEditing_date(), exceldata.getStringData("My Profile", 3, 1));
		generic.clickOnWebElement(pdpo.getOk_text());
//		Generic.swiping(530, 1413, 519, 608, 3000);     - for emulator
//		Generic.swiping(513,1698,508,1256, 3000);   //   for real device
	}

	public void invalidDateAction() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		generic.tappingOnWebelement(955, 1287);
		generic.clickOnWebElement(pdpo.getEdit_under_date_field());
		generic.sendKeysOnTextfields(pdpo.getEditing_date(), exceldata.getStringData("My Profile", 15, 1));
		generic.clickOnWebElement(pdpo.getOk_text());
	}

	public void invalidDateAssertionAction() {
		generic.softAssertion(pdpo.getAge_error_message(), configdata.getinvalidDateExpected());
	}

	public void addressFieldAction() throws InterruptedException {
		generic.clearOnTexBox(pdpo.getAddress_field());
	}

	public void enterAddressAction() {
		generic.sendKeysOnTextfields(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 4, 1));
//		generic.swiping(572, 1657, 559, 1218, 4000);
	}

	public void addressAssertionAction() {
		generic.softAssertion(pdpo.getAddress_field(), configdata.getaddressExpected());
	}

	public void enterInvalidAddressAssertionAction() {
		generic.sendKeysOnTextfields(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 16, 1));
	}

	public void invalidPincodeAssertionAction() {
		generic.softAssertion(pdpo.getBlank_pincode_field(), configdata.getinvalidPincodeExpected());

	}

	public void pincodeFieldAction() throws InterruptedException {
		if (pdpo.getPincode_field().getText().contains("11")) {
			generic.clearOnTexBox(pdpo.getPincode_field());
		}

	}

	public void savingWithNoInternetAction1() {
		generic.WifiOff();
		generic.clickOnWebElement(cepo.getbutton());
		savingWithNoInternetAssertionAction();
		generic.WifiOn();
		generic.clickOnWebElement(cepo.getbutton());
	}

	public void enterPincodeAction() throws InterruptedException {
		generic.sendKeysOnTextfields(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 5, 1));
	}

	public void enterInvalidPincodeAction() throws InterruptedException {

		generic.sendKeysOnTextfields(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 17, 1));
	}

	public void clickSaveButton() throws InterruptedException {
		generic.clickOnWebElement(cepo.getbutton());
	}

}
