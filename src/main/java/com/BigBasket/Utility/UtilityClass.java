package com.BigBasket.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityClass {

	static Workbook wb;
	static FileInputStream file;
	static String path; 
 
	public static String TestData1(String propValue) throws EncryptedDocumentException, IOException 
	{

		String value =  UtilityClass.getPropData(propValue);
		return value;
	} 

	
	public static void screenshot(WebDriver driver) throws IOException 
	{
		
		Date d = new Date();
		String timestamp = d.toString().replace(" ", "_").replace(":", "_");
		
		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		String scpath = "E:\\Aspire 2022\\Eclipse\\Workspace\\BigBasket.MavenProject\\Screenshots"+timestamp+".jpg";
		File dest = new File(scpath);
	    FileHandler.copy(src, dest);
		
	}
	
	public static String getPropData(String key) throws IOException  
	{
		Properties propObj = new Properties();
	    file =new  FileInputStream("E:\\Aspire 2022\\Eclipse\\Workspace\\BigBasket.MavenProject\\test-data\\prop.properties");
  	    propObj.load(file);
	    String value = propObj.getProperty(key);
	    return value;  
	}

}
