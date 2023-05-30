package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_199Membership_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/lbl1")
	private WebElement Goodlife_199Membership_PageText;

	@FindBy(id = "com.customerapp.hero:id/plan_name")
	private WebElement Goodlife_199Membership_PlanName;

	@FindBy(id = "com.customerapp.hero:id/down_ic_btn")
	private WebElement Goodlife_199Membership_ShowMoreLink;

	@FindBy(xpath = "//*[@text='Membership Valid Till']")
	private WebElement MemberShipValidTill_Text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement MemberShipValidTill_value;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	private WebElement MemberShipNumber_Text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement MemberShipNumber_value;

	@FindBy(xpath = "//*[@text='Winner Of The Month']")
	private WebElement WinnerOfTheMonth_Text;

	@FindBy(id = "com.customerapp.hero:id/winner_name_lbl")
	private WebElement WinnerName_OfTheMonth;

	@FindBy(xpath = "//*[@text='Points Earning & Redemption']")
	private WebElement PointsEarningAndRedemption_Text;

	@FindBy(xpath = "//*[@text='View Details']")
	private WebElement ViewDetails_Link;

	public Goodlife_199Membership_Page_Object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getGoodlife_199Membership_PageText() {
		return Goodlife_199Membership_PageText;
	}

	public WebElement getGoodlife_199Membership_PlanName() {
		return Goodlife_199Membership_PlanName;
	}

	public WebElement getGoodlife_199Membership_ShowMoreLink() {
		return Goodlife_199Membership_ShowMoreLink;
	}

	public WebElement getMemberShipValidTill_Text() {
		return MemberShipValidTill_Text;
	}

	public WebElement getMemberShipValidTill_value() {
		return MemberShipValidTill_value;
	}

	public WebElement getMemberShipNumber_Text() {
		return MemberShipNumber_Text;
	}

	public WebElement getMemberShipNumber_value() {
		return MemberShipNumber_value;
	}

	public WebElement getWinnerOfTheMonth_Text() {
		return WinnerOfTheMonth_Text;
	}

	public WebElement getWinnerName_OfTheMonth() {
		return WinnerName_OfTheMonth;
	}

	public WebElement getPointsEarningAndRedemption_Text() {
		return PointsEarningAndRedemption_Text;
	}

	public WebElement getViewDetails_Link() {
		return ViewDetails_Link;
	}

}
