package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Driving_License_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Driving_License_Page_Actions {

	public AppiumDriver ad;
	public Driving_License_Page_Object dlpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public Generic generic;

	public Driving_License_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		dlpo = new Driving_License_Page_Object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		generic = new Generic();
	}

	public void clickThreeDotsAction() {

		generic.clickOnWebElement(dlpo.getThree_dots());
	}

	public void uploadingLicenseProcessAction() throws InterruptedException, IOException {
		ta = new TouchAction(ad);

		generic.tappingOnWebelement(813, 297);

		if (dlpo.getTake_pictures_pop().isDisplayed() == true) {
			generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
		}

		if (dlpo.getAccessPhotosAndVideos().isDisplayed() == true) {
			generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
		}

		generic.clickOnWebElement(dlpo.getThree_dots());
		generic.tappingOnWebelement(813, 297);
		generic.clickOnWebElement(dlpo.getChoose_from_library_btn());
//		 ad.pushFile("/sdcard/Download/Pika.jpg", new File("D:\\JAVA\\Pika.jpg"));
		ad.pullFile("/sdcard/Download/Pika.jpg");
//		 Generic.click_on_WebElement(dlpo.getImage_under_emulator());  for emulator
		generic.clickOnWebElement(dlpo.getImage_under_realDevice()); // for real devices
		generic.clickOnWebElement(dlpo.getCrop_image());
	}

	public void turnOFFInternetAction() {
		generic.WifiOff();
	}

	public void turnONInternetAction() {
		generic.WifiOn();
	}

	public void downloadingLicenceprocessAction() {
		clickThreeDotsAction();
		generic.tappingOnWebelement(805, 529);
	}

	public void downloadedLicenseAssertionAction() {
		generic.hardAssertion(cepo.getToast_message(), "Download start");
	}

	public void uploadedLicenseAssertionAction() {
		generic.hardAssertion(cepo.getToast_message(), "Document Uploaded Successfully");
	}

	public void sharingLicenseAction() {
		generic.clickOnWebElement(dlpo.getThree_dots());
		generic.tappingOnWebelement(770, 409);
	}

	public void sharingLicenseAssertionAction() {
		generic.softAssertion(cepo.getToast_message(), "No recommended people to share with");
	}

	public void clickBackIconAction() {
		generic.clickOnWebElement(cepo.getBack_icon());
	}

	public void uploadingLicenseWithNoInternetAction() {
		generic.softAssertion(cepo.getToast_message(), "Please check your network connection.");
	}

	public void downloadingLicenseWithNoInternetAction() {
		generic.softAssertion(cepo.getToast_message(), "Please check your network connection.");
	}

}
