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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CommonElements_Page_object extends BaseClass {

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	private MobileElement nonOfTheAbove;

	@AndroidFindBy(xpath = "//*[@text='ALLOW']")
	private MobileElement allowing_commom_popup_honor;

	@AndroidFindBy(xpath = "//*[@text='Allow']")
	private MobileElement allowing_commom_popup_samsung;

	@AndroidFindBy(xpath = "//*[@text='Allow Hero App to send you notifications?']")
	private MobileElement notification_pop_up_samsung;

	@AndroidFindBy(id = "com.customerapp.hero:id/back_btn")
	private MobileElement back_icon;

	@AndroidFindBy(id = "com.customerapp.hero:id/snackbar_text")
	private MobileElement toast_message;

	@AndroidFindBy(id = "com.customerapp.hero:id/lbl1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]")

	private MobileElement herologo;

	@AndroidFindBy(id = "com.customerapp.hero:id/btn_lbl")
	private MobileElement button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")

	private MobileElement continuebuttonIOS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify\"]")

	private MobileElement verifybuttonIOS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save\"]")

	private MobileElement savebuttonIOS;

	@AndroidFindBy(xpath = "//*[@text='Only this time']")
	private MobileElement onlyThisTime_popup_samsung;

	@AndroidFindBy(id = "com.customerapp.hero:id/lbl")
	private MobileElement pageTitleText;

	@AndroidFindBy(id = "com.customerapp.hero:id/state_sp")
	private MobileElement state_box;

	@AndroidFindBy(id = "com.customerapp.hero:id/city_sp")
	private MobileElement city_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> state_typedropdown;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> city_typedropdown;

//	public CommonElements_Page_object(AppiumDriver ad2) {
//		PageFactory.initElements(ad2, this);
//	}

	public MobileElement getBack_icon() {
		return back_icon;
	}

	public MobileElement getToast_message() {
		return toast_message;
	}

	public MobileElement getHerologo() {
		return herologo;
	}

	public MobileElement getNonOfTheAbove() {
		return nonOfTheAbove;
	}

	public MobileElement getallowing_commom_popup_honor() {
		return allowing_commom_popup_honor;
	}

	public MobileElement getAllowing_commom_popup_samsung() {
		return allowing_commom_popup_samsung;
	}

	public MobileElement getNotification_pop_up_samsung() {
		return notification_pop_up_samsung;
	}

	public MobileElement getbutton() {

		return button;
	}

	public MobileElement getContinuebuttonIOS() {
		return continuebuttonIOS;
	}

	public MobileElement getVerifybuttonIOS() {
		return verifybuttonIOS;
	}

	public MobileElement getsavebuttonIOS() {
		return savebuttonIOS;
	}

	public MobileElement getOnlyThisTime_popup_samsung() {
		return onlyThisTime_popup_samsung;
	}

	public MobileElement getPageTitleText() {
		return pageTitleText;
	}

	public MobileElement getState_box() {
		return state_box;
	}

	public MobileElement getCity_box() {
		return city_box;
	}

	public List<WebElement> getState_typedropdown() {
		return state_typedropdown;
	}

	public List<WebElement> getCity_typedropdown() {
		return city_typedropdown;
	}

}
