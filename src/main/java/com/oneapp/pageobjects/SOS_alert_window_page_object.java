package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SOS_alert_window_page_object extends BaseClass {
	
	public Generic generic = new Generic();

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")

	private WebElement Send_alert_now_button;

	@FindBy(xpath = "//*[@text='Don't send.']")
	private WebElement dont_send_link;

	@FindBy(id = "com.customerapp.hero:id/custom_radius_close")
	private WebElement close_icon;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[1]")
	private WebElement PanicAlert_Text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[2]")
	private WebElement Theappwillalertwithyouremergencycontactswithyourcurrentlocation_Text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[3]")
	private WebElement SendAlertNow_Text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[4]")
	private WebElement Dontsend_Text;

	@FindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[5]")
	private WebElement Imsafe_Text;

	SOS_alert_window_page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

}
