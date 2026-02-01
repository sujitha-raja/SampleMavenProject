package packagename.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase3_ClickOnnSearchResult extends BaseClass
{
	@Test
	public void ClickOnResultProduct()
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
	}

}
