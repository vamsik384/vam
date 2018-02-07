package com.chiselon.classifieds.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common 
{
	public WebDriver driver;
	
	public void url(WebDriver driver,String browserurl)
	{
		try
		{
		driver.get(browserurl);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

	
	public void sendkey(WebDriver driver,String xpathvalue,String value)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).clear();
		driver.findElement(By.xpath(xpathvalue)).sendKeys(value);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


}
