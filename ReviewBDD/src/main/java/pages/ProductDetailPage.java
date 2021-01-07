package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;

public class ProductDetailPage {
	WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

				
			
	@FindBy(xpath="") List<WebElement> allColours;
	@FindBy(xpath="") List<WebElement> allSizes;
	@FindBy(xpath="") WebElement addToCartButton;
	@FindBy(xpath="") WebElement Cart;
	@FindBy(xpath="") WebElement secondProduct;
	public  void selectColours() {
		Helper.clickByIndex(allColours, 2);
	}
	public  void selectSize() {
		Helper.clickByText(allSizes, "L");
		
	}
	public  void clickAddToCart() {
		Helper.click(driver, addToCartButton);

	}
	public void verifyCartForOneProduct() {
		Helper.getCountOfProduct(Cart);
	
	}
	public void navigateBack() {
		driver.navigate().back();
		
	}
	public void buySecondProduct() {
		Helper.click(driver,secondProduct);
		Helper.clickByIndex(allColours, 3);
		Helper.clickByText(allSizes, "M");
		clickAddToCart();
		
		
	}
	public boolean verifyCartForSecondProduct() {
		int v= Helper.getCountOfProduct(Cart);
	if (v==2) {
		return true;
		
	}
	else return false;
	
		
	}
}

