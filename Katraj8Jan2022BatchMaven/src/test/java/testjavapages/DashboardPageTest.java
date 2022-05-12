package testjavapages;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DashboardPageTest extends BaseTest {

	@Test(priority=5)
	public void verifyLogoutOption() {
		loginPage.loginMethod("Admin", "admin123");
		dashboardPage.logoutProcess();
		boolean verifyLoginBtnDisplayed = loginPage.verifyBtnLoginIsDisplayed();
		Assert.assertEquals(verifyLoginBtnDisplayed, true);
	}
}
