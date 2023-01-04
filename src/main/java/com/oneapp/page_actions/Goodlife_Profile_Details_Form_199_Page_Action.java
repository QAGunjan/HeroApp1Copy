package com.oneapp.page_actions;

import java.time.Duration;

import com.oneapp.pageobjects.Goodlife_Profile_Details_Form_199_Page_Object;
import com.oneapp.pageobjects.Goodlife_Select_Your_Plan_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Goodlife_Profile_Details_Form_199_Page_Action {
	public AndroidDriver ad;
	public Goodlife_Profile_Details_Form_199_Page_Object gpdf_199_po;
	TouchAction ta;
	
	public Goodlife_Profile_Details_Form_199_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		gpdf_199_po = new Goodlife_Profile_Details_Form_199_Page_Object(ad);
	}

	public void Profile_form_199_checkboxes_and_tap_pay_199_button() throws InterruptedException
	{ 
		if(gpdf_199_po.getMy_immediate_family_mem_checkbox().isSelected())
		{
			System.out.println("Immediate family member checkbox is already selected");
		}
		else
		{
			gpdf_199_po.getMy_immediate_family_mem_checkbox().click();
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
			gpdf_199_po.getI_agree_T_and_C_checkbox().click();
		}
		
		gpdf_199_po.getPay_199_button().click();
		Thread.sleep(12000);
	}
}
