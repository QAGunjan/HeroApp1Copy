//package com.oneapp.test_suits;
//
//import java.io.File;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import com.oneapp.basic.BaseClass;
//import com.oneapp.utils.Console_Colors;
//import com.oneapp.utils.TestUtils;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class ManageLicenceTestCases extends BaseClass {
//
//	SoftAssert sa = new SoftAssert();
//
//	@Test(priority = 600, groups = { "Smoke", "Regression" })
//	public void TC401_ValidateUploadLicence() {
//		try {
//			if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
//				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//			}
//		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}
//
//		generic.clearOnTexBox(lpo.getMobile_num_field());
//		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
//		generic.clickOnWebElement(cepo.getbutton());
//
//		generic.waitForVisibility(opo.getVerify_with_OTP());
//
//		Assert.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());
//
//		opo.getFirsttxtbox().sendKeys("1");
//		opo.getSecondtxtbox().sendKeys("2");
//		opo.getThirdtxtbox().sendKeys("3");
//		opo.getFourthtxtbox().sendKeys("4");
//		opo.getFifthtxtbox().sendKeys("5");
//		opo.getSixthtxtbox().sendKeys("6");
//
//		generic.clickOnWebElement(cepo.getbutton());
//
//		if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
//			generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
//			TestUtils.log().debug("Book service PAID vin selected");
//			generic.clickOnWebElement(cepo.getbutton());
//		}
//
//		try {
//			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
//				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//				Thread.sleep(5000);
//			}
//		} catch (Exception e) {
//			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
//		}
//
//		generic.clickOnWebElement(dpo.getMenu_bar_icon());
//		generic.clickOnWebElement(mbpo.getMyprofile_menu_bar_txt());
//
//		generic.waitForVisibility(cepo.getPageTitleText());
//		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getprofileDetailsPageTitleExpected());
//
//		generic.clickOnWebElement(mppo.getManage_license_text());
//
//		generic.clickOnWebElement(dlpo.getThree_dots());
//
//		generic.tappingOnWebelement(813, 297);
//
//		if (generic.elementDisplaying(dlpo.getTake_pictures_pop())) {
//			generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
//		}
//
//		if (generic.elementDisplaying(dlpo.getAccessPhotosAndVideos())) {
//			generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
//		}
//
//		generic.clickOnWebElement(dlpo.getThree_dots());
//		generic.tappingOnWebelement(813, 297);
//		generic.clickOnWebElement(dlpo.getChoose_from_library_btn());
////		 ad.pushFile("/sdcard/Download/Pika.jpg", new File("D:\\JAVA\\Pika.jpg"));
////		ad.pullFile("/sdcard/Download/Pika.jpg");
//		generic.clickOnWebElement(dlpo.getImage_under_realDevice()); // for real devices
//		generic.clickOnWebElement(dlpo.getCrop_image());
//
//		generic.waitForVisibility(cepo.getToast_message());
//		Assert.assertEquals(cepo.getToast_message(), "Document Uploaded Successfully");
//
//		sa.assertAll();
//	}
//
//	@Test (priority = 601, groups = { "Smoke", "Regression" })
//	public void TC402_ValidateDownloadLicence() throws InterruptedException {
//		Thread.sleep(5000);
//		generic.clickOnWebElement(dlpo.getThree_dots());
//		generic.tappingOnWebelement(805, 529);
//
//		generic.waitForVisibility(cepo.getToast_message());
//		Assert.assertEquals(cepo.getToast_message(), "Download start");
//		Thread.sleep(5000);
//		generic.clickOnWebElement(cepo.getBack_icon());
//		generic.clickOnWebElement(cepo.getBack_icon());
//	}
//
//}
