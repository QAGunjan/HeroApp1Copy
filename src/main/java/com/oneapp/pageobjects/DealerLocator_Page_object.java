package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.oneapp.basic.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DealerLocator_Page_object extends BaseClass{

	@AndroidFindBy(id = "com.customerapp.hero:id/floating_button2")
	private MobileElement listViewicon;

	@AndroidFindBy(id = "com.samsung.android.dialer:id/digits")
	private MobileElement DialerPad;

	@FindBys({ @FindBy(className = "android.widget.TextView")

	})
	private List<WebElement> DealerLocatorsName;

	@AndroidFindBy(xpath = "//*[@text='Hans Motors']")
	private MobileElement HansMotorsDealerLocatorName;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	private MobileElement callIconBesidesHansMotorsDealer;

	@AndroidFindBy(xpath = "//*[@text='Something went wrong - 102']")
	private MobileElement somethingWentWrong_text;

	

	public MobileElement getListViewicon() {
		return listViewicon;
	}

	public List<WebElement> getDealerLocatorsName() {
		return DealerLocatorsName;
	}

	public MobileElement getHansMotorsDealerLocatorName() {
		return HansMotorsDealerLocatorName;
	}

	public MobileElement getCallIconBesidesHansMotorsDealer() {
		return callIconBesidesHansMotorsDealer;
	}

	public MobileElement getDialerPad() {
		return DialerPad;
	}

	public MobileElement getSomethingWentWrong_text() {
		return somethingWentWrong_text;
	}

}
