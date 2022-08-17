package com.BigBasket.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	//@FindBy (xpath="(//a[text()='Login/Sign Up'])[1]") private WebElement loginbtn;
	@FindBy (xpath="(//a[@qa='loginLink'])[2]") private WebElement loginbtn;
	@FindBy (xpath="//input[@name='otpEmail']") private WebElement entermobno;
	@FindBy (xpath="//button[@class='btn btn-default login-btn']") private WebElement continuebtn;
	@FindBy (xpath="//button[@class='btn btn-default btn-lg login-btn fixed-btn']") private WebElement verifycontinuebtn; 
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

	public void	clickloginButton()
	{
		loginbtn.click();	
	}
	
	public void enterMob(String mob) 
	{
	    entermobno.sendKeys(mob);
	}
	
	public void clickContinueButton() 
	{
		continuebtn.click();
	}
	
	
	public void clickVerifyContinueButton() 
	{
		verifycontinuebtn.click();
	}
	
	
	
	

}
