package com.BigBasket.qa.TessCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BigBasket.Base.BaseClass;
import com.BigBasket.Logout.LogoutPage;
import com.BigBasket.Utility.UtilityClass;

public class TC02_LogoutTest extends BaseClass{
	
	
	LogoutPage lp2 ;
	
	
	@BeforeClass
	public void startpage() 
	{
		lp2= new LogoutPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test 
	public void clickProfile()
	{	
		
		lp2.clickProfileDropdown(driver);
	}
	
	@Test (priority = 1)
	public void clickLogout() 
	{
		lp2.clickLogoutbutton();
	}
	
	
	

}
