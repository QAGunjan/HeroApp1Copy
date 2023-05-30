package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TipsAndDIYVideos_page_object {

	@FindBy(xpath = "//*[@text='Pre Bike Riding Tips_Battery']")
	private WebElement tipsPDFTitleText;

	@FindBy(xpath = "//*[@text='DIY Videos']")
	private WebElement DIYVideosText;

	@FindBy(xpath = "//*[@text='Tyre Care']")
	private WebElement TypeCareTextUnderDIYVideos;

	@FindBy(xpath = "//*[@text='Play']")
	private WebElement VideoPlayerTextUnderTyrecareSection;

	@FindBy(xpath = "//*[@text='Watch Now']")
	private WebElement WatchNowUnderTyrecareSection;

	public TipsAndDIYVideos_page_object(AppiumDriver ad2) {

		PageFactory.initElements(ad2, this);

	}

	public WebElement getTipsPDFTitleText() {
		return tipsPDFTitleText;
	}

	public WebElement getDIYVideosText() {
		return DIYVideosText;
	}

	public WebElement getTypeCareTextUnderDIYVideos() {
		return TypeCareTextUnderDIYVideos;
	}

	public WebElement getVideoPlayerTextUnderTyrecareDIYVideos() {
		return VideoPlayerTextUnderTyrecareSection;
	}

	public WebElement getWatchNowUnderTyrecareSection() {
		return WatchNowUnderTyrecareSection;
	}

}
