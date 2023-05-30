package com.oneapp.page_actions;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_199_Page_Object;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_299_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Profile_Details_Form_299_Page_Action {
	
	public AppiumDriver ad;
	public Goodlife_Profile_Details_Form_299_Page_Object gpdf_299_po;
	public ExcelData exceldata;
	public Generic generic;
	
	public Goodlife_Profile_Details_Form_299_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		gpdf_299_po = new Goodlife_Profile_Details_Form_299_Page_Object(ad2);
		exceldata = new ExcelData();
		generic = new Generic();
	}

	public void validation299PlanOwnerRadioButtonAction()
	{
		if(gpdf_299_po.getOwner_selection_radio_button().isSelected())
		{
			TestUtils.log().debug("Owner is already selected. Thanks!");
		}
		
		else
		{
			generic.clickOnWebElement(gpdf_299_po.getOwner_selection_radio_button());
			TestUtils.log().debug("Now, owner is getting selected. Thanks!");
		}
	}
	
	public void valition299PlanMobileNumberFieldAssertionAction()
	{
		generic.isClickable(gpdf_299_po.getMobileNumber_field_299Plan());
				
		}
	
	public void addressField299PlanAssertionAction()
	{  
		generic.softAssertion(gpdf_299_po.getAddress_field_299Plan(), exceldata.getStringData("My Profile", 4, 1));
	}
	
	public void clickContinueButtonAction() throws InterruptedException
	{
		generic.swiping(542, 1565, 535, 715, 4000);
		generic.clickOnWebElement(gpdf_299_po.getContinue_button());
		Thread.sleep(6000);
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
