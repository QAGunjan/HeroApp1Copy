package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.Generic;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Dashboard_Page_object extends BaseClass {

	public Generic generic = new Generic();

	@FindBy(xpath = "//*[@text='Enjoy every feature : Grant required permissions']")
	private WebElement grantAllPermissionPopUp_SamsungM53;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement grantAllPermissionPopUpButton_SamsungM53;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement deviceLocationPopUp_SamsungM53;

	@FindBy(id = "com.customerapp.hero:id/permissionTitle")
	private WebElement Location_popup;

	@FindBy(id = "com.customerapp.hero:id/custom_radius_close")
	private WebElement dahboardOneTimeBanner_PopUp;

	@FindBy(id = "com.customerapp.hero:id/permissionTitle")
	private WebElement proceedButtonLocationPopUp;

	@FindBy(xpath = "//*[@text='Key Actions']")
	private WebElement key_action_text;

	@FindBy(xpath = "//*[@text='Allow']")
	private WebElement Location_popup_Honor;

	@FindBy(xpath = "//*[@text='Dealer Locator']")
	private WebElement dealerLocatortext;

	@FindBy(xpath = "//*[@text='Relationship Manager']")
	private WebElement relationshipManagertext;

	@FindBy(xpath = "//*[@text='RSA']")
	private WebElement RSAtext;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.View")
	private WebElement RSAImageIcon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.view.View")
	private WebElement dealerLocatorImageIcon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.View")
	private WebElement relationshipManagerImageIcon;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement nearby_devices_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement calllogs_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement contacts_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement managephonecalls_popup;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement sms_messages_popup;

//	@FindBy(className="android.widget.LinearLayout")
//	private List<WebElement> Location_pop_displaying;

//	@FindBy(xpath="//*[contains(text(), 'Allow Hero App to access this?')]")
//	private WebElement Location_pop_displaying;

	@FindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement Location_pop_displaying;

	// *[@text='Allow Hero App to access this device’s location?']

	@FindBy(id = "com.customerapp.hero:id/side_menu_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"menu\"]")

	private WebElement menu_bar_icon;

	@FindBy(xpath = "//*[@text='Services']")
	private WebElement services_icon;

	@FindBy(xpath = "//*[@text='GoodLife']")
	private WebElement goodlife_icon;

	@FindBy(xpath = "//*[@text='Home']")
	private WebElement home_icon;

	@FindBy(id = "com.customerapp.hero:id/ic_sos")
	private WebElement SOS_icon;

	@FindBy(xpath = "//*[@text='Allow Hero App to access this device’s location?']")
	private WebElement device_location_popup_samsung;

//	@FindBy(xpath ="//*[@text='Only this time']")
//	private WebElement allowing_location_popup_samsung;

	@FindAll({ @FindBy(className = "android.view.ViewGroup") })
	private List<WebElement> ImageIconUnderKeyAction;

	@FindBy(id = "com.customerapp.hero:id/iv_pause")
//		@FindBy(id = "com.customerapp.hero:id/exo_controls_background")
	private WebElement dashboardVideo;

	@FindBy(xpath = "com.customerapp.hero:id/iv_close")
	private WebElement dashboardVideoCloseIcon;

	@FindBy(xpath = "//*[@text='Allow Hero App to access your phone call logs?']")
	private WebElement acessYourPhoneCallLogsPopUp;

	@FindBy(xpath = "//*[@text='Allow Hero App to access your contacts?']")
	private WebElement acessYourContactsPopUp;

	@FindBy(xpath = "//*[@text='Allow Hero App to make and manage phone calls?']")
	private WebElement managePhoneCallsPopUp;

	@FindBy(xpath = "//*[@text='Allow Hero App to send and view SMS messages?']")
	private WebElement sendAndViewSMSMessagesPopUp;

	@FindBy(xpath = "//*[@text='Allow Hero App to find, connect to and determine the relative position of nearby devices?']")
	private WebElement connectNearByDevicesPopUp;

	@FindBy(id = "com.customerapp.hero:id/weather_lbl")
	private WebElement temperature_value;

	@FindBy(id = "com.customerapp.hero:id/quick_ac_edit_btn")
	private WebElement editList_Text;

	@FindBy(id = "com.customerapp.hero:id/custom_radius_close")
	private WebElement bookNowDashboardNewPopUpClosingIcon;

	@FindAll({
			@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup//android.widget.TextView") })
	private List<WebElement> featuresUnderKeyActions_AllText;

	@FindBy(xpath = "//android.view.ViewGroup//android.view.View")
	private WebElement allfeatureIconUnderKeyActions;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[1]")
	private WebElement featureRSAIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[2]")
	private WebElement featureExchangeIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[2]")
	private WebElement featureNavigateIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[4]")
	private WebElement featureDocumentsIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[5]")
	private WebElement featureRelationshipManagerIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[6]")
	private WebElement featureTechnicalSupportIcon;

	@FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.view.View)[7]")
	private WebElement featureDealerLocatorIcon;

	Dashboard_Page_object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void selectingFeaturesUnderKeyActions(String text) {

		switch (text) {
		case "Exchange":
			generic.clickOnWebElement(featureExchangeIcon);
			break;
		case "RSA":
			generic.clickOnWebElement(featureRSAIcon);
			break;
		case "Navigate":
			generic.clickOnWebElement(featureNavigateIcon);
			break;
		case "Documents":
			generic.clickOnWebElement(featureDocumentsIcon);
			break;
		case "Relationship Manager":
			generic.clickOnWebElement(featureRelationshipManagerIcon);
			break;
		case "Technical Support":
			generic.clickOnWebElement(featureTechnicalSupportIcon);
			break;
		case "Dealer Locator":
			generic.clickOnWebElement(featureDealerLocatorIcon);
			break;
		default:
			System.out.println("Not features matched");
		}
	}

	public void clickOnExchangeIcon() {

//		for (WebElement value : featuresUnderKeyActions_AllText) {
//
//			String text = value.getText();
//			if (text.equalsIgnoreCase("Exchange")) {
//
//				System.out.println(text);
//
//				generic.clickOnWebElement(allfeatureIconUnderKeyActions);
//			}
//		}
		
		selectingFeaturesUnderKeyActions("Exchange");

	}

	public SOS_alert_window_page_object clickOnSOSIcon() {
		generic.clickOnWebElement(SOS_icon);

		return new SOS_alert_window_page_object(ad);
	}

	public BookServiceMainScreen_page_object clickOnServicesTab() {
		generic.clickOnWebElement(services_icon);

		return new BookServiceMainScreen_page_object(ad);
	}

	public void clickOnHomeTab() {
		generic.clickOnWebElement(home_icon);
	}

	public Menu_Bar_Page_Object clickOnMenuBarIcon() {
		generic.clickOnWebElement(menu_bar_icon);

		return new Menu_Bar_Page_Object(ad);
	}

	public RelationshipManager_Page_Object clickOnRelationShipManager() throws InterruptedException {

		if (generic.elementDisplaying(key_action_text)) {
			if (generic.elementDisplaying(relationshipManagertext)) {

				List<WebElement> options = ImageIconUnderKeyAction;
				for (int i = 1; i <= options.size(); i++) {
					if (i == 3)

						Thread.sleep(3000);

					generic.clickOnWebElement(relationshipManagerImageIcon);
					break;
				}

			}
		}
		return new RelationshipManager_Page_Object();
	}

	public void DashboardAllPopUp() throws InterruptedException {

//		generic.waitForVisibility(grantAllPermissionPopUp_SamsungM53);
//		grantAllPermissionPopUp_SamsungM53.getText().contains("Enjoy every feature")

		/*
		 * try { generic.waitForVisibility(grantAllPermissionPopUp_SamsungM53); while
		 * (grantAllPermissionPopUp_SamsungM53.getText().contains("Enjoy every feature"
		 * )) { generic.clickOnWebElement(grantAllPermissionPopUpButton_SamsungM53); //
		 * generic.clickOnWebElement(deviceLocationPopUp_SamsungM53); break; }
		 */
		generic.waitForVisibility(dahboardOneTimeBanner_PopUp);

		while (dahboardOneTimeBanner_PopUp.isDisplayed()) {
			generic.clickOnWebElement(dahboardOneTimeBanner_PopUp);
			break;
		}

		/*
		 * try { // generic.clickOnWebElement(Location_popup); if
		 * (generic.elementDisplaying(grantAllPermissionPopUp_SamsungM53)) {
		 * generic.clickOnWebElement(grantAllPermissionPopUpButton_SamsungM53);
		 * generic.clickOnWebElement(deviceLocationPopUp_SamsungM53);
		 * 
		 * } } catch (Exception e) { System.out.print(e); }
		 * 
		 */

//		try {
//			for (int i = 0; i < 5; i++) {
//				new Generic().clickOnWebElement(Location_popup_Honor);
//
//			}
//		}

//		catch (Exception e) {
//			TestUtils.log().debug(e);

		/*
		 * try { new Generic().clickOnWebElement(bookNowDashboardNewPopUpClosingIcon);
		 * 
		 * } catch (Exception e) { // TestUtils.log().debug(e); }
		 */
	}

	public void toCheckDashboardVideoOrNot() {
		try {

			if (generic.elementDisplaying(dashboardVideo)) {
				TestUtils.log().debug("Dashboard video is present");
				generic.clickOnWebElement(dashboardVideoCloseIcon);
			}

		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());

			TestUtils.log().debug(
					Console_Colors.Red_color() + "Dasdhboard video is not displaying " + Console_Colors.Reset_color());
			Assert.fail();
		}
	}

}
