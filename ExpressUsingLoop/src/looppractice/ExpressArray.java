package looppractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpressArray {
	public static int[] copyArray (List<WebElement> eles ) {
		int [] x = new int [eles.length];
		for (int i=0;i<x.length;i++) {
			
		}
		
		return x;
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		WebDriver dr =new FirefoxDriver();  
		dr.get("https://www.express.com");
		List<WebElement> eles = dr.findElements(By.xpath("//nav//ol[@class='MegaMenu_menuList__1Z0gk']"));
		int x =eles.size();
		int [] ar=copyArray(eles);
		for(int z:ar) {
			System.out.println(z);
		}
	}

}
