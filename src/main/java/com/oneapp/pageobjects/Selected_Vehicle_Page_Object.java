package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Selected_Vehicle_Page_Object extends BaseClass {

	public Generic generic = new Generic();
	
	@FindBy(id = "com.customerapp.hero:id/reg_no_val_lbl")
	private WebElement vehicleselection;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	private WebElement makeprimary;

	@FindBy(xpath = "//*[@text='goodlife member']")
	private WebElement goodlife_membership_vin;

	@FindBy(xpath = "//*[@text='book service paid']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"book service paid\"]")

	private WebElement book_service_PAID_vin;

	@FindAll({
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView[3]"),
			@FindBy(id = "com.customerapp.hero:id/ic_edit") })
	private WebElement Edit_Icon_FirstVin;

	@FindBy(id = "com.customerapp.hero:id/normal_text_input_layout")
	private WebElement NickName_TextField;

	@FindBy(id = "com.customerapp.hero:id/lbl2")

	private WebElement YouWillAlwaysSeePrimaryVehicleDetails_Text;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement continueBtn;

	Selected_Vehicle_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public Dashboard_Page_object vinSelection() throws InterruptedException {
		if (book_service_PAID_vin.getText().contains("book")) {
			generic.clickOnWebElement(book_service_PAID_vin);
		}

		generic.clickOnWebElement(continueBtn);

		return new Dashboard_Page_object(ad);

	}
}
