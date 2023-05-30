package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Emergency_contact_details_page_object {
	
	@FindBy(id = "com.customerapp.hero:id/user_name")
	private WebElement fullname_textbox;
	
	@FindBy(id = "com.customerapp.hero:id/phn_no_edtxt")
	private WebElement mob_number_txtbox;
	
	@FindBy(id = "com.customerapp.hero:id/name")
	private WebElement relation_type;
	
	
	@FindBys({ 
		@FindBy(className = "android.widget.TextView") 
		})
	private List<WebElement> relation_typedropdown;

//	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
//	private WebElement continue_btn;
	
	@FindBy(xpath="//*[@text='Full Name']")
	private WebElement fullName_text;
	
	public Emergency_contact_details_page_object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}


	public WebElement getFullname_textbox() {
		return fullname_textbox;
	}


	public WebElement getMob_number_txtbox() {
		return mob_number_txtbox;
	}


	public List<WebElement> getRelation_typedropdown() {
		return relation_typedropdown;
	}


	public WebElement getRelation_type() {
		return relation_type;
	}


//	public WebElement getContinue_btn() {
//		return continue_btn;
//	}


	public WebElement getFullName_text() {
		return fullName_text;
	}
	
	
	
	

}
