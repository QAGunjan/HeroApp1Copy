package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MyProfile_Page_Object extends BaseClass {

	Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement profiledetails_text;

	@FindBy(id = "com.customerapp.hero:id/tv_details")
	private WebElement moredetails_link;

	@FindBy(id = "com.customerapp.hero:id/user_name")
	private WebElement SavedFullName;

	@FindBy(id = "com.customerapp.hero:id/user_email")
	private WebElement SavedEmail;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement editprofile_details_btn;

	@FindBy(id = "com.customerapp.hero:id/address")
	private WebElement address_val;

	@FindBy(id = "com.customerapp.hero:id/gender")
	private WebElement gender_val;

	@FindBy(id = "com.customerapp.hero:id/emergency_contacts")
	private WebElement emergency_contact_txt;

	@FindBy(id = "com.customerapp.hero:id/manage_license")
	private WebElement manage_license_text;

	@FindBy(id = "com.customerapp.hero:id/back_btn")
	private WebElement back_icon;

	public MyProfile_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void clickOnMoreDetails() {
		generic.clickOnWebElement(moredetails_link);
	}

	public Personal_Details_Page_Object clickOnEditProfileDetails() {
		generic.clickOnWebElement(editprofile_details_btn);

		return new Personal_Details_Page_Object(ad);
	}

	public void clickOnBackIcon() throws InterruptedException {
		Thread.sleep(5000);
		generic.clickOnWebElement(back_icon);
	}

}
