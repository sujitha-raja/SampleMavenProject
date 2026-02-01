package packagename.SampleMavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Hover over Account and list
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	public void hoverOverAccountAndList(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	@FindBy(xpath="//span[. ='Sign in']")
	WebElement signin;
	
	public void signIntoAmazon()
	{
		signin.click();
	}
	
	
//Sign out
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	public void logoutFromAmazon()
	{
		signout.click();
	}
	
//Search field
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public void searchField()
	{
		search.sendKeys("shoe");
	}
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement submit;
	
	public void searchResult()
	{
		submit.click();
	}
}
