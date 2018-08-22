package com.qa.cpl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.cpl.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@class='ng-star-inserted']")
	WebElement profileLink;
	
	@FindBy(xpath="//a[@href='#/maindashboard/accountdetails']")
	WebElement accountDetailsLink;
	
	@FindBy(xpath="//a[@href='#/maindashboard/contactdetails']")
	WebElement contactDetailsLink;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	WebElement cancelBtn;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncancelBtn()
	{
		cancelBtn.click();
	
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnProfileLinks()
	{
		profileLink.click();
		//return new ContactsPage();
	}
	
	
	
	
	

}
