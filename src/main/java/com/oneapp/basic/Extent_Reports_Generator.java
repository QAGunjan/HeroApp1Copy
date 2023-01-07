package com.oneapp.basic;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports_Generator {
	
	public static ExtentHtmlReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		String fileName = getReportName();
		
		String directory= "D:\\JAVA\\Eclipse- workspace\\oneapp\\Reports\\index.html ";
		String path= directory + fileName;
		report = new ExtentHtmlReporter(path);
		
		report.config().setDocumentTitle("Hero_App-Automation Test Report");
		report.config().setReportName("Hero_App");
		report.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Project Name", "Hero_App");
		extent.setSystemInfo("QA", "Gunjan Rawat");
		extent.setSystemInfo("Operating system", "Windows 10");
		return extent;
	}
	
	 public static String getReportName()
	 {
		 Date d= new Date();
		 String fileName = "AutomationReport_" + "_"+ d.toString().replace(":", "_").replace("", "_") + ".html";
		 return fileName;
	 }


}
