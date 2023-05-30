package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Insurance_Details_Form_299_Page_Object {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement NomineeName_field;

	@FindBy(id = "com.customerapp.hero:id/filled_exposed")
	private WebElement NomineeRelationship_with_member_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement NomineeContactNumber_field;

	@FindBy(id = "com.customerapp.hero:id/nominee_address_same_as_user_check")
	private WebElement Nominee_address_same_as_member_checkbox;

	@FindBy(id = "com.customerapp.hero:id/nominee_address_edtxt")
	private WebElement address_field;

	@FindBy(id = "com.customerapp.hero:id/filled_exposed")
	private WebElement relationType_dropdown;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement relativeName_field;

	@FindBy(id = "com.customerapp.hero:id/radio_button_term1")
	private WebElement My_immediate_family_member_checkbox;

	@FindBy(id = "com.customerapp.hero:id/radio_button_term2")
	private WebElement terms_and_condition_checkbox;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement Pay_299_button;

	public Goodlife_Insurance_Details_Form_299_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);
	}

	public WebElement getNomineeName_field() {
		return NomineeName_field;
	}

	public WebElement getNomineeRelationship_with_member_field() {
		return NomineeRelationship_with_member_field;
	}

	public WebElement getNomineeContactNumber_field() {
		return NomineeContactNumber_field;
	}

	public WebElement getNominee_address_same_as_member_checkbox() {
		return Nominee_address_same_as_member_checkbox;
	}

	public WebElement getAddress_field() {
		return address_field;
	}

	public WebElement getRelationType_dropdown() {
		return relationType_dropdown;
	}

	public WebElement getRelativeName_field() {
		return relativeName_field;
	}

	public WebElement getMy_immediate_family_member_checkbox() {
		return My_immediate_family_member_checkbox;
	}

	public WebElement getTerms_and_condition_checkbox() {
		return terms_and_condition_checkbox;
	}

	public WebElement getPay_299_button() {
		return Pay_299_button;
	}

}
