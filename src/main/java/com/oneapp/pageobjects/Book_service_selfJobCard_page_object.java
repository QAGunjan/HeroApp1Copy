package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Book_service_selfJobCard_page_object {
	
	@FindBy(id="com.customerapp.hero:id/title")
	private WebElement self_job_card_text;
	
	@FindBy(id="com.customerapp.hero:id/keyType")
	private WebElement Key_issues_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement service_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement service_radio_button;
	
	@FindBy(id="com.customerapp.hero:id/otherIssuesEdt")
	private WebElement other_issues_textbox;
	
	@FindBy(id="com.customerapp.hero:id/btn_lbl")
	private WebElement book_service_btn;
	
	
	public Book_service_selfJobCard_page_object(AppiumDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}

	public WebElement getSelf_job_card_text() {
		return self_job_card_text;
	}

	public WebElement getKey_issues_text() {
		return Key_issues_text;
	}

	public WebElement getService_text() {
		return service_text;
	}

	public WebElement getService_radio_button() {
		return service_radio_button;
	}

	public WebElement getOther_issues_textbox() {
		return other_issues_textbox;
	}

	public WebElement getBook_service_btn() {
		return book_service_btn;
	}
	
	

}
