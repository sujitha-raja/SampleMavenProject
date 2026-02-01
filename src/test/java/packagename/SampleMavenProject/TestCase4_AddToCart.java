package packagename.SampleMavenProject;

import org.testng.annotations.Test;

public class TestCase4_AddToCart extends BaseClass {
	
	
	@Test
	public void addProductToCart() throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		home.hoverOverAccountAndList(driver);
		home.signIntoAmazon();	
		
		LoginPage login = new LoginPage(driver);
		login.userName();
		login.continueButton();
		login.signInPassword();
		login.signInSubmitbutton();
		
		home.searchField();
		home.searchResult();
		
		SearchResult sresult = new SearchResult(driver);
		sresult.clickOnFirstProduct();
		
		ProductPage addproduct = new ProductPage(driver);
		addproduct.addToCart();
		
		BuyProduct bp = new BuyProduct(driver);
		bp.proceedToBuy();
		Thread.sleep(3000);
		bp.clickOnBackToCart();
		
		HomePage hp = new HomePage(driver);
		hp.hoverOverAccountAndList(driver);
		hp.logoutFromAmazon();
		
	}
	
	

}
