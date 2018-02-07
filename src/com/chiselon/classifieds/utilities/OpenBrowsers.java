package com.chiselon.classifieds.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowsers extends Common
{
	//public WebDriver driver;
	@Test
	public WebDriver bm(String browsernamevalue)
	{
		try
		{
			if(browsernamevalue.trim().equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browsernamevalue.trim().equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
				// use above line if fire-fox browser version is above 47.0.1
				driver= new FirefoxDriver();
			}
			else if(browsernamevalue.trim().equalsIgnoreCase("internetexplorer"))
			{
				System.setProperty("webdriver.ie.driver","D:\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe" );
				driver = new InternetExplorerDriver();

			}
			else
			{
				System.out.println(browsernamevalue + "code is invalid");
			}return driver;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}

}
