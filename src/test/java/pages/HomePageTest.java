package pages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void clickUserIdFieldTest() {
		homePage.clickUserIdField();
	}

}
