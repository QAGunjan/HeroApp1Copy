package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;

public class Login_Page_Object {

	@FindBy(id = "com.customerapp.hero:id/lbl1")
	private WebElement herologo;

	@FindBy(id = "com.customerapp.hero:id/text_input_editext")
	private WebElement mobile_num_field;

	@FindBy(id = "com.customerapp.hero:id/btn_lbl")
	private WebElement login_btn;

//	@FindBy(id="com.customerapp.hero:id/btn_lay")
//	private WebElement Mob_num_not_regis;

	@FindBys({ @FindBy(className = "android.widget.TextView") })
	private List<WebElement> privacylink;

	@FindBys({ 
	//	@FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
		@FindBy(className = "android.widget.TextView")
		})
	private List<WebElement> term_and_condition_link;
	
	@FindBys({ 
		//	@FindBy(id = "com.customerapp.hero:id/term_nd_cond_lbl"),
			@FindBy(className = "android.widget.TextView")
			})
		private List<WebElement> contact_us_link;
	
	

	public Login_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public WebElement getHerologo() {
		return herologo;
	}

//	public WebElement getMob_num_not_regis() {
//		return Mob_num_not_regis;
//	}

	public WebElement getMobile_num_field() {
		return mobile_num_field;
	}

	public WebElement getlogin_btn() {
		return login_btn;
	}

	public List<WebElement> getPrivacylink() {
		return privacylink;
	}

	public List<WebElement> getTerm_and_condition_link() {
		return term_and_condition_link;
	}

	public List<WebElement> getContact_us_link() {
		return contact_us_link;
	}

	

	
	

}
