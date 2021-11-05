package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
	    createUser();
	    modifyUser();
	    deleteUser();
		logout();
		closeApplication();
	}
    static void launchBrowser()
    {
        try
       {
    	System.setProperty("webdriver.chrome.driver", "D:\\\\Exampleautomation\\\\Automation\\\\Web-Automation\\\\Library\\\\Drivers\\\\chromedriver.exe");
		oBrowser=new ChromeDriver();
       }catch(Exception e)
       {
    	e.printStackTrace();
       }
    }
    static void navigate()
    {
       try
       {
    	oBrowser.navigate().to("http://localhost/login.do");
    	oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
    }
    static void login()
    {
        try
       {
    	oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(6000);
       }catch(Exception e)
       {
    	e.printStackTrace();
       }
    }
    static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    static void createUser()
    {
        try
       {
        oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();	
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    	oBrowser.findElement(By.name("lastName")).sendKeys("User1");
    	oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
    	oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
    	oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
    	oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
    	oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);   
       }catch (Exception e)
       {
        	e.printStackTrace();
       }
    }
    static void modifyUser()
    {
       try
       {
        oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")).click();
        Thread.sleep(2000);
        oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).click();
        Thread.sleep(2000);
        oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("1");
    	oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);   
       }catch (Exception e)
       {
         e.printStackTrace();
       }
    }
    static void deleteUser()
    {
       try
       {
    	oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
   		Thread.sleep(3000);
   		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
   		Thread.sleep(3000);
   		Alert oAlert=oBrowser.switchTo().alert();
   		String str=oAlert.getText();
   		System.out.println(str);
   		oAlert.accept();
   		Thread.sleep(3000);
 
       }catch (Exception e)
       {
    	e.printStackTrace();
       }
    }
    static void logout()
    {
       try
       {
    	oBrowser.findElement(By.id("logoutLink")).click();
   		Thread.sleep(2000);

       }catch(Exception e)
       {
         e.printStackTrace();
       }
    }
    static void closeApplication()
    {
       try
       {
    	oBrowser.quit();
       }catch(Exception e)
       {
    	e.printStackTrace();
       }
    }
}
