package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Object {
	
	@FindBy(id = "com.customerapp.hero:id/reg_no_val_lbl")
	private WebElement vehicleselection;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	private WebElement makeprimary;

	
	@FindBy(id="com.customerapp.hero:id/btn_lbl")
	private WebElement continuebtn_selected_vehicle;
	
	@FindBy(xpath="//*[@text='Book service FSC']")
	private WebElement book_service_vin;
	
	@FindBy(xpath="//*[@text='Goodlife nonmem']")
	private WebElement goodlife_vin;
	
	public Selected_Vehicle_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

//	public WebElement getVehicleselection() {
//		return vehicleselection;
//	}

	public WebElement getMakeprimary() {
		return makeprimary;
	}

	public WebElement getContinuebtn_selected_vehicle() {
		return continuebtn_selected_vehicle;
	}

	public WebElement getBook_service_vin() {
		return book_service_vin;
	}


	public WebElement getGoodlife_vin() {
		return goodlife_vin;
	}

	
	

	



	 
	


}
