package com_FrameworkAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider
{
	  @DataProvider(name="hemal")
	  public Object[][] input(){
		  return new Object[][] {{"standard_user","secret_sauce"},
				  {"problem_user","secret_sauce"}};		  
	  }

	  @Test(dataProvider = "hemal")
	  public void f(String username,String password) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/v1/index.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);
			
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
		driver.close();
	  }	
			
	}