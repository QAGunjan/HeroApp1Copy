package com.oneapp.page_actions;

import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Goodlife_Insurance_Details_Form_299_Page_Object;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_299_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Insurance_Details_Form_299_Page_Action {

	public AndroidDriver ad;
	public Goodlife_Insurance_Details_Form_299_Page_Object gidf_299_po;
	public ExcelData exceldata;

	public Goodlife_Insurance_Details_Form_299_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		gidf_299_po = new Goodlife_Insurance_Details_Form_299_Page_Object(ad);
		exceldata = new ExcelData();
	}

	public void enter_nomineeName() {
		Generic.sendKeys(gidf_299_po.getNomineeName_field(), exceldata.getStringData("Goodlife", 2, 1));
	}

	public void Nominee_relationship_dropdown() {
		Generic.click_on_WebElement(gidf_299_po.getNomineeRelationship_with_member_field());
		Generic.Tap_on_WebElement(156, 1030);
	}

	public void NomineeContactNumber_field() {
		Generic.sendKeys(gidf_299_po.getNomineeContactNumber_field(), exceldata.getStringData("Goodlife", 3, 1));
	}

	public void Nominee_address_same_as_member_checkbox() {
		if (gidf_299_po.getNominee_address_same_as_member_checkbox().isSelected()) {
			System.out.println("Nominee checkbox is already selected. Thanks!");
		}

		else {
			Generic.click_on_WebElement(gidf_299_po.getNominee_address_same_as_member_checkbox());
			System.out.println("Now, nominee checkbox is getting selected");
		}
	}

	public void validation_of_address_field() {
		Generic.Soft_assertion_validation(gidf_299_po.getAddress_field(), exceldata.getStringData("My Profile", 3, 1));
		Generic.swiping(508, 1641, 496, 512, 4000);
	}

	public void selecting_relationType() {
		Generic.click_on_WebElement(gidf_299_po.getRelationType_dropdown());
		Generic.Tap_on_WebElement(174, 1547);
	}

	public void enter_relativeName() {
		Generic.sendKeys(gidf_299_po.getRelativeName_field(), exceldata.getStringData("Goodlife", 4, 1));
	}

	public void My_immediate_family_member_checkbox() {
		Generic.swiping(528, 1554, 521, 935, 4000);
		Generic.click_on_WebElement(gidf_299_po.getMy_immediate_family_member_checkbox());
	}

	public void terms_and_condition_checkbox() {
		Generic.click_on_WebElement(gidf_299_po.getTerms_and_condition_checkbox());
	}

	public void tap_on_pay299_button() {
		Generic.click_on_WebElement(gidf_299_po.getPay_299_button());
	}

}
