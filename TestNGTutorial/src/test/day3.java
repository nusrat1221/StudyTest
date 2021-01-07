package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//rahulonlinetutor@gmail.com
public class day3 {
	@BeforeClass
	public void BfClass() {
		System.out.println("i will execute before any methods in class");
	}
	@AfterClass
	public void AfClass() {
		System.out.println("i will execute after all methods in the class");
	}
	@BeforeMethod
	public void BfMethod() {
		System.out.println("this is before method");
	}
	@AfterMethod (enabled=true)
	public void AfMethod() {
		System.out.println("this is after Method");
	}
	@Parameters({"url"})
	@Test
	public void weblogin(String urla) {
		System.out.println("car web login ");
		System.out.println(urla);
	}
	
	@Test(groups= {"smoke"})
	public void mobileLogin() {
		System.out.println("car mobile login ");

	}
	@Test (timeOut=4000)//in miliseconds, when a test is failing because it takes too long, you set it to certain time so that it cn execute 
	public void mobileLogin2() {
		System.out.println("mobile method 2");
	}
	@Test (dependsOnMethods= {"mobileLogin2","mobileLogin"})
	public void Apilogin() {
		System.out.println("car api login ");

	}
	
}
