package com.oneapp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.oneapp.basic.BaseClass;

public class ConfigData extends BaseClass {
	public Properties pro;
	protected String AndroidProjectPathURL = "\\\\ConfigTestData\\\\ConfigData.properties";
	protected String IOSProjectPathURL = "./ConfigTestData/ConfigData.properties";

	public ConfigData() {
		ReadConfigFile();
	}

	public void ReadConfigFile() {

		if (PLATFORM_NAME.equalsIgnoreCase("android")) {

			String ProjectPath = System.getProperty("user.dir") + AndroidProjectPathURL;
			FileInputStream fis;
			try {
				fis = new FileInputStream(ProjectPath);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else if (PLATFORM_NAME.equalsIgnoreCase("ios")) {

			File file = new File(IOSProjectPathURL);

//			String ProjectPath = System.getProperty("user.dir") + "\\ConfigTestData\\ConfigData.properties";
			FileInputStream fis;
			try {
				fis = new FileInputStream(file);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Login Page

	public String getPleaseProceedWithYourRegisteredHeroMobileNumberExpected() {
		return pro.getProperty("PleaseProceedWithYourRegisteredHeroMobileNumberExpected");
	}

	public String getByTappingOnLoginOrRegisterYouAreAgreeingToHeroExpected() {
		return pro.getProperty("ByTappingOnLoginOrRegisterYouAreAgreeingToHeroExpected");
	}

	public String getValidLoginExpected() {
		return pro.getProperty("validLoginExpected");
	}

	public String getCommonLoginPageExpected() {
		return pro.getProperty("commonLoginPageExpected");
	}

	public String getContinue_TextExpected() {
		return pro.getProperty("Continue_TextExpected");
	}

	// OTP Page

	public String getWelcomeToHero_TextExpected() {
		return pro.getProperty("WelcomeToHero_TextExpected");
	}

	public String getEnter6digitOTPsentto_TextExpected() {
		return pro.getProperty("Enter6digitOTPsentto_TextExpected");
	}

	public String getResendOTPin_TextExpected() {
		return pro.getProperty("ResendOTPin_TextExpected");
	}

	public String getInvalidOTPExpected() {
		return pro.getProperty("invalidOTPExpected");
	}

	public String getValidOTPWithNoInternet() {
		return pro.getProperty("validOTPWithNoInternet");
	}

	public String getResend_TextExpected() {
		return pro.getProperty("Resend_TextExpected");
	}

	public String getVerify_TextExpected() {
		return pro.getProperty("Verify_TextExpected");
	}

	// Selected Vehicle Page

	public String getYouWillAlwaysSeePrimaryVehicleDetails_TextExpected() {
		return pro.getProperty("YouWillAlwaysSeePrimaryVehicleDetails_TextExpected");
	}

	// Dashboard Page

	public String gettemperature_valueExpected() {
		return pro.getProperty("temperature_valueExpected");
	}

	public String geteditList_TextExpected() {
		return pro.getProperty("editList_TextExpected");
	}

	public String getsaveList_TextExpected() {
		return pro.getProperty("saveList_TextExpected");
	}

	// BurgerMenu Page

	public String getyouAreUsing_textExpected() {
		return pro.getProperty("youAreUsing_textExpected");
	}

	public String getHello_textExpected() {
		return pro.getProperty("Hello_textExpected");
	}

	public String getWheelsOfTrust_textExpected() {
		return pro.getProperty("WheelsOfTrust_textExpected");
	}

	public String getJoyride_textExpected() {
		return pro.getProperty("Joyride_textExpected");
	}

	public String getVehicleDetails_textExpected() {
		return pro.getProperty("VehicleDetails_textExpected");
	}

	public String getAppVersion_textExpected() {
		return pro.getProperty("AppVersion_textExpected");
	}

	// RelationShip Manager Page

	public String getAreaSalesManager_TextExpected() {
		return pro.getProperty("AreaSalesManager_TextExpected");
	}

	public String getotherContact_TextExpected() {
		return pro.getProperty("otherContact_TextExpected");
	}

	// RSA Page

	public String getLocatenearestdealer_TextExpected() {
		return pro.getProperty("Locatenearestdealer_TextExpected");
	}

	// Dealer Locator

	public String getNodealerfound_TextExpected() {
		return pro.getProperty("Nodealerfound_TextExpected");
	}

	// SOS

	public String getPanicAlert_TextExpected() {
		return pro.getProperty("PanicAlert_TextExpected");
	}

	public String getWehavesentanSMStoemergencycontact_TextExpected_TextExpected() {
		return pro.getProperty("WehavesentanSMStoemergencycontact_TextExpected");
	}

	public String getSendAlertNow_TextExpected() {
		return pro.getProperty("SendAlertNow_TextExpected");
	}

	public String getDontsend_TextExpected() {
		return pro.getProperty("Dontsend_TextExpected");
	}

	public String getImsafe_TextExpected() {
		return pro.getProperty("Imsafe_TextExpected");
	}

	// My Profile Page

	public String getEditProfileDetails_textExpected() {
		return pro.getProperty("EditProfileDetails_textExpected");
	}

	public String getMoredetails_textExpected() {
		return pro.getProperty("Moredetails_textExpected");
	}

	public String getLessdetails_textExpected() {
		return pro.getProperty("Lessdetails_textExpected");
	}

	// My Profile Detail Page

	public String getblankFullNameFieldExpected() {
		return pro.getProperty("blankFullNameFieldExpected");
	}

	public String getinvalidEmailFieldExpected() {
		return pro.getProperty("invalidEmailFieldExpected");
	}

	public String getsavingWithoutInternetExpected() {
		return pro.getProperty("savingWithoutInternetExpected");
	}

	public String getinvalidDateExpected() {
		return pro.getProperty("invalidDateExpected");
	}

	public String getaddressExpected() {
		return pro.getProperty("addressExpected");
	}

	public String getinvalidPincodeExpected() {
		return pro.getProperty("invalidPincodeExpected");
	}

	public String getsavedFullNameExpected() {
		return pro.getProperty("savedFullNameExpected");
	}

	public String getcommonAssertionEmergencyContactExpected() {
		return pro.getProperty("commonAssertionEmergencyContactExpected");
	}

	public String gettipsAndDIYVideosPageTitleExpected() {
		return pro.getProperty("tipsAndDIYVideosPageTitleExpected");
	}

	public String gettipsPageTitleExpected() {
		return pro.getProperty("tipsPageTitleExpected");
	}

	public String gettyreCareTextUnderDIYVideosExpected() {
		return pro.getProperty("tyreCareTextUnderDIYVideosExpected");
	}

	public String getVideoPlayerTextUnderTyrecareDIYVideosExpected() {
		return pro.getProperty("VideoPlayerTextUnderTyrecareDIYVideosExpected");
	}

	public String getcommonAssertionSOSAlertWindowExpected() {
		return pro.getProperty("commonAssertionSOSAlertWindowExpected");
	}

	public String getserviceCenterExpected() {
		return pro.getProperty("serviceCenterExpected");
	}

	public String getrSAPageTitleExpected() {
		return pro.getProperty("rSAPageTitleExpected");
	}

	public String getrSAPageTextExpected() {
		return pro.getProperty("rSAPageTextExpected");
	}

	public String getrelationshipManagerPageTitleExpected() {
		return pro.getProperty("relationshipManagerPageTitleExpected");
	}

	public String getreferToFriendPageTitleExpected() {
		return pro.getProperty("referToFriendPageTitleExpected");
	}

	public String getreferSuccessfullyExpected() {
		return pro.getProperty("referSuccessfullyExpected");
	}

	public String getprivacyPolicyPageExpected() {
		return pro.getProperty("privacyPolicyPageExpected");
	}

	public String getpointsEarningAndRedemptionPageTitleExpected() {
		return pro.getProperty("pointsEarningAndRedemptionPageTitleExpected");
	}

	public String getpointsEarningAndRedemptionPageTextExpected() {
		return pro.getProperty("pointsEarningAndRedemptionPageTextExpected");
	}

	public String getPaymentpageTitleExpected() {
		return pro.getProperty("PaymentpageTitleExpected");
	}

	public String getprofileDetailsPageTitleExpected() {
		return pro.getProperty("profileDetailsPageTitleExpected");
	}

	public String getlogoutPageTextExpected() {
		return pro.getProperty("logoutPageTextExpected");
	}

	public String getselfJobCardPageTextExpected() {
		return pro.getProperty("selfJobCardPageTextExpected");
	}

	public String getkeyissuesTextExpected() {
		return pro.getProperty("keyissuesTextExpected");
	}

	public String getbookServiceButtonExpected() {
		return pro.getProperty("bookServiceButtonExpected");
	}

	public String getcontinueWithNoInternetExpected() {
		return pro.getProperty("continueWithNoInternetExpected");
	}

	public String getvalidatingServiceTypeExpected() {
		return pro.getProperty("validatingServiceTypeExpected");
	}

	public String getContactUsPageTitleExpected() {
		return pro.getProperty("ContactUsPageTitleExpected");
	}

	public String getwhatsappUnderContactUSExpected() {
		return pro.getProperty("whatsappUnderContactUSExpected");
	}

	public String getdealerLocatorPageTitleExpected() {
		return pro.getProperty("dealerLocatorPageTitleExpected");
	}

	public String getdialerPadPageExpected() {
		return pro.getProperty("dialerPadPageExpected");
	}

	public String getdeletingContactPageExpected() {
		return pro.getProperty("deletingContactPageExpected");
	}

	public String getgoodlife199MembershipPageTitleExpected() {
		return pro.getProperty("goodlife199MembershipPageTitleExpected");
	}

	// Logout

	public String getLogoutWindow_textExpected() {
		return pro.getProperty("LogoutWindow_textExpected");
	}

	public String getAreyousuretologout_textExpected() {
		return pro.getProperty("Areyousuretologout_textExpected");
	}

}
