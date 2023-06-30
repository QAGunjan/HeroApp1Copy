package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyProfile_Page_Object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/lbl")
	private MobileElement profiledetails_text;

	@AndroidFindBy(id = "com.customerapp.hero:id/tv_details")
	private MobileElement moredetails_link;

	@AndroidFindBy(id = "com.customerapp.hero:id/user_name")
	private MobileElement SavedFullName;

//	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
//	private WebElement editprofile_details_btn;

	@AndroidFindBy(id = "com.customerapp.hero:id/address")
	private MobileElement address_val;

	@AndroidFindBy(id = "com.customerapp.hero:id/gender")
	private MobileElement gender_val;

	@AndroidFindBy(id = "com.customerapp.hero:id/emergency_contacts")
	private MobileElement emergency_contact_txt;

	@AndroidFindBy(id = "com.customerapp.hero:id/manage_license")
	private MobileElement manage_license_text;


	public MobileElement getMoredetails_link() {
		return moredetails_link;
	}

//	public WebElement getEditprofile_details_btn() {
//		return editprofile_details_btn;
//	}

	public MobileElement getAddress_val() {
		return address_val;
	}

	public MobileElement getGender_val() {
		return gender_val;
	}

	public MobileElement getEmergency_contact_txt() {
		return emergency_contact_txt;
	}

	public MobileElement getManage_license_text() {
		return manage_license_text;
	}

	public MobileElement getSavedFullName() {
		return SavedFullName;
	}

}
