package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logout_Page_Object extends BaseClass {
	public Generic generic = new Generic();

//	@AndroidFindBy(id = "android:id/button1")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
//
//	private MobileElement yes_text;

	@FindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Are you sure you want to logout?\"]/parent::XCUIElementTypeOther/parent::XCUIElementTypeScrollView/following-sibling::XCUIElementTypeScrollView//XCUIElementTypeButton)[2]")

	private WebElement yes_text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[1]")
	private WebElement LogoutWindow_text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[2]")
	private WebElement Areyousuretologout_text;

	public Logout_Page_Object(AppiumDriver ad)

	{
		PageFactory.initElements(ad, this);
	}

	public CommonElements_Page_object clickOnYes() {

		try {
			generic.clickOnWebElement(yes_text);
		} catch (Exception e) {
//		TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		return new CommonElements_Page_object(ad);
	}

}
