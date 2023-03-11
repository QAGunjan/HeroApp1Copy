package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Driving_License_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Driving_License_Page_Actions {
	
	public AndroidDriver ad;
	public Driving_License_Page_Object dlpo;
    public TouchAction ta;
	public CommonElements_Page_object cepo;

    
	public Driving_License_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		dlpo = new Driving_License_Page_Object(ad);
		cepo= new CommonElements_Page_object(ad);

	}
	
	public void click_three_dots()
	{
		Generic.click_on_WebElement(dlpo.getThree_dots());
	}
	
	public void uploading_new() throws InterruptedException, IOException
	{
		 ta = new TouchAction(ad);
		 Thread.sleep(3000);
		 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(819, 277))).perform();
		 
		 try {
			 Generic.click_on_WebElement(cepo.getallowing_commom_popup_honor());
			 Generic.click_on_WebElement(cepo.getallowing_commom_popup_honor());
			 Generic.click_on_WebElement(dlpo.getTake_pictures_pop_up());
			 Generic.click_on_WebElement( dlpo.getAcess_photos_and_medio_pop_up());
//			 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(819, 277))).perform(); - for emulator
			 
		 } catch (Exception e) {
			  System.out.println();
			}
		 
		 Generic.click_on_WebElement(dlpo.getThree_dots());
		 Generic.Tap_on_WebElement(819, 277);
		 Generic.click_on_WebElement(dlpo.getChoose_from_library_btn());
		 ad.pushFile("/sdcard/Download/Pika.jpg", new File("D:\\JAVA\\Pika.jpg"));
		 ad.pullFile("/sdcard/Download/Pika.jpg");
//		 Generic.click_on_WebElement(dlpo.getImage_under_emulator());  for emulator
		 Generic.click_on_WebElement(dlpo.getImage_under_realDevice());   // for real devices
		 Generic.click_on_WebElement(dlpo.getCrop_image());
	}
	
	public void Turning_off_the_internet()
	{
		Generic.WifiOff();
	}
	
	public void turning_ON_the_internet()
	{
		Generic.WifiOn();
	}
	public void downloading_licence()
	{
		Generic.click_on_WebElement(dlpo.getThree_dots());
		Generic.Tap_on_WebElement(794,523);
	}
	
	public void assertion_of_downloaded_license()
	{
		Generic.Soft_assertion_validation(cepo.getToast_message(), "Download Completed");
	}
	
	public void sharing_license()
	{
		Generic.click_on_WebElement(dlpo.getThree_dots());
		Generic.Tap_on_WebElement(769,398);
	}
	
	public void assertion_of_sharing_license()
	{
		Generic.Soft_assertion_validation(cepo.getToast_message(),"No recommended people to share with");
	}
	
	public void click_back_button()
	{
		Generic.click_on_WebElement(cepo.getBack_icon());
	}

	public void assertion_of_uploading_license_without_internet()
	{
	   Generic.Soft_assertion_validation(cepo.getToast_message(), "Please check your network connection.");
	}
	
	public void assertion_of_downloading_license_without_internet()
	{
		Generic.Soft_assertion_validation(cepo.getToast_message(), "Please check your network connection.");
	}
	
	
	
	
}
