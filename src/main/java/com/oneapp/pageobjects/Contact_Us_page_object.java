package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Contact_Us_page_object extends BaseClass {
	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> contact_us_text_val;

	@AndroidFindBy(xpath = "//*[@text='Whatsapp']")
	private MobileElement Whatsapp_text;

	public List<WebElement> getContact_us_text_val() {
		return contact_us_text_val;
	}

	public MobileElement getWhatsapp_text() {
		return Whatsapp_text;
	}

}
