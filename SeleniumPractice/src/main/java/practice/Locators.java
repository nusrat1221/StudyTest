package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		 WebDriver dr = new FirefoxDriver();
		 dr.get("https://facebook.com/");
		 

//ID
		 dr.findElement(By.id("email")).sendKeys("nusrat");
		 
		 dr.findElement(By.id("pass")).sendKeys("Amin");
		 
//name
		 dr.findElement(By.name("email")).sendKeys("nusrat");
		 dr.findElement(By.name("pass")).sendKeys("Amin");

//link text
		 dr.findElement(By.linkText("Forgot Password?")).click();
		 
		 
//partiallinkText
		 //(not recommended)
		 
		 dr.findElement(By.partialLinkText("Voting Information")).click();
		 
//cssSelector
		 dr.findElement(By.cssSelector("#u_0_b")).click();
		 
//Class Name 
		 
		 dr.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Nusrat");
		 
//Xpath
		 dr.findElement(By.xpath("//input[@id='email']")).sendKeys("nusrat");
		 
		 
		 
		 
		 
	}

}
