package com.qa.cpl.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.cpl.base.TestBase;
import com.qa.cpl.pages.HomePage;
import com.qa.cpl.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Customer Panel");
	}
	

	@Test(priority=3)
	public void loginTest()
	{
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//homePage= loginPage.login(prop.getProperty("name"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
