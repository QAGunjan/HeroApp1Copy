package com.oneapp.page_actions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;
import com.oneapp.pageobjects.Goodlife_199Membership_Page_Object;
import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Goodlife_199Membership_Page_Action {

	public AppiumDriver ad;
	public Goodlife_199Membership_Page_Object g199m_po;
	public CommonElements_Page_object cepo;
	public ExcelData exceldata;
	public ConfigData configdata;
	public Generic generic;

	public Goodlife_199Membership_Page_Action(AppiumDriver ad2) {
		this.ad = ad2;
		g199m_po = new Goodlife_199Membership_Page_Object(ad2);
		cepo = new CommonElements_Page_object(ad2);
		exceldata = new ExcelData();
		configdata = new ConfigData();
		generic = new Generic();

	}

	public void goodlife199MembershipPageAssertionAction() {
		generic.hardAssertion(g199m_po.getGoodlife_199Membership_PageText(),
				configdata.getgoodlife199MembershipPageTitleExpected());
	}

	public void goodlifeMembershipProcessAction() throws InterruptedException {
		if (g199m_po.getGoodlife_199Membership_PlanName().isDisplayed() == true) {
			generic.clickOnWebElement(g199m_po.getGoodlife_199Membership_ShowMoreLink());
			if (g199m_po.getMemberShipValidTill_Text().isDisplayed() == true) {
				generic.softAssertion(g199m_po.getMemberShipValidTill_value(), "Oct 31 2025");
				if (g199m_po.getMemberShipNumber_Text().isDisplayed() == true) {
					String Mvalue = g199m_po.getMemberShipNumber_value().getText();
					Assert.assertEquals(Mvalue.length(), 16);
					Thread.sleep(3000);
					generic.swiping(521, 2038, 525, 882, 4000);
				}

			}

		}

	}

	public void winnerOfTheMonthProcessAction() {
		if (g199m_po.getWinnerOfTheMonth_Text().isDisplayed() == true) {
			String row = g199m_po.getWinnerOfTheMonth_Text().getText();
			String column = g199m_po.getWinnerName_OfTheMonth().getText();
			exceldata.setCellData("Goodlife Member", row, column);
			generic.clickOnWebElement(g199m_po.getWinnerOfTheMonth_Text());
		}
	}

	public void pointsEarningAndRedemptionProcessAction() {
		if (g199m_po.getPointsEarningAndRedemption_Text().isDisplayed() == true) {

			if (g199m_po.getViewDetails_Link().isDisplayed() == true) {

				generic.clickOnWebElement(g199m_po.getViewDetails_Link());
			}
		}
	}

}
