package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Emerygency_contacts_page_objects {

	@FindBy(id = "com.customerapp.hero:id/subtitle")
	private WebElement add_emergency_contact_link;

	@FindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement contact_allowing_popup;

	@FindBy(xpath = "//*[@text='Allow Hero App to access your contacts?']")
	private WebElement Contact_acess_popUpSamsung;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement allow_btn;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement create_text;

	@FindBy(id = "com.customerapp.hero:id/mobile_no")
	private WebElement saved_mob_number_contact;

	@FindBy(id = "com.customerapp.hero:id/ivAction")
	private WebElement threedots_besides_contact_num;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	private WebElement delete_btn;

	@FindBy(id = "com.customerapp.hero:id/icon2")
	private WebElement EmerygencyContactPlusIcon;

	public Emerygency_contacts_page_objects(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getAdd_emergency_contact_link() {
		return add_emergency_contact_link;
	}

	public WebElement getContact_allowing_popup() {
		return contact_allowing_popup;
	}

	public WebElement getAllow_btn() {
		return allow_btn;
	}

	public WebElement getCreate_text() {
		return create_text;
	}

	public WebElement getSaved_mob_number_contact() {
		return saved_mob_number_contact;
	}

	public WebElement getThreedots_besides_contact_num() {
		return threedots_besides_contact_num;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public WebElement getContact_acess_popUpSamsung() {
		return Contact_acess_popUpSamsung;
	}

	public WebElement getEmerygencyContactPlusIcon() {
		return EmerygencyContactPlusIcon;
	}

}
