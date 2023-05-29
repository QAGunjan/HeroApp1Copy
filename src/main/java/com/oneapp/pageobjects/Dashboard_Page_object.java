package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Dashboard_Page_object {

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement Location_popup;

	@FindBy(xpath = "//*[@text='Key Actions']")
	private WebElement key_action_text;

	@FindBy(xpath = "//*[@text='ALLOW']")
	private WebElement Location_popup_Honor;

	@FindBy(xpath = "//*[@text='Dealer Locator']")
	private WebElement dealerLocatortext;

	@FindBy(xpath = "//*[@text='Relationship Manager']")
	private WebElement relationshipManagertext;

	@FindBy(xpath = "//*[@text='RSA']")
	private WebElement RSAtext;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.View")
	private WebElement RSAImageIcon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.view.View")
	private WebElement dealerLocatorImageIcon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.View")
	private WebElement relationshipManagerImageIcon;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement nearby_devices_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement calllogs_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement contacts_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement managephonecalls_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement sms_messages_popup;

//	@FindBy(className="android.widget.LinearLayout")
//	private List<WebElement> Location_pop_displaying;

//	@FindBy(xpath="//*[contains(text(), 'Allow Hero App to access this?')]")
//	private WebElement Location_pop_displaying;

	@FindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement Location_pop_displaying;

	// *[@text='Allow Hero App to access this device’s location?']

	@FindBy(id = "com.customerapp.hero:id/side_menu_btn")
	private WebElement menu_bar_icon;

	@FindBy(xpath = "//*[@text='Services']")
	private WebElement services_icon;

	@FindBy(xpath = "//*[@text='GoodLife']")
	private WebElement goodlife_icon;

	@FindBy(id = "com.customerapp.hero:id/ic_sos")
	private WebElement SOS_icon;

	@FindBy(xpath = "//*[@text='Allow Hero App to access this device’s location?']")
	private WebElement device_location_popup_samsung;

//	@FindBy(xpath ="//*[@text='Only this time']")
//	private WebElement allowing_location_popup_samsung;

	@FindAll({ @FindBy(className = "android.view.ViewGroup") })
	private List<WebElement> ImageIconUnderKeyAction;

	@FindBy(id ="com.customerapp.hero:id/iv_pause")
//		@FindBy(id = "com.customerapp.hero:id/exo_controls_background")
		private WebElement dashboardVideo;

	public Dashboard_Page_object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getLocation_popup() {
		return Location_popup;
	}

	public WebElement getNearby_devices_popup() {
		return nearby_devices_popup;
	}

	public WebElement getCalllogs_popup() {
		return calllogs_popup;
	}

	public WebElement getManagephonecalls_popup() {
		return managephonecalls_popup;
	}

	public WebElement getContacts_popup() {
		return contacts_popup;
	}

	public WebElement getSms_messages_popup() {
		return sms_messages_popup;
	}

	public WebElement getMenu_bar_icon() {
		return menu_bar_icon;
	}

	public WebElement getLocation_pop_displaying() {
		return Location_pop_displaying;
	}

	public WebElement getServices_icon() {
		return services_icon;
	}

	public WebElement getGoodlife_icon() {
		return goodlife_icon;
	}

	public WebElement getLocation_popup_Honor() {
		return Location_popup_Honor;
	}

	public WebElement getKey_action_text() {
		return key_action_text;
	}

	public WebElement getSOS_icon() {
		return SOS_icon;
	}

	public WebElement getDevice_location_popup_samsung() {
		return device_location_popup_samsung;
	}

	public WebElement getDealerLocatortext() {
		return dealerLocatortext;
	}

	public List<WebElement> getImageIconUnderKeyAction() {
		return ImageIconUnderKeyAction;
	}

	public WebElement getDealerLocatorImageIcon() {
		return dealerLocatorImageIcon;
	}

	public WebElement getRelationshipManagertext() {
		return relationshipManagertext;
	}

	public WebElement getRelationshipManagerImageIcon() {
		return relationshipManagerImageIcon;
	}

	public WebElement getRSAtext() {
		return RSAtext;
	}

	public WebElement getRSAImageIcon() {
		return RSAImageIcon;
	}

	public WebElement getDashboardVideo() {
		return dashboardVideo;
	}

//	public WebElement getAllowing_location_popup_samsung() {
//		return allowing_location_popup_samsung;
//	}

}
