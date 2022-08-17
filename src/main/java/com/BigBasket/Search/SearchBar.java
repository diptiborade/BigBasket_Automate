package com.BigBasket.Search;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchBar 
{
	@FindBy (xpath="//input[@qa='searchBar']") private WebElement searchbar;
	@FindBy (xpath="//button[@qa='searchBtn']") private WebElement searchbutton;	
	
	public SearchBar(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchbar()
	{		
		searchbar.sendKeys("dark");
		searchbutton.click();
		
	}
	
	
	
	
	
	

}
