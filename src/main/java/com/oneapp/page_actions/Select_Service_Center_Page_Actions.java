package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.Select_Service_Center_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Select_Service_Center_Page_Actions {
	public AppiumDriver ad;
	public Select_Service_Center_Page_Object sscpo;
	public ConfigData configdata;
	public Generic generic;


	public Select_Service_Center_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		sscpo = new Select_Service_Center_Page_Object(ad2);
		configdata	= new ConfigData();
		generic = new Generic();

	}
	
	public void selectingServiceCenterProcessAction() throws InterruptedException
	{
		generic.clickOnWebElement(sscpo.getList_view_icon());
		generic.clickOnWebElement(sscpo.getState_box());
		List<WebElement> options = sscpo.getState_typedropdown();
		generic.itratingOnWebelements(options, "delhi");
		generic.clickOnWebElement(sscpo.getCity_box());
		List<WebElement> options1 = sscpo.getCity_typedropdown();
		generic.itratingOnWebelements(options1, "delhi");
		generic.swiping(512, 1755, 489, 663, 4000);
		
		String Expected = configdata.getserviceCenterExpected();
		if(sscpo.getHimgiri_service_center().getText().equalsIgnoreCase(Expected))
		{
			generic.clickOnWebElement(sscpo.getService_center_radio_button());
		}
		
		else {
			Assert.fail("HIMGIRI AUTOMOBILES (P) LTD service center is not available on the page");
		}
	}

}
