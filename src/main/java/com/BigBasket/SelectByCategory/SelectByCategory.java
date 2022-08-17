package com.BigBasket.SelectByCategory;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SelectByCategory 
{
	@FindBy (xpath="//a[@qa='bbLogo']") private WebElement logo;
	@FindBy (xpath="//li[@class='dropdown full-wid hvr-drop']") private WebElement selectbycategory;
	@FindBy (xpath="(//a[text()='Beauty & Hygiene'])[1]")  private WebElement beauty;
	
	public SelectByCategory(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean logoVerification() 
	{
		boolean result = logo.isDisplayed();
		return result;	
	}
	
	public void selectbycategory(WebDriver driver) throws InterruptedException 
	{
//		 Thread.sleep(2000);
//		selectbycategory.click();
//		 Thread.sleep(2000);
//		beauty.click();
//	    Thread.sleep(2000);
	    	    
		boolean visible = selectbycategory.isDisplayed();
	    System.out.println( "selectbycategory:"+visible);     
	    
	    Actions action = new Actions(driver);
	    action.moveToElement(selectbycategory).click().perform();
	    beauty.click();	
	}
	
	
}
