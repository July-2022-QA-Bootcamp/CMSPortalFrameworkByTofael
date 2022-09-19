package BaseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.portal.cms\\driver\\chromedriver.exe");
		driver = new ChromeDriver(); // This line will instantiate the Webdriver and chromedriver will be used
		driver.get("https://portal.cms.gov/portal");
		homePage = new HomePage(driver);
	}

	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	

}
