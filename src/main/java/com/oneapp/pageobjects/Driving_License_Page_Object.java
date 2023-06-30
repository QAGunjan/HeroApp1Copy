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

public class Driving_License_Page_Object extends BaseClass {

	@AndroidFindBy(id = "com.customerapp.hero:id/icon2")  	
	
	private MobileElement three_dots;

//	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
//	private WebElement take_pictures_pop_up;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private MobileElement acess_photos_and_medio_pop_up;

	@AndroidFindBy(xpath = "//*[@text='Take a Photo']")
	private MobileElement take_a_photo_btn;

	@AndroidFindBy(xpath = "//*[@text='Choose from library']")
	private MobileElement Choose_from_library_btn;

	@AndroidFindBy(id = "com.customerapp.hero:id/image_capture_button")
	private MobileElement camera_capturing_icon;

	@AndroidFindBy(id = "com.google.android.documentsui:id/icon_thumb")
	private MobileElement image_under_emulator;

	@AndroidFindBy(id = "com.google.android.documentsui:id/icon_thumb")
	private MobileElement image_under_realDevice;

	@AndroidFindBy(id = "com.customerapp.hero:id/crop_image_menu_crop")
	private MobileElement crop_image;

	@AndroidFindBy(xpath = "//*[@text='Allow Hero App to take pictures and record video?']")
	private MobileElement take_pictures_pop;

	@AndroidFindBy(xpath = "//*[@text='Allow Hero App to access photos and videos on this device?']")
	private MobileElement accessPhotosAndVideos;

	public MobileElement getThree_dots() {
		return three_dots;
	}

//	public WebElement getTake_pictures_pop_up() {
//		return take_pictures_pop_up;
//	}

	public MobileElement getAcess_photos_and_medio_pop_up() {
		return acess_photos_and_medio_pop_up;
	}

	public MobileElement getTake_a_photo_btn() {
		return take_a_photo_btn;
	}

	public MobileElement getCamera_capturing_icon() {
		return camera_capturing_icon;
	}

	public MobileElement getChoose_from_library_btn() {
		return Choose_from_library_btn;
	}

	public MobileElement getImage_under_emulator() {
		return image_under_emulator;
	}

	public MobileElement getCrop_image() {
		return crop_image;
	}

	public MobileElement getTake_pictures_pop() {
		return take_pictures_pop;
	}

	public MobileElement getImage_under_realDevice() {
		return image_under_realDevice;
	}

	public MobileElement getAccessPhotosAndVideos() {
		return accessPhotosAndVideos;
	}

}
