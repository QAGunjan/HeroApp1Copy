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

public class CancelServiceWindow_Page_Object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/tv_title")
	private WebElement cancelService_Text;

	@FindBy(id = "com.customerapp.hero:id/textMessage")
	private WebElement areYouSureYouWantToCancelThisService_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[4]")
	private WebElement noButton;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[3]")
	private WebElement yesButton;

	@FindBy(xpath = "//*[@text='Service Cancelled']")
	private WebElement serviceCancelled_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[2]")
	private WebElement yourServiceHasBeenCancelled_Text;

	@FindBy(id = "com.customerapp.hero:id/iv_close")
	private WebElement closeIcon;

	public CancelServiceWindow_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void clickOnYesButton() {
		generic.clickOnWebElement(yesButton);

	}

	public void clickOnNoButton() {
		generic.clickOnWebElement(noButton);

	}

	public void clickOnCloseIcon() {
		generic.clickOnWebElement(closeIcon);

	}

}
