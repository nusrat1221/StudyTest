package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utility.Helper;



public class HomePage {
	WebDriver driver;
	@FindBy(xpath="") List<WebElement> menus;
	@FindBy(xpath="") List<WebElement> subMenus;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void hoveroverOnMenu(String exMenuText) {
			Actions ac=new Actions(driver);
			for (WebElement menu:menus) {
				if (menu.getText().equals(exMenuText)) {
					ac.moveToElement(menu).build().perform();
				}
			}
			
			
	}
public ArrivalPage clickOnSubMenu() {
	Helper.clickByText(subMenus, "New Arrivals");
	return new ArrivalPage(driver);
	
	
}
}
