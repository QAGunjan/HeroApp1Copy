package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RelationshipManager_Page_Object extends BaseClass {

	@FindBy(xpath = "//*[@text='GoodLife']")
	private WebElement goodlife_icon;

	@FindBy(id = "com.customerapp.hero:id/noDataTitle")
	private WebElement noDataFound;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[7]")
	private WebElement TSM_text;

	@FindBy(xpath = "(//android.view.ViewGroup)[10]/child::android.widget.TextView[3]")
	private WebElement TSM_email;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[5]")
	private WebElement otherContact_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[10]")
	private WebElement AreaSalesManager_Text;

	
}
