package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Personal_Details_Page_Object {

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> Personal_details_text;

	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	private WebElement fullname_textfield;

	@FindBy(id = "com.customerapp.hero:id/female_rd")
	private WebElement Gender_checkbox;

//	@FindBys({
//		@FindBy(className = "android.widget.EditText")
//		})
//		private List<WebElement> emailfield;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement emailfield;

//	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
//	private WebElement datefield;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement datefield;

	@FindBy(id = "com.customerapp.hero:id/mtrl_picker_header_toggle")
	private WebElement edit_under_date_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement editing_date;

	@FindBy(id = "com.customerapp.hero:id/confirm_button")
	private WebElement ok_text;

	@FindBy(id = "com.customerapp.hero:id/filled_exposed")
	private WebElement blood_group_field;
	
	
	@FindBy(id = "com.customerapp.hero:id/address_input_editext")
	private WebElement address_field;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pincode_field;
	
	
	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement save_btn;

	@FindBy(xpath = "//*[@text='Age must be of 18yr old']")
	private WebElement age_error_message;
	
	
	
	public Personal_Details_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public List<WebElement> getPersonal_details_text() {
		return Personal_details_text;
	}

	public WebElement getFullname_textfield() {
		return fullname_textfield;
	}

	public WebElement getGender_checkbox() {
		return Gender_checkbox;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getDatefield() {
		return datefield;
	}

	public WebElement getEdit_under_date_field() {
		return edit_under_date_field;
	}

	public WebElement getEditing_date() {
		return editing_date;
	}

	public WebElement getOk_text() {
		return ok_text;
	}

	public WebElement getBlood_group_field() {
		return blood_group_field;
	}

	public WebElement getAddress_field() {
		return address_field;
	}


	public WebElement getPincode_field() {
		return pincode_field;
	}

	public WebElement getSave_btn() {
		return save_btn;
	}

	public WebElement getAge_error_message() {
		return age_error_message;
	}



	
	
	
	
	
	
	
	
	
	
}
