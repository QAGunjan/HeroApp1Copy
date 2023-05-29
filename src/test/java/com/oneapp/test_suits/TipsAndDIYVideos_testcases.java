package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.ReferToFriend_page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;
import com.oneapp.page_actions.TipsAndDIYVideos_page_action;

@Listeners(com.oneapp.basic.MyListeners.class)

public class TipsAndDIYVideos_testcases extends BrowserFactory {

	@Test(priority = 40, groups = { "Smoke", "Regression" })
	public void validate_TipsPDF_successfully() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.vehicleSelectionAction();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickMenuBarAction();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.clickTipsAndDIYVideosFromMenuBarAction();
		TipsAndDIYVideos_page_action tadpa= new TipsAndDIYVideos_page_action(ad);
		tadpa.tipsAndDIYVideosPageAssertionAction();
		tadpa.tipsProcessAction();
		
	}
	
	@Test(priority = 41, groups = { "Smoke", "Regression" })
	public void validate_DIYVideos_successfully() throws InterruptedException, IOException {
		TipsAndDIYVideos_page_action tadpa= new TipsAndDIYVideos_page_action(ad);
		tadpa.tipsAndDIYVideosPageAssertionAction();
		tadpa.DIYVideosProcessAction();
		
	}
}