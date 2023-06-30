package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Emerygency_contacts_page_objects extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/subtitle")  	
	private MobileElement add_emergency_contact_link;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	private MobileElement contact_allowing_popup;

	@AndroidFindBy(xpath = "//*[@text='Allow Hero App to access your contacts?']")
	private MobileElement Contact_acess_popUpSamsung;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement allow_btn;

	@AndroidFindBy(id = "com.customerapp.hero:id/btn_lbl")
	private MobileElement create_text;

	@AndroidFindBy(id = "com.customerapp.hero:id/mobile_no")
	private MobileElement saved_mob_number_contact;

	@AndroidFindBy(id = "com.customerapp.hero:id/ivAction")
	private MobileElement threedots_besides_contact_num;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	private MobileElement delete_btn;

	@AndroidFindBy(id = "com.customerapp.hero:id/icon2")
	private MobileElement EmerygencyContactPlusIcon;


	public MobileElement getAdd_emergency_contact_link() {
		return add_emergency_contact_link;
	}

	public MobileElement getContact_allowing_popup() {
		return contact_allowing_popup;
	}

	public MobileElement getAllow_btn() {
		return allow_btn;
	}

	public MobileElement getCreate_text() {
		return create_text;
	}

	public MobileElement getSaved_mob_number_contact() {
		return saved_mob_number_contact;
	}

	public MobileElement getThreedots_besides_contact_num() {
		return threedots_besides_contact_num;
	}

	public MobileElement getDelete_btn() {
		return delete_btn;
	}

	public MobileElement getContact_acess_popUpSamsung() {
		return Contact_acess_popUpSamsung;
	}

	public MobileElement getEmerygencyContactPlusIcon() {
		return EmerygencyContactPlusIcon;
	}

}
