package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VehicleConditionScreenExchangeJourney_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/tV2")
	private WebElement VehicleConditionText;

	@FindBy(id = "com.customerapp.hero:id/identify_tv1")
	private WebElement IdentifyYourVehicleConditionText;

	@FindBys({ @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.TextView") })
	private List<WebElement> SeactionBoxHeading;

	@FindBys({ @FindBy(xpath = "//android.view.ViewGroup//android.widget.RadioGroup//android.widget.RadioButton") })
	private List<WebElement> SeactionSelectText;

	@FindBy(xpath = "((//androidx.recyclerview.widget.RecyclerView//android.widget.RadioGroup)[2]//android.widget.RadioButton)[2]")
	private WebElement RearTyerConditionSelection;

	@FindBy(xpath = "//*[@text='No Smoke']")
	private WebElement noSmokeSelectionText;

	@FindBy(xpath = "//*[@text='Not Starting']")
	private WebElement notStartingSelectionText;

	@FindBy(xpath = "//*[@text='Not Working']")
	private WebElement notWorkingSelectionText;

	@FindBy(xpath = "//*[@text='OK']")
	private WebElement oKSelectionText;

	@FindBy(xpath = "((//android.view.ViewGroup//android.widget.RadioGroup)[2]//android.widget.RadioButton)[2]")
	private WebElement wornOutCrackPuntureSelectionText;

	@FindBy(xpath = "//*[@text='Scratch / Dent / Cracks']")
	private WebElement ScratchDentCracksSelectionText;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[10]")
	private WebElement nextButton;

	public VehicleConditionScreenExchangeJourney_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void identifyVehicleConditions(String VehicleConditionHeading) throws InterruptedException {

		switch (VehicleConditionHeading) {
		case "Smoke":
			generic.clickOnWebElement(noSmokeSelectionText);
			Thread.sleep(2000);
			break;
		case "Starting":
			generic.clickOnWebElement(notStartingSelectionText);
			Thread.sleep(2000);
			break;
		case "Light Indicator":
			generic.clickOnWebElement(notWorkingSelectionText);
			Thread.sleep(2000);
			break;
		case "Front Tyre":
			generic.clickOnWebElement(oKSelectionText);
			Thread.sleep(2000);
			break;
		case "Rear Tyre":
			generic.clickOnWebElement(wornOutCrackPuntureSelectionText);
			Thread.sleep(2000);
			break;
		case "Body Part":
			generic.clickOnWebElement(ScratchDentCracksSelectionText);
			Thread.sleep(2000);
			break;
		default:
			System.out.println("Vehicle Condition is not available");
		}
	}

	public FinalScreenExchangeJourney_page_object clickOnNextButton() {
		generic.clickOnWebElement(nextButton);

		return new FinalScreenExchangeJourney_page_object(ad);
	}

}
