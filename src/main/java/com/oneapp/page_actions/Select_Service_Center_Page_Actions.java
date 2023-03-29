package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.Select_Service_Center_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Select_Service_Center_Page_Actions {
	public AndroidDriver ad;
	public Select_Service_Center_Page_Object sscpo;

	public Select_Service_Center_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		sscpo = new Select_Service_Center_Page_Object(ad);
	}
	
	public void selectingServiceCenterProcessAction() throws InterruptedException
	{
		Generic.clickOnWebElement(sscpo.getList_view_icon());
		Generic.clickOnWebElement(sscpo.getState_box());
		List<WebElement> options = sscpo.getState_typedropdown();
		Generic.itratingOnWebelements(options, "delhi");
		Generic.clickOnWebElement(sscpo.getCity_box());
		List<WebElement> options1 = sscpo.getCity_typedropdown();
		Generic.itratingOnWebelements(options1, "delhi");
		Generic.swiping(512, 1755, 489, 663, 4000);
		
		String Expected ="HIMGIRI AUTOMOBILES (P) LTD.";
		if(sscpo.getHimgiri_service_center().getText().equalsIgnoreCase(Expected))
		{
			Generic.clickOnWebElement(sscpo.getService_center_radio_button());
		}
		
		else {
			Assert.fail("HIMGIRI AUTOMOBILES (P) LTD service center is not available on the page");
		}
	}

}
