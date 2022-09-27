package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	// When you don't define who will test first?
	// It follow the name alphabetically

	// If enabled is true, the test case will run
	// If enabled is false, the test case will not run
	@Test(enabled = false, priority = 1)
	public void logoTest01() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false, priority = 3)
	public void clickUserIdFieldTest01() {
		homePage.clickUserIdField(); // updated again
	}

	@Test(enabled = false, priority = 2)
	public void loginButtonTest01() throws InterruptedException {
		homePage.loginButtonClicked();
	}
	
	@Test(enabled = false)
	public void forgotPasswordTest() throws InterruptedException {
		homePage.forgotPasswordClicked();
	}
	
	// new
	// Important: Use of xpath as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest01() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(3000);
	}
	
	// new
	@Test(enabled = false)
	public void forgotUserIdClickTest() {
		homePage.forgotUserIdClicked();
	}
	
	// new
	// This test case will fail
	// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:{"method":"xpath","selector":"//a[text()='gunlock']"}
	// There is no gunlock as a text in the page
	// This is one of the way to test implicitly wait.
	@Test(enabled = false)
	public void unlockLinkClickedTest() {
		driver.findElement(By.xpath("//a[text()='gunlock']")).click();
	}
	
	// new
	// Important: Use of id attribute as locator
	@Test(enabled = false)
	public void loginButtonTest02() {
		driver.findElement(By.id("cms-login-submit")).click();
	}
	
	// new
	// Important: Use of name attribute as locator
	@Test(enabled = false)
	public void loginButtonTest03() {
		driver.findElement(By.name("Submit Login")).click();
	}
	
	// new
	// Important: Use of class name attribute as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest02() {
		driver.findElement(By.className("cms-newuser-reg")).click();		
	}
	
	// new
	// This is best scripted in ebay
	// Important: Use of linkText as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest03() {
		driver.findElement(By.linkText("New User Registration")).click();		
	}
	
	// new
	// This is best scripted in ebay
	// Important: Use of partialLinkText as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest04() {
		driver.findElement(By.partialLinkText("New User Regi")).click();		
	}
	
	// new
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> first html tag, then dot, then write value of the class attribute inside the string
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest05() {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();	
	}

	// new
	// This is best scripted in ebay
	// Important: Use of cssSelector as locator
	// if the class contain separate words [cms-login-field ng-pristine ng-invalid ng-touched], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void clickUserIdFieldTest02() {
		driver.findElement(By.cssSelector("input.cms-login-field.ng-pristine.ng-invalid.ng-touched")).click();
	}
	
	// new
	// Important: Use of cssSelector as locator
	// cssSelector by id 
	// first html tag, then # (hash), then write the value of id attribute inside the string
	@Test(enabled = false)
	public void loginButtonTest04() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
	}
	
	// new
	// Important: Use of cssSelector as locator
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void loginButtonTest05() {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
	}
	
	/*
	SUB-STRING MATCHES:
    CSS in Selenium has an interesting feature of allowing partial string matches using ^, $, and *.
    https://www.softwaretestingmaterial.com/css-selector-selenium-webdriver-tutorial/
	 */
	
	// new
	// Important: Use of cssSelector as locator
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void loginButtonTest06() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']")).click();
	}
	
	// new
	// Important: Use of cssSelector as locator
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void loginButtonTest07() {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	// new
	// Important: Use of tagName as locator
	// Although here, action is not correct
	@Test(enabled = true)
	public void headerTest() {
		driver.findElement(By.tagName("header")).click();
	}
	
	// new
	// isDisplayed() is an alternate of click() method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element within the web page.
	// Use of isDisplayed() available- image, link, button, text field, check box etc.
	@Test(enabled = false)
	public void logoTest02() {
		boolean elementDisplayed = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class= 'cms-icon cms-sprite-loggedout ms-3']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed); // This is not necessary, I gave you guys comfort about the boolean method
	}
	
	// new
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	
	@Test(enabled = false)
	public void loginButtonTest08() throws InterruptedException {
		boolean loginButtonEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + loginButtonEnabled);
		Thread.sleep(4000);
	}
	
	//new: another example
	@Test(enabled = true)
	public void newUserRegistrationTest() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
