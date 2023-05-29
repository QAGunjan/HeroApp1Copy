package com.oneapp.page_actions;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Vehicle_Service_page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Book_service_service_center_page_actions {
	
	public AndroidDriver ad;
	public Book_service_service_center_page_object bsscpo;
	public CommonElements_Page_object cepo;
	public ConfigData configdata;
	public Generic generic;

	public Book_service_service_center_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bsscpo = new Book_service_service_center_page_object(ad);
		cepo= new CommonElements_Page_object(ad);
		configdata = new ConfigData();
		generic = new Generic();

	}
	
	public void clickServiceCenterfieldAction() throws InterruptedException
	{
		generic.clickOnWebElement(bsscpo.getSelect_service_center_textbox());
	}
	
	public void serviceTypeRadioButtonAction() throws InterruptedException
	{
		if (bsscpo.getService_Type_radio_button().isSelected())
		{
			System.out.println("FSC is already selected. Thanks! ");
		}
		
		else
		{
			generic.clickOnWebElement(bsscpo.getService_Type_radio_button());
			System.out.println(" FSC was not selected but now selected. Thanks! ");
		}
		
	}
	
	public void continueWithNoInterneAction()
	{
		generic.softAssertion(cepo.getToast_message(), configdata.getcontinueWithNoInternetExpected());
	}
	
	public void turnOFFInternetAction()
	{
		generic.WifiOff();
	}
	
	public void turnONInternetAction()
	{
		generic.WifiOn();
	}
	
	
	public void clickContinueButtonAction()
	{
		generic.clickOnWebElement(cepo.getbutton());
	}
	
	public void validatingServiceTypeAction()
	{
		String Expected = configdata.getvalidatingServiceTypeExpected();
		if (cepo.getToast_message().getText().equalsIgnoreCase(Expected));
		{
			generic.clickOnWebElement(bsscpo.getPaid_service_radio_button());
			generic.clickOnWebElement(cepo.getbutton());
		}
		
	}
	
}
