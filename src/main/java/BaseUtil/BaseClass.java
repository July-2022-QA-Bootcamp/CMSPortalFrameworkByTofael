package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		/*
		// System is a class and setProperty is a method
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.portal.cms\\driver\\chromedriver.exe");
		*/
		// new
		// 2nd way, to show the location of chrome driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		homePage = new HomePage(driver);
	}

	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	

}
