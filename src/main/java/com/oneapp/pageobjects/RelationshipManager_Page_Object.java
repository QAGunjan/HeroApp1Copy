package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class RelationshipManager_Page_Object {

	@FindBy(xpath = "//*[@text='GoodLife']")
	private WebElement goodlife_icon;

	@FindBy(id = "com.customerapp.hero:id/noDataTitle")
	private WebElement noDataFound;

	@FindBy(xpath = "//*[@text='TSM']")
	private WebElement TSM_text;

	@FindBy(xpath = "//*[@text='chavakula.rakshit@heromotocorp.com']")
	private WebElement TSM_email;

	public RelationshipManager_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getNoDataFound() {
		return noDataFound;
	}

	public WebElement getTSM_text() {
		return TSM_text;
	}

	public WebElement getTSM_email() {
		return TSM_email;
	}

}
