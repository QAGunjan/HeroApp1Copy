package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Profile_Details_Form_199_Page_Object {
	@FindBy(id = "com.customerapp.hero:id/goodlifeMemberChkBox")
	private WebElement my_immediate_family_mem_checkbox;

	@FindBy(id = "com.customerapp.hero:id/radio_button_term2")
	private WebElement I_agree_T_and_C_checkbox;
	
//	@FindBy(id = "com.customerapp.hero:id/btn_lay")
//	private WebElement pay_199_button;
	
	
	public Goodlife_Profile_Details_Form_199_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);
	}

	public WebElement getMy_immediate_family_mem_checkbox() {
		return my_immediate_family_mem_checkbox;
	}

	public WebElement getI_agree_T_and_C_checkbox() {
		return I_agree_T_and_C_checkbox;
	}

//	public WebElement getPay_199_button() {
//		return pay_199_button;
//	}

	
	

	
}
