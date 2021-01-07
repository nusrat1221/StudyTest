package com.TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("it will run while project gets start");
		System.out.println("collection of test is called suite");
		System.out.println("usually we will configure code here for reporting of profect");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("it will run before collection of class, which belongs to this test");
		System.out.println("collection of class is called before test");
		System.out.println("usually we will configure code whcih need for "
				+ "each test seperatly loke property file or xl file "
				+ "where project configure date will be stored for each test "
				+ "seperately");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("collection og method if called before class"
				+ "it runs against a class, usually we will write code if one "
				+ "method is dependent on another method");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("It runs against a test annotation usually we will write "
				+ "code which need for each method seperatly");
	}
	@AfterMethod 
	public void aftermethod() {
		System.out.println("am");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("ac");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("at");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("as");
	}
}
