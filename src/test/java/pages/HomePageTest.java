package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.systeminfo.model.VideoDecodeAcceleratorCapability;
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
	
	
	// Important: Use of xpath as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest01() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(3000);
	}
	
	
	@Test(enabled = false)
	public void forgotUserIdClickTest() {
		homePage.forgotUserIdClicked();
	}
	
	
	// This test case will fail
	// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:{"method":"xpath","selector":"//a[text()='gunlock']"}
	// There is no gunlock as a text in the page
	// This is one of the way to test implicitly wait.
	@Test(enabled = false)
	public void unlockLinkClickedTest() {
		driver.findElement(By.xpath("//a[text()='gunlock']")).click();
	}
	
	
	// Important: Use of id attribute as locator
	@Test(enabled = false)
	public void loginButtonTest02() {
		driver.findElement(By.id("cms-login-submit")).click();
	}
	
	
	// Important: Use of name attribute as locator
	@Test(enabled = false)
	public void loginButtonTest03() {
		driver.findElement(By.name("Submit Login")).click();
	}
	
	
	// Important: Use of class name attribute as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest02() {
		driver.findElement(By.className("cms-newuser-reg")).click();		
	}
	
	
	// This is best scripted in ebay
	// Important: Use of linkText as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest03() {
		driver.findElement(By.linkText("New User Registration")).click();		
	}
	
	
	// This is best scripted in ebay
	// Important: Use of partialLinkText as locator
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest04() {
		driver.findElement(By.partialLinkText("New User Regi")).click();		
	}
	
	
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> first html tag, then dot, then write value of the class attribute inside the string
	@Test(enabled = false)
	public void newUserRegistrationButtonClickTest05() {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();	
	}

	
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
	
	
	// Important: Use of cssSelector as locator
	// cssSelector by id 
	// first html tag, then # (hash), then write the value of id attribute inside the string
	@Test(enabled = false)
	public void loginButtonTest04() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
	}
	
	
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
	
	
	// Important: Use of cssSelector as locator
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void loginButtonTest06() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']")).click();
	}
	
	
	// Important: Use of cssSelector as locator
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void loginButtonTest07() {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	
	// Important: Use of tagName as locator
	// Although here, action is not correct
	@Test(enabled = false)
	public void headerTest() {
		driver.findElement(By.tagName("header")).click();
	}
	
	
	// isDisplayed() is an alternate of click() method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element within the web page.
	// Use of isDisplayed() available- image, link, button, text field, check box etc.
	@Test(enabled = false)
	public void logoTest02() {
		boolean elementDisplayed = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class= 'cms-icon cms-sprite-loggedout ms-3']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed); // This is not necessary, I gave you guys comfort about the boolean method
	}
	
	
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	
	@Test(enabled = false)
	public void loginButtonTest08() throws InterruptedException {
		boolean loginButtonEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + loginButtonEnabled);
		Thread.sleep(4000);
	}
	
	// another example
	@Test(enabled = false)
	public void newUserRegistrationTest() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	
	// new
	// from check box
	@Test (enabled = false)
	public void use_of_isSelected_method() {
		boolean checkBoxSelected = driver.findElement(By.cssSelector("label#cms-label-tc")).isSelected();
		System.out.println("Is the Check Box Selected? Ans: " + checkBoxSelected);
	}
	
	// new
	// how can you find the title of the page?
	// right click on an empty place of any page -- click "view page source" -- ctrl+f (to find) -- Type 'title' -- find the <title> tag
	@Test(enabled = false)
	public void use_of_getTitle_method() {
		System.out.println("The title of the Page is: " + driver.getTitle());
	}
	
	// new
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getText_method () {
		WebElement nur = driver.findElement(By.xpath("//a[contains(text(), 'New')]"));
		System.out.println("The text for the Web Element is: " + nur.getText());

	}
	
	// new
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getCurrentURL_method () throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'New')]")).click();
		Thread.sleep(4000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
	}
	
	// new
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getAttribute_method () {
		String value01 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("id");
		String value02 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("class");
		String value03 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("title");
		String value04 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("href");
		System.out.println("The value of the id attribute is: " + value01);
		System.out.println("The value of the class attribute is: " + value02);
		System.out.println("The value of the title attribute is: " + value03);
		System.out.println("The value of the href attribute is: " + value04);
	}
	
	// new
	// We use 'User Id' Field and 'Password' field
	@Test(enabled = false)
	public void use_of_sendKeys_method  () throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("enthrall_12");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='cms-login-password']")).sendKeys("Nabeeha19@12");
		Thread.sleep(5000);		
	}
	
	// use_of_sendKeys_method_then_click_submit_and_then_clear() in ebay
	// use_of_sendKeys_method_then_click_by_enter_key_and_then_clear () in ebay
	
	// new
	@Test(enabled = false)
	public void use_of_navigate_method () throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}
	
	// new
	// Very important interview question	
	@Test(enabled = true)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cvs.com");
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension); // just to show again the set size
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
