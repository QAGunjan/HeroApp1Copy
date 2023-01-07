package com.oneapp.page_actions;


import org.openqa.selenium.WebElement;

import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;


public class OTP_Page_Actions {
	
public AndroidDriver ad;
	
	public OTP_Page_Object opo;
	
	public OTP_Page_Actions(AndroidDriver ad)
	{
		this.ad=ad;
		opo=new OTP_Page_Object(ad);
	}
	
	
	public void Validate_OTP()
	{
		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");
		

		 opo.getVerifybtn().click();
		 System.out.println("I get the vehicle selected page");
		
	}
	
	 public void Click_edit()
	 {
		 opo.getEdit_button().click();
	 }
	
	
	
}

	
	
	
