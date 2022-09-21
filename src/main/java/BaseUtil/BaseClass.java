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
		// System is a class and setProperty is a method
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.portal.cms\\driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class which implements WebDriver interface
		driver = new ChromeDriver(); // This line will instantiate the Webdriver and chromedriver will be used
		driver.manage().window().maximize(); // or fullscreen() method
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// WebDriver will wait for 20 seconds to load the page and then it will through exception
		// But if the loading is done before 20 seconds, it will go to next level
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Learn from here, very very important interview question
		// Here, WebDriver will wait for 20 seconds to find any web element under this class 
		// and then it will through exception if web element is not found
		// But if the web element is found before 20 seconds, it will go to next step, it means it will not wait for 20 seconds
		
		homePage = new HomePage(driver);
	}

	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	

}
