package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	@BeforeSuite
	public void BFsuite() {
		
	}

	@BeforeTest
	public void BfTest() {
		
	}

	@BeforeMethod
	public void BfMethod() {

	}
	@Test
	public void theTest() {
		
	}

	@AfterMethod
	public void AfMethod() {

	}

	@AfterTest
	public void AfTest() {

	}

	@AfterSuite
	public void AFsuite() {

	}
}
