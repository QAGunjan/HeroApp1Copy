package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TipsAndDIYVideos_page_object extends BaseClass {

	@AndroidFindBy(xpath = "//*[@text='Pre Bike Riding Tips_Battery']")
	private MobileElement tipsPDFTitleText;

	@AndroidFindBy(xpath = "//*[@text='DIY Videos']")
	private MobileElement DIYVideosText;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@index='2'])[1]")
	private MobileElement TypeCareTextUnderDIYVideos;

	@AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
	private MobileElement VideoPlayerTextUnderTyrecareSection;

	@AndroidFindBy(xpath = "//*[@text='Watch Now']")
	private MobileElement WatchNowUnderTyrecareSection;

	public MobileElement getTipsPDFTitleText() {
		return tipsPDFTitleText;
	}

	public MobileElement getDIYVideosText() {
		return DIYVideosText;
	}

	public MobileElement getTypeCareTextUnderDIYVideos() {
		return TypeCareTextUnderDIYVideos;
	}

	public MobileElement getVideoPlayerTextUnderTyrecareDIYVideos() {
		return VideoPlayerTextUnderTyrecareSection;
	}

	public MobileElement getWatchNowUnderTyrecareSection() {
		return WatchNowUnderTyrecareSection;
	}

}
