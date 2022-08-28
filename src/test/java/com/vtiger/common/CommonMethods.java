package com.vtiger.common;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class CommonMethods {
	private WebDriver driver;
	
	
	public CommonMethods(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void EnterValue(WebElement elm, String value, String elmName)
	{
		try
		{
		elm.clear();
		elm.sendKeys(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			


		}
	}
	
	public void SelectVisibleText(WebElement elm, String value, String elmName)
	{
		try
		{
		Select s = new Select(elm);
		s.selectByVisibleText(value);
		elm.sendKeys(value);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
				}
	}
	
	public void ClickElement(WebElement elm, String elmName)
	{
		try
		{
		elm.click();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
				}
	}
	
	public boolean CheckDisplay(WebElement elm,String elmName)
	{	
		boolean b=false;
		try
		{
		b = elm.isDisplayed();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
		return b;
	}
	
	public String getscreenshot()
	{
	DateFormat f = new SimpleDateFormat("yyyyMMhhmmss");
	Date d = new Date();
	String str = f.format(d);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
	String Path = System.getProperty("user.dir")+"/src/test/java/com/Vtiger/reports/screenshots/image"+str+".png";
	File destFile = new File(Path);
	try
	{
		FileUtils.copyFile(srcFile, destFile);
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return Path;
	}
}
	
	

