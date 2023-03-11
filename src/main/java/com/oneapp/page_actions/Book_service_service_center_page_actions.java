package com.oneapp.page_actions;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Vehicle_Service_page_object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Book_service_service_center_page_actions {
	
	public AndroidDriver ad;
	public Book_service_service_center_page_object bsscpo;
	public CommonElements_Page_object cepo;


	public Book_service_service_center_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bsscpo = new Book_service_service_center_page_object(ad);
		cepo= new CommonElements_Page_object(ad);

	}
	
	public void Select_Service_Center() throws InterruptedException
	{
		Generic.click_on_WebElement(bsscpo.getSelect_service_center_textbox());
	}
	
	public void selecting_ServiceType() throws InterruptedException
	{
		if (bsscpo.getService_Type_radio_button().isSelected())
		{
			System.out.println("FSC is already selected. Thanks! ");
		}
		
		else
		{
			Generic.click_on_WebElement(bsscpo.getService_Type_radio_button());
			System.out.println(" FSC was not selected but now selected. Thanks! ");
		}
		
	}
	
	public void assertion_on_continue_without_internet()
	{
		Generic.Soft_assertion_validation(cepo.getToast_message(),"Please check your network connection." );
	}
	
	public void turning_OFF_the_internet()
	{
		Generic.WifiOff();
	}
	
	public void turning_ON_the_internet()
	{
		Generic.WifiOn();
	}
	
	
	public void tapping_on_continue_button()
	{
		Generic.click_on_WebElement(bsscpo.getContinue_btn());
	}
	
	public void Verifying_service_type()
	{
		String Expected = "You have consumed all your free services, Please select other service.";
		if (cepo.getToast_message().getText().equalsIgnoreCase(Expected));
		{
			Generic.click_on_WebElement(bsscpo.getPaid_service_radio_button());
			Generic.click_on_WebElement(bsscpo.getContinue_btn());
		}
		
	}
	
}
