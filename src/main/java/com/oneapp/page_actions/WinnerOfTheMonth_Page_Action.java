package com.oneapp.page_actions;

import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Goodlife_199Membership_Page_Object;
import com.oneapp.pageobjects.WinnerOfTheMonth_Page_Object;
import com.oneapp.utils.Generic;

import io.appium.java_client.android.AndroidDriver;

public class WinnerOfTheMonth_Page_Action {

	public AndroidDriver ad;
	public WinnerOfTheMonth_Page_Object wotm_po;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public Generic generic;

	public WinnerOfTheMonth_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		wotm_po = new WinnerOfTheMonth_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
		exceldata = new ExcelData();
		 generic = new Generic();
	}

	public void WinnerOfTheMonthPageAssertionAction() {
		generic.hardAssertion(cepo.getPageTitleText(), exceldata.getStringData("Goodlife Member", 1, 0));
	}

	public void WinnerOfTheMonthValidationAction() {
		generic.softAssertion(wotm_po.getWinnerName_OfTheMonth(), exceldata.getStringData("Goodlife Member", 1, 1));
		generic.clickOnWebElement(cepo.getBack_icon());
	}

}
