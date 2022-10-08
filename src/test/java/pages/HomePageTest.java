package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	@Test(enabled = true)
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
	public void use_of_scroll_down_and_scroll_up_action () throws InterruptedException {
		// for Scroll Down using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		// for Scroll Up using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
		//Keys.UP or Keys.Down doesn't change much but the test case passes		
	}
	
	// important interview question
	// 2nd way: Scroll by javascriptExecutor
	// scroll in a certain position
	@Test (enabled = true)
	public void use_of_scroll_down_and_scroll_up_action02 () throws InterruptedException {
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
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
