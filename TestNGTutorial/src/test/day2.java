package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void ploan(String URL) {
		System.out.println("this is ploan in Day2");
		System.out.println(URL);
	}
	@BeforeTest
	public void preReq() {
		System.out.println("i will execute first because of @BeforeTest");
	}
	
}
