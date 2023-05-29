package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Feedback_page_object {
	
	@FindBy(xpath = "//*[@text='Whatsapp']")
	private WebElement feedback_text;
	
	public Feedback_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public WebElement getFeedback_text() {
		return feedback_text;
	}


	
	

}
