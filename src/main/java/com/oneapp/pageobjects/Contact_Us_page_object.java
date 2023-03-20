package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Contact_Us_page_object {
	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> contact_us_text_val;

	@FindBy(xpath = "//*[@text='Whatsapp']")
	private WebElement Whatsapp_text;

	public Contact_Us_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public List<WebElement> getContact_us_text_val() {
		return contact_us_text_val;
	}

	public WebElement getWhatsapp_text() {
		return Whatsapp_text;
	}
	
}
