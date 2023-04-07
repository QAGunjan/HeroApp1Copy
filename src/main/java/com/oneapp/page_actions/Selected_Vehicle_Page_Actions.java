package com.oneapp.page_actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

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
	public HashMap<String, String> hm;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;

	public Selected_Vehicle_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		svpo = new Selected_Vehicle_Page_Object(ad);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad);

	}

	public void selectedVehicleAssertion() throws InterruptedException {
		Generic.hardAssertion(svpo.getbook_service_PAID_vin(), exceldata.getStringData("Selected Vehicle Page", 1, 1));
	}

	public void vehicleSelectionAction() throws InterruptedException {

		String vin = exceldata.getStringData("Selected Vehicle Page", 1, 1);
		Generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
		TestUtils.log().debug("Book service PAID vin selected");
		Generic.clickOnWebElement(cepo.getbutton());
	}

	public void vehicleSelectionActionForGoodlife() throws InterruptedException {
		String vin1 = exceldata.getStringData("Selected Vehicle Page", 2, 1);
		Generic.clickOnWebElement(svpo.getGoodlife_membership_vin());
		TestUtils.log().debug("Goodlife membership vin has selected");

		Generic.clickOnWebElement(cepo.getbutton());
	}

//		 hm = exceldata.getMapData("Selected Vehicle Page");
//		
//		for (Entry <String, String> map: hm.entrySet())
//		{
//			TestUtils.log().debug(map);
//			
//			String vin = hm.get("Vehicle Nickname1");
//			
//			if (svpo.getbook_service_PAID_vin().getText().equalsIgnoreCase(vin)) {
//				Generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
//				TestUtils.log().debug("Book service PAID vin selected");
//                hm.remove("Vehicle Nickname1");
//                
//			}
//			else {
//				String vin1 = hm.get("Vehicle Nickname2");
//				
//				svpo.getGoodlife_membership_vin().getText().equalsIgnoreCase(vin1);
//				Generic.clickOnWebElement(svpo.getGoodlife_membership_vin());
//				TestUtils.log().debug("Goodlife membership vin has selected");
//			}
//			
//			hm.put("Vehicle Nickname1", "Book service PAID");
//		}
//		{
//			TestUtils.log().debug("Key = "+map.getKey()+", Value = "+map.getValue());
//			
//		}

}
