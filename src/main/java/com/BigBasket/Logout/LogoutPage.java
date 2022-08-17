package com.BigBasket.Logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoutPage 
{
	@FindBy (xpath="(//span[@class='new-caret'])[1]") private WebElement profiledropdown;
	@FindBy (xpath="//a[@qa='logout']") private WebElement logoutbutton;
	
	public LogoutPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void	clickProfileDropdown(WebDriver driver)
	{
		Actions act = new Actions(driver);
        act.moveToElement(profiledropdown).build().perform();
	}
	
	public void clickLogoutbutton()
	{
		logoutbutton.click();
	}	
	
	
	

}
