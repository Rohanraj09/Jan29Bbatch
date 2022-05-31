package maven1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomClasses.HomePage;
import pomClasses.SignupPage;
import utils.Utility;

  public class VarifyFacebookLogin { 
  WebDriver driver; HomePage homepage;
  SignupPage signuppage;
  
  @Parameters ("BrowserName")
  
  @BeforeTest
 public void launchBrowser (String browser) {
	  
	  System.out.println(browser);
	  if(browser.equals("Chrome"))
	  {
		  driver=Base.openChromeBrowser();
	  }
	  if(browser.equals("Firefox"))
	  {
		  driver=Base.openfirefoxBrowser();
	  }
	
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  @BeforeClass 
  public void CreatePOMpage() {
	  homepage= new HomePage (driver);
	  signuppage = new SignupPage (driver);
 
  
  }
  
  @BeforeMethod 
  public void launchapplication()  {
  
  driver.get("https://www.facebook.com/"); 
  }
  
  @Test
  public void open() throws InterruptedException {
  homepage.loginpage(driver);
  Assert.fail();
  signuppage.about(driver);
     
  }
 
   
  @AfterMethod
  public void lagout(ITestResult result) throws IOException {
	  
	  if (ITestResult.FAILURE==result.getStatus()){
		  
	      Utility.captureScreenshot(driver, result.getName());
	  }
  }
  @AfterTest 
 public void logout () {
	 driver.close();
	 driver=null;
	   System.gc();
 }
  
  }

  
  
  
  
  
  
  
 
	
	
	
	
	
	
	
	
	

