package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		// 3rd way, to show the location of chrome driver
		// This is a relative path
		// I will use this one till end of the course (relative path, not the gecko driver
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// we used gecko driver + relative path
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		// new	
		// https://chromedriver.chromium.org/downloads -- to get some older version, see below
		// 104.0.5112.79, 104.0.5112.29 etc.
		// if no version is used, please follow below line
		// WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromedriver().setup();
		
		// new
		// for chrome driver
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated version
		WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup(); 
		driver = new ChromeDriver();
		
		// new 
		// for firefox driver
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();
		
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
