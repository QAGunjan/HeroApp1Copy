package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Goodlife_Dashboard_Non_mem_Page_Object;
import com.oneapp.pageobjects.Goodlife_Plans_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Plans_Page_Actions {
	
	public AndroidDriver ad;
	public Goodlife_Plans_Page_Object gppo;

	
	public Goodlife_Plans_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		gppo = new Goodlife_Plans_Page_Object(ad);
	}

	public void clickViewAllBenefits199PlanAction()
	{
		Generic.clickOnWebElement(gppo.getViewallbenefits_goodlife_199Plans());
	}
	
	public void clickViewAllBenefits299PlanAction()
	{
	   	Generic.swiping(527,1282,527,603,5000);
	   	Generic.clickOnWebElement(gppo.getViewallbenefits_goodlife_299Plans());
	}

}
