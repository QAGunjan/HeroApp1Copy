package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Goodlife_199Membership_Page_Action;
import com.oneapp.page_actions.Goodlife_Dashboard_Non_mem_Page_Actions;
import com.oneapp.page_actions.Goodlife_Insurance_Details_Form_299_Page_Action;
import com.oneapp.page_actions.Goodlife_Plans_Page_Actions;
import com.oneapp.page_actions.Goodlife_Profile_Details_Form_299_Page_Action;
import com.oneapp.page_actions.Goodlife_Select_Your_Plan_Page_Action;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.PaymentPage_page_action;
import com.oneapp.page_actions.PointsEarningAndRedemption_Page_Action;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;
import com.oneapp.page_actions.WinnerOfTheMonth_Page_Action;

@Listeners(com.oneapp.basic.MyListeners.class)

public class Goodlife_Member_testcases extends BrowserFactory {
	
	@Test (priority = 47, groups = {"Smoke", "Regression" })
	public void validate_Goodlife_ProMembership_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validLoginAction();
		lpa.validLoginAssertionAction();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.validOTPAction();
		opa.clickVerifyButtonAction();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.vehicleSelectionActionForGoodlife();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.dashboardAllPopUpAction();
		dpa.clickGoodlifeIconAction();
		Goodlife_199Membership_Page_Action g199m_pa= new Goodlife_199Membership_Page_Action(ad);
		g199m_pa.goodlife199MembershipPageAssertionAction();
		g199m_pa.goodlifeMembershipProcessAction();
	}
	
	@Test (priority = 48, groups = {"Smoke", "Regression" })
	public void validate_WinnerOFTheMonth_testcase() throws InterruptedException {
		Goodlife_199Membership_Page_Action g199m_pa= new Goodlife_199Membership_Page_Action(ad);
		g199m_pa.winnerOfTheMonthProcessAction();
		WinnerOfTheMonth_Page_Action wotm_pa = new WinnerOfTheMonth_Page_Action(ad);
		wotm_pa.WinnerOfTheMonthPageAssertionAction();
		wotm_pa.WinnerOfTheMonthValidationAction();
	}
	
	@Test (priority = 49, groups = {"Smoke", "Regression" })
	public void validate_PointsEarningAndRedemption_testcase() throws InterruptedException {
		Goodlife_199Membership_Page_Action g199m_pa= new Goodlife_199Membership_Page_Action(ad);
		g199m_pa.pointsEarningAndRedemptionProcessAction();
		PointsEarningAndRedemption_Page_Action pear_pa = new PointsEarningAndRedemption_Page_Action(ad);
		pear_pa.pointsEarningAndRedemptionPageAssertionAction();
		pear_pa.pointsEarningAndRedemptionValidationsAction();
	}
	

}
