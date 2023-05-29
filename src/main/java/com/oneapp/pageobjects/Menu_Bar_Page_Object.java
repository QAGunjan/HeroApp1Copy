package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Menu_Bar_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/rv_item_lbl")
	private WebElement myprofile_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Logout']")
	private WebElement logout_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Contact Us']")
	private WebElement ContactUs_menu_bar_txt;

	@FindBy(id = "com.customerapp.hero:id/cross")
	private WebElement menu_bar_close_icon;

	@FindBy(xpath = "//*[@text='Refer a friend']")
	private WebElement referToFriend_menu_bar_txt;

	@FindBy(xpath = "//*[@text='Tips and DIY videos']")
	private WebElement tipsAndDIYVideos_menu_bar_txt;

	@FindBy(id = "//*[@text='Feedback']")
	private WebElement feedback_menu_bar_text;
	
	public Menu_Bar_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getMyprofile_menu_bar_txt() {
		return myprofile_menu_bar_txt;
	}

	public WebElement getLogout_menu_bar_txt() {
		return logout_menu_bar_txt;
	}

	public WebElement getMenu_bar_close_icon() {
		return menu_bar_close_icon;
	}

	public WebElement getReferToFriend_menu_bar_txt() {
		return referToFriend_menu_bar_txt;
	}

	public WebElement getTipsAndDIYVideos_menu_bar_txt() {
		return tipsAndDIYVideos_menu_bar_txt;
	}

	public WebElement getContactUs_menu_bar_txt() {
		return ContactUs_menu_bar_txt;
	}

	public WebElement getFeedback_menu_bar_text() {
		return feedback_menu_bar_text;
	}
	

}
