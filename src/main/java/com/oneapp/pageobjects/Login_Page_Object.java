package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login_Page_Object extends BaseClass {

	@AndroidFindBy(id = "com.customerapp.hero:id/text_input_editext")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\" Enter mobile number\"]")
	private MobileElement mobile_num_field;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> privacylink;

	@FindBys({
			// @FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
			@FindBy(className = "android.widget.TextView") })
	private List<WebElement> term_and_condition_link;

	@FindBys({
			// @FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
			@FindBy(className = "android.widget.TextView") })
	private List<WebElement> contact_us_link;


	@AndroidFindBy(id="com.customerapp.hero:id/button_neg")
	private MobileElement cancelbtn;

	
	
	public MobileElement getCancelbtn() {
		return cancelbtn;
	}

	public MobileElement getMobile_num_field() {
		return mobile_num_field;
	}

	public List<WebElement> getPrivacylink() {
		return privacylink;
	}

	public List<WebElement> getTerm_and_condition_link() {
		return term_and_condition_link;
	}

	public List<WebElement> getContact_us_link() {
		return contact_us_link;
	}

}
