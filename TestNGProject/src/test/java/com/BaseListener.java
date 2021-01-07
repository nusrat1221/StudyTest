package com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod()+ "is started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod()+"is succed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod()+"took screenshot");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod()+ "is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getStatus());
		
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"is Starting");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println();
		
	}
  
  
}
