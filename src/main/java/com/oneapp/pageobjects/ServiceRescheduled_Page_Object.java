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

public class ServiceRescheduled_Page_Object extends BaseClass {
	
	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/text")
	private WebElement serviceRescheduled_Text;

	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement 	serviceRescheduledTitle;

	@FindBy(id = "com.customerapp.hero:id/tv_sr_no")
	private WebElement serialNumberText;

	@FindBy(id = "com.customerapp.hero:id/tv_title")

	private WebElement kindlyRateYourExperienceText;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	
	private WebElement submitButton;

	public ServiceRescheduled_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}
	
	public void clickOnSubmitButton()
	{
		new Generic().clickOnWebElement(submitButton);
	}
	

}
