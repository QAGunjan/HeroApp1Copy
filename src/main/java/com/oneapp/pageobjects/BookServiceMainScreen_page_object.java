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
public class BookServiceMainScreen_page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement bookServiceButton;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[14]")
	private WebElement rescheduledButton;
	
	@FindBy(xpath = "(//android.view.ViewGroup)[12]//android.widget.TextView")
	private WebElement cancelButton;

	public BookServiceMainScreen_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public BookServiceDetailsPage_page_object clickOnBookServiceButton() {
		generic.clickOnWebElement(bookServiceButton);

		return new BookServiceDetailsPage_page_object(ad);
	}

	public ServiceRescheduling_Page_Object clickOnRescheduledButton() {
		generic.clickOnWebElement(rescheduledButton);

		return new ServiceRescheduling_Page_Object(ad);
	}
	
	public CancelServiceWindow_Page_Object clickOnCancelButton() {
		generic.clickOnWebElement(cancelButton);

		return new CancelServiceWindow_Page_Object(ad);
	}

}
