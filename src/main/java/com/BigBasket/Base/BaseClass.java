package com.BigBasket.Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BigBasket.Utility.UtilityClass;



public class BaseClass {
	
protected static WebDriver driver=null;
	
	public static void browserLaunch() throws IOException 
	{
		String key = "webdriver.chrome.driver";
		String value = "E:\\Aspire 2022\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key,value );	
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(UtilityClass.getPropData("url"));
		driver.manage().window().maximize();
		
	}
	

	public static void browserClose() 
	{
		driver.close();
		
	}
	
	

}
