package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
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

public class Login_Page_Object extends BaseClass {

	Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\" Enter mobile number\"]")
	private WebElement mobile_num_field;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> privacylink;

	@FindBys({
			// @FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
			@FindBy(className = "android.widget.TextView") })
	private List<WebElement> term_and_condition_link;

	@FindBys({
			// @FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
			@FindBy(className = "android.widget.TextView") })
	private List<WebElement> contact_us_link;

	@FindBy(id = "com.customerapp.hero:id/button_neg")
	private WebElement cancelbtn;

	@FindBy(id = "com.customerapp.hero:id/lbl2")
	private WebElement PleaseProceedWithYourRegisteredHeroMobileNumber_Text;

	@FindBy(id = "com.customerapp.hero:id/lbl3")
	private WebElement ByTappingOnLoginOrRegisterYouAreAgreeingToHero_Text;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement continueBtn;

	@FindBy(id = "com.customerapp.hero:id/snackbar_text")
	private WebElement otpGeneratedToastMessage;

	@FindBy(id = "com.customerapp.hero:id/tv_title")
	private WebElement numberNotRegisteredWithAnyHeroVehicle_Text;

	@FindBy(id = "com.customerapp.hero:id/textMessage")
	private WebElement updateRegisteredMobileNumberForYourHeroVehicleOrTryWithAnotherNumber_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[3]")
	private WebElement updateNumberButton;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[4]")
	private WebElement continueAsGuestButton;

	@FindBy(id = "com.customerapp.hero:id/iv_cross")
	private WebElement closeIcon;

	public Login_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void clickOnCloseIcon() {
		generic.clickOnWebElement(closeIcon);
	}

	public void clickOnUpdateNumberButton() {
		generic.clickOnWebElement(updateNumberButton);
	}

	public void clickOnContinueAsGuestButton() {
		generic.clickOnWebElement(continueAsGuestButton);
	}

	public void clickOnCancelButton() {
		generic.clickOnWebElement(cancelbtn);
	}

	public void enterLoginMobileNumber(String text) {
		generic.clearOnTexBox(mobile_num_field);
		generic.sendKeysOnTextfields(mobile_num_field, text);
	}

	public OTP_Page_Object clickOnContinuebutton() {
		generic.clickOnWebElement(continueBtn);

		return new OTP_Page_Object(ad);
	}

}
