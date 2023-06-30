package com.oneapp.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigData {
	public Properties pro;

	public ConfigData() {
		ReadConfigFile();
	}

	public void ReadConfigFile() {
		String ProjectPath = System.getProperty("user.dir") + "\\ConfigTestData\\ConfigData.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(ProjectPath);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getValidLoginExpected() {
		return pro.getProperty("validLoginExpected");
	}

	public String getCommonLoginPageExpected() {
		return pro.getProperty("commonLoginPageExpected");
	}

	public String getInvalidOTPExpected() {
		return pro.getProperty("invalidOTPExpected");
	}

	public String getValidOTPWithNoInternet() {
		return pro.getProperty("validOTPWithNoInternet");
	}

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
}
