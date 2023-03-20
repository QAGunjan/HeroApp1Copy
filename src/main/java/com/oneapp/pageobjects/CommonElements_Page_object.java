package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	private  WebElement back_icon;
	
	@FindBy(id="com.customerapp.hero:id/snackbar_text")
	private  WebElement toast_message;
	
	@FindBy(id = "com.customerapp.hero:id/lbl1")
	private WebElement herologo;
	
	
	public CommonElements_Page_object(AndroidDriver ad) 
	{
		PageFactory.initElements(ad, this);
	}

	public  WebElement getBack_icon() {
		return back_icon;
	}

	public  WebElement getToast_message() {
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


	
}
