package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OTP_Page_Object extends BaseClass {

	@AndroidFindBy(className = "android.widget.EditText")
	private MobileElement textboxes;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_one_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[1]")
	private MobileElement firsttxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_two_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[2]")
	private MobileElement secondtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_three_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[3]")

	private MobileElement thirdtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_four_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[4]")

	private MobileElement fourthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_5_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[5]")

	private MobileElement fifthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/otp_6_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[6]")

	private MobileElement sixthtxtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/edit_phn_no_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"editredcircle\"]")

	private MobileElement edit_button;

	@AndroidFindBy(id = "com.customerapp.hero:id/resend_btn_lbl")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Resend\"]")

	private MobileElement resend_link;

	@AndroidFindBy(xpath = "//*[@text='Verify with OTP']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify with OTP\"]")
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
