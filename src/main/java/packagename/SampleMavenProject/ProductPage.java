package packagename.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addcart;
	
	public void addToCart()
	{
		addcart.click();
	}
	
	public ProductPage(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);
	}
	

}
