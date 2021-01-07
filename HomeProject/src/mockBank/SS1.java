package mockBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SS1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		WebDriver dr =new FirefoxDriver();  
		dr.get("http://www.demo.guru99.com/V4/");
		WebElement username=dr.findElement(By.name("uid"));
		WebElement password=dr.findElement(By.name("password"));
		WebElement login=dr.findElement(By.name("btnLogin"));
		
		
		
		username.sendKeys("mngr284731");
		password.sendKeys("UpEjAbe");
		login.click();
		dr.getCurrentUrl();
		
	
	
		
		String Actual = dr.getTitle();{
			System.out.println(Actual);
		}
		
        String Expected ="Guru99 Bank Manager HomePage";

        if (Actual.contentEquals(Expected)) {
                   System.out.println("Test Passed!");
        } else {
                   System.out.println("Test Failed");
        }
		
		
	}
	
}
