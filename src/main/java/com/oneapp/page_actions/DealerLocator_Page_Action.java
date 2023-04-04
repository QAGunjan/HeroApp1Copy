package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.DealerLocator_Page_object;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class DealerLocator_Page_Action {

	public ExcelData exceldata;
	public AndroidDriver ad;
	public DealerLocator_Page_object dlpo;
	public CommonElements_Page_object cepo;
	public String val;

	public DealerLocator_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		dlpo = new DealerLocator_Page_object(ad);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);
	}

	public void dealerLocatorPageAssertionAction() {
		Generic.hardAssertion(cepo.getPageTitleText(), "Dealer Locator");
	}

	public void dealerLocatorProcessAction() throws InterruptedException {
		if (dlpo.getSomethingWentWrong_text().isDisplayed() == true) {

			TestUtils.log().debug(Console_Colors.Red_color() + "We are getting Something Went wrong in Dealer Locator"
					+ Console_Colors.Reset_color());
			Assert.fail();
		}

		else {
			Generic.clickOnWebElement(cepo.getState_box());
			List<WebElement> options = cepo.getState_typedropdown();
			Generic.itratingOnWebelements(options, "Delhi");
			Generic.clickOnWebElement(cepo.getCity_box());
			List<WebElement> options1 = cepo.getCity_typedropdown();
			Generic.itratingOnWebelements(options1, "Delhi");
			Generic.clickOnWebElement(dlpo.getListViewicon());

			TestUtils.log().debug("BELOW ARE THE LIST OF DEALER LOCATORS WHICH ARE IN DELHI STATE");
			List<WebElement> elements = dlpo.getDealerLocatorsName();
			for (WebElement element : elements) {
				val = element.getText();
				TestUtils.log().debug(val);
			}

			if (dlpo.getHansMotorsDealerLocatorName().isDisplayed() == true) {
				Generic.clickOnWebElement(dlpo.getCallIconBesidesHansMotorsDealer());
				Thread.sleep(2000);
				ad.terminateApp("com.customerapp.hero");
				Thread.sleep(4000);
				ad.activateApp("com.samsung.android.dialer");
				Generic.hardAssertion(dlpo.getDialerPad(), "0112293007");
				Thread.sleep(3000);
				ad.activateApp("com.customerapp.hero");
				Thread.sleep(10000);
			}
		}

	}
}
