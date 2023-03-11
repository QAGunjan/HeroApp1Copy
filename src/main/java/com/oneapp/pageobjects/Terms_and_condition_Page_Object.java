package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Terms_and_condition_Page_Object {
	
	@FindBys
	({
	@FindBy(className= "android.view.View")
	})
	private List<WebElement> terms_and_conditions_text_val;
	
	public Terms_and_condition_Page_Object(AppiumDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public List<WebElement> getTerms_and_conditions_text_val() {
		return terms_and_conditions_text_val;
	}
	
	
	

}
