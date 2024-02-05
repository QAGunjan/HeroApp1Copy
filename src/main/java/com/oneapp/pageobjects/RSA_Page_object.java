package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RSA_Page_object extends BaseClass {

	@AndroidFindBy(xpath = "(//android.view.View//android.widget.TextView)[1]")
	private MobileElement RSAPage_Text;

	@AndroidFindBy(xpath = "(//android.view.View//android.widget.TextView)[2]")
	private MobileElement Locatenearestdealer_Text;

	public MobileElement getLocatenearestdealer_Text() {
		return Locatenearestdealer_Text;
	}

	public MobileElement getRSAPage_Text() {
		return RSAPage_Text;
	}

}
