package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Emergency_contact_page_actions {
	
	public AndroidDriver ad;
	public Emerygency_contacts_page_objects ecpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;



	public Emergency_contact_page_actions(AndroidDriver ad) {
		this.ad = ad;
		ecpo = new Emerygency_contacts_page_objects(ad);
		cepo= new CommonElements_Page_object(ad);
		exceldata = new ExcelData();

	}
	
	public void Adding_emergency_contact()
	{
		Generic.click_on_WebElement(ecpo.getAdd_emergency_contact_link());
		
		try {
			
		
		if (cepo.getallowing_commom_popup_honor().isDisplayed())
		{
			Generic.click_on_WebElement(cepo.getallowing_commom_popup_honor());
		}
		else
		{
			
		}
		
		if(ecpo.getContact_allowing_popup().isDisplayed())
		{
			Generic.click_on_WebElement(ecpo.getAllow_btn());
		}
		else 
		{
			System.out.println("Contact_allow_pop_up not displaying");
		}	
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	
	public void click_create_new_contact()
	{
		Generic.click_on_WebElement(ecpo.getCreate_text());
	}
	
	public void saved_contact_val()
	{
		String expected_mob_num= exceldata.getStringData("Emergency_contact", 4, 1);
		if (ecpo.getSaved_mob_number_contact().getText().equalsIgnoreCase(expected_mob_num))
		{
			Generic.Hard_assertion_validation(ecpo.getSaved_mob_number_contact(), expected_mob_num);
		Reporter.log(ecpo.getSaved_mob_number_contact().getText(), true);
		}
	}

	public void deleting_contact() throws InterruptedException
	{
		 ta = new TouchAction(ad);
		Generic.click_on_WebElement(ecpo.getThreedots_besides_contact_num());
		 Generic.Tap_on_WebElement(769, 614);
		 Generic.click_on_WebElement(ecpo.getDelete_btn());
	}
	
	public void validation_of_deleting_contact()
	{
		Generic.Hard_assertion_validation(ecpo.getAdd_emergency_contact_link(), exceldata.getStringData("Emergency_contact", 19, 1));
	}
	
	public void click_back_icon() throws InterruptedException
	{
		Thread.sleep(4000);
		Generic.click_on_WebElement(cepo.getBack_icon());
	}
	
	public void Tapping_on_new_contact_plus_icon()
	{
		Generic.Tap_on_WebElement(994, 176);
	}
	
	
}
