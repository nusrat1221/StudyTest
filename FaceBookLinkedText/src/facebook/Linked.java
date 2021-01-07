package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linked {

	public static void main(String[] args) {
		
		
			
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
			 WebDriver driver = new FirefoxDriver();
			 
			 driver.get("https://facebook.com/");
			 
			 List<WebElement> links = driver.findElements(By.tagName("a"));
			 
			 System.out.println(links.size());
			 
			 for (int i = 1; i<=links.size(); i=i+1)
			 
			 {
			 
			 System.out.println(links.get(i).getText());
			 
			 }
			
			 
			 }
			 
			
	}


