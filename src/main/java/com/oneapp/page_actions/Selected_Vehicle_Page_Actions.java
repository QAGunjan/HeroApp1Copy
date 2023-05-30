package com.oneapp.page_actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.utils.Generic;
import com.oneapp.pageobjects.CommonElements_Page_object;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Selected_Vehicle_Page_Actions {
	public ExcelData exceldata;

	public AndroidDriver ad;
	public HashMap<String, String> hm;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;
	public CommonElements_Page_object cepo;
	public Generic generic;

	public Selected_Vehicle_Page_Actions(AppiumDriver ad2) {
		this.ad = (AndroidDriver) ad2;
		svpo = new Selected_Vehicle_Page_Object(ad2);
		exceldata = new ExcelData();
		cepo = new CommonElements_Page_object(ad2);
		 generic = new Generic();

	}

//	public void selectedVehicleAssertion() throws InterruptedException {
//		Generic.hardAssertion(svpo.getbook_service_PAID_vin(), exceldata.getStringData("Selected Vehicle Page", 1, 1));
//	}

	public void vehicleSelectionAction() throws InterruptedException {
		try {
			if (svpo.getbook_service_PAID_vin().isDisplayed()) {
//		String vin = exceldata.getStringData("Selected Vehicle Page", 1, 1);

				generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
				TestUtils.log().debug("Book service PAID vin selected");
				generic.clickOnWebElement(cepo.getbutton());
			}

		}

		catch (Exception e) {
			generic.clickOnWebElement(svpo.getEdit_Icon_FirstVin());
			generic.clickOnWebElement(svpo.getNickName_TextField());
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			ad.pressKey(new KeyEvent(AndroidKey.DEL));
			Thread.sleep(4000);
			ad.pressKey(new KeyEvent(AndroidKey.B));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.O));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.O));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.K));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.SPACE));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.S));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.E));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.R));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.V));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.I));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.C));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.E));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.SPACE));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.P));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.A));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.I));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.D));
			Thread.sleep(2000);
			ad.pressKey(new KeyEvent(AndroidKey.ENTER));
			Thread.sleep(2000);
			generic.clickOnWebElement(cepo.getbutton());
			generic.clickOnWebElement(cepo.getbutton());

		}
	}

	public void vehicleSelectionActionForGoodlife() throws InterruptedException {
		String vin1 = exceldata.getStringData("Selected Vehicle Page", 2, 1);
		generic.clickOnWebElement(svpo.getGoodlife_membership_vin());
		TestUtils.log().debug("Goodlife membership vin has selected");

		generic.clickOnWebElement(cepo.getbutton());
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
