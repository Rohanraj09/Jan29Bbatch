package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	//@FindBy (xpath="//input[@name='firstname'] ")private WebElement firstname;
	
	@FindBy (xpath="(// input[contains(@type,'text')])[3]")private WebElement lastname;
	
	@FindBy (xpath="//input[@name='reg_email__' ]")private WebElement moboremail;
	
	@FindBy (xpath="//input[@id='password_step_input']")private WebElement password;
	
	@FindBy (xpath="//select[@title='Day']")private WebElement dateset ;
	
	@FindBy (xpath="//select[@aria-label='Month']")private WebElement monthset  ;
	
	@FindBy (xpath="(//label[@class='_58mt'])[2]")private WebElement sexmale ;
	
	@FindBy (xpath="(//button['text()=Sign Up'])[2]")private WebElement signup ;
	@FindBy (xpath="(//div[text()='Get Started'])[1]")private WebElement get ;

//@FindBy (xpath="//*[@id=\"mount_0_0_HF\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[3]/div/div/div/div/div[2]/a/div/div[1]/div/span/span")private WebElement gethelp; ;
	@FindBy (xpath="//*[@id=\"pageFooterChildren\"]/ul/li[28]/a")private WebElement help ;
@FindBy (xpath="(//span[text()='English (UK)'])[1]")private WebElement about;
	public  SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void signupactions() {
		
		//firstname.sendKeys("Rohanraj");
		lastname.sendKeys("Patil");
		moboremail.sendKeys("9511278307");
		password.sendKeys("Rohanraj@8307");
		dateset.sendKeys("9");
		monthset.sendKeys("nov");
		sexmale.click();
		signup.click();
		
	}
	public void help(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
	     help.click();
	}
	
	 public void about(WebDriver driver) throws InterruptedException {
		  Thread.sleep(4000);
		about.click();
	 }	
	
}

