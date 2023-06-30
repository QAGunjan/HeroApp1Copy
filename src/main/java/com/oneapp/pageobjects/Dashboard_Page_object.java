package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Dashboard_Page_object extends BaseClass {

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private MobileElement Location_popup;

	@AndroidFindBy(xpath = "//*[@text='Key Actions']")
	private MobileElement key_action_text;

	@AndroidFindBy(xpath = "//*[@text='ALLOW']")
	private MobileElement Location_popup_Honor;

	@AndroidFindBy(xpath = "//*[@text='Dealer Locator']")
	private MobileElement dealerLocatortext;

	@AndroidFindBy(xpath = "//*[@text='Relationship Manager']")
	private MobileElement relationshipManagertext;

	@AndroidFindBy(xpath = "//*[@text='RSA']")
	private MobileElement RSAtext;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.View")
	private MobileElement RSAImageIcon;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.view.View")
	private MobileElement dealerLocatorImageIcon;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.View")
	private MobileElement relationshipManagerImageIcon;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement nearby_devices_popup;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement calllogs_popup;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement contacts_popup;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement managephonecalls_popup;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement sms_messages_popup;

//	@FindBy(className="android.widget.LinearLayout")
//	private List<WebElement> Location_pop_displaying;

//	@FindBy(xpath="//*[contains(text(), 'Allow Hero App to access this?')]")
//	private WebElement Location_pop_displaying;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	private MobileElement Location_pop_displaying;

	// *[@text='Allow Hero App to access this device’s location?']

	@AndroidFindBy(id = "com.customerapp.hero:id/side_menu_btn")
	private MobileElement menu_bar_icon;

	@AndroidFindBy(xpath = "//*[@text='Services']")
	private MobileElement services_icon;

	@AndroidFindBy(xpath = "//*[@text='GoodLife']")
	private MobileElement goodlife_icon;

	@AndroidFindBy(id = "com.customerapp.hero:id/ic_sos")
	private MobileElement SOS_icon;

	@AndroidFindBy(xpath = "//*[@text='Allow Hero App to access this device’s location?']")
	private MobileElement device_location_popup_samsung;

//	@FindBy(xpath ="//*[@text='Only this time']")
//	private WebElement allowing_location_popup_samsung;

	@FindAll({ @FindBy(className = "android.view.ViewGroup") })
	private List<WebElement> ImageIconUnderKeyAction;

	@AndroidFindBy(id = "com.customerapp.hero:id/iv_pause")
//		@FindBy(id = "com.customerapp.hero:id/exo_controls_background")
	private MobileElement dashboardVideo;

	
	@AndroidFindBy(id ="com.customerapp.hero:id/iv_close")  	
	private MobileElement dashboardVideoCloseIcon;
	
	public MobileElement getLocation_popup() {
		return Location_popup;
	}

	public MobileElement getNearby_devices_popup() {
		return nearby_devices_popup;
	}

	public MobileElement getCalllogs_popup() {
		return calllogs_popup;
	}

	public MobileElement getManagephonecalls_popup() {
		return managephonecalls_popup;
	}

	public MobileElement getContacts_popup() {
		return contacts_popup;
	}

	public MobileElement getSms_messages_popup() {
		return sms_messages_popup;
	}

	public MobileElement getMenu_bar_icon() {
		return menu_bar_icon;
	}

	public MobileElement getLocation_pop_displaying() {
		return Location_pop_displaying;
	}

	public MobileElement getServices_icon() {
		return services_icon;
	}

	public MobileElement getGoodlife_icon() {
		return goodlife_icon;
	}

	public MobileElement getLocation_popup_Honor() {
		return Location_popup_Honor;
	}

	public MobileElement getKey_action_text() {
		return key_action_text;
	}

	public MobileElement getSOS_icon() {
		return SOS_icon;
	}

	public MobileElement getDevice_location_popup_samsung() {
		return device_location_popup_samsung;
	}

	public MobileElement getDealerLocatortext() {
		return dealerLocatortext;
	}

	public List<WebElement> getImageIconUnderKeyAction() {
		return ImageIconUnderKeyAction;
	}

	public MobileElement getDealerLocatorImageIcon() {
		return dealerLocatorImageIcon;
	}

	public MobileElement getRelationshipManagertext() {
		return relationshipManagertext;
	}

	public MobileElement getRelationshipManagerImageIcon() {
		return relationshipManagerImageIcon;
	}

	public MobileElement getRSAtext() {
		return RSAtext;
	}

	public MobileElement getRSAImageIcon() {
		return RSAImageIcon;
	}

	public MobileElement getDashboardVideo() {
		return dashboardVideo;
	}

	public MobileElement getDashboardVideoCloseIcon() {
		return dashboardVideoCloseIcon;
	}


}
