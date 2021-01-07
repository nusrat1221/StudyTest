package pom.bdd.review;

import com.bit.test.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ArrivalPage;
import pages.HomePage;
import pages.ProductDetailPage;

public class StepDefinition {
	BaseTest b;
	HomePage hp;
	ArrivalPage ap;
	ProductDetailPage pdp;
	
	
	@Given("^Navigate to url$")
	public void navigate_to_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    b = new BaseTest();
	   hp= b.navigateToUrl();
	}

	@When("^User will hover on my menu$")
	public void user_will_hover_on_my_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.hoveroverOnMenu("NEW");
	}

	@When("^user click on any submenu$")
	public void user_click_on_any_submenu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 ap=  hp.clickOnSubMenu();
	}

	@When("^User click any supecific product from submenu$")
	public void user_click_any_supecific_product_from_submenu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pdp= ap.clickOnProduct();
	    
	}

	@When("^User will select any colour$")
	public void user_will_select_any_colour() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User will select any size$")
	public void user_will_select_any_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User will click add cart button$")
	public void user_will_click_add_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^User should see one product into cart$")
	public void user_should_see_one_product_into_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^User nevigate back$")
	public void user_nevigate_back() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User add another product into cart$")
	public void user_add_another_product_into_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User should see two product into cart$")
	public void user_should_see_two_product_into_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
