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

public class ServiceRescheduling_Page_Object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/lbl")
	private WebElement reschedulingTitle_Text;

	@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[41]")
	private WebElement confirmButton;

	public ServiceRescheduling_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public ServiceRescheduled_Page_Object clickOnConfirmButton() {
		generic.clickOnWebElement(confirmButton);

		return new ServiceRescheduled_Page_Object(ad);
	}
}
