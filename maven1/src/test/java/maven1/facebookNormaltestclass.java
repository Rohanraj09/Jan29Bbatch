package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.HomePage;

public class facebookNormaltestclass {
	  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {	
	
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		  driver.get("https://www.facebook.com/");
	
		  HomePage homepage = new HomePage (driver);
	
	homepage.loginpage(driver);
	Thread.sleep(2000);
	homepage.Gethelp(driver);
}
}