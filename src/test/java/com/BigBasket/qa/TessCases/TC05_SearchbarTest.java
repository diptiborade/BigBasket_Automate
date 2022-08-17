package com.BigBasket.qa.TessCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BigBasket.Base.BaseClass;
import com.BigBasket.Logout.LogoutPage;
import com.BigBasket.PanelHighlight.PanelHighlight;
import com.BigBasket.Search.SearchBar;
import com.BigBasket.SelectByCategory.SelectByCategory;
import com.BigBasket.Utility.UtilityClass;

public class TC05_SearchbarTest extends BaseClass
{
	
	
	SearchBar sb ;
	
	
	@BeforeClass
	public void startpage() 
	{
		sb= new SearchBar(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test 
	public void testSearchBar()
	{	
		sb.searchbar();
	}

	

}
