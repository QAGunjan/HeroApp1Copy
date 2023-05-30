package com.oneapp.page_actions;

import java.time.Duration;

import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_199_Page_Object;
import com.oneapp.pageobjects.Goodlife_Select_Your_Plan_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Goodlife_Profile_Details_Form_199_Page_Action {
	public AppiumDriver ad;
	public Goodlife_Profile_Details_Form_199_Page_Object gpdf_199_po;
	TouchAction ta;
	public CommonElements_Page_object cepo;
	public Generic generic;
	
	public Goodlife_Profile_Details_Form_199_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		gpdf_199_po = new Goodlife_Profile_Details_Form_199_Page_Object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		generic = new Generic();

	}

	public void profileForm199PlanProcessAction() throws InterruptedException
	{ 
		if(gpdf_199_po.getMy_immediate_family_mem_checkbox().isSelected())
		{
			System.out.println("Immediate family member checkbox is already selected");
		}
		else
		{
			generic.clickOnWebElement(gpdf_199_po.getMy_immediate_family_mem_checkbox());
		}
		
		ta = new TouchAction(ad);
		ta.press(PointOption.point(549, 1546)).moveTo(PointOption.point(549, 1114))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(6000))).release().perform();
		Thread.sleep(4000);
		
		if(gpdf_199_po.getI_agree_T_and_C_checkbox().isSelected())
		{
			System.out.println("I agree terms and condition checkbox is already selected");
		}
		else
		{
			generic.clickOnWebElement(gpdf_199_po.getI_agree_T_and_C_checkbox());
		}
		
		generic.clickOnWebElement(cepo.getbutton());
	}
}
