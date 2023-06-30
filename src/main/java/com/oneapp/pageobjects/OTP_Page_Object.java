package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OTP_Page_Object extends BaseClass {

	@AndroidFindBy(className = "android.widget.EditText")
	private MobileElement textboxes;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_one_edtxt")
	private MobileElement firsttxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_two_edtxt")
	private MobileElement secondtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_three_edtxt")
	private MobileElement thirdtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_four_edtxt")
	private MobileElement fourthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_5_edtxt")
	private MobileElement fifthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_6_edtxt")
	private MobileElement sixthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/edit_phn_no_btn")
	private MobileElement edit_button;

	@AndroidFindBy(id = "com.customerapp.hero:id/resend_btn_lbl")
	private MobileElement resend_link;

	@AndroidFindBy(id = "com.customerapp.hero:id/lbl2")
	private MobileElement verify_with_OTP;

	public MobileElement getFirsttxtbox() {
		return firsttxtbox;
	}

	public MobileElement getSecondtxtbox() {
		return secondtxtbox;
	}

	public MobileElement getThirdtxtbox() {
		return thirdtxtbox;
	}

	public MobileElement getFourthtxtbox() {
		return fourthtxtbox;
	}

	public MobileElement getFifthtxtbox() {
		return fifthtxtbox;
	}

	public MobileElement getSixthtxtbox() {
		return sixthtxtbox;
	}

	public MobileElement getEdit_button() {
		return edit_button;
	}

	public MobileElement getResend_link() {
		return resend_link;
	}

	public MobileElement getVerify_with_OTP() {
		return verify_with_OTP;
	}

	public MobileElement getTextboxes() {
		return textboxes;
	}

	
}
