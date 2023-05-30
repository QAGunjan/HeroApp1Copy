package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Dashboard_Page_Actions {

	public AppiumDriver ad;
	public TouchAction ta;
	public Dashboard_Page_object dpo;
	public CommonElements_Page_object cepo;
	public Generic generic;

	public Dashboard_Page_Actions(AppiumDriver ad2) {
		this.ad = ad2;
		dpo = new Dashboard_Page_object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		generic = new Generic();
	}
	
	public void dashboardVideoAction()
	{
		try {
			
		if (dpo.getDashboardVideo().isDisplayed())
		{
			TestUtils.log().debug("Dashboard video is present");
		}
		}
		catch (Exception e)
		{
			TestUtils.log().debug(Console_Colors.Red_color() + "Dasdhboard video is not displaying "+ e + Console_Colors.Reset_color());
		}
	}

	public void dashboardAllPopUpAction() throws InterruptedException {
		Thread.sleep(3000);

//		Below Actions are for Honor Phone (Android - 9)
//		try {
//			Generic.click_on_WebElement(dpo.getLocation_popup_Honor());
//			Generic.click_on_WebElement(dpo.getLocation_popup());
//		}
//		catch(Exception e)
//		{
//		}
		try {
			if (dpo.getDevice_location_popup_samsung().isDisplayed()) {
				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			TestUtils.log().debug("Exception Handled" + e);
		}

//		String str= "Allow Hero App to access this device’s location?";
//		String popup_dis = dpo.getLocation_pop_displaying().getText();

//		WebElement popup_dis = dpo.getLocation_pop_displaying().get(4);
//		if (popup_dis.equalsIgnoreCase(str))
//		if (popup_dis.isDisplayed())

//		{
//			dpo.getLocation_popup().click();
//			Thread.sleep(3000);
//			Reporter.log("Location popup is displaying", true);
//		}
//		
//		else
//		{
//			Reporter.log("Location popup is not displaying because it has already enabled", true);
//		}

//		dpo.getNearby_devices_popup().click();
//		Thread.sleep(3000);
//		dpo.getCalllogs_popup().click();
//		Thread.sleep(3000);
//		dpo.getContacts_popup().click();
//		Thread.sleep(3000);
//		dpo.getManagephonecalls_popup().click();
//		Thread.sleep(3000);
//		dpo.getSms_messages_popup().click();
//		Thread.sleep(3000);

	}

	public void clickMenuBarAction() {
		generic.clickOnWebElement(dpo.getMenu_bar_icon());
	}

	public void clickServiceIconAction() {
		generic.clickOnWebElement(dpo.getServices_icon());
	}

	public void clickGoodlifeIconAction() {
		generic.clickOnWebElement(dpo.getGoodlife_icon());
	}

	public void clickSOSIconAction() {
		generic.clickOnWebElement(dpo.getSOS_icon());
	}

	public void clickDealerLocatorAction() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (dpo.getKey_action_text().isDisplayed() == true) {

			if (dpo.getDealerLocatortext().isDisplayed() == true) {
				// Generic.itratingOnWebelements(dpo.getDealerLocatortext(), "Dealer Locator");
				List<WebElement> options = dpo.getImageIconUnderKeyAction();
				for (int i = 1; i <= options.size(); i++) {
					if (i == 6)
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					generic.clickOnWebElement(dpo.getDealerLocatorImageIcon());

					break;
				}
			}
		}
	}

	public void clickRelationshipManager() {
		if (dpo.getKey_action_text().isDisplayed() == true) {
			if (dpo.getRelationshipManagertext().isDisplayed() == true) {

				List<WebElement> options = dpo.getImageIconUnderKeyAction();
				for (int i = 1; i <= options.size(); i++) {
					if (i == 3)
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					generic.clickOnWebElement(dpo.getRelationshipManagerImageIcon());
					break;
				}

			}
		}

	}

	public void clickRSA() {

		if (dpo.getKey_action_text().isDisplayed() == true) {
			if (dpo.getRSAtext().isDisplayed() == true) {

				List<WebElement> options = dpo.getImageIconUnderKeyAction();
				for (int i = 1; i <= options.size(); i++) {
					if (i == 3)
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					generic.clickOnWebElement(dpo.getRSAImageIcon());
					break;
				}

			}
		}

	}

}
