package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	//method overloading is the concept of polymorphism 
	
	
	ChromeDriver dr;
	
	
	//when we need multiple methods with same name in the same class 
	//we can use method overloading concept 
	//we have to change the parameter size or type or sequence 
	// accessModifier and returnType could be same or different 
	public void clickElemen(By by) {
		dr.findElement(by).click();
		
	}
	//public void clickElemen() {
		//dr.findElement().click();
		
	}
	
	
	

