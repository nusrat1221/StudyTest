package saturday;

import org.openqa.selenium.By;

public class Scenario2 {

	//SCENARIO 1:
	/*open Chrome
	 * go top target
	 * click on categories
	 * lick young adult
	 * click top rated
	 * click the first product on the page
	 * select quantity as 3
	 * select YOUR size
	 * click "ship it"
	 * click "view cart and check out"
	 * verify "3" is visible in cart sign
	 * change quantity to 1
	 * verify again "1" is visible in cart sign
	 * click "i'm ready to check out"
	 * input email
	 * input password
	 * click sign in
	 * verify error message is displayed and print the error message.
	 */
void targetbuyproduct() throws InterruptedException {

Common1 d=new Common1();
d.openBrowser();
d.getWebSite("https://www.target.com");
//go to target
d.pageTitle();
d.getUrl();
d.myClick(By.cssSelector("h-padding-l-tiny ArrowSprite-w7d9ld-0 hiyEuV"));//click on categories

Thread.sleep(2000);
d.myClick(By.cssSelector("Row-uds8za-0 kjjHUt")); //click on young adult 
Thread.sleep(2000);
d.myClick(By.cssSelector("Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 ktUEKH"));//click on top rated
Thread.sleep(2000);
d.myClick(By.cssSelector("Link-sc-1khjl8b-0 h-display-block h-text-bold h-text-bs flex-grow-one styles__StyledTitleLink-e5kry1-5 lioQal"));
//click on product
Thread.sleep(2000);
d.myClick(By.cssSelector("select--customLabel Row-uds8za-0 enkgmP"));//click on quantity
Thread.sleep(2000);
d.myClick(By.cssSelector("h-text-md OptionLabel-u6t284-0 jbQdvP"));//click on 3
Thread.sleep(2000);
d.myClick(By.cssSelector("VariationButton__StyledButtonWrapper-sc-1hf3dzx-0 btEntv"));// click on medium
Thread.sleep(2000);
d.myClick(By.cssSelector("Button-bwu3xu-0 jkzMMC"));//click on ship it 
Thread.sleep(2000);
d.verifyElement(By.cssSelector("cartItem-qty"));//verify 3 is visible
Thread.sleep(5000);
d.selectValueInDropDown_value(By.cssSelector("select_30"), "1");
Thread.sleep(4000);
d.verifyElement(By.cssSelector("cartItem-qty"));//verify 1 is visible
Thread.sleep(5000);
d.myClick(By.cssSelector("checkout-button"));
Thread.sleep(4000);
d.typeon(By.cssSelector("username"),"nusrat@gmail.com");
Thread.sleep(5000);
d.typeon(By.cssSelector("password"), "nusrat1234");
Thread.sleep(5000);








}
}
