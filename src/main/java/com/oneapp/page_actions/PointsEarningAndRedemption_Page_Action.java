package com.oneapp.page_actions;

import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.PointsEarningAndRedemption_Page_Object;
import com.oneapp.pageobjects.WinnerOfTheMonth_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;

import io.appium.java_client.android.AndroidDriver;

public class PointsEarningAndRedemption_Page_Action {
	
	public AndroidDriver ad;
	public PointsEarningAndRedemption_Page_Object pear_po;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public ConfigData configdata;
	public Generic generic;


	public PointsEarningAndRedemption_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		pear_po = new PointsEarningAndRedemption_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
		exceldata = new ExcelData();
		configdata	= new ConfigData();
		generic = new Generic();
	}

	public void pointsEarningAndRedemptionPageAssertionAction()
	{
		generic.hardAssertion(cepo.getPageTitleText(), configdata.getpointsEarningAndRedemptionPageTitleExpected());  	
	}
	
	public void pointsEarningAndRedemptionValidationsAction()
	{
		generic.softAssertion(pear_po.getMilestoneRewards_text(), configdata.getpointsEarningAndRedemptionPageTextExpected());
	}	
	

}
