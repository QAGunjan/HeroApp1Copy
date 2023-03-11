package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Plans_Page_Object {

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement viewallbenefits_goodlife_199Plans;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement viewallbenefits_goodlife_299Plans;
	
	
	public Goodlife_Plans_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}


	public WebElement getViewallbenefits_goodlife_199Plans() {
		return viewallbenefits_goodlife_199Plans;
	}


	public WebElement getViewallbenefits_goodlife_299Plans() {
		return viewallbenefits_goodlife_299Plans;
	}

	

	


}
