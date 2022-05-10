package testjava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPage;

public class BaseTest extends BaseClass{

	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption	= new ChromeOptions();
		chromeOption.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	//STCM  --------
	@BeforeMethod
	public void allPageObjects() {
		loginPage = new LoginPage(driver);	
		dashboardPage = new DashboardPage(driver);
	}
	
	
	
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
	}
}
