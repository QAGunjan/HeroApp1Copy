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
		cepo = new CommonElements_Page_object(ad);

	}

	public void clickBackIconAction() {
		Generic.clickOnWebElement(cepo.getBack_icon());
	}

	public void alreadyExistContactAssertionAction() {
		Generic.hardAssertion(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 20, 1));
	}

	public void savingWithInvalidFullNameAction() {
		Generic.clearOnWebElement(ecdpo.getFullname_textbox());
		Generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 9, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void invalidFullNameAssertionAction() {
		Generic.softAssertion(ecdpo.getFullname_textbox(),
				exceldata.getStringData("Emergency_contact", 21, 1));
	}

	public void savingWithInvalidMobNumberAction() {
		Generic.clearOnWebElement(ecdpo.getMob_number_txtbox());
		Generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 10, 1));
		Generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 11, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithBlankFullNameAction() {
		Generic.clearOnWebElement(ecdpo.getFullname_textbox());
		Generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void commonAssertionWithBlankAndInvalidFieldAction() {
		Generic.softAssertion(ecdpo.getFullName_text(),
				exceldata.getStringData("Emergency_contact", 22, 1));
	}

	public void savingContactWithBlankMobileNumberAction() {

		Generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.clearOnWebElement(ecdpo.getMob_number_txtbox());
		Generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithBlankRelationTypeAction() {

		Generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 11, 1));
		Generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithNoInternetAction() {
		Generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		Generic.WifiOff();
		Generic.clickOnWebElement(cepo.getbutton());
		Generic.WifiOn();
	}

	public void savingWithNoInternetAssertionAction() {
		Generic.softAssertion(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 23, 1));
	}

	public void enterValidEmergencyContactDetailsAction() {
		Generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		Generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		Generic.clickOnWebElement(ecdpo.getRelation_type());

		List<WebElement> options = ecdpo.getRelation_typedropdown();
		Generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));

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

		Generic.clickOnWebElement(cepo.getbutton());
	}

}
