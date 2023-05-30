package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/reg_no_val_lbl")
	private WebElement vehicleselection;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	private WebElement makeprimary;

	@FindBy(xpath = "//*[@text='goodlife member']")
	private WebElement goodlife_membership_vin;

	@FindBy(xpath = "//*[@text='book service paid']")
	private WebElement book_service_PAID_vin;

	@FindAll ({
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView[3]"),
	@FindBy(id ="com.customerapp.hero:id/ic_edit")
	})
	private WebElement Edit_Icon_FirstVin;

	@FindBy(id = "com.customerapp.hero:id/normal_text_input_layout")
	private WebElement NickName_TextField;

	public Selected_Vehicle_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

//	public WebElement getVehicleselection() {
//		return vehicleselection;
//	}

	public WebElement getMakeprimary() {
		return makeprimary;
	}

	public WebElement getGoodlife_membership_vin() {
		return goodlife_membership_vin;
	}

	public WebElement getbook_service_PAID_vin() {
		return book_service_PAID_vin;
	}

	public WebElement getEdit_Icon_FirstVin() {
		return Edit_Icon_FirstVin;
	}

	public WebElement getNickName_TextField() {
		return NickName_TextField;
	}

	
}
