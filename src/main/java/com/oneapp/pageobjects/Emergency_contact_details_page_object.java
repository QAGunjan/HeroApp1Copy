package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Emergency_contact_details_page_object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/user_name")
	private MobileElement fullname_textbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/phn_no_edtxt")
	private MobileElement mob_number_txtbox;

	@AndroidFindBy(id = "com.customerapp.hero:id/name")
	private MobileElement relation_type;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> relation_typedropdown;

//	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
//	private WebElement continue_btn;

	@AndroidFindBy(xpath = "//*[@text='Full Name']")
	private MobileElement fullName_text;

	public MobileElement getFullname_textbox() {
		return fullname_textbox;
	}

	public MobileElement getMob_number_txtbox() {
		return mob_number_txtbox;
	}

	public List<WebElement> getRelation_typedropdown() {
		return relation_typedropdown;
	}

	public MobileElement getRelation_type() {
		return relation_type;
	}

//	public WebElement getContinue_btn() {
//		return continue_btn;
//	}

	public MobileElement getFullName_text() {
		return fullName_text;
	}

}
