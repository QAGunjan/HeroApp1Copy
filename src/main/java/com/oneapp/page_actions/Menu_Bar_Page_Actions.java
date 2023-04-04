package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Menu_Bar_Page_Actions {

	public AndroidDriver ad;
	public Menu_Bar_Page_Object mbpo;


	public Menu_Bar_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		mbpo = new Menu_Bar_Page_Object(ad);

	}
	
	public void clickReferToFriendFromMenuBarAction() throws InterruptedException
	{
		Generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());
	}
	
	public void clickMyProfileFromMenuBarAction() throws InterruptedException
	{
		Generic.clickOnWebElement(mbpo.getMyprofile_menu_bar_txt());
	}
	
	 public void clickLogoutFromMenuBarAction()
	 {
		 Generic.clickOnWebElement( mbpo.getLogout_menu_bar_txt());
	 }
	
	 public void clickCloseIconFromMenuBarAction() throws InterruptedException
	 {
		 Generic.clickOnWebElement(mbpo.getMenu_bar_close_icon());
	 }
	 
	 public void clickTipsAndDIYVideosFromMenuBarAction() throws InterruptedException
	 {
		 Generic.clickOnWebElement(mbpo.getTipsAndDIYVideos_menu_bar_txt());
	 }
	 
	 public void clickContactUSFromMenubarAction()
	 {
		 Generic.clickOnWebElement(mbpo.getContactUs_menu_bar_txt());
	 }
	 
}
