package packagename.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase5_SearchProductWithoutLogin extends BaseClass {
	
	@Test
	
	public void searchProductWithoutLogin()
	{
		HomePage h = new HomePage(driver);
		//h.hoverOverAccountAndList(driver);
		h.searchField();
		h.searchResult();
	}

}
