package looppractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpressHW {

	public static void main(String[] args) throws Exception {
		
	{
		
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		WebDriver dr =new FirefoxDriver();  
		dr.get("https://www.express.com");
		int s = dr.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li")).size();
		for (int i=1;i< s; i++) {
			dr.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li["+i+"]")).click();
			int s1=
		}
	
	
	
		
		
	}
}

	}

