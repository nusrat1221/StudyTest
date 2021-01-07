package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;


public class BaseTest {
	
	WebDriver driver;
	public HomePage navigateToUrl() {
		driver =new ChromeDriver();
		driver.get("http://www.express.com");
		
		return new HomePage(driver);
		
		
		
	}

}
