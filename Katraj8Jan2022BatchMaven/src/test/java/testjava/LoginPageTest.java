package testjava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPageTest extends BaseTest {

	@Test(priority=0)
	public void verifyUrlOfPage() {
		String url = loginPage.pageUrl();
		AssertJUnit.assertEquals(url, "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void verifyTitleOfPage() {
		String title = loginPage.pageTitle();
		AssertJUnit.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void verifyLoginWithCorrectCred() {
		loginPage.loginMethod("Admin", "admin123");
		boolean verifyLoginSuccessful = dashboardPage.titleOfDashBoard();
		AssertJUnit.assertEquals(verifyLoginSuccessful, true);
	}
}
