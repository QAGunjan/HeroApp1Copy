package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Driving_License_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Driving_License_Page_Actions {

	public AndroidDriver ad;
	public Driving_License_Page_Object dlpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;

	public Driving_License_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		dlpo = new Driving_License_Page_Object(ad);
		cepo = new CommonElements_Page_object(ad);
	}

	public void clickThreeDotsAction() {

		Generic.clickOnWebElement(dlpo.getThree_dots());
	}

	public void uploadingLicenseProcessAction() throws InterruptedException, IOException {
		ta = new TouchAction(ad);

		Generic.tappingOnWebelement(813, 297);

		if (dlpo.getTake_pictures_pop().isDisplayed() == true) {
			Generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
		}

		if (dlpo.getAccessPhotosAndVideos().isDisplayed() == true) {
			Generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
		}

		Generic.clickOnWebElement(dlpo.getThree_dots());
		Generic.tappingOnWebelement(813, 297);
		Generic.clickOnWebElement(dlpo.getChoose_from_library_btn());
//		 ad.pushFile("/sdcard/Download/Pika.jpg", new File("D:\\JAVA\\Pika.jpg"));
		ad.pullFile("/sdcard/Download/Pika.jpg");
//		 Generic.click_on_WebElement(dlpo.getImage_under_emulator());  for emulator
		Generic.clickOnWebElement(dlpo.getImage_under_realDevice()); // for real devices
		Generic.clickOnWebElement(dlpo.getCrop_image());
	}

	public void turnOFFInternetAction() {
		Generic.WifiOff();
	}

	public void turnONInternetAction() {
		Generic.WifiOn();
	}

	public void downloadingLicenceprocessAction() {
		clickThreeDotsAction();
		Generic.tappingOnWebelement(805, 529);
	}

	public void downloadedLicenseAssertionAction() {
		Generic.hardAssertion(cepo.getToast_message(), "Download start");
	}

	public void uploadedLicenseAssertionAction() {
		Generic.hardAssertion(cepo.getToast_message(), "Document Uploaded Successfully");
	}

	public void sharingLicenseAction() {
		Generic.clickOnWebElement(dlpo.getThree_dots());
		Generic.tappingOnWebelement(770, 409);
	}

	public void sharingLicenseAssertionAction() {
		Generic.softAssertion(cepo.getToast_message(), "No recommended people to share with");
	}

	public void clickBackIconAction() {
		Generic.clickOnWebElement(cepo.getBack_icon());
	}

	public void uploadingLicenseWithNoInternetAction() {
		Generic.softAssertion(cepo.getToast_message(), "Please check your network connection.");
	}

	public void downloadingLicenseWithNoInternetAction() {
		Generic.softAssertion(cepo.getToast_message(), "Please check your network connection.");
	}

}
