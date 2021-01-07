package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void postReq() {
		System.out.println("i will execute last because @AfterTest");
	}

	@Test
	public void demo() {
		System.out.println("hello");
	}
	@AfterSuite
	public void AFSuite() {
		System.out.println("i will execute after suite ");
	}
	@Test(dataProvider="getData")
	public void secondTest(String s, String s1) {
		System.out.println("12");
		System.out.println(s+" "+s1);
		
	}
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = new Object [3][2];
		data [0][0]= "firstusername";
		data [0][1]= "firstpassword";
		data [1][0]= "secondusername";
		data [1][1]= "secondpass";
		data [2][0]= "thirdusername";
		data [2][1]= "Thirdpass";
		return data;
	}
}
