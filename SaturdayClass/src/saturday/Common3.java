package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common3 {
ChromeDriver dr;

void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "‎⁨Untitled⁩ ▸ ⁨Users⁩ ▸ ⁨Nusrat⁩ ▸ ⁨Downloads⁩");
	
}

 void getWebsite(String url) {
	// TODO Auto-generated method stub
	dr.get(url);
}

public void myClick(By cssSelector) {
	// TODO Auto-generated method stub
	
}

}
