package browsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

        public static WebDriver openChromeBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	return driver;
	
        }
        
//	public static WebDriver openOperaBrowser() {
//		System.setProperty("webdriver.opera.driver","C:\\Users\\DELL\\Downloads\\operadriver_win32\\operadriver_win32\\operadriver.exe");
//	
//		 WebDriver driver = new OperaDriver ();
//		 return driver;
//		
//	}
    
public static WebDriver openfirefoxBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");

	 WebDriver driver = new FirefoxDriver ();
	 return driver;
	}
}