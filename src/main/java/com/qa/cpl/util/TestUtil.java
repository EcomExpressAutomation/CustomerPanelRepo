package com.qa.cpl.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.cpl.base.TestBase;

public class TestUtil extends TestBase {
	
	public static int PAGE_LOAD_TIMEOUT=30;
	public static int IMPLICIT_WAIT=30;
	
/*	public void switchToAlert()
	{
		driver.switchTo().alert();
	}*/
	
	
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		//FileHandler.copy(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
		
		}
	

}
