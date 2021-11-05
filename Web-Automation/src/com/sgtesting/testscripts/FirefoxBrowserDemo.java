package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
			launchBrowser();
			navigate();
			closeApplication();
		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Exampleautomation\\Automation\\Web-Automation\\Library\\Drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void navigate()
		{
			try
			{
				oBrowser.get("https://www.google.co.in/");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	


