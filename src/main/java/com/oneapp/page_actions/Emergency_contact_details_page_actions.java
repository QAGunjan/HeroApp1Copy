package com.oneapp.page_actions;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;

import io.appium.java_client.android.AndroidDriver;

public class Emergency_contact_details_page_actions {

	public ExcelData exceldata;
	public AndroidDriver ad;
	public Emergency_contact_details_page_object ecdpo;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;

	public Emergency_contact_details_page_actions(AndroidDriver ad) {
		this.ad = ad;
		ecdpo = new Emergency_contact_details_page_object(ad);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);
		configdata	= new ConfigData();
		generic = new Generic();

	}

	public void clickBackIconAction() {
		generic.clickOnWebElement(cepo.getBack_icon());
	}

//	public void alreadyExistContactAssertionAction() {
//		Generic.hardAssertion(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 20, 1));
//	}

	public void savingWithInvalidFullNameAction() {
		generic.clearOnTexBox(ecdpo.getFullname_textbox());
		generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 9, 1));
		generic.clearOnTexBox(ecdpo.getMob_number_txtbox());
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 11, 1));
		generic.isClickable(cepo.getbutton());
	}

//	public void invalidFullNameAssertionAction() {
//		Generic.softAssertion(ecdpo.getFullname_textbox(),
//				exceldata.getStringData("Emergency_contact", 21, 1));
//	}

	public void savingWithInvalidMobNumberAction() {
		generic.clearOnTexBox(ecdpo.getMob_number_txtbox());
		generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 10, 1));
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 11, 1));
		generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithBlankFullNameAction() {
		generic.clearOnTexBox(ecdpo.getFullname_textbox());
		generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		generic.isClickable(cepo.getbutton());
	}

	public void commonAssertionEmergencyContact() {
		generic.softAssertion(ecdpo.getFullName_text(),
				configdata.getcommonAssertionEmergencyContactExpected());
	}

	public void savingContactWithBlankMobileNumberAction() {

		generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		generic.clearOnTexBox(ecdpo.getMob_number_txtbox());
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithBlankRelationTypeAction() {

		generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 11, 1));
		generic.isClickable(cepo.getbutton());
	}

	public void savingContactWithNoInternetAction() throws InterruptedException {
		generic.clickOnWebElement(ecdpo.getRelation_type());
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));
		generic.WifiOff();
		generic.clickOnWebElement(cepo.getbutton());
		generic.WifiOn();
		Thread.sleep(4000);
	}

//	public void savingWithNoInternetAssertionAction() {
//		Generic.softAssertion(cepo.getToast_message(), exceldata.getStringData("Emergency_contact", 23, 1));
//	}

	public void enterValidEmergencyContactDetailsAction() {
		generic.sendKeysOnTextfields(ecdpo.getFullname_textbox(), exceldata.getStringData("Emergency_contact", 1, 1));
		generic.sendKeysOnTextfields(ecdpo.getMob_number_txtbox(), exceldata.getStringData("Emergency_contact", 2, 1));
		generic.clickOnWebElement(ecdpo.getRelation_type());

		List<WebElement> options = ecdpo.getRelation_typedropdown();
		generic.itratingOnWebelements(options, exceldata.getStringData("Emergency_contact", 3, 1));

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

		generic.clickOnWebElement(cepo.getbutton());
	}

}
