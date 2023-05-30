package com.oneapp.page_actions;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Goodlife_Plans_Page_Object;
import com.oneapp.pageobjects.Goodlife_Select_Your_Plan_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Select_Your_Plan_Page_Action {
	public AppiumDriver ad;
	public Goodlife_Select_Your_Plan_Page_Object gsyppo;
	public Generic generic;

	
	public Goodlife_Select_Your_Plan_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		gsyppo = new Goodlife_Select_Your_Plan_Page_Object(ad2);
		generic = new Generic();
	}
	
	public void clickSelectingPlanAction()
	{
		generic.clickOnWebElement(gsyppo.getGoodlife_select_Plan_btn());
	}

}
