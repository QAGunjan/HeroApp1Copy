package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Actions {
	public ExcelData exceldata;

	public AndroidDriver ad;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;


	public Selected_Vehicle_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		svpo = new Selected_Vehicle_Page_Object(ad);
		 exceldata= new ExcelData();
			cepo = new CommonElements_Page_object(ad);

	}
	
	public void selectedVehicleAssertion() throws InterruptedException
	{	
//		Generic.waitForVisibility(svpo.getbook_service_PAID_vin());
		Generic.hardAssertion(svpo.getbook_service_PAID_vin(), exceldata.getStringData("Selected Vehicle Page", 1, 1));
	}
	public void vehicleSelectionAction() throws InterruptedException {
		String vin=exceldata.getStringData("Selected Vehicle Page", 1, 1);

		if (svpo.getbook_service_PAID_vin().getText().equalsIgnoreCase(vin))
		{
			Generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
        	TestUtils.log().debug("Book service PAID Vin selected");
		}
		
		else
		{
			TestUtils.log().debug("Book service PAID Vin is not selected");
		}
		
		Generic.clickOnWebElement(cepo.getbutton());
	}

	}
