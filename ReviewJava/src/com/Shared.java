package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {

	WebDriver dr;
	
	public WebDriver openBrowser() {
		
	dr =new ChromeDriver();
	return dr;
		
	}
	
	public void gotoUrl(String url) {
		dr.get(url);
			
	}
	public void typeonSearch(String text) {
		 dr.findElement(By.xpath("xpath of search box")).sendKeys(text);
	}
	
	
// create one method which can help to finish login scenerio 
	
	public WebElement login(By b) {
		return dr.findElement(b);
		
		
	}
	
// if i went to perform any action with any numeric number 
	
	public int anyName (int x) {
		return x;
		
	}
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	public void clickOnElement(List<WebElement> ele, int i) {
		WebElement r=ele.get(i);
		r.click();
		
	}
}
