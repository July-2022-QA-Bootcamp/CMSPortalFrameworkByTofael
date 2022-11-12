package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

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
		homePage.clickUserIdField1(); // updated again
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
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_new_user_registration_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(3000);
	}
	
	
	@Test(enabled = false)
	public void forgotUserIdClickTest() {
		homePage.forgotUserIdClicked();
	}
	
	
	// This test case will fail
	// Web Element: unlock Link
	// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:{"method":"xpath","selector":"//a[text()='gunlock']"}
	// There is no gunlock as a text in the page
	// This is one of the way to test implicitly wait.
	@Test(enabled = false)
	public void implicitly_wait_test() {
		driver.findElement(By.xpath("//a[text()='gunlock']")).click();
	}
	
	
	// Important: Use of id attribute as locator
	// Web Element: login Button
	@Test(enabled = false)
	public void use_of_id_as_locator_in_login_button () {
		driver.findElement(By.id("cms-login-submit")).click();
	}
	
	
	// Important: Use of name attribute as locator
	// Web Element: login Button
	@Test(enabled = false)
	public void use_of_name_as_locator_in_login_button() {
		driver.findElement(By.name("Submit Login")).click();
	}
	
	
	// Important: Use of class name attribute as locator
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_class_name_as_locator_in_new_user_registration_button () {
		driver.findElement(By.className("cms-newuser-reg")).click();		
	}
	
	
	// This is best scripted in ebay
	// Important: Use of linkText as locator
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_linkText_as_locator_in_new_user_registration_button() {
		driver.findElement(By.linkText("New User Registration")).click();		
	}
	
	
	// This is best scripted in ebay
	// Important: Use of partialLinkText as locator
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_partialLinkText_as_locator_in_new_user_registration_button() {
		driver.findElement(By.partialLinkText("New User Regi")).click();		
	}
	
	// Important: Use of linkText as locator
	// source: ebay - at the bottom of the page, first element from Sell column is 'Start Selling'
	// This text is connected to a link
	@Test (enabled = false)
	public void use_of_linkText_as_locator_in_start_selling_Test() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Start selling")).click(); 
		Thread.sleep(5000);
	}

	// Important: Use of partialLinkText as locator
	// source: ebay - at the bottom of the page, first element from Sell column is 'Start Selling'
	// This partial text also can be used as a locator for connected to a link
	@Test (enabled = false)
	public void use_of_partilLinkText_as_locator_in_start_selling_Test () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Start s")).click();    // Learn from here , use of class attribute
		Thread.sleep(5000);
	}
	
	// Web Element: New User Registration Button
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> first html tag, then dot, then write value of the class attribute inside the string
	@Test(enabled = false)
	public void role1_use_of_cssSelector_as_locator_in_new_user_registration_button () {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();	
	}
	
	// Web Element: Search Field (ebay)
	// Important: Use of cssSelector as locator
	// if the class contain separate words [gh-tb ui-autocomplete-input], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void role2_use_of_cssSelector_as_locator_in_search_field() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).click();
	}
	
	// This is best scripted in ebay above
	// Important: Use of cssSelector as locator
	// if the class contain separate words [cms-login-field ng-pristine ng-invalid ng-touched], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void role2_use_of_cssSelector_as_locator_in_user_id_field() {
		driver.findElement(By.cssSelector("input.cms-login-field.ng-pristine.ng-invalid.ng-touched")).click();
	}
	
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// cssSelector by id 
	// first html tag, then # (hash), then write the value of id attribute inside the string
	@Test(enabled = false)
	public void role3_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
	}
	
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role4_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
	}
	
	/*
	SUB-STRING MATCHES:
    CSS in Selenium has an interesting feature of allowing partial string matches using ^, $, and *.
    https://www.softwaretestingmaterial.com/css-selector-selenium-webdriver-tutorial/
	 */
	
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role5_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']")).click();
	}
		
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role6_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	
	// Important: Use of tagName as locator
	// tag name: header
	// Although here, action is not correct
	@Test(enabled = false)
	public void use_of_tagName_as_locator () {
		driver.findElement(By.tagName("header")).click();
	}
	
	// Web Element: logo
	// isDisplayed() is an alternate of click() method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element within the web page.
	// Use of isDisplayed() available- image, link, button, text field, check box etc.
	@Test(enabled = false)
	public void use_of_isDisplayed_in_iamge() {
		boolean elementDisplayed = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class= 'cms-icon cms-sprite-loggedout ms-3']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed); // This is not necessary, I gave you guys comfort about the boolean method
	}
	
	// Web Element: login Button
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	
	@Test(enabled = false)
	public void use_of_isEnabled_in_button() throws InterruptedException {
		boolean loginButtonEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + loginButtonEnabled);
		Thread.sleep(4000);
	}
	
	// Web Element: New User Registration
	// no need next time
	// another example
	@Test(enabled = false)
	public void newUserRegistrationTest() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	
	
	// Web Element: check box
	@Test (enabled = false)
	public void use_of_isSelected_in_check_box () {
		boolean checkBoxSelected = driver.findElement(By.cssSelector("label#cms-label-tc")).isSelected();
		System.out.println("Is the Check Box Selected? Ans: " + checkBoxSelected);
	}
	
	
	// how can you find the title of the page?
	// right click on an empty place of any page -- click "view page source" -- ctrl+f (to find) -- Type 'title' -- find the <title> tag
	@Test(enabled = false)
	public void use_of_getTitle_method() {
		System.out.println("The title of the Page is: " + driver.getTitle());
	}
	
	
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getText_method () {
		WebElement nur = driver.findElement(By.xpath("//a[contains(text(), 'New')]"));
		System.out.println("The text for the Web Element is: " + nur.getText());

	}
	
	
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getCurrentURL_method () throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'New')]")).click();
		Thread.sleep(4000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
	}
	
	
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
	
	// search field
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop");
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt");
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
				
	}
	
	// search field
	// enter_key = Enther button in your laptop/desktop
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_enter_key_and_then_clear () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt", Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
				
	}
	
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
	
	
	// Very important interview question	
	@Test(enabled = false)
	public void use_of_set_specific_size_in_a_window() throws InterruptedException {
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
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());		
	}
	
	// new
	// not important at all
	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void use_of_set_script_timeout_for_window() {
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
        // setScriptTimeout () method deprecated, so giving you warning, this method is going to be out from selenium
        // you use @SuppressWarnings("deprecation")
		driver.get("https://www.ebay.com");		

	}
	
	@Test(enabled = false)
	public void logoTest03() {
		homePage.logoDisplayed();
	}
	
	// Web Element: logo (mount sinai)
	@Test(enabled = false)
	public void role1_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// Web Element: logo (mount sinai)
	@Test(enabled = false)
	public void role2_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertFalse(false, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// Web Element: logo (mount sinai)
	// This test case will be failed
	@Test(enabled = false)
	public void role3_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertFalse(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// A regular title test
	@Test(enabled = false)
	public void use_of_getTitle_method01() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		System.out.println("The title of the Page is: " + driver.getTitle());
	}
	
	// Will Pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion01() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		String expected = "Mount Sinai Health System - New York City | Mount Sinai - New York";
  		String actual = driver.getTitle();
  		System.out.println("Home Page Title is: "+actual);
  		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ..."); // Hard Assertion
  		String currentURL =	driver.getCurrentUrl();
		System.out.println("The current url from priority 1 is: " + currentURL);
	}

	// Will fail
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion02() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		String expected = "Mount Sinai Health System - New York City |  Mount Sinai - New York";
  		String actual = driver.getTitle();
  		System.out.println("Home Page Title is: "+actual);
  		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ..."); // Hard Assertion
  		String currentURL =	driver.getCurrentUrl();
		System.out.println("The current url from priority 2 is: " + currentURL);
	}

	// will pass
	// use of soft assertion
	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		String expected = "Mount Sinai Health System"; // WHICH is wrong
  		String actual = driver.getTitle();
  		System.out.println("Home Page Title is: "+actual);
  		SoftAssert softAssert  = new SoftAssert(); // Soft Assertion, mainly interview question, not used generally
  		softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ..."); // Soft Assertion
  		// The above condition is not true, but because of soft assertion the execution go to next line
  		String currentURL =	driver.getCurrentUrl();
		System.out.println("The current url from priority 3 is: " + currentURL);
	}
		
	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_aboutUs() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		actions = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		actions.moveToElement(aboutUs).build().perform(); // this syntax interview question
		Thread.sleep(5000);
		
	}
	
	// similar like above, nothing different, extra
	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_ourLocations () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		actions = new Actions(driver); // very important interview question
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(6000);	
		System.out.println("\nThe text of this web element is: "+ ourLocations.getText());
	}
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// here - using selectByIndex() method
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one change the index number
	@Test(enabled=false)
	public void use_of_dropdown_selectByIndex_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select1 = new Select(dropElement);
		select1.selectByIndex(6);
		Thread.sleep(5000);		
	}
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()
	@Test(enabled=false)
	public void use_of_dropdown_selectByVisisbleText_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select2 = new Select(dropElement);
		select2.selectByVisibleText("DVDs & Movies");
		Thread.sleep(5000);		
	}
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled=false)
	public void use_of_dropdown_selectByValue_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select3 = new Select(dropElement);
		select3.selectByValue("58058");		
		Thread.sleep(5000);		
	}
	
	// new
	@Test(enabled = false)
	public void use_of_click_method_in_loginButtonTest () throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000);
	}
	
	// new
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	// new
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}
	
	// new
	// alternate of click()
	// Nasir will use
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest03() {
		WebElement loginBtn = driver.findElement(By.id("cms-login-submit"));
		js.executeScript("arguments[0].click()", loginBtn);
	}
	
	// new
	// alternate of click()
	// "arguments[0].click()" --- easy to memorize, memorize it, if you want
	// follow the above one, because you can use any kind of locator 
	// (specially xpath is difficult to create by below one)
	// Que: what is the alternative of click() method or click an web element 
	// or how to find a hidden web element-- very important interview question 
	// don't follow this one, but if you ever see it, i hope you can recognize it
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest04() {
		js.executeScript("document.getElementById('cms-login-submit').click();");
	}
	
	// From here till end, this is high level, so just see, don't take them seriously
	// alternative to click an web element in many ways (never memorize, a collection of code)
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest06() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.click(homepageLoginButton).perform();
	}
	
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest07() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest08() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.clickAndHold(homepageLoginButton).release().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest09() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}
	
	// search field in ebay and click on submit button, for next one this one was shown
	@Test(enabled = false)
	public void use_of_sendKeys_method_and_clcik() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop");
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);					
	}
	
	// Alternative of sending value in text field --- By using JavascriptExecutor
	// search field in ebay and click on submit button
    // Nasir will use
	@Test(enabled = false)
	public void use_of_sendKeys_method_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		js.executeScript("arguments[0].value='Laptop' ", searchField); // how to send value by javascriptExecutor
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", searchButton);  // how to click by javascriptExecutor
		Thread.sleep(5000);
						
	}
	
	// new
	// it will fail
	@Test(enabled = false)
	public void how_to_handle_hidden_element_by_regular_method() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// identify the 'Hide' element and click on it
		// The search field will be disappeared, but we can pass value on it
		driver.findElement(By.id("hide-textbox")).click();
		// identify element and set value
		// it will fail by below error message
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Enthrall IT");
		Thread.sleep(5000);
	}
	
	// new
	// it will pass
	@Test(enabled = false)
	public void how_to_handle_hidden_element_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// identify the 'Hide' element and click on it
		// The search field will be disappeared, but we can pass value on it
		driver.findElement(By.id("hide-textbox")).click();
		// identify element and set value by JavascriptExecutor
		WebElement field = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		js.executeScript("arguments[0].value='Enthrall IT' ", field);
		Thread.sleep(5000);
		
		// not important
		// Extra code
		// Extra not related to hidden elements and not important
		// To find out what you send as text, not necessary for this scenario
		// Just save the below code for future reference
		String s = (String) js.executeScript("return document.getElementById('displayed-text').value");
		System.out.print("Value entered in hidden field: " + s + "\n");
		
		// not important
		// How to get title of the page by JavaScript
		// How to read a JavaScript variable in Selenium WebDriver?
		String title = (String) js.executeScript("return document.title");
		System.out.println("Title of the webpage : " + title);
	}
	
	// new
	// very very important
	// "request An Appointment" web element
	// using visibilityOfElementLocated() method
	// This is a very common scenario in industry
	// Nasir will use
	
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai01() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
	}
	
	// new
	// very very important
	// "request An Appointment" web element
	// using elementToBeClickable() method
	// This is a very common scenario in industry
    // Nasir will use
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai02() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
	}
	
	// new
	// important
	// "request An Appointment" web element
	// using visibilityOf() method
	// This is a very common scenario in industry
    // Nasir will use
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai03() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement requestAnAppointment = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.visibilityOf(requestAnAppointment)).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
	}
	
	// new
	// not important
	// "request An Appointment" web element
	// using presenceOfElementLocated() method
	// This is a very common scenario in industry
    // Nasir will use
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai04() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
	}
	
	
	// new
	// not important
	// "request An Appointment" web element
	// using textToBePresentInElement() method, this is not a clickable method, just to recognize the web element
	// This is a very common scenario in industry
    // Nasir will use
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai05() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement raa = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.textToBePresentInElement(raa, "Request an Appointment"));
		
	}
	
	// important interview question
	// 1st way: Scroll by Actions class
	// scroll bottom and then top
	@Test (enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_actions_class () throws InterruptedException {
		// for Scroll Down using Actions class at the bottom of the page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		// for Scroll Up using Actions class at the top of the page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
		//Keys.UP or Keys.Down doesn't change much but the test case passes		
	}
	
	// important interview question
	// 2nd way: Scroll by javascriptExecutor
	// scroll in a certain position
	@Test (enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_javascriptExecutor () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// This will scroll down the page by 3000 pixel vertical
		// here 0 is x axis, 3000 y axis
		// you choose your pixel accordingly to reach to that web element
		Thread.sleep(5000);	
		js.executeScript("window.scrollBy(0, 3000)", ""); // scroll down
		Thread.sleep(5000);	
		js.executeScript("window.scrollBy(0, -3000)", ""); // scroll up
		Thread.sleep(4000);
		
		// not related with this test
		driver.navigate().back(); // Back to Mountsinai
		Thread.sleep(4000);	
		// How to refresh, getTitle by Javascript, 
		js.executeScript("history.go(0)"); // To do refresh by Javascript
		String sText = js.executeScript("return document.title;").toString(); // fetching page title by javascript
		System.out.println(sText);
		
	}
	
	// not important, just to know
	@Test (enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_robot_class () throws InterruptedException, AWTException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Robot robot = new Robot();
		
		 // Scroll Down using Robot class
		robot.keyPress(KeyEvent.VK_PAGE_DOWN); // Constant for the PAGE_DOWN virtual key.
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		
		// Scroll Up using Robot class
        robot.keyPress(KeyEvent.VK_PAGE_UP); // Constant for the PAGE_UP virtual key. 
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
        Thread.sleep(5000);
        
        driver.navigate().back();
		
	}
	
	// scroll Into View The Element
	// This is important, standard question
	//TODO Not working, Need to ask Nasir
	@Test(enabled = false)
	public void scrollIntoViewTheElement(WebElement element) throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://portaldev.cms.gov/portal/");
		Thread.sleep(5000);
		WebElement learnMoreAboutEnterprisePortalElement = driver.findElement(By.xpath("//a[text()='Learn more about Enterprise Portal']"));
		js.executeScript("arguments[0].scrollIntoView(true);", learnMoreAboutEnterprisePortalElement);
	}
	
	// important for interview
	@Test(enabled = false)
	public void web_based_alert_accept_test () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println("The text of the Alert is: " + alert.getText()); 
		// line 930, not part of the accept function, 
		// we just added to know about, the text is present in the alert or not
		alert.accept();
		
	}
	
	// important for interview
	@Test(enabled = false)
	public void web_based_alert_reject_test () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.dismiss();
		
	}
	
	// important for interview
	@Test(enabled = false)
	public void authenticationPopUp () throws InterruptedException {
		Thread.sleep(5000);	
		String userName = "admin";
		String password = "admin";
		// adding user name, password with URL
		// original one is: "https://the-internet.herokuapp.com/basic_auth";
		// Updated one is: "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth"; // learn this line, important interview question	
		driver.get(url);
		Thread.sleep(5000);	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		// identify and get text after authentication of popup
		String t = driver.findElement(By.tagName("p")).getText(); // we use tag name as a locator in our course
		System.out.println("Text is: " + t);
	}
	
	// important for interview
	@Test(enabled = false)
	public void use_of_right_click_action () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement rcButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.moveToElement(rcButton).contextClick().build().perform(); // to do the right click, contextClick() is used
		Thread.sleep(3000);
		
		// Just keep below code, Can't find the web element for Edit at present, the line 983 is from my collection.
		// Below 2 is not relevant to right click, just doing some extra, which we know already
		// Next: I want to click on Edit link on the displayed menu options
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		Thread.sleep(5000);
		edit.click(); // a regular click , not a right click
		Thread.sleep(5000);
		
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);		
	}
	
	// important for interview
	@Test(enabled = false)
	public void use_of_double_click_action () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dcButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(dcButton).build().perform(); // to do the double click, doubleClick() is used
		Thread.sleep(3000);
		
		// Not part of the double click action
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);		
	}
	
	// important for interview
	@Test(enabled = false)
	public void use_of_drag_and_drop_action () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Element which needs to drag (Bank)
		WebElement sourceLocator = driver.findElement(By.id("credit2"));
		// Element where need to be dropped.(In 'Account' field of debit side)
		WebElement targetLocator = driver.findElement(By.xpath("//ol[@id='bank']"));
		// We Use Actions class for drag and drop.
		actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(5000);	
		
	}
	
	// not important
	@Test(enabled = false)
	public void use_of_slider_action () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demoqa.com/slider/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Retrieve WebElemnt 'slider' to perform mouse hover
		// This is the field where volume is increased
		WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		Thread.sleep(5000);
		// to test the slider is working or not
		// dragAndDrop (int xoffset, int yoffset)
		actions.dragAndDropBy(slider, 80, 0).build().perform(); // learn from here, 80 is in pixel which might not match with real volume change
		Thread.sleep(5000);
		// slider.click();
		System.out.println("Moved slider in horizontal directions");
	}
	
	// not important (alternate)
	@Test(enabled = false)
	public void use_of_slider_action_alternate () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demoqa.com/slider/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Retrieve WebElemnt 'slider' to perform mouse hover
		// This is the field where volume is increased
		WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		Thread.sleep(5000);
		actions.clickAndHold(slider);
		actions.moveByOffset(65, 0).build().perform();
		Thread.sleep(5000);
		System.out.println("Moved slider in horizontal directions");
	}
	
	@Test(enabled = false)
	public void clickUserIdFieldTest() {
		homePage.clickUserId(); 
	}
	
	@Test(enabled = false)
	public void mouseHoverActionOnAboutUs() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement aboutUs = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		actions.moveToElement(aboutUs).build().perform();
		Thread.sleep(5000);
		
		List<WebElement> listofAboutUs =  driver.findElements(By.xpath("//a[normalize-space(text())='About Us']//following-sibling::div//child::div//child::div"));
		int numberOfElements = listofAboutUs.size();
		System.out.println("Number of web Elements: "+ numberOfElements);
		for(int i=0; i<numberOfElements; i++) {
			System.out.println(listofAboutUs.get(i).getText());
		}
		
		//a[contains(text(), 'About Us')]//following-sibling::div//child::div//child::div
		//a[contains(text(), 'Patient Care')]//following-sibling::div//child::div//child::div
		//a[contains(text(), 'Our Locations')]//following-sibling::div//child::div//child::div
		
	}
	
	@Test(enabled = false)
	public void mouseHoverActionOnPhotos() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.costco.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement photos = driver.findElement(By.xpath("//a[text()='Photo']"));
		Thread.sleep(5000);
		actions.moveToElement(photos).build().perform();
		Thread.sleep(5000);
		List<WebElement> listofPhotos =  driver.findElements(By.xpath("//a[text()='Photo']//following-sibling::div//child::div"));
		int numberOfElements = listofPhotos.size();
		System.out.println("Number of web Elements: "+ numberOfElements);
		for(int i=0; i<numberOfElements; i++) {
			System.out.println(listofPhotos.get(i).getText());
		}
		
		
	}
	
	@Test(enabled = false)
	public void switchWindows01 () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainWindow =  driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainWindow + "\n");
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(3000);
		// interview question:  How you handle windows from parent to child? 
		// or how you can recognize the parent and child window	
		// Get all window handles -- include parent + child
		// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Total Windows Opened: " + allWindowHandles.size());
		// Extract Parent and child window from all window handles
	    String parent = (String) allWindowHandles.toArray()[0]; // first index: parent
	    String child1 = (String) allWindowHandles.toArray()[1]; // second index: child1
	    String child2 = (String) allWindowHandles.toArray()[2]; // second index: child2
	    System.out.println("Parent Window ID: " + parent + "\n");
	    System.out.println("Child1 Window ID: " + child1 + "\n");
	    System.out.println("Child2 Window ID: " + child2 + "\n");
	    // Then switch from one window to other window (parent to child) by below
	    driver.switchTo().window(child1);
		
	}
	
	// same way for moving from child to window for different url
	@Test(enabled = false)
	public void switchWindows02 () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://enthrallit.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// to click seelenium
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(3000);
		
		// This will scroll up the page by 1000 pixel vertically
		Thread.sleep(4000); // used to see the scroll
		js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
		Thread.sleep(4000);
		
		String mainWindow = driver.getWindowHandle(); // learn this line
		System.out.println("Main Window ID: " + mainWindow + "\n");
		
		// click on the Open Window button
		driver.findElement(By.xpath("(//button[text()='Open Window'])[1]")).click();
		Thread.sleep(5000);
		// interview question:  How you handle windows from parent to child? or how you can recognize the parent and child window
		
		// Get all window handles -- include parent + child
		// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allWindowHandles.size());
		// Extract Parent and child window from all window handles
		String parent = (String) allWindowHandles.toArray()[0]; // first index: parent
		String child = (String) allWindowHandles.toArray()[1]; // second index: child 

		//	Use window handle to switch from one window to other window (parent to child)
		driver.switchTo().window(child); // switchTo() -- method is used to switch from one to another
		
	}
	
	// different way for moving from child to window for different url
	@Test(enabled = false)
	public void switchWindows03 () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://enthrallit.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(3000);
		
		// This will scroll up the page by 1000 pixel vertically
		Thread.sleep(4000); // used to see the scroll
		js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
		Thread.sleep(4000);
		
		String mainWindow = driver.getWindowHandle(); // learn this line
		System.out.println("Main Window ID: " + mainWindow + "\n");
		
		// click on the Open Window button
		driver.findElement(By.xpath("(//button[text()='Open Window'])[1]")).click();
		Thread.sleep(5000);
		
		// interview question:  How you handle windows from parent to child? or how you can recognize the parent and child window
		
		// Get all window handles -- include parent + child
		// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Total Windows Open: " + allWindowHandles.size());
		
		// for each loop
		for (String windowHandle : allWindowHandles) {
			if (mainWindow.equals(windowHandle)) {
				System.out.println("\t Window ID 1: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			} else {
				driver.switchTo().window(windowHandle);
				System.out.println("\t Window ID 2: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			}
		}		
		
		
	}
	
	// How to read the content of a Table 
	@Test(enabled = false)
	public void read_table () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon"));
		System.out.println(table.getText());
		
	}
	
	// How to read a row of a Table 
		@Test(enabled = false)
		public void readAnyRowofTheTable () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.amazon.com");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(10000);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			Thread.sleep(5000);
			WebElement row = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon tr:nth-child(3)"));
			System.out.println(row.getText());
			
		}
	
		// How to read a cell of a Table 
		@Test(enabled = false)
		public void readAnyCellOfARowofTheTable () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.amazon.com");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(10000);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			Thread.sleep(5000);
			WebElement cell = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon tr:nth-child(1) td:nth-child(3)"));
			System.out.println(cell.getText());			
		}
		
		@Test(enabled = false, priority = 1, groups = {"functionalTest", "smokeTest", "regressionTest"})
		public void titleTest01() {	
			String expected = "CMS Enterprise Portal";
			String actual = driver.getTitle();
			System.out.println("Home Page Title is: "+actual);
			Assert.assertEquals(actual, expected, "Home Page Title doesn't match ..."); // Hard Assertion
			String currentURL =	driver.getCurrentUrl();
			System.out.println("The current url from priority 1 is: "+currentURL);
		}
		
		@Test (enabled = false, priority = 2, groups = {"functionalTest", "regressionTest"})
		public void titleTest02() {	
			String expected = "A CMS Enterprise Portal"; // WHICH is wrong
			String actual = driver.getTitle();
			System.out.println("Home Page Title is: "+actual);
			Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");	// Hard Assertion, if failed no next step
			String currentURL =	driver.getCurrentUrl();
			System.out.println("The current url from priority 2 is: "+currentURL);
		}
		
		@Test (enabled = false, priority = 3, groups = {"sanityTest", "regressionTest"})
		public void titleTest03() {	
			String expected = "A CMS Enterprise Portal"; // WHICH is wrong
			String actual = driver.getTitle();
			System.out.println("Home Page Title is: "+actual);
			SoftAssert softAssert = new SoftAssert(); 	// Soft Assertion, mainly interview question, not used generally
			softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ..." );
			String currentURL =	driver.getCurrentUrl();
			System.out.println("The current url from priority 3 is: "+currentURL);
			
		}
		
		@Test (enabled = false, priority = 4, groups = {"smokeTest", "functionalTest", "regressionTest"})
		public void logoTest(){
			WebElement logo = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
			boolean flag = logo.isDisplayed();
			System.out.println("Is the logo displayed? Ans: "+flag);
			Assert.assertTrue(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
		
		}
		
		@Test(enabled = false)
		public void use_of_expectedExceptions01 () {
			System.out.println("We can verify whether a code throws the expected exception or not. Here it will fail");
			int i = 1/0;	
		}
		
		@Test(enabled = false, expectedExceptions = ArithmeticException.class)
		public void use_of_expectedExceptions02 () {
			System.out.println("We can verify whether a code throws the expected exception or not. Here it will pass");
			int i = 1/0;	
		}
		
		// It's failing, but should not
		@Test(enabled = false, expectedExceptions = NoSuchElementException.class)
		public void use_of_expectedExceptions03 () throws InterruptedException {
			driver.findElement(By.id("ms-login-submit")).click();
			Thread.sleep(3000);
		}
		
		// use of invocation count, when? -- if you know some test cases fail for no reason
		// and then you fix it, you can run more than one time by invocation count	
		// use of threadPoolSize
		//TODO Is the threadPoolSize working? NEED TO RESOLVED, may be working as multi threaded, can't see, need to be make sure
		@Test (enabled = false, priority = 1, threadPoolSize = 3, timeOut = 10000)
		public void titleTest() {	
			String expected = "CMS Enterprise Portal";
			String actual = driver.getTitle();
			System.out.println("Home Page Title is: "+actual);
			Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
			System.out.println("Thread: "+ Thread.currentThread().getName()); // to know which thread is running

		}
		
		
		@Test (enabled = false, priority = 1, invocationCount = 10, timeOut = 10000)
		public void titleTest04() {	
			String expected = "CMS Enterprise Portal";
			String actual = driver.getTitle();
			System.out.println("Home Page Title is: "+actual);
			Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
			System.out.println("Thread: "+ Thread.currentThread().getName()); // to know which thread is running

		}
		
		@Test (enabled = false)
		public void logoTest02(){
			WebElement logo = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
			boolean flag = logo.isDisplayed();
			System.out.println("Is the logo displayed? Ans: "+flag);
			Assert.assertTrue(true, "Application Logo is not displayed .....");	
		}
		
		@Test(enabled = false, dependsOnMethods = "logoTest02")
		public void newUserRegistrationTest01() {
			boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
			System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
		}	
		// change the logoTest02 method to fail and see the above method skipped as it depends on logoTest02
		
		// Explain in the next class, forgot to add
		@Test(enabled = true, groups = { "functionalTest" })
		public void nonSkipHomePageTitleTest() {
			String expected = "CMS Enterprise Portal";
			String actual = driver.getTitle();
			System.out.println("home page title is: " + actual);
			Assert.assertEquals(actual, expected, "Home Page Title doesn't match...");	
			System.out.println("No need to skip the test");
		}	
		
		@Test(enabled = true, groups = { "functionalTest" })
		public void skipHomePageTitleTest() {
			String title = "CMS Enterprise Portal";
			if (title.equals(driver.getTitle())) {
				throw new SkipException("Skipping -- as the title matches as expected");
			} else {
				System.out.println("Home Page Title doesn't match...");
			}
			System.out.println("I am out of the if else condition");
		}	
		
		// Tough, don't try to understand the code, just understand the concept: time+condition+frequency
		@Test
		public void logoTest04() throws InterruptedException {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElementException.class); // line ends here
			WebElement logo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(
							By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
				}
			});
			logo.isDisplayed();
		}
		

	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
