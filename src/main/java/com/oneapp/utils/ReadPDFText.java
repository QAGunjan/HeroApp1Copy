package com.oneapp.utils;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.testautomationguru.utility.PDFUtil;

public class ReadPDFText {
	public PDFUtil pdf;
	public String PDFLocation = "D:\\ECLIPSE_LATEST\\HeroApp1\\PdfFiles\\Pre Bike Riding Tips-Battery.pdf";

	public ReadPDFText() {
		pdf = new PDFUtil();
	}

	public void ReadContent() throws IOException {

		String content = pdf.getText(PDFLocation);
		TestUtils.log().debug(content);
		Assert.assertTrue(content.contains("Conventional Battery"));

	}

}
