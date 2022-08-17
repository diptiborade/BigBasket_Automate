package com.BigBasket.qa.TessCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BigBasket.Base.BaseClass;
import com.BigBasket.Logout.LogoutPage;
import com.BigBasket.SelectByCategory.SelectByCategory;
import com.BigBasket.Utility.UtilityClass;

public class TC03_ShopbyCategoryVerification extends BaseClass
{


	SelectByCategory sb ;


	@BeforeClass
	public void startpage() 
	{
		sb= new SelectByCategory(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test (priority = 1)
	public void LogoVerification()
	{	
		boolean res = sb.logoVerification();
		if(res==true) {
			Reporter.log("Logo is displayed!",true);
		}

	}

	@Test (priority = 2)
	public void ShopbyCategoryVerification() throws InterruptedException 
	{
		sb.selectbycategory(driver);
		//driver.navigate().back();
	}



}
