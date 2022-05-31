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

public class Demo1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite  Demo1 ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test Demo1");
	}
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Demo1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method Demo1");
	}
	
	@Test
	public void testA() {
		System.out.println("  Test  A  Demo1");
	}
	@Test 
	public void testB() {
		System.out.println("  Test  B  Demo1");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method Demo1");
	}
		@AfterClass
		public void afterclass () {
			System.out.println("after class demo1");
		}
		@AfterTest
		public void aftertest() {
			System.out.println("after test demo1");
		}
		
		@AfterSuite
		public void aftersuite() {
			System.out.println("after suite demo1");
		}
		

}