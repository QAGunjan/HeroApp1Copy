package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Myprofile_Page_Actions {

	public AppiumDriver ad;
	public MyProfile_Page_Object mppo;
	public ExcelData exceldata;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;


	public Myprofile_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		mppo = new MyProfile_Page_Object(ad2);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad2);
		configdata	= new ConfigData();
		generic = new Generic();

	}

	public void profileDetailsvalidateAction() throws InterruptedException {

		try {
			generic.hardAssertion(cepo.getPageTitleText(), configdata.getprofileDetailsPageTitleExpected());
			generic.clickOnWebElement(mppo.getMoredetails_link());
			generic.clickOnWebElement(cepo.getbutton());
		} 
		catch (Exception e)
		{
			TestUtils.log().debug(e);
		}
	}

	public void clickBackIconAction() throws InterruptedException {
		Thread.sleep(4000);
		generic.clickOnWebElement(cepo.getBack_icon());
	}

	public void profileDetailsAfterSavingValidationAction()

	{
		generic.clickOnWebElement(mppo.getMoredetails_link());

		String expected_address = exceldata.getStringData("My Profile", 4, 1);
		generic.hardAssertion(mppo.getAddress_val(), expected_address);
		System.out.println(expected_address);

//		if (mppo.getAddress_val().getText().equalsIgnoreCase(expected_address)) {
//			Assert.assertEquals(mppo.getAddress_val().getText(), expected_address);
//			Reporter.log("AFTER SAVING MY PROFILE DETAILS", true);
//			Reporter.log(mppo.getAddress_val().getText(), true);
//			String expected_gender = "Female";
//			Assert.assertEquals(mppo.getGender_val().getText(), expected_gender);
//			Reporter.log(mppo.getGender_val().getText(), true);
//		}
//
//		else {
//			Reporter.log("Address field is blank", true);
//		}

	}
	
	public void clickEmergencyContactAction() throws InterruptedException {
		generic.clickOnWebElement(mppo.getEmergency_contact_txt());
	}

	public void clickManageLicenceAction() {
		generic.clickOnWebElement(mppo.getManage_license_text());
	}

}
