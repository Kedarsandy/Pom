package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

	// all the locators

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
	@FindBy(id="spanMessage")
	WebElement invalidMSg;

	// Initialization of variables (locators)
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// steps or methods related to current page

	public void loginMethod(String usernameData, String passwordData) {
		userName.sendKeys(usernameData);
		password.sendKeys(passwordData);
		btnLogin.click();
	}

	public String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String pageUrl() {
		String url = driver.getCurrentUrl();
 	    return url;
	}
	
	public String msgUponInvalidCred(String expectedInvMsg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String invMsg= invalidMSg.getText();
		return invMsg;
	}
	
	public boolean verifyBtnLoginIsDisplayed() {
		return btnLogin.isDisplayed();
	}
}









