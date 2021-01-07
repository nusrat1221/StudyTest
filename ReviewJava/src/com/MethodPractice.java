package com;

import org.openqa.selenium.By;

public class MethodPractice {

	public static void main(String[] args) {
		//add selenium jar 
		// create another class 
		//creat four different methods using return type and parameter 
		//1. open blank browser and return driver 
		//2. nevigate to any url 
		//3. type anything on search engine 
		
		
		Shared s=new Shared();
		s.openBrowser();
		s.gotoUrl("https:google.com");
		s.typeonSearch("username");
		
		s.login(By.id("userTextBox")).sendKeys("yourid");
		s.login(By.id("passbox")).sendKeys("yourpassword");
		s.login(By.id("userTextBox")).click();;
		
		int c = s.anyName(8)+10;
		int c1 = s.anyName(81)*10;
		
	}

}
