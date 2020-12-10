package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListner interface which implements testng listners.

public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("I succsfully executed listners pass code");

	}

	public void onTestSuccess(ITestResult result) {
		//screenshot code
		//response id api is failed

	}

	public void onTestFailure(ITestResult result) {


	}

	public void onTestSkipped(ITestResult result) {


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	public void onStart(ITestContext context) {


	}

	public void onFinish(ITestContext context) {


	}

}
