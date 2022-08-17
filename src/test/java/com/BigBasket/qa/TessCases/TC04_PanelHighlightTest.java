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
import com.BigBasket.SelectByCategory.SelectByCategory;
import com.BigBasket.Utility.UtilityClass;

public class TC04_PanelHighlightTest extends BaseClass
{
	
	
	PanelHighlight ph ;
	
	
	@BeforeClass
	public void startpage() 
	{
		ph= new PanelHighlight(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test 
	public void PanelHoverVerification()
	{	
		
	}

	

}
