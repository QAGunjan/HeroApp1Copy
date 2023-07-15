package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RelationshipManager_Page_Object extends BaseClass{

	@AndroidFindBy(xpath = "//*[@text='GoodLife']")
	private MobileElement goodlife_icon;

	@AndroidFindBy(id = "com.customerapp.hero:id/noDataTitle")
	private MobileElement noDataFound;

	@AndroidFindBy(xpath = "//*[@text='TSM']")
	private MobileElement TSM_text;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private MobileElement TSM_email;



	public MobileElement getNoDataFound() {
		return noDataFound;
	}

	public MobileElement getTSM_text() {
		return TSM_text;
	}

	public MobileElement getTSM_email() {
		return TSM_email;
	}

}