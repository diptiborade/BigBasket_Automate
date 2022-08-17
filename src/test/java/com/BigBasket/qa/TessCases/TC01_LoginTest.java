package com.BigBasket.qa.TessCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BigBasket.Base.BaseClass;
import com.BigBasket.Login.LoginPage;
import com.BigBasket.Utility.UtilityClass;

public class TC01_LoginTest extends BaseClass{
	
	
	LoginPage lp ;
	
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		BaseClass.browserLaunch();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lp = new LoginPage(driver);
	}
	
	@Test  (priority=0)
	public void clickLogin() throws InterruptedException 
	{
		Thread.sleep(2000);
		lp.clickloginButton();
		Thread.sleep(2000);
	}
	
	@Test (priority=1)
	public void enterMob() throws IOException, InterruptedException 
	{
		Thread.sleep(2000);
		lp.enterMob(UtilityClass.getPropData("mob"));
	}
	
	
	@Test  (priority=2)
	public void clickContinue() throws InterruptedException 
	{
	     Thread.sleep(2000);
		lp.clickContinueButton();
	}
//	
//	@Test  (priority=3)
//	public void clickverifycontinue() throws InterruptedException 
//	{
//	    Thread.sleep(2000);
//		lp.clickVerifyContinueButton();
//	}
	
//	@AfterTest
//	public void closeBrowser() throws IOException 
//	{
//		BaseClass.browserClose();
//	}
//	
	
	
	
	
	

}
