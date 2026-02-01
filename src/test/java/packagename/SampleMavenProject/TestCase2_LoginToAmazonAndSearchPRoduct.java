package packagename.SampleMavenProject;

import org.testng.annotations.Test;

public class TestCase2_LoginToAmazonAndSearchPRoduct extends BaseClass
{
	
	@Test
	public void LoginAndSearchPRoduct()
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

}
}