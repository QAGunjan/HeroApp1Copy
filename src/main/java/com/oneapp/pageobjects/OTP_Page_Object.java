package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OTP_Page_Object extends BaseClass {

	public Generic generic = new Generic();

	@FindBys({ @FindBy(className = "android.widget.EditText") })
	private List<WebElement> textboxes;

	@FindBy(id = "com.customerapp.hero:id/otp_one_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[1]")
	private WebElement firsttxtbox;

	@FindBy(id = "com.customerapp.hero:id/otp_two_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[2]")
	private WebElement secondtxtbox;

	@FindBy(id = "com.customerapp.hero:id/otp_three_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[3]")

	private WebElement thirdtxtbox;

	@FindBy(id = "com.customerapp.hero:id/otp_four_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[4]")

	private WebElement fourthtxtbox;

	@FindBy(id = "com.customerapp.hero:id/otp_5_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[5]")

	private WebElement fifthtxtbox;

	@FindBy(id = "com.customerapp.hero:id/otp_6_edtxt")
	@iOSXCUITFindBy(xpath = "((//XCUIElementTypeButton[@name=\"editredcircle\"]/following-sibling::XCUIElementTypeOther)[1]/XCUIElementTypeTextField)[6]")

	private WebElement sixthtxtbox;

	@FindBy(id = "com.customerapp.hero:id/edit_phn_no_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"editredcircle\"]")

	private WebElement edit_button;

	@FindBy(id = "com.customerapp.hero:id/resend_btn_lbl")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Resend\"]")

	private WebElement resend_link;

	@FindBy(xpath = "//*[@text='Verify with OTP']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify with OTP\"]")
	private WebElement verify_with_OTP;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[1]")
	private WebElement WelcomeToHero_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[3]")
	private WebElement Enter6digitOTPsentto_Text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[5]")
	private WebElement ResendOTPin_Text;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement verifyBtn;

	public OTP_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public Selected_Vehicle_Page_Object clickOnVerifyButton() {

		generic.clickOnWebElement(verifyBtn);

		return new Selected_Vehicle_Page_Object(ad);
	}

	public void TypeInField() {

		generic.waitForVisibility(verify_with_OTP);

		String val = "123456";
		List<WebElement> elements = textboxes;
		elements.clear();
		int i = 0;
		for (WebElement e : elements) {
			e.sendKeys(String.valueOf(val.charAt(i)));
			i++;
		}
	}

}
