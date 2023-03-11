package com.oneapp.page_actions;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_199_Page_Object;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_299_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Profile_Details_Form_299_Page_Action {
	
	public AndroidDriver ad;
	public Goodlife_Profile_Details_Form_299_Page_Object gpdf_299_po;
	public ExcelData exceldata;
	
	public Goodlife_Profile_Details_Form_299_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		gpdf_299_po = new Goodlife_Profile_Details_Form_299_Page_Object(ad);
		exceldata = new ExcelData();
	}

	
	public void validation_of_299Plan_owner_radio_button()
	{
		if(gpdf_299_po.getOwner_selection_radio_button().isSelected())
		{
			System.out.println("Owner is already selected. Thanks!");
		}
		
		else
		{
			Generic.click_on_WebElement(gpdf_299_po.getOwner_selection_radio_button());
			System.out.println("Now, owner is getting selected. Thanks!");
		}
	}
	
	
	public void validation_of_299plan_mobileNumber_field()
	{
		Generic.isClickable(gpdf_299_po.getMobileNumber_field_299Plan());
				
		}
	
	public void validation_of_299Plan_address_field()
	{  
		Generic.Soft_assertion_validation(gpdf_299_po.getAddress_field_299Plan(), exceldata.getStringData("My Profile", 3, 1));
	}
	
	public void tapping_on_continue_button()
	{
		Generic.swiping(542, 1565, 535, 715, 4000);
		Generic.click_on_WebElement(gpdf_299_po.getContinue_button());
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
