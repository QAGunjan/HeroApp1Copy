package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CommonElements_Page_object {

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
	private WebElement herologo;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement button;

	@FindBy(xpath = "//*[@text='Only this time']")
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

	public CommonElements_Page_object(AndroidDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public WebElement getBack_icon() {
		return back_icon;
	}

	public WebElement getToast_message() {
		return toast_message;
	}

	public WebElement getHerologo() {
		return herologo;
	}

	public WebElement getNonOfTheAbove() {
		return nonOfTheAbove;
	}

	public WebElement getallowing_commom_popup_honor() {
		return allowing_commom_popup_honor;
	}

	public WebElement getAllowing_commom_popup_samsung() {
		return allowing_commom_popup_samsung;
	}

	public WebElement getNotification_pop_up_samsung() {
		return notification_pop_up_samsung;
	}

	public WebElement getbutton() {
		return button;
	}

	public WebElement getOnlyThisTime_popup_samsung() {
		return onlyThisTime_popup_samsung;
	}

	public WebElement getPageTitleText() {
		return pageTitleText;
	}

	public WebElement getState_box() {
		return state_box;
	}

	public WebElement getCity_box() {
		return city_box;
	}

	public List<WebElement> getState_typedropdown() {
		return state_typedropdown;
	}

	public List<WebElement> getCity_typedropdown() {
		return city_typedropdown;
	}

}
