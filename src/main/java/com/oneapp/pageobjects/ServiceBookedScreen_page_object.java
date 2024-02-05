package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ServiceBookedScreen_page_object extends BaseClass {

	@FindBy(id = "com.customerapp.hero:id/text")
	private WebElement serviceBookedText;

	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement serviceBookedTitle;

	@FindBy(id = "com.customerapp.hero:id/tv_sr_no")
	private WebElement serialNumberText;

	@FindBy(id = "com.customerapp.hero:id/tv_title")

	private WebElement kindlyRateYourExperienceText;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	
	private WebElement submitButton;

	public ServiceBookedScreen_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}
	
	
	public void clickOnSubmitButton()
	{
		new Generic().clickOnWebElement(submitButton);
	}
	
	
	
	

}
