package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ReferToFriend_Page_object {

	@FindBy(id = "com.customerapp.hero:id/spinner_vehicle")
	private WebElement selectModel_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> selectModel_typedropdown;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement friendName_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement MobileNumber_field;

	@FindBy(xpath = "//*[@text='We have successfully captured the Referral. Stay Tuned for more update.']")
	private WebElement successfullyReferral_PopUp;
	
	@FindBy(xpath = "//*[@text='OK']")
	private WebElement Ok_text;
	
	@FindBy(xpath = "//*[@text='Refer yourself']")
	private WebElement referYourself_link;
	
	
	public ReferToFriend_Page_object(AppiumDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getSelectModel_box() {
		return selectModel_box;
	}

	public List<WebElement> getSelectModel_typedropdown() {
		return selectModel_typedropdown;
	}

	public WebElement getFriendName_field() {
		return friendName_field;
	}

	public WebElement getMobileNumber_field() {
		return MobileNumber_field;
	}

	public WebElement getSuccessfullyReferral_PopUp() {
		return successfullyReferral_PopUp;
	}

	public WebElement getOk_text() {
		return Ok_text;
	}

	public WebElement getReferYourself_link() {
		return referYourself_link;
	}
	
	
	
}
