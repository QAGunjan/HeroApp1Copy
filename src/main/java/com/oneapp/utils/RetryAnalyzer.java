package com.oneapp.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.oneapp.basic.BaseClass;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 1;

	@Override
	public boolean retry(ITestResult result) {

		BaseClass baseclass = new BaseClass();
//		baseclass.Quit_session();
//		baseclass.BrowserSetUp();

		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
