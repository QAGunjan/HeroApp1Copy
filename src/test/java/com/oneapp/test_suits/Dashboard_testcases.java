package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.DealerLocator_Page_Action;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.RSA_Page_Action;
import com.oneapp.page_actions.RelationshipManager_Page_Action;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;
import com.oneapp.page_actions.TipsAndDIYVideos_page_action;

@Listeners(com.oneapp.basic.MyListeners.class)

public class Dashboard_testcases extends BrowserFactory {

	@Test(priority = 43, groups = { "Smoke", "Regression" })
	public void validate_DashboardVideoIsPresent_testcase() throws InterruptedException, IOException {
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
		dpa.dashboardVideoAction();
	}

	@Test(priority = 44, groups = { "Smoke", "Regression" })
	public void validate_relationshipManager_testcase() throws InterruptedException, IOException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickRelationshipManager();
		RelationshipManager_Page_Action rmpa = new RelationshipManager_Page_Action(ad);
		rmpa.relationshipManagerPageAssertionAction();
		rmpa.relationshipManagerProcessAction();
	}

	@Test(priority = 45, groups = { "Smoke", "Regression" })
	public void validate_RSA_testcase() throws InterruptedException, IOException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickRSA();
		RSA_Page_Action RSApa = new RSA_Page_Action(ad);
		RSApa.RSAPageAssertionAction();
		RSApa.RSAProcessAction();
	}

	@Test(priority = 46, groups = { "Smoke", "Regression" })
	public void validate_DealorLocator_testcase() throws InterruptedException, IOException {
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickDealerLocatorAction();
		DealerLocator_Page_Action dlpa = new DealerLocator_Page_Action(ad);
		dlpa.dealerLocatorPageAssertionAction();
		dlpa.dealerLocatorProcessAction();

	}
}
