package looppractice;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpressLoop {

	//public static void main(String[] args) throws Exception {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
		WebDriver dr =new FirefoxDriver();  
		dr.get("https://www.express.com");
//		//WebElement ele = dr.findElement(By.xpath("//div[@class='Header_desktop__3pYiR']/nav/ol/li"));
//		//List<WebElement> ele = ele.findElements(By.tagName("li"));
//		
//		
//		WebElement tops =  dr.findElement(By.xpath("//div[@class='dynamictwocolcomponentlayout abstractdynamicrow section']//div//div[@class='tilecomponent section']/div/a[@class='tile-href' and @aria-label='Womens Tops']"));
//		
//				
//		//women.click();
//		Thread.sleep(2000);
//		tops.click();
//		Thread.sleep(2000);
//		dr.navigate().back();
//		
//		System.setProperty("webdriver.gecko.driver", "/Users/Nusrat/Downloads/geckodriver");
//		WebDriver driver =new FirefoxDriver(); 
//			driver.get("https://www.google.com");  
//			List<WebElement> all_links_webpage = driver.findElements(By.tagName("li")); 
//			System.out.println("Total no of links Available: " + all_links_webpage.size());
//			int k = all_links_webpage.size();
//			System.out.println("List of links Available: ");
//			for(int i=0;i<k;i++)
//			{
//			if(all_links_webpage.get(i).getAttribute("href").contains("google"))
//			{
//			String link = all_links_webpage.get(i).getAttribute("href");
//			System.out.println(link);
//			}   
//			}
//			
		
		// express
		
		
		//perform hover over in menu bar 
		public void hoverOverMenu() {
			dr.get("https://www.express.com");

			int size = dr.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li")).size();
			for (int i=1;i<=size;i++) {
				WebElement ele =dr.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li["+i+"]"));
				Actions a =new Actions(dr);
				a.moveToElement(ele).build().perform();
			
		}
		
		}

		public void hoverOverMenu(List<WebElement> eles) {
			int size = eles.size();
			for (int i=1;i<=size;i++) {
				WebElement ele =eles.get(i);
				Actions a =new Actions(dr);
				a.moveToElement(ele).build().perform();
			}
		}
		
		public void nestedLoops() {
			int s=dr.findElements(By.xpath("//*[@id=\"content\"]/div/div[4]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a")).size();
			for(int i=1;i<=s;i++)
			{
				dr.findElement(By.xpath("//*[@id=\"content\"]/div/div[4]/div/div/div/div[1]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
				int s1=dr.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div/div[1]/a")).size();
				for(int j=1;j<=s1;j++)
				{
					dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div["+j+"]/div[1]/a")).click();
					dr.navigate().back();
				}
				dr.navigate().back();
			}
		
		}
				// check based on user based input 
		public void clickOnMenu(List<WebElement> ele,String text) {
			for(WebElement e:ele)
			{
				if(e.getText().equals(text)) {
					e.click();
					break;
				}
			}
		}
}

