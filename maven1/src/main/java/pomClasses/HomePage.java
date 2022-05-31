package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

 @FindBy (xpath="//input[@id='email']")private WebElement username;
	
@FindBy (xpath="//input[@id='pass']")private WebElement password;
	
@FindBy (xpath="/button[@value='1']")private WebElement login;

@FindBy (xpath="//a[text( )='Create New Account']")private WebElement createnewaccount;

@FindBy (xpath="//input[@name='firstname'] ")private WebElement firstname;

@FindBy (xpath="//input[@id='password_step_input']")private WebElement password2;

@FindBy (xpath="//select[@aria-label='Month']") private WebElement date;

@FindBy (xpath="(//label[@class='_58mt'])[2]")private WebElement sexmale ;

@FindBy (xpath="//a[text()='Create Page']")private WebElement page ;
//*[@id="pageFooterChildren"]/ul/li[28]/a
@FindBy (xpath="//*[@id=\"pageFooterChildren\"]/ul/li[28]/a")private WebElement help ;


@FindBy (xpath="(//span[text()='English (UK)'])[1]")private WebElement about; 


private WebDriver driver;
    private WebDriverWait wait;
     public HomePage (WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
    	// wait = new WebDriverWait(driver,20);
     }
     public void sendusername() {
    	 username.sendKeys("9511278307");
     }
     public void sendpassword() {
    	  password.sendKeys("Rohanraj");
      }
     public void clicklogin () {
    	  login.click();
      }
     public void clickcreatenewacc() {
    	 //wait=new WebDriverWait(driver,30);
    	//  wait.until(ExpectedConditions.visibilityOf(createnewaccount));
    	 createnewaccount.click();
     }
      public void firstname() {
    	  wait=new WebDriverWait(driver,20);
    	  wait.until(ExpectedConditions.visibilityOf(firstname));
    	  firstname.sendKeys("Rohanraj");
      }
      
      public void password2() {
    	  wait=new WebDriverWait(driver,20);
    	  wait.until(ExpectedConditions.visibilityOf(password2));
    	  password2.sendKeys("6878855");
      }
      //OR
      public void loginpage (WebDriver driver) throws InterruptedException {
    	  username.sendKeys("9511278307");
    	  password.sendKeys("Rohanraj");
    	  //login.click();
//    	  createnewaccount.click();
//    	  Thread.sleep(3000);
//			
//			  firstname.sendKeys("Rohanraj");
//			  password2.sendKeys("6878855");
//			  Thread.sleep(4000); 
//			  Select s = new Select (date);
//			  s.selectByVisibleText("Nov"); sexmale.click();
			   Thread.sleep(4000);
			   help.click();
			   Thread.sleep(4000);
			  // driver.switchTo();
			 //  about.click();
			   
    	  }
			
		public void senddate(WebDriver driver) throws InterruptedException {
				
		wait=new  WebDriverWait(driver,20); 
		wait.until(ExpectedConditions.visibilityOf(date));
	   Select s = new Select (date); 
	  s.selectByVisibleText("Nov"); }
			 
    	  
    	  public void male () {
    		  sexmale.click();
    	  }
    	  
    	  public void help() throws InterruptedException {
    		  help.click();
    		
//   		  ArrayList<String> t= new ArrayList (driver.getWindowHandles());
//  		   
// 		    driver.switchTo().window( t.get(1));
  		    Thread.sleep(4000);
    	  }
    	  
    	  public void Gethelp(WebDriver driver) throws InterruptedException {
    		 // ArrayList<String> t= new ArrayList (driver.getWindowHandles());
     		   
   		   // driver.switchTo().window( t.get(0));
    		  about.click();
    		
    
    		
    	  } 
}  
   
      

