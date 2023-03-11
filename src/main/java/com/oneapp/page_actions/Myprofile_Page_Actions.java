package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Myprofile_Page_Actions {

	public AndroidDriver ad;
	public MyProfile_Page_Object mppo;
	public ExcelData exceldata;
	public CommonElements_Page_object cepo;


	public Myprofile_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		mppo = new MyProfile_Page_Object(ad);
		exceldata = new ExcelData();
		cepo= new CommonElements_Page_object(ad);
	}

	public void Profiledetails_val() throws InterruptedException {
		try {
		Generic.Soft_assertion_validation(mppo.getProfiledetails_text(), "Profile Details");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled" + e);
		}
		Generic.click_on_WebElement(mppo.getMoredetails_link());
		Generic.click_on_WebElement(mppo.getEditprofile_details_btn());
	}

	public void click_back_icon() throws InterruptedException
	{
		Thread.sleep(4000);
		Generic.click_on_WebElement(cepo.getBack_icon());
	}
	public void profile_details_after_saving_validation()

	{
		Generic.click_on_WebElement(mppo.getMoredetails_link());
		
		String expected_address = exceldata.getStringData("My Profile", 3, 1);
		
		if (mppo.getAddress_val().getText().equalsIgnoreCase(expected_address)) {
			Assert.assertEquals(mppo.getAddress_val().getText(), expected_address);
			Reporter.log("AFTER SAVING MY PROFILE DETAILS", true);
			Reporter.log(mppo.getAddress_val().getText(), true);
			String expected_gender = "Female";
			Assert.assertEquals(mppo.getGender_val().getText(), expected_gender);
			Reporter.log(mppo.getGender_val().getText(), true);
		}

		else {
			Reporter.log("Address field is blank", true);
		}

	}
	
	public void Emergency_contact() throws InterruptedException
	{
		Generic.click_on_WebElement(mppo.getEmergency_contact_txt());
	
	}
	
	public void click_manage_licence()
	{
		Generic.click_on_WebElement(mppo.getManage_license_text());
	}

}
