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

public class Menu_Bar_Page_Object extends BaseClass {
	
	Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/rv_item_lbl")
	private WebElement myprofile_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Logout']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")

	private WebElement logout_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Contact Us']")
	private WebElement ContactUs_menu_bar_txt;

	@FindBy(id = "com.customerapp.hero:id/cross")
	private WebElement menu_bar_close_icon;

	@FindBy(xpath = "//*[@text='Refer a friend']")
	private WebElement referToFriend_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Tips and DIY videos']")
	private WebElement tipsAndDIYVideos_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Feedback']")
	private WebElement feedback_menu_bar_text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[2]")
	private WebElement youAreUsing_text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[1]")
	private WebElement Hello_text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[6]")
	private WebElement WheelsOfTrust_text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[7]")
	private WebElement Joyride_text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[5]")
	private WebElement VehicleDetails_text;

	@FindBy(id = "com.customerapp.hero:id/app_version_lbl")

	private WebElement AppVersion_text;

	public Menu_Bar_Page_Object(AppiumDriver ad)

	{
		PageFactory.initElements(ad, this);
	}

	public Logout_Page_Object clickOnLogoutOut_Text() {
		generic.clickOnWebElement(logout_menu_bar_txt);

		return new Logout_Page_Object(ad);
	}

	public MyProfile_Page_Object clickOnMyProfile() {
		generic.clickOnWebElement(myprofile_menu_bar_txt);

		return new MyProfile_Page_Object(ad);
	}

	public ReferToFriend_Page_object clickOnReferToFriend() {
		generic.clickOnWebElement(referToFriend_menu_bar_txt);
		
		return new ReferToFriend_Page_object(ad);

	}

}
