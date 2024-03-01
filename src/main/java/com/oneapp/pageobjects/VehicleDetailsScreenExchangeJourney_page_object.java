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

public class VehicleDetailsScreenExchangeJourney_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/tV1")
	private WebElement VehicleDetailsText;

	@FindBy(id = "com.customerapp.hero:id/registrationDateTv")
	private WebElement ChooseCityWhereYouWantToSellTheVehicleText;

	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	private WebElement CityToSellVehicleTextfield;

	@FindBy(id = "com.customerapp.hero:id/vehicle_nameTV")
	private WebElement newDelhiSuggestionText;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.LinearLayout)[2]//android.widget.EditText")
	private WebElement pinCodeTextField;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[6]")
	private WebElement nextButton;

	public VehicleDetailsScreenExchangeJourney_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void enterCityToSellVehicle() {
		generic.sendKeysOnTextfields(CityToSellVehicleTextfield, "new delhi");
	}

	public void clickOnSuggestions() {
		generic.clickOnWebElement(newDelhiSuggestionText);
	}

	public void enterPinCode() {
		generic.sendKeysOnTextfields(pinCodeTextField, "110091");
	}

	public VehicleConditionScreenExchangeJourney_page_object clickOnNextButton() {
		generic.clickOnWebElement(nextButton);
		
		return new VehicleConditionScreenExchangeJourney_page_object(ad);
	}

}
