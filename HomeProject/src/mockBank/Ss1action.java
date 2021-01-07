package mockBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ss1action {

	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
	WebDriver dr =new FirefoxDriver();  
	dr.get("https://www.express.com/womens-clothing");
	dr.findElement(By.xpath("//div[@class='grid__col-4']//div//div[@class='tilecomponent section']/div/a[@class='tile-href' and @aria-label='Womens Tops']")).click();
	
	
	
	
	// //a[@class='btn btn-underline btn-black' and contains(text(),'TOPS')]
}
	}
