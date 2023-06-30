package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Logout_Page_Object extends BaseClass {

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement yes_text;

	public MobileElement getYes_text() {
		return yes_text;
	}

}
