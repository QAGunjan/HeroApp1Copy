package com.oneapp.page_actions;

import java.io.IOException;

import org.testng.Assert;

import com.oneapp.utils.ConfigData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.TipsAndDIYVideos_page_object;
import com.oneapp.utils.ReadPDFText;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class TipsAndDIYVideos_page_action {

	public AndroidDriver ad;
	public TipsAndDIYVideos_page_object tadpo;
	public CommonElements_Page_object cepo;
	public ReadPDFText readpdf;
	public ConfigData configdata;
	public Generic generic;


	public TipsAndDIYVideos_page_action(AndroidDriver ad) {
		this.ad = ad;
		tadpo = new TipsAndDIYVideos_page_object(ad);
		cepo = new CommonElements_Page_object(ad);
		 readpdf = new ReadPDFText();
			configdata	= new ConfigData();
			generic = new Generic();

	}

	public void tipsAndDIYVideosPageAssertionAction() {
		generic.hardAssertion(cepo.getPageTitleText(), configdata.gettipsAndDIYVideosPageTitleExpected());
	}
	
	public void tipsProcessAction() throws IOException, InterruptedException
	{
		generic.clickOnWebElement(tadpo.getTipsPDFTitleText());
		Thread.sleep(6000);
		generic.softAssertion(cepo.getPageTitleText(), configdata.gettipsPageTitleExpected());
		readpdf.ReadContent();
		generic.clickOnWebElement(cepo.getBack_icon());
	}
	
	public void DIYVideosProcessAction()
	{
		if(tadpo.getDIYVideosText().isDisplayed() == true)
		{
			generic.clickOnWebElement(tadpo.getDIYVideosText());	
			generic.softAssertion(tadpo.getTypeCareTextUnderDIYVideos(),configdata.gettypeCareTextUnderDIYVideosExpected() );
			generic.clickOnWebElement(tadpo.getWatchNowUnderTyrecareSection());
			
			generic.hardAssertion(tadpo.getVideoPlayerTextUnderTyrecareDIYVideos(), configdata.getVideoPlayerTextUnderTyrecareDIYVideosExpected());
		}
		
		else
		{
			TestUtils.log().debug("DIYVideos Tab is not available");
			Assert.fail();
		}
		
		
	}
	
	
	

}
