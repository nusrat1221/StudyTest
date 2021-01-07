package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;


public class ArrivalPage {
	WebDriver driver;
	@FindBy(xpath="") WebElement firstProduct;

	public ArrivalPage (WebDriver driver) {
		this.driver= driver;
		
	
		PageFactory.initElements(driver, this);
	}
	
		
		
	public ProductDetailPage clickOnProduct() {
		Helper.click(driver, firstProduct);
		return new ProductDetailPage(driver);
	
		
	}
	//public ProductDetailPage clickOnSecondProduct() {
	//	Helper.click(driver, secondProduct);
		//return new ProductDetailPage(driver);}
}
