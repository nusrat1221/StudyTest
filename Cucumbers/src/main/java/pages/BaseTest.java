package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
public void open() {
	driver=new ChromeDriver();
	
}
	public HomePage gotourl() {
		driver.get("http:/www.facebook.com");
		return new HomePage();
		
	
	
	}
	public void openBrowser(String browser) {
		// TODO Auto-generated method stub
		
	}
}

