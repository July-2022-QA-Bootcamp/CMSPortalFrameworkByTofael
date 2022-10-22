package base;

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
import utils.Configuration;
import static utils.Constant.*;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	protected JavascriptExecutor js;
	protected Actions actions;
	protected WebDriverWait wait;
	
	Configuration config = new Configuration();
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(config.getProperty((URL.name())));
		// to convert String to long --> Long.praseLong()
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT.name()));
		long implicitWait = Long.parseLong(config.getProperty(IMPLICIT_WAIT.name()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		homePage = new HomePage(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterMethod
	public void tearUp() {
		getDriver().quit();
	}
	
	
	
	
	
	

}
