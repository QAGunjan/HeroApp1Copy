package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Select_Service_Center_Page_Object {

	@FindBy(id="com.customerapp.hero:id/floating_button2")
	private WebElement list_view_icon;
	
	
	@FindBy(id="com.customerapp.hero:id/state_sp")
	private WebElement state_box;
	
	@FindBy(id="com.customerapp.hero:id/city_sp")
	private WebElement city_box;
	
	@FindBys({ 
		@FindBy(className = "android.widget.TextView") 
		})
	private List<WebElement> state_typedropdown;
	
	@FindBys({ 
		@FindBy(className = "android.widget.TextView") 
		})
	private List<WebElement> city_typedropdown;
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView")
	private WebElement service_center_radio_button;
	
	
	@FindBy(xpath="//*[@text='HIMGIRI AUTOMOBILES (P) LTD.']")
	private WebElement himgiri_service_center;
	
	public Select_Service_Center_Page_Object(AppiumDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}



	public WebElement getList_view_icon() {
		return list_view_icon;
	}



	public WebElement getState_box() {
		return state_box;
	}



	public WebElement getCity_box() {
		return city_box;
	}



	public List<WebElement> getState_typedropdown() {
		return state_typedropdown;
	}



	public List<WebElement> getCity_typedropdown() {
		return city_typedropdown;
	}



	public WebElement getService_center_radio_button() {
		return service_center_radio_button;
	}



	public WebElement getHimgiri_service_center() {
		return himgiri_service_center;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

