package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // PageFactory class help to instantiate WebElement
	}
	// 1st way: Most common way to write the WebElement (@FindBy), you must know how to do that
	// Use of xpath as locator
	
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class= 'cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;

	@FindBy(xpath = "//input[@id='cms-login-userId']")
	WebElement userId;
	
	// Important: Use of Id attribute as locator
	@FindBy(id = "cms-login-submit")
	WebElement loginButton;
	
	// 2nd way to write the WebElement: tough, you need to recognize if used in your office,
	// no need to use this in your framework
	@FindBy(how = How.XPATH, using = "//a[text()='Password' and @id ='cms-forgot-password']")
	WebElement forgotPassword;
	
	// new
	// 3rd way to write the WebElement: not common, here forgotUserId, I used
	By forgotUserId = By.id("cms-forgot-userid");
		
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	
	public void clickUserIdField1() {
		userId.click();
	}
	
	public void loginButtonClicked() throws InterruptedException {
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
	}
	
	public void forgotPasswordClicked () throws InterruptedException {
		Thread.sleep(5000);
		forgotPassword.click();
		Thread.sleep(5000);
	}
	
	// new
	// This is not common, 
	public void forgotUserIdClicked() {
		driver.findElement(forgotUserId).click();
	}
	
	public void clickUserId() {
		click(userId);
	}
	
	
	

}
