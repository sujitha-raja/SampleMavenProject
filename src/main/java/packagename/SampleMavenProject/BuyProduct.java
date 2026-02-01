package packagename.SampleMavenProject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct {
	
	@FindBy(name ="proceedToRetailCheckout")
	WebElement proceed;
	
	public void proceedToBuy()
	{
		proceed.click();
	}
	
	@FindBy(linkText="Back to cart")
	WebElement backtocart;
	
	public void clickOnBackToCart()
	{
		backtocart.click();
	}
	
	
	public BuyProduct(SearchContext Driver)
	{
		PageFactory.initElements(Driver, this);
	}

}
