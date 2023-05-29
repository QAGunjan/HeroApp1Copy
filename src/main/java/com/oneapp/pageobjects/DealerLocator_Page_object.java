package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DealerLocator_Page_object {

	@FindBy(id = "com.customerapp.hero:id/floating_button2")
	private WebElement listViewicon;

	@FindBy(id = "com.samsung.android.dialer:id/digits")
	private WebElement DialerPad;

	@FindBys({ @FindBy(className = "android.widget.TextView")

	})
	private List<WebElement> DealerLocatorsName;

	@FindBy(xpath = "//*[@text='Hans Motors']")
	private WebElement HansMotorsDealerLocatorName;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement callIconBesidesHansMotorsDealer;

	@FindBy(xpath = "//*[@text='Something went wrong - 102']")
	private WebElement somethingWentWrong_text;

	public DealerLocator_Page_object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);
	}

	public WebElement getListViewicon() {
		return listViewicon;
	}

	public List<WebElement> getDealerLocatorsName() {
		return DealerLocatorsName;
	}

	public WebElement getHansMotorsDealerLocatorName() {
		return HansMotorsDealerLocatorName;
	}

	public WebElement getCallIconBesidesHansMotorsDealer() {
		return callIconBesidesHansMotorsDealer;
	}

	public WebElement getDialerPad() {
		return DialerPad;
	}

	public WebElement getSomethingWentWrong_text() {
		return somethingWentWrong_text;
	}

}
