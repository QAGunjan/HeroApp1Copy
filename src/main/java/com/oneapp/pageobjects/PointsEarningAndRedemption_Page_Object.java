package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PointsEarningAndRedemption_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/lbl1")  	
	private WebElement MilestoneRewards_text;
	
	public PointsEarningAndRedemption_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getMilestoneRewards_text() {
		return MilestoneRewards_text;
	}

}
