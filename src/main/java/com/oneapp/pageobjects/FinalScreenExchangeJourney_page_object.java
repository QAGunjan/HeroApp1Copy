package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FinalScreenExchangeJourney_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/bike_nameTv")
	private WebElement VehicleNameText;

	@FindBy(id = "com.customerapp.hero:id/rg_dateTv")
	private WebElement MonthAndYearText;

	@FindBy(id = "com.customerapp.hero:id/locationTv")
	private WebElement LocationText;

	public FinalScreenExchangeJourney_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}
	
	
	

}
