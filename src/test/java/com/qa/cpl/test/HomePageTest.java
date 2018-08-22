package com.qa.cpl.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.cpl.base.TestBase;
import com.qa.cpl.pages.HomePage;
import com.qa.cpl.pages.LoginPage;
import com.qa.cpl.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//driver.switchTo().alert();
		//homePage.clickOncancelBtn();
		
	}
	
	@Test(priority=2)
	public void verifyHomePageTitleTest()
	{
		String title=homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "Customer Pane");
	}
	
	@Test(priority=1)
	public void cancelbtnClickTest()
	{
		homePage.clickOncancelBtn();
	}
	
	@Test(priority=3)
	public void clickOnProfileLinksTest()
	{
		//Thread.sleep(2000);
		homePage.clickOnProfileLinks();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
