package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Emergency_contact_page_actions {

	public AppiumDriver ad;
	public Emerygency_contacts_page_objects ecpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public ConfigData configdata;
	public Generic generic;


	public Emergency_contact_page_actions(AppiumDriver ad2) {
		this.ad = ad2;
		ecpo = new Emerygency_contacts_page_objects(ad2);
		cepo = new CommonElements_Page_object(ad2);
		exceldata = new ExcelData();
		configdata	= new ConfigData();
		generic = new Generic();
		
	}
	
	

	public void clickAddingEmergencyContactLinkAction() {
		generic.clickOnWebElement(ecpo.getAdd_emergency_contact_link());

//		try {
//
//			if (cepo.getallowing_commom_popup_honor().isDisplayed()) {
//				Generic.click_on_WebElement(cepo.getallowing_commom_popup_honor());
//			} else {
//
//			}
//
//			if (ecpo.getContact_allowing_popup().isDisplayed()) {
//				Generic.click_on_WebElement(ecpo.getAllow_btn());
//			} else {
//				TestUtils.log().debug("Contact_allow_pop_up not displaying");
//			}
//		} catch (Exception e) {
//
//		}
//
		try {
		if (ecpo.getContact_acess_popUpSamsung().isDisplayed())
		{
			generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
		}
		}catch(Exception e)
		{
			TestUtils.log().debug("Contact Acess pop up is not displaying");
		}
		
	}

	public void clickCreateNewContactAction() {
		generic.clickOnWebElement(ecpo.getCreate_text());
	}

	public void contactValidationAction() {
		String expected_mob_num = exceldata.getStringData("Emergency_contact", 4, 1);
		if (ecpo.getSaved_mob_number_contact().getText().equalsIgnoreCase(expected_mob_num)) {
			generic.hardAssertion(ecpo.getSaved_mob_number_contact(), expected_mob_num);
			Reporter.log(ecpo.getSaved_mob_number_contact().getText(), true);
		}
	}

	public void deletingSavedContactAction() throws InterruptedException {
		ta = new TouchAction(ad);
		generic.clickOnWebElement(ecpo.getThreedots_besides_contact_num());
		generic.tappingOnWebelement(769, 614);
		generic.clickOnWebElement(ecpo.getDelete_btn());
	}

	public void deletingContactAssertionAction() {
		generic.hardAssertion(ecpo.getAdd_emergency_contact_link(),configdata.getdeletingContactPageExpected());
	}

	public void clickBackIconAction() throws InterruptedException {
		Thread.sleep(4000);
		generic.clickOnWebElement(cepo.getBack_icon());
	}

	public void tappingNewContactPlusIconAction() throws InterruptedException {
		Thread.sleep(5000);
		generic.clickOnWebElement(ecpo.getEmerygencyContactPlusIcon());
	}

}
