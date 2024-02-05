package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookServiceDetailsPage_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(xpath = "//android.widget.TextView[@index='10']")
	private WebElement selectaTimeText;

	@FindBy(id = "com.customerapp.hero:id/slider_time")
	private WebElement slider;

	@FindBy(id = "com.customerapp.hero:id/tv_service_center")
	private WebElement serviceCenterText;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement reviewServiceDetailsButton;

	@FindBy(id = "com.customerapp.hero:id/serviceCenterDetails")
	private WebElement serviceCentertextbox;

	@FindBy(id = "com.customerapp.hero:id/tv_customer_request")
	private WebElement customerRequestText;

	@FindBy(xpath = "(//android.widget.ImageView[@index='0'])[2]")
	private WebElement customerRequestcheckboxSelection;

	@FindBy(id = "com.customerapp.hero:id/tv_additional_instructions")
	private WebElement AdditionalInstructionsText;

	@FindBy(id = "com.customerapp.hero:id/otherIssuesEdt")
	private WebElement AdditionalInstructionsTextbox;


	@FindBy(xpath = "(//android.widget.TextView[@index='0'])[3]")
	private WebElement bookServicebuttonText;

	@FindBy(id = "com.customerapp.hero:id/state_sp")
	private WebElement state_box;

	@FindBy(id = "com.customerapp.hero:id/city_sp")
	private WebElement city_box;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> state_typedropdown;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> city_typedropdown;

	@FindBy(id = "com.customerapp.hero:id/floating_button2")
	private WebElement listViewicon;

	@FindBys({ @FindBy(xpath = "//android.widget.TextView") })
	private List<WebElement> jhilmilDealer;

	@FindBy(xpath = "(//android.view.ViewGroup)[12]//android.widget.ImageView")
	private WebElement radioButtonBesidesJhilmilDealer;

	@FindBy(id = "com.customerapp.hero:id/ivSelect")
	private WebElement radioButtonBesidesAutoRidersDealer;

	@FindBy(xpath = "(//android.widget.LinearLayout)[4]")
	private WebElement SelectedServiceCentre;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[9]")
	private WebElement bookServiceButton;
	
	@FindBy(id = "com.customerapp.hero:id/centerName")
	private WebElement dealerNameAfterSelected;
	
	@FindBy(id = "com.customerapp.hero:id/tv_nextservice")
	private WebElement serviceScheduledText;
	

	public BookServiceDetailsPage_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void SliderMoving() {
		Actions action = new Actions(ad);
		action.dragAndDropBy(slider, 20, 0).build().perform();
		slider.getLocation();
	}

	public void SelectingSeviceCenter() throws InterruptedException {
		generic.clickOnWebElement(serviceCentertextbox);
		generic.clickOnWebElement(listViewicon);
		generic.clickOnWebElement(state_box);

		generic.itratingOnWebelements(state_typedropdown, "GOA");

		generic.clickOnWebElement(city_box);

		generic.itratingOnWebelements(city_typedropdown, "BICHOLIM");

//		generic.Scrolling("A-19 JHILMIL IND AREA G.T. Road, DELHI, DELHI, 110095");
		generic.clickOnWebElement(radioButtonBesidesAutoRidersDealer);

	}

	public void clickOncustomerRequestCheckbox() {
		generic.clickOnWebElement(customerRequestcheckboxSelection);
	}

	public void enterAdditionalInstructions(String text) {
		generic.sendKeysOnTextfields(AdditionalInstructionsTextbox, text);
	}

	public void clickOnReviewServiceDetailsButton() {
		generic.clickOnWebElement(reviewServiceDetailsButton);
	}

	public ServiceBookedScreen_page_object clickOnBookServiceButton() {
		generic.clickOnWebElement(bookServiceButton);

		return new ServiceBookedScreen_page_object(ad);
	}

}
