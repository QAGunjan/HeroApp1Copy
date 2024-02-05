package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;
import com.oneapp.basic.ExcelData;
import com.oneapp.utils.FakerData;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Personal_Details_Page_Object extends BaseClass {

	public Generic generic = new Generic();

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> Personal_details_text;

	@FindBy(xpath = "//android.widget.TextView[@index='4']")
	private WebElement personalDetails;

	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	private WebElement fullname_textfield;

	@FindBy(xpath = "//android.widget.RadioButton[@index='1']")
	private WebElement Gender_checkbox;

	@FindBy(xpath = "//android.widget.TextView[@index='11']")
	private WebElement Address_text;

//	@FindBys({
//		@FindBy(className = "android.widget.EditText")
//		})
//		private List<WebElement> emailfield;

	@FindBy(xpath = "(//android.widget.EditText[@index='0'])[2]")
	private WebElement emailfield;

//	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
//	private WebElement datefield;

	@FindBy(xpath = "(//android.widget.EditText[@resource-id='com.customerapp.hero:id/text_input_editext'])[4]")
	private WebElement datefield;

	@FindBy(id = "com.customerapp.hero:id/mtrl_picker_header_toggle")
	private WebElement edit_under_date_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement editing_date;

	@FindBy(id = "com.customerapp.hero:id/month_navigation_fragment_toggle")
	private WebElement origionaldate;

	@FindBy(xpath = "(//android.widget.FrameLayout//android.widget.Button)[2]")
	private WebElement previousMonthArrowIcon;

	@FindBy(id = "com.customerapp.hero:id/confirm_button")
	private WebElement ok_text;

	@FindBy(id = "com.customerapp.hero:id/filled_exposed")
	private WebElement blood_group_field;

	@FindBy(id = "com.customerapp.hero:id/address_input_editext")
	private WebElement address_field;

	@FindBy(xpath = "(//android.widget.EditText[@index='0'])[5]")
	private WebElement pincode_field;

	@FindBy(xpath = "(//android.widget.EditText[@index='0'])[6]")
	private WebElement blank_pincode_field;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement save_btn;

	@FindBy(xpath = "//*[@text='Age must be of 18yr old']")
	private WebElement age_error_message;

	@FindBy(id = "com.customerapp.hero:id/textinput_error")
	private WebElement dateFormattErrorMessage;

	@FindBy(id = "com.customerapp.hero:id/back_btn")
	private WebElement back_icon;

//@FindBys({ @FindBy(className = "androidx.recyclerview.widget.RecyclerView") })
//
//private List<WebElement> allyear;

	@FindBys({ @FindBy(className = "android.widget.GridView") })

	private List<WebElement> allDates;

	public Personal_Details_Page_Object(AppiumDriver ad) {
		PageFactory.initElements(ad, this);
	}

	public void enterFullName(String text) {
		generic.sendKeysOnTextfields(fullname_textfield, text);
	}

	public void enterEmail(String text) {
		generic.sendKeysOnTextfields(emailfield, text);
	}

	public void enterDate(String text) {

//		String month = "JANUARY 2005";
//				
//		String date = "20";
//
//       new Generic().clickOnWebElement(origionaldate);
//		
//		
//		while (true) {
//
//			String monthText = origionaldate.getText();
//
//			if (monthText.equalsIgnoreCase(month)) {
//				break;
//			}
//
//			else {
//				previousMonthArrowIcon.click();
//			}
//		}
//
//		for (WebElement dates : allDates) {
//			String dateText = dates.getText();
//			if (dateText.equalsIgnoreCase(date)) {
//				new Generic().clickOnWebElement(dates);
//				break;
//			}
//		}

		generic.clickOnWebElement(datefield);
		generic.clickOnWebElement(edit_under_date_field);

		generic.sendKeysOnTextfields(editing_date, text);
		generic.clickOnWebElement(ok_text);

	}

	public void enterAddress(String text) {
		generic.sendKeysOnTextfields(address_field, text);
	}

	public void enterPinCode(String text) {
		if (pincode_field.getText().contains("11")) {
			System.out.println(pincode_field.getText());
		}

		else {
			generic.sendKeysOnTextfields(blank_pincode_field, text);
		}
	}

//	public void enterPinCode(String text) {
//		if (pincode_field.getText().isEmpty()) {
//			
//			new Generic().sendKeysOnTextfields(blank_pincode_field, text);
//			
//		}
//
//		else {
//			System.out.println(pincode_field.getText());
//		}
//	}

	public void clickOnSaveButton() {
		generic.clickOnWebElement(save_btn);
	}

	public void clickOnBackIcon() throws InterruptedException {
		Thread.sleep(5000);
		generic.clickOnWebElement(back_icon);
	}

}
