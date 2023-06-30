package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Menu_Bar_Page_Object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/rv_item_lbl")
	private MobileElement myprofile_menu_bar_txt;

	@AndroidFindBy(xpath = "//*[@text='Logout']")
	private MobileElement logout_menu_bar_txt;

	@AndroidFindBy(xpath = "//*[@text='Contact Us']")
	private MobileElement ContactUs_menu_bar_txt;

	@AndroidFindBy(id = "com.customerapp.hero:id/cross")
	private MobileElement menu_bar_close_icon;

	@AndroidFindBy(xpath = "//*[@text='Refer a friend']")
	private MobileElement referToFriend_menu_bar_txt;

	@AndroidFindBy(xpath = "//*[@text='Tips and DIY videos']")
	private MobileElement tipsAndDIYVideos_menu_bar_txt;

	@AndroidFindBy(id = "//*[@text='Feedback']")
	private MobileElement feedback_menu_bar_text;
	
	public MobileElement getMyprofile_menu_bar_txt() {
		return myprofile_menu_bar_txt;
	}

	public MobileElement getLogout_menu_bar_txt() {
		return logout_menu_bar_txt;
	}

	public MobileElement getMenu_bar_close_icon() {
		return menu_bar_close_icon;
	}

	public MobileElement getReferToFriend_menu_bar_txt() {
		return referToFriend_menu_bar_txt;
	}

	public MobileElement getTipsAndDIYVideos_menu_bar_txt() {
		return tipsAndDIYVideos_menu_bar_txt;
	}

	public MobileElement getContactUs_menu_bar_txt() {
		return ContactUs_menu_bar_txt;
	}

	public MobileElement getFeedback_menu_bar_text() {
		return feedback_menu_bar_text;
	}
	

}
