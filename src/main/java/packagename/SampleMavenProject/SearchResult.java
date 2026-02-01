package packagename.SampleMavenProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	List<WebElement> list;
	
	public void clickOnFirstProduct()
	{
		list.get(0).click();
	}
	
	public SearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/*public WebDriver driver;
	
	//step3
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//step1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	//step2
	public void hoverOverAccountAndList(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	

	@FindBy(xpath="//span[text()='Sign in']")
	WebElement signin;
	
	public void signIntoAmazon()
	{
		signin.click();
	}
	*/
	
}
