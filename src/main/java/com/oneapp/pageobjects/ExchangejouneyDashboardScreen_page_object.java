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

public class ExchangejouneyDashboardScreen_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/exchange_intro_msg")
	private WebElement IntroducingIndiaNewAgePhysical2wheelerResalePlatformText;

	@FindBy(id = "com.customerapp.hero:id/exchange_benefitsTv")
	private WebElement ExchangeBenefitsUpTo₹4000Text;

	@FindBy(id = "com.customerapp.hero:id/choose_vehicle_estimateTv")
	private WebElement ChooseVehicleForWhichYouWantToGetEstimatedPriceText;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup)[1]")
	private WebElement VehicleSelectForExchangeJouney;

	public ExchangejouneyDashboardScreen_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public VehicleDetailsScreenExchangeJourney_page_object SelectVehicle() {
		generic.clickOnWebElement(VehicleSelectForExchangeJouney);

		return new VehicleDetailsScreenExchangeJourney_page_object(ad);
	}

}
