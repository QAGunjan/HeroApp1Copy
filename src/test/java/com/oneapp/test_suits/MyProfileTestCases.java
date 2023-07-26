package com.oneapp.test_suits;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.BaseClass;
import com.oneapp.utils.Console_Colors;
import com.oneapp.utils.TestUtils;

public class MyProfileTestCases extends BaseClass {

	protected String value = "Personal Details";
	SoftAssert sa = new SoftAssert();
	protected List<WebElement> AllText;

	@Test(priority = 400, groups = { "Smoke", "Regression" })
	public void TC201_ValidateValidProfileDetailsTestcase() throws InterruptedException {
		/*
		try {
			if (generic.elementDisplaying(cepo.getAllowing_commom_popup_samsung())) {
				generic.clickOnWebElement(cepo.getAllowing_commom_popup_samsung());
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}

		generic.clearOnTexBox(lpo.getMobile_num_field());
		generic.sendKeysOnTextfields(lpo.getMobile_num_field(), exceldata.getStringData("Login Page", 1, 1));
		generic.clickOnWebElement(cepo.getbutton());

		generic.waitForVisibility(opo.getVerify_with_OTP());

		Assert.assertEquals(opo.getVerify_with_OTP().getText(), configdata.getValidLoginExpected());

		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

		generic.clickOnWebElement(cepo.getbutton());

		if (generic.elementDisplaying(svpo.getbook_service_PAID_vin())) {
			generic.clickOnWebElement(svpo.getbook_service_PAID_vin());
			TestUtils.log().debug("Book service PAID vin selected");
			generic.clickOnWebElement(cepo.getbutton());
		}

		try {
			if (generic.elementDisplaying(dpo.getDevice_location_popup_samsung())) {
				generic.clickOnWebElement(cepo.getOnlyThisTime_popup_samsung());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			TestUtils.log().debug(Console_Colors.Red_color() + e + Console_Colors.Reset_color());
		}
*/
		generic.clickOnWebElement(dpo.getMenu_bar_icon());
		generic.clickOnWebElement(mbpo.getMyprofile_menu_bar_txt());

		generic.waitForVisibility(cepo.getPageTitleText());
		sa.assertEquals(cepo.getPageTitleText().getText(), configdata.getprofileDetailsPageTitleExpected());

		generic.clickOnWebElement(mppo.getMoredetails_link());
		generic.clickOnWebElement(cepo.getbutton());

		generic.clearOnTexBox(pdpo.getFullname_textfield());

		HashMap<String, String> testD = exceldata.hashmapping("My Profile", 12);
		for (Entry<String, String> map : testD.entrySet()) {
			generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), map.getValue()); // "My Profile"
			generic.clickOnWebElement(cepo.getbutton());
			Thread.sleep(3000);

			AllText = pdpo.getPersonal_details_text();

			generic.itratingOnWebelements(AllText, value);

			if (!value.equalsIgnoreCase("Personal Details")) {
				TestUtils.log().debug("This validation is making test failed - > " + map.getValue());
				generic.waitForVisibility(pdpo.getPersonalDetails());
				sa.assertEquals(pdpo.getPersonalDetails().getText(), value);

				generic.clickOnWebElement(cepo.getbutton());
			}

		}
		generic.sendKeysOnTextfields(pdpo.getFullname_textfield(), exceldata.getStringData("My Profile", 5, 1));

		if (generic.elementSelecting(pdpo.getGender_checkbox())) {
			TestUtils.log().debug("Female is already selected");
		}

		else {
			generic.clickOnWebElement(pdpo.getGender_checkbox());
			TestUtils.log().debug("Female was not selected earlier but now it has been selected");
		}

		HashMap<String, String> testD2 = exceldata.hashmapping("My Profile", 23);
		for (Entry<String, String> map1 : testD2.entrySet()) {
			generic.sendKeysOnTextfields(pdpo.getEmailfield(), map1.getValue()); // "My Profile"
			generic.clickOnWebElement(cepo.getbutton());
			Thread.sleep(3000);

			AllText = pdpo.getPersonal_details_text();

			generic.itratingOnWebelements(AllText, value);

			if (!value.equalsIgnoreCase("Personal Details")) {
				TestUtils.log().debug("This validation is making test failed - > " + map1.getValue());
				generic.waitForVisibility(pdpo.getPersonalDetails());
				sa.assertEquals(pdpo.getPersonalDetails().getText(), value);

			}

		}

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100000);
		String email = exceldata.getStringData("My Profile", 1, 1);
		String front_email = email.substring(0, 6);
		String end_email = email.substring(9, 19);
		pdpo.getEmailfield().sendKeys(front_email + randomInt + end_email);

		generic.clickOnWebElement(pdpo.getDatefield());
		generic.clickOnWebElement(pdpo.getEdit_under_date_field());

		HashMap<String, String> testD3 = exceldata.hashmapping("My Profile", 34);
		for (Entry<String, String> map2 : testD3.entrySet()) {
			generic.sendKeysOnTextfields(pdpo.getEditing_date(), map2.getValue()); // "My Profile"

			try {
				generic.clickOnWebElement(pdpo.getOk_text());
			} catch (Exception e) {
				TestUtils.log().debug(e);
			}
			String value2 = "OK";

			if (!value2.equalsIgnoreCase(pdpo.getOk_text().getText())) {
				TestUtils.log().debug("This validation is making test failed - > " + map2.getValue());
				generic.waitForVisibility(pdpo.getOk_text());
				sa.assertEquals(pdpo.getOk_text().getText(), value2);
				generic.clickOnWebElement(pdpo.getOk_text());

			}

		}

		generic.sendKeysOnTextfields(pdpo.getEditing_date(), exceldata.getStringData("My Profile", 2, 1));
		generic.clickOnWebElement(pdpo.getOk_text());
		generic.scrollingToWebElement("Address");
		generic.sendKeysOnTextfields(pdpo.getAddress_field(), exceldata.getStringData("My Profile", 3, 1));

		if (pdpo.getPincode_field().getText().contains("11")) {
			generic.clearOnTexBox(pdpo.getPincode_field());
		}
		generic.sendKeysOnTextfields(pdpo.getBlank_pincode_field(), exceldata.getStringData("My Profile", 4, 1));
		generic.clickOnWebElement(cepo.getbutton());

		sa.assertAll();
	}

}
