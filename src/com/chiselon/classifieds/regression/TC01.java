package com.chiselon.classifieds.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Common;
import com.chiselon.classifieds.utilities.OpenBrowsers;

public class TC01 extends Common
{
	OpenBrowsers ob= new OpenBrowsers();
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void browser(String browsernamevalue)
	{
		try
		{
		 driver = ob.bm(browsernamevalue);
		 //return driver;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//return null;
		}
	}
	
	@Test
	public void URL()
	{
		try
		{
		driver.get("https://www.gmail.com");
		}
		catch(Exception a)
		{
			System.out.println(a.getMessage());
		}
	}

}
