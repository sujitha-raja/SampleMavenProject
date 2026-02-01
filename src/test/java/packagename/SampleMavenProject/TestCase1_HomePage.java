package packagename.SampleMavenProject;


import org.testng.annotations.Test;

public class TestCase1_HomePage extends BaseClass {
	
	//WebDriver driver;
	@Test
public void withValidCredentials()
{
	HomePage home = new HomePage(driver);
	home.hoverOverAccountAndList(driver);
	home.signIntoAmazon();	
}
	

}
