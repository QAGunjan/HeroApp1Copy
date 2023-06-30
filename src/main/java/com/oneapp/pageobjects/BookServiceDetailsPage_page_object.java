package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookServiceDetailsPage_page_object{

	@FindBy(xpath = "//android.widget.TextView[@index='10']")
	private WebElement selectaTimeText;

	@FindBy(id = "com.customerapp.hero:id/slider_time")
	private WebElement slider;

	@FindBy(id = "com.customerapp.hero:id/tv_service_center")
	private WebElement serviceCenterText;

	@FindBy(id = "com.customerapp.hero:id/serviceCenterDetails")
	private MobileElement serviceCentertextbox;

	@FindBy(id = "com.customerapp.hero:id/tv_customer_request")
	private WebElement customerRequestText;

	@FindBy(xpath = "(//android.widget.ImageView[@index='0'])[2]")
	private WebElement customerRequestcheckboxSelection;

	@FindBy(id = "com.customerapp.hero:id/tv_additional_instructions")
	private WebElement AdditionalInstructionsText;

	@FindBy(id = "com.customerapp.hero:id/otherIssuesEdt")
	private WebElement AdditionalInstructionsTextbox;

	@FindBy(id = "com.customerapp.hero:id/tv_nextservice")
	private WebElement serviceScheduledText;

	@FindBy(xpath = "(//android.widget.TextView[@index='0'])[3]")
	private WebElement bookServicebuttonText;

	public BookServiceDetailsPage_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
			}

	public WebElement getSelectaTimeText() {
		return selectaTimeText;
	}

	public WebElement getSlider() {
		return slider;
	}

	public WebElement getServiceCenterText() {
		return serviceCenterText;
	}

	public MobileElement getServiceCentertextbox() {
		return serviceCentertextbox;
	}

	public WebElement getCustomerRequestText() {
		return customerRequestText;
	}

	public WebElement getCustomerRequestcheckboxSelection() {
		return customerRequestcheckboxSelection;
	}

	public WebElement getAdditionalInstructionsText() {
		return AdditionalInstructionsText;
	}

	public WebElement getAdditionalInstructionsTextbox() {
		return AdditionalInstructionsTextbox;
	}

	public WebElement getServiceScheduledText() {
		return serviceScheduledText;
	}

	public WebElement getBookServicebuttonText() {
		return bookServicebuttonText;
	}

}
