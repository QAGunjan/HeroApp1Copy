package com.oneapp.page_actions;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Menu_Bar_Page_Actions {

	public AndroidDriver ad;
	public Menu_Bar_Page_Object mbpo;
	public Generic generic;


	public Menu_Bar_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		mbpo = new Menu_Bar_Page_Object(ad);
		generic = new Generic();
	}
	
	public void clickReferToFriendFromMenuBarAction() throws InterruptedException
	{
		generic.clickOnWebElement(mbpo.getReferToFriend_menu_bar_txt());
	}
	
	public void clickMyProfileFromMenuBarAction() throws InterruptedException
	{
		generic.clickOnWebElement(mbpo.getMyprofile_menu_bar_txt());
	}
	
	 public void clickLogoutFromMenuBarAction()
	 {
		 generic.clickOnWebElement( mbpo.getLogout_menu_bar_txt());
	 }
	
	 public void clickCloseIconFromMenuBarAction() throws InterruptedException
	 {
		 generic.clickOnWebElement(mbpo.getMenu_bar_close_icon());
	 }
	 
	 public void clickTipsAndDIYVideosFromMenuBarAction() throws InterruptedException
	 {
		 generic.clickOnWebElement(mbpo.getTipsAndDIYVideos_menu_bar_txt());
	 }
	 
	 public void clickContactUSFromMenubarAction()
	 {
		 generic.clickOnWebElement(mbpo.getContactUs_menu_bar_txt());
	 }
	 
	 public void clickFeedbackFromMenubarAction()
	 {
		 generic.clickOnWebElement(mbpo.getFeedback_menu_bar_text());
	 }
	 
}
