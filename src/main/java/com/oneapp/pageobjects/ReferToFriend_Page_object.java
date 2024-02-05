package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReferToFriend_Page_object extends BaseClass {
	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/spinner_vehicle")
	private WebElement selectModel_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> selectModel_typedropdown;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement friendName_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement MobileNumber_field;

	@FindBy(xpath = "//*[@text='We have successfully captured the Referral. Stay Tuned for more update.']")
	private WebElement successfullyReferral_PopUp;

	@FindBy(xpath = "//*[@text='OK']")
	private WebElement Ok_text;

	@FindBy(xpath = "//*[@text='Refer yourself']")
	private WebElement referYourself_link;

	@FindBy(id = "com.customerapp.hero:id/state_sp")
	private WebElement state_box;

	@FindBy(id = "com.customerapp.hero:id/city_sp")
	private WebElement city_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> state_typedropdown;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> city_typedropdown;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement submitButton;

	public ReferToFriend_Page_object(AppiumDriver ad)

	{
		PageFactory.initElements(ad, this);
	}

	public void stateLists(String stateName) throws InterruptedException {
		switch (stateName) {
		case "HARYANA":
			generic.Scrolling("HARYANA");
			break;
		case "PUNJAB":
			generic.Scrolling("PUNJAB");
			break;
		case "SIKKIM":
			generic.Scrolling("SIKKIM");
			break;
		case "DELHI":
			generic.Scrolling("DELHI");
			break;
		case "GOA":
			generic.Scrolling("GOA");
			break;
		default:
			System.out.println("State name does not match");
		}
	}

	public void cityLists(String cityName) throws InterruptedException {
		switch (cityName) {
		case "KARNAL":
			generic.Scrolling("KARNAL");
			break;
		case "BEAS":
			generic.Scrolling("BEAS");
			break;
		case "PELLING":
			generic.Scrolling("PELLING");
			break;
		case "NEW DELHI":
			generic.Scrolling("NEW DELHI");
			break;
		case "BORIM":
			generic.Scrolling("BORIM");
			break;
		default:
			System.out.println("City name does not match");
		}
	}

	public Dashboard_Page_object ReferAFriend(String friendName, String mobileNumber, String stateName, String cityName,
			String modelName) throws InterruptedException {

		generic.sendKeysOnTextfields(friendName_field, friendName);
		generic.sendKeysOnTextfields(MobileNumber_field, mobileNumber);

		generic.clickOnWebElement(state_box);

//		if (stateName.equalsIgnoreCase("haryana")) {
//			generic.Scrolling("HARYANA");
//		}

		stateLists(stateName);

		generic.itratingOnWebelements(state_typedropdown, stateName);

		generic.clickOnWebElement(city_box);

//		if (cityName.equalsIgnoreCase("KARNAL")) {
//			generic.Scrolling("KARNAL");
//		}

		cityLists(cityName);

		generic.itratingOnWebelements(city_typedropdown, cityName);

		generic.clickOnWebElement(selectModel_box);

		if (modelName.equalsIgnoreCase("Xpulse 200")) {
			generic.Scrolling("Xpulse 200");
		}

		generic.itratingOnWebelements(selectModel_typedropdown, modelName);

		generic.clickOnWebElement(submitButton);

		Thread.sleep(8000);

		return new Dashboard_Page_object(ad);
	}

}
