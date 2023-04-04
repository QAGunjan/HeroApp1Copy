package com.oneapp.page_actions;

import java.io.IOException;

import org.testng.Assert;

import com.oneapp.basic.Generic;
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

	public TipsAndDIYVideos_page_action(AndroidDriver ad) {
		this.ad = ad;
		tadpo = new TipsAndDIYVideos_page_object(ad);
		cepo = new CommonElements_Page_object(ad);
		 readpdf = new ReadPDFText();
	}

	public void tipsAndDIYVideosPageAssertionAction() {
		Generic.hardAssertion(cepo.getPageTitleText(), "Tips");
	}
	
	public void tipsProcessAction() throws IOException, InterruptedException
	{
		Generic.clickOnWebElement(tadpo.getTipsPDFTitleText());
		Thread.sleep(6000);
		Generic.softAssertion(cepo.getPageTitleText(), "Pre Bike Riding Tips_Battery");
		readpdf.ReadContent();
		Generic.clickOnWebElement(cepo.getBack_icon());
	}
	
	public void DIYVideosProcessAction()
	{
		if(tadpo.getDIYVideosText().isDisplayed() == true)
		{
			Generic.clickOnWebElement(tadpo.getDIYVideosText());	
			Generic.softAssertion(tadpo.getTypeCareTextUnderDIYVideos(), "Tyre Care");
			Generic.clickOnWebElement(tadpo.getWatchNowUnderTyrecareSection());
			
			Generic.hardAssertion(tadpo.getVideoPlayerTextUnderTyrecareDIYVideos(), "Play");
		}
		
		else
		{
			TestUtils.log().debug("DIYVideos Tab is not available");
			Assert.fail();
		}
		
		
	}
	
	
	

}
