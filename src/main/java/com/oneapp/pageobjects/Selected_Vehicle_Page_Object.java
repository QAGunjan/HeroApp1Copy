package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Selected_Vehicle_Page_Object extends BaseClass {

	@AndroidFindBy(id = "com.customerapp.hero:id/reg_no_val_lbl")
	private MobileElement vehicleselection;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	private MobileElement makeprimary;

	@AndroidFindBy(xpath = "//*[@text='goodlife member']")
	private MobileElement goodlife_membership_vin;

	@AndroidFindBy(xpath = "//*[@text='book service paid']")
	private MobileElement book_service_PAID_vin;

	@FindAll({
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView[3]"),
			@FindBy(id = "com.customerapp.hero:id/ic_edit") })
	private WebElement Edit_Icon_FirstVin;

	@AndroidFindBy(id = "com.customerapp.hero:id/normal_text_input_layout")
	private MobileElement NickName_TextField;

	public MobileElement getMakeprimary() {
		return makeprimary;
	}

	public MobileElement getGoodlife_membership_vin() {
		return goodlife_membership_vin;
	}

	public MobileElement getbook_service_PAID_vin() {
		return book_service_PAID_vin;
	}

	public WebElement getEdit_Icon_FirstVin() {
		return Edit_Icon_FirstVin;
	}

	public MobileElement getNickName_TextField() {
		return NickName_TextField;
	}

}
