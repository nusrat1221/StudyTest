package saturday;

import org.openqa.selenium.By;

public class Scenario3 {
void abc( ) {
	Common1 e=new Common1();
	//SCENARIO 2:
			/*open Chrome
			 * Go to Aldo.com
			 * search for kids shoes
			 * elect kids
			 * select first product
			 * select size
			 * "add to bag"
			 * click start check out
			 * change to standard delivery 
			 * fill in contact information form, until you get an error
			 * 
			 */
	e.openBrowser();
	e.getWebSite("https://www.aldoshoes.com/us/en_US");
	e.myClick(By.id("regular-menu-usenuskids"));
	
	
	
}
}
