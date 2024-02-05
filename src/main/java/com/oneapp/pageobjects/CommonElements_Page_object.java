package com.oneapp.pageobjects;

import java.util.List;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

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

public class CommonElements_Page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.google.android.gms:id/title")
	private WebElement chooseAPhoneNumber;

	@FindBy(id = "com.google.android.gms:id/cancel")

	private WebElement closePopUp;

	@FindBy(id = "com.google.android.gms:id/cancel")
	private WebElement nonOfTheAbove;

	@FindBy(xpath = "//*[@text='ALLOW']")
	private WebElement allowing_commom_popup_honor;

	@FindBy(xpath = "//*[@text='Allow']")
	private WebElement allowing_commom_popup_samsung;

	@FindBy(xpath = "//*[@text='Allow Hero App to send you notifications?']")
	private WebElement notification_pop_up_samsung;

	@FindBy(id = "com.customerapp.hero:id/back_btn")
	private WebElement back_icon;

	@FindBy(id = "com.customerapp.hero:id/snackbar_text")
	private WebElement toast_message;

	@FindBy(id = "com.customerapp.hero:id/lbl1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]")

	private WebElement herologo;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")

	private WebElement button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")

	private WebElement continuebuttonIOS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify\"]")

	private WebElement verifybuttonIOS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save\"]")

	private WebElement savebuttonIOS;

	@FindBy(xpath = "(//android.widget.LinearLayout/android.widget.Button)[1]")
	private WebElement onlyThisTime_popup_samsung;

	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement pageTitleText;

	@FindBy(id = "com.customerapp.hero:id/state_sp")
	private WebElement state_box;

	@FindBy(id = "com.customerapp.hero:id/city_sp")
	private WebElement city_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> state_typedropdown;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> city_typedropdown;

	public CommonElements_Page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void clickOnAllowPopUp() {

		if (DEVICE_NAME.equals("Pixel 3")) {
			while (generic.elementDisplaying(new CommonElements_Page_object(ad).getChooseAPhoneNumber())) {
				generic.clickOnWebElement(new CommonElements_Page_object(ad).getClosePopUp());
			}

		}
		
//		generic.waitForVisibility(allowing_commom_popup_samsung);
//
//		while (allowing_commom_popup_samsung.getText().contains("Allow")) {
//			generic.clickOnWebElement(allowing_commom_popup_samsung);
//			break;
//		
//		}
//
//		System.out.println("Gunjan");

		while (generic.elementDisplaying(allowing_commom_popup_samsung)) {
			generic.clickOnWebElement(allowing_commom_popup_samsung);
			break;
		}

		/*
		 * 
		 * try {
		 * 
		 * if (DEVICE_NAME.equals("Pixel 3")) { if (generic.elementDisplaying(new
		 * CommonElements_Page_object(ad).getChooseAPhoneNumber())) {
		 * generic.clickOnWebElement(new
		 * CommonElements_Page_object(ad).getClosePopUp()); } }
		 * 
		 * if (generic.elementDisplaying(allowing_commom_popup_samsung)) {
		 * generic.clickOnWebElement(allowing_commom_popup_samsung); } } catch
		 * (Exception e) { }
		 * 
		 */
	}
}
