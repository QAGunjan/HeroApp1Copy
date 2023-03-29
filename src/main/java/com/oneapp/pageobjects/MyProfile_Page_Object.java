package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyProfile_Page_Object {
	
	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement profiledetails_text;
	
	@FindBy(id = "com.customerapp.hero:id/tv_details")
	private WebElement moredetails_link;
	
//	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
//	private WebElement editprofile_details_btn;
	
	@FindBy(id = "com.customerapp.hero:id/address")
	private WebElement address_val;
	
	@FindBy(id = "com.customerapp.hero:id/gender")
	private WebElement gender_val;
	
	@FindBy(id = "com.customerapp.hero:id/emergency_contacts")
	private WebElement emergency_contact_txt;
	
	@FindBy(id = "com.customerapp.hero:id/manage_license")
	private WebElement manage_license_text;
	
	
	

	public MyProfile_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}


	public WebElement getProfiledetails_text() {
		return profiledetails_text;
	}


	public WebElement getMoredetails_link() {
		return moredetails_link;
	}


//	public WebElement getEditprofile_details_btn() {
//		return editprofile_details_btn;
//	}


	public WebElement getAddress_val() {
		return address_val;
	}



	public WebElement getGender_val() {
		return gender_val;
	}


	public WebElement getEmergency_contact_txt() {
		return emergency_contact_txt;
	}


	public WebElement getManage_license_text() {
		return manage_license_text;
	}

	
	

}
