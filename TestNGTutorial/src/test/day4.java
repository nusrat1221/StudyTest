package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com
public class day4 {
	
	@Test
	public void weblogin() {
		System.out.println("home web login ");
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("home mobile login ");
	}
	@BeforeSuite
	public void BfSuite() {
		System.out.println("i will execute before Suite");
	}
	
	@Test (groups= {"smoke"})
	public void loginAPI() {
		System.out.println("home api login ");

	}
}
