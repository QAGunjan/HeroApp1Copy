package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Profile_Details_Form_299_Page_Object {

	
	@FindBy(id = "com.customerapp.hero:id/owner_radio")
	private WebElement owner_selection_radio_button;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement mobileNumber_field_299Plan;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement address_field_299Plan;
	
	
	@FindBy(xpath = "//*[@text='Continue']")
	private WebElement continue_button;
	
	
	
	
	public Goodlife_Profile_Details_Form_299_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);
	}


	public WebElement getOwner_selection_radio_button() {
		return owner_selection_radio_button;
	}


	public WebElement getMobileNumber_field_299Plan() {
		return mobileNumber_field_299Plan;
	}


	public WebElement getAddress_field_299Plan() {
		return address_field_299Plan;
	}


	public WebElement getContinue_button() {
		return continue_button;
	}
	
	
	
	
}
