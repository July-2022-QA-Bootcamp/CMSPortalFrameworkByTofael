package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	protected JavascriptExecutor js;
	protected Actions actions;
	protected WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
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
