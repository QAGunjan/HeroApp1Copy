package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OTP_Page_Object {
	
	@FindBy(id="com.customerapp.hero:id/otp_one_edtxt")
	private static WebElement firsttxtbox;
	
	@FindBy(id="com.customerapp.hero:id/otp_two_edtxt")
	private WebElement secondtxtbox;

	@FindBy(id="com.customerapp.hero:id/otp_three_edtxt")
	private WebElement thirdtxtbox;
	
	@FindBy(id="com.customerapp.hero:id/otp_four_edtxt")
	private static WebElement fourthtxtbox;
	
	@FindBy(id="com.customerapp.hero:id/otp_5_edtxt")
	private WebElement fifthtxtbox;

	@FindBy(id="com.customerapp.hero:id/otp_6_edtxt")
	private WebElement sixthtxtbox;
	
	@FindBy(id="com.customerapp.hero:id/btn_lay")
	private WebElement verifybtn;
	
	@FindBy(id="com.customerapp.hero:id/edit_phn_no_btn")
	private WebElement edit_button;
	
	@FindBy(xpath="//android.widget.Toast[1]")
	private WebElement toast_message;
	
	
	@FindBy(id="com.customerapp.hero:id/resend_btn_lbl")
	private WebElement resend_link;
	
	
	public OTP_Page_Object(AndroidDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}

	public WebElement getFirsttxtbox() {
		return firsttxtbox;
	}

	public WebElement getSecondtxtbox() {
		return secondtxtbox;
	}

	public WebElement getThirdtxtbox() {
		return thirdtxtbox;
	}

	public  WebElement getFourthtxtbox() {
		return fourthtxtbox;
	}

	public WebElement getFifthtxtbox() {
		return fifthtxtbox;
	}

	public WebElement getSixthtxtbox() {
		return sixthtxtbox;
	}

	public WebElement getVerifybtn() {
		return verifybtn;
	}

	public WebElement getEdit_button() {
		return edit_button;
	}

	public WebElement getToast_message() {
		return toast_message;
	}

	public WebElement getResend_link() {
		return resend_link;
	}

	
	
	
}
