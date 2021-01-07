package saturday;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Common {
	
	ChromeDriver dr;
	
	void openBrowser() {
 
	}
	void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
	void getWebSite(String url) {
		dr.get(url);
	}
	void myClick(By locator) {
		//dr.findElement(By.id("")).click();
		
		dr.findElement(locator).click();
	}
	void myType2(By locator, String value) {
		dr.findElement(locator).sendKeys(value);
	}
	void myType(WebElement element, String value) {
		//dr.findElement(By.id("")).sendKeys("");
		
		element.sendKeys(value);
	}
	void getUrl() {
		
		String url = dr.getCurrentUrl();
		System.out.println(url);
	}
	void pageTitle() {
		//if a method returns any value,N if i want to get that value. 
		//I have to assign that method to a variable
		String title = dr.getTitle(); 
		int a = 10;
		int k = a;
		System.out.println(title);
	}
	void verifyElement(By locator) {
		boolean b = dr.findElement(locator).isDisplayed();
		System.out.println("Is element displkayed ? " + b);
	}
	
	void selectValueInDropDown_visibleText(By by, String text) {
		new Select(dr.findElement(by)).selectByVisibleText(text);
	}
	
	void selectValueInDropDown_index(By by, int number) {
		new Select(dr.findElement(by)).selectByIndex(number);
	}
	
	void selectValueInDropDown_value(By by, String text) {
		new Select(dr.findElement(by)).selectByValue(text);
	}
	
	void verifyText(By locator, String expectedText) {
		String actuaTtext = dr.findElement(locator).getText();
		
		if(expectedText.equals(actuaTtext)) {
			System.out.println("Text is Similar");
		}
		else {
			System.out.println("Text did not match");
		}
		
	}
	
	void textPresent(String expectedText) {
		
		String page = dr.getPageSource();
		
		if(page.contains(expectedText)) {
			System.out.println("Text contained as : " + expectedText);
		}
		else {
			System.out.println("Text doesn't contain in the Page source ");
		}
		
	}
	
	
	void getMultipleElements(By by, int elementNumber) {
		
		List<WebElement> ele = dr.findElements(by);
		
		ele.get(elementNumber).click();
	}
	
	
	//--------------------------------------------------------------------------------
	
	
	public WebElement anyAction(By locator) {
		return dr.findElement(locator);
	}

	String verifyText2(By locator, String expectedText) {
		String actuaTtext = dr.findElement(locator).getText();
		
		if(expectedText.equals(actuaTtext)) {
			System.out.println("Text is Similar");
		}
		else {
			System.out.println("Text did not match");
		}
		
		// u must assign a variable 
		return actuaTtext;
	}
}
	
	
	
	
	
	
	
