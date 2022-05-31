package maven1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite  Demo2 ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test Demo2");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class demo2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method demo2");
	}
	
	@Test
	public void testA() {
		System.out.println("  Test  A  demo2");
	}
	@Test 
	public void testB() {
		System.out.println("  Test  B  demo2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method demo2");
}
	@AfterClass
	public void afterclass () {
		System.out.println("after class demo2");

}
	@AfterTest
	public void aftertest() {
		System.out.println("after test demo2");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite demo2");
	}
}