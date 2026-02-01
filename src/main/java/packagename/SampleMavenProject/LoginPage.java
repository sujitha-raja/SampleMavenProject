package packagename.SampleMavenProject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement username;
	
	public void userName()
	{
		username.sendKeys("sujitha.vishnu11@gmail.com");
	}
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	public void continueButton()
	{
		continuebtn.click();
	}
	
	@FindBy(name="password")
	WebElement pwd;
	
	public void signInPassword()
	{
		pwd.sendKeys("Kiaan@123");
	}
	
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	public void signInSubmitbutton()
	{
		submit.click();
	}
	}
	
	
	
	
	
	
	
	
	
	/* code for amzon login elements
	  WebDriver driver;
	 
	//Step1
	@FindBy(id="email")
	WebElement un;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement login;
	
	//Step2
	public void userName()
	{
		un.sendKeys("sujitha.vishnu11@gmail.com");
	}
	
	public void passWord()
	{
		pwd.sendKeys("pass@123");
	}
	public void loginWithValidCredentials()
	{
		login.click();
	}
     //step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	*/

