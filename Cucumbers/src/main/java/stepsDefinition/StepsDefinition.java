package stepsDefinition;




import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseTest;
import pages.HomePage;
import pages.ProfilePage;

public class StepsDefinition {
	BaseTest b;
	HomePage h;
	ProfilePage p;
	

@Before
public void open() {
	System.out.println("before every single scenerio");
}
@After
public void close() {
	System.out.println("after every single scenerio");
	
}

@Given("^open chrome browser$")
public void open_chrome_browser(DataTable arg1) throws Throwable {
	List<List<String>> browsers=arg1.raw();
	String browser=browsers.get(1).get(0);
    b=new BaseTest();
    b.openBrowser(browser);
    
}

@Given("^navigate to facebook\\.com$")
public void navigate_to_facebook_com() throws Throwable {
	h=b.gotourl();
	
}

@When("^user type userid in email text box$")
public void user_type_userid_in_email_text_box() throws Throwable {
   h.typeUserId1("myuserid");
}

@When("^user type password in Password type box$")
public void user_type_password_in_Password_type_box() throws Throwable {
	h.typePassWord("mypass");
    
}

@When("^user click in login button$")
public void user_click_in_login_button() throws Throwable {
	System.out.println("");
    p=h.clickOnLogin();
}

@Then("^user should be in his/her profile page$")
public void user_should_be_in_his_her_profile_page() throws Throwable {
	System.out.println("Verified");
    
}

@When("^user type \"([^\"]*)\" in email text box$")
public void user_type_in_email_text_box(String arg1) throws Throwable {
	h.typeUserId1(arg1);
   
}

@When("^user type \"([^\"]*)\" in Password type box$")
public void user_type_in_Password_type_box(String arg1) throws Throwable {
	h.typePassWord(arg1);
}

@Then("^user should not be in his/her profile page$")
public void user_should_not_be_in_his_her_profile_page() throws Throwable {
	if (p.veryfyProfile()) {
	System.out.println("iaminmyprofilpage");
	}
	else 
		System.out.println("iamnotinprofilepage");
   
}



}
