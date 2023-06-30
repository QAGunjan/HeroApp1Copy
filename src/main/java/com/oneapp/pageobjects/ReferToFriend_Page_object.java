package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ReferToFriend_Page_object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/spinner_vehicle")
	private MobileElement selectModel_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> selectModel_typedropdown;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private MobileElement friendName_field;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private MobileElement MobileNumber_field;

	@AndroidFindBy(xpath = "//*[@text='We have successfully captured the Referral. Stay Tuned for more update.']")
	private MobileElement successfullyReferral_PopUp;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private MobileElement Ok_text;
	
	@AndroidFindBy(xpath = "//*[@text='Refer yourself']")
	private MobileElement referYourself_link;
	
	
	

	public MobileElement getSelectModel_box() {
		return selectModel_box;
	}

	public List<WebElement> getSelectModel_typedropdown() {
		return selectModel_typedropdown;
	}

	public MobileElement getFriendName_field() {
		return friendName_field;
	}

	public MobileElement getMobileNumber_field() {
		return MobileNumber_field;
	}

	public MobileElement getSuccessfullyReferral_PopUp() {
		return successfullyReferral_PopUp;
	}

	public MobileElement getOk_text() {
		return Ok_text;
	}

	public MobileElement getReferYourself_link() {
		return referYourself_link;
	}
	
	
	
}
