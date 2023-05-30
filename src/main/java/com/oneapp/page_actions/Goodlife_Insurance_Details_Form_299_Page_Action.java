package com.oneapp.page_actions;

import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Goodlife_Insurance_Details_Form_299_Page_Object;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_299_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Insurance_Details_Form_299_Page_Action {

	public AppiumDriver ad;
	public Goodlife_Insurance_Details_Form_299_Page_Object gidf_299_po;
	public ExcelData exceldata;
	public Generic generic;
	
	public Goodlife_Insurance_Details_Form_299_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		gidf_299_po = new Goodlife_Insurance_Details_Form_299_Page_Object(ad2);
		exceldata = new ExcelData();
		generic = new Generic();
	}

	public void enterNomineeNameAction() {
		generic.sendKeysOnTextfields(gidf_299_po.getNomineeName_field(), exceldata.getStringData("Goodlife", 2, 1));
	}

	public void selectingNomineeFromRelationshipDropdownAction() {
		generic.clickOnWebElement(gidf_299_po.getNomineeRelationship_with_member_field());
		generic.tappingOnWebelement(156, 1030);
	}

	public void enterNomineeContactNumberAction() {
		generic.sendKeysOnTextfields(gidf_299_po.getNomineeContactNumber_field(), exceldata.getStringData("Goodlife", 3, 1));
	}

	public void nomineeAddressSameAsMemberCheckboxActon() {
		if (gidf_299_po.getNominee_address_same_as_member_checkbox().isSelected() == true) {
			System.out.println("Nominee checkbox is already selected. Thanks!");
		}

		else {
			generic.clickOnWebElement(gidf_299_po.getNominee_address_same_as_member_checkbox());
			System.out.println("Now, nominee checkbox is getting selected");
		}
	}

	public void addressFieldAssertionAction() {
		generic.softAssertion(gidf_299_po.getAddress_field(), exceldata.getStringData("My Profile", 4, 1));
		generic.swiping(508, 1641, 496, 512, 4000);
	}

	public void selectingRelationFromRelationTypeDropdownAction() {
		generic.clickOnWebElement(gidf_299_po.getRelationType_dropdown());
		generic.tappingOnWebelement(165, 1594);
	}

	public void enterRelativeNameAction() {
		generic.sendKeysOnTextfields(gidf_299_po.getRelativeName_field(), exceldata.getStringData("Goodlife", 4, 1));
	}

	public void myImmediateFamilyMemberCheckboxAction() {
		generic.swiping(528, 1554, 521, 935, 4000);
		generic.clickOnWebElement(gidf_299_po.getMy_immediate_family_member_checkbox());
	}

	public void termsAndConditionCheckboxAction() {
		generic.clickOnWebElement(gidf_299_po.getTerms_and_condition_checkbox());
	}

	public void tappingPay299ButtonAction() throws InterruptedException {
		generic.clickOnWebElement(gidf_299_po.getPay_299_button());
		Thread.sleep(10000);
	}

}
