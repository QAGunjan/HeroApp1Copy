package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Driving_License_Page_Object {
	
	@FindBy(id = "com.customerapp.hero:id/icon2")
	private WebElement three_dots;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement take_pictures_pop_up;
	
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement acess_photos_and_medio_pop_up;
	
	@FindBy(xpath = "//*[@text='Take a Photo']")
	private WebElement take_a_photo_btn;
	
	@FindBy(xpath = "//*[@text='Choose from library']")
	private WebElement Choose_from_library_btn;

	@FindBy(id = "com.customerapp.hero:id/image_capture_button")
	private WebElement camera_capturing_icon;
	
	@FindBy(id = "com.google.android.documentsui:id/icon_thumb")
	private WebElement image_under_emulator;
	
	@FindBy(id = "com.android.documentsui:id/icon_thumb")
	private WebElement image_under_realDevice;
	
	@FindBy(id = "com.customerapp.hero:id/crop_image_menu_crop")
	private WebElement crop_image;
	
	@FindBy(xpath="//*[@text='Allow Hero App to take pictures and record video?']")
	private WebElement take_pictures_pop;
	
	
	public Driving_License_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}


	public WebElement getThree_dots() {
		return three_dots;
	}

	public WebElement getTake_pictures_pop_up() {
		return take_pictures_pop_up;
	}


	public WebElement getAcess_photos_and_medio_pop_up() {
		return acess_photos_and_medio_pop_up;
	}


	public WebElement getTake_a_photo_btn() {
		return take_a_photo_btn;
	}




	public WebElement getCamera_capturing_icon() {
		return camera_capturing_icon;
	}




	public WebElement getChoose_from_library_btn() {
		return Choose_from_library_btn;
	}




	public WebElement getImage_under_emulator() {
		return image_under_emulator;
	}




	public WebElement getCrop_image() {
		return crop_image;
	}


	public WebElement getTake_pictures_pop() {
		return take_pictures_pop;
	}


	public WebElement getImage_under_realDevice() {
		return image_under_realDevice;
	}







	



    


	
	
}
