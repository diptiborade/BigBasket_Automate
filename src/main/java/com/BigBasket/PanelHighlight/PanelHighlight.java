package com.BigBasket.PanelHighlight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PanelHighlight 
{
	@FindBy (xpath="(//img[@class='img-responsive ng-scope lazyautosizes lazyloaded'])[3]") private WebElement panel;
	
	public PanelHighlight(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void panelHover(WebDriver driver) throws InterruptedException 
	{
		int x = panel.getLocation().x;
		int y = panel.getLocation().y;
		
		JavascriptExecutor j = ((JavascriptExecutor) driver);
		j.executeScript("scroll("+(x-100)+","+(y-100)+")");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(panel).click().build().perform();		
		
	}
	
	
	
	
	
	

}
