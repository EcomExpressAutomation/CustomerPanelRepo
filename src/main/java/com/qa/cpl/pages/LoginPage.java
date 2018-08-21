package com.qa.cpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.cpl.base.TestBase;

public class LoginPage extends TestBase {
	
	//OR--
	@FindBy(xpath= "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='button']")

	WebElement loginBtn;
	
	//Initilize OR
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
/*		public HomePage login(String un, String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.submit();
			
			return new HomePage();
		}*/

		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.submit();
			return new HomePage();
		}



}
