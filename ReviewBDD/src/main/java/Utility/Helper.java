package Utility;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Helper {

		public static void clickByText(List<WebElement> elements, String exText) { 
			// we created this method to get a group of elements to click on an element 
			
			for (WebElement element:elements) {
				if (element.getText().equals(exText)) {
					element.click();
					
				}
			}

	}
		
	public static void click(WebDriver driver, WebElement element) {
		waitForElement(driver, element).click() ;
		
	}

	public static WebElement waitForElement(WebDriver driver, WebElement element) {
		//to wait for every element 
		//instead of using thread
		
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
		
		
	}

	public static void clickByIndex(List<WebElement> elements, int i) { 
		 
		elements.get(i).click();
			
		}
	
	//to get the result we used the return type 
	public static int getCountOfProduct(WebElement element) {
		String text= element.getText();
		return Integer.parseInt(text);
		
	}
}
