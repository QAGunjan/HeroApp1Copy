package com.oneapp.page_actions;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;

import io.appium.java_client.android.AndroidDriver;

public class Emergency_contact_details_page_actions {

	public ExcelData exceldata;
	public AndroidDriver ad;
	public Emergency_contact_details_page_object ecdpo;
	public CommonElements_Page_object cepo;


	public Emergency_contact_details_page_actions(AndroidDriver ad) {
		this.ad = ad;
		ecdpo = new Emergency_contact_details_page_object(ad);
		exceldata = new ExcelData();
		cepo= new CommonElements_Page_object(ad);

	}

	public void click_on_back_icon() {
		Generic.click_on_WebElement(cepo.getBack_icon());
	}

	public void assertion_of_already_exist_contact() {
		Generic.Hard_assertion_validation(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 20, 1));
	}

	public void Saving_with_invalid_fullName() {
		Generic.clear_on_WebElement(ecdpo.getFullname_textbox());
		Generic.sendKeys(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 9, 1));
		Generic.isClickable(ecdpo.getContinue_btn());
	}
	
	public void validation_of_invalid_fullName()
	{
		Generic.Soft_assertion_validation(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 21, 1) );
	}

	public void Saving_with_invalid_mobNumber() {
		Generic.clear_on_WebElement(ecdpo.getMob_number_txtbox());
		Generic.sendKeys(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 10, 1));
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 11, 1));
		Generic.isClickable(ecdpo.getContinue_btn());
	}

	public void Saving_contact_with_blank_fullName() {
		Generic.clear_on_WebElement(ecdpo.getFullname_textbox());
		Generic.sendKeys(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.isClickable(ecdpo.getContinue_btn());
	}
	
	public void Validation_of_saving_blank_and_invalid_field()
	{
		Generic.Soft_assertion_validation(ecdpo.getFullName_text(), exceldata.getStringData("Emergency_contact", 22, 1));
	}

	public void Saving_contact_with_blank_MobileNumber() {

		Generic.sendKeys(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.clear_on_WebElement(ecdpo.getMob_number_txtbox());
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.isClickable(ecdpo.getContinue_btn());
	}

	public void Saving_contact_with_blank_relationType() {

		Generic.sendKeys(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeys(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 11, 1));
		Generic.isClickable(ecdpo.getContinue_btn());
	}

	public void saving_contact_with_noInternet() {
		Generic.sendKeys(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeys(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.WifiOff();
		Generic.click_on_WebElement(ecdpo.getContinue_btn());
		Generic.WifiOn();
	}
	
	public void validation_saving_with_no_internet()
	{
		Generic.Soft_assertion_validation(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 23, 1));
	}
	
	public void filling_emergency_contact_details() {
		Generic.sendKeys(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeys(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.click_on_WebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.looping_on_webelement(options, exceldata.getStringData("Emergency_contact", 3, 1));

//		for loop
//		
//		 int options = ecdpo.getRelation_typedropdown().size();
//		 for (int i=0;i<options;i++)
//		 {
//			 String text = ecdpo.getRelation_typedropdown().get(i).getText();
//			 if (text.equalsIgnoreCase("friend"))
//			 {
//				 ecdpo.getRelation_typedropdown().get(i).click();
//				 break;
//			 }
//			 
//		 }

		Generic.click_on_WebElement(ecdpo.getContinue_btn());
	}

}
