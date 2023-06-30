package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Personal_Details_Page_Object extends BaseClass {

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> Personal_details_text;

	@AndroidFindBy(xpath = "//android.widget.TextView[@index='4']")
	private MobileElement personalDetails;
	

	@AndroidFindBy(id = "com.customerapp.hero:id/text_input_editext")
	private MobileElement fullname_textfield;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@index='1']")
	private MobileElement Gender_checkbox;

	@AndroidFindBy(xpath = "//android.widget.TextView[@index='11']")
	private MobileElement Address_text;

//	@FindBys({
//		@FindBy(className = "android.widget.EditText")
//		})
//		private List<WebElement> emailfield;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[2]")
	private MobileElement emailfield;

//	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
//	private WebElement datefield;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.customerapp.hero:id/text_input_editext'])[4]")
	private MobileElement datefield;

	@AndroidFindBy(id = "com.customerapp.hero:id/mtrl_picker_header_toggle")
	private MobileElement edit_under_date_field;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private MobileElement editing_date;

	@AndroidFindBy(id = "com.customerapp.hero:id/confirm_button")
	private MobileElement ok_text;

	@AndroidFindBy(id = "com.customerapp.hero:id/filled_exposed")
	private MobileElement blood_group_field;

	@AndroidFindBy(id = "com.customerapp.hero:id/address_input_editext")
	private MobileElement address_field;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[5]")
	private MobileElement pincode_field;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[6]")
	private MobileElement blank_pincode_field;

//	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
//	private WebElement save_btn;

	@AndroidFindBy(xpath = "//*[@text='Age must be of 18yr old']")
	private MobileElement age_error_message;

	@AndroidFindBy(id = "com.customerapp.hero:id/textinput_error")
	private MobileElement dateFormattErrorMessage;

	public List<WebElement> getPersonal_details_text() {
		return Personal_details_text;
	}

	public MobileElement getFullname_textfield() {
		return fullname_textfield;
	}

	public MobileElement getGender_checkbox() {
		return Gender_checkbox;
	}

	public MobileElement getEmailfield() {
		return emailfield;
	}

	public MobileElement getDatefield() {
		return datefield;
	}

	public MobileElement getEdit_under_date_field() {
		return edit_under_date_field;
	}

	public MobileElement getEditing_date() {
		return editing_date;
	}

	public MobileElement getOk_text() {
		return ok_text;
	}

	public MobileElement getBlood_group_field() {
		return blood_group_field;
	}

	public MobileElement getAddress_field() {
		return address_field;
	}

	public MobileElement getPincode_field() {
		return pincode_field;
	}

//	public WebElement getSave_btn() {
//		return save_btn;
//	}

	public MobileElement getAge_error_message() {
		return age_error_message;
	}

	public MobileElement getBlank_pincode_field() {
		return blank_pincode_field;
	}

	public MobileElement getAddress_text() {
		return Address_text;
	}

	public MobileElement getPersonalDetails() {
		return personalDetails;
	}

	public MobileElement getDateFormattErrorMessage() {
		return dateFormattErrorMessage;
	}

}
