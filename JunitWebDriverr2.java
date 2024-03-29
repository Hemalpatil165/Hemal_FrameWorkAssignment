package com_FrameworkAssignment;

import java.sql.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JunitWebDriverr2 
{
	WebDriver driver;

	    @Before
		public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
    }
     @Test
	 public void login() throws InterruptedException {
		WebElement user=driver.findElement(By.name("user_name"));
		
		Actions actions = new Actions(driver);
		
		Action a1 = actions
					.moveToElement(user)
					.click()
					.sendKeys("9879969052")
					.doubleClick()
					.build();
		a1.perform();
		
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.id("password"));
		 
		Action a2 = actions            		
        		.moveToElement(pass)
        		.click()
        		.sendKeys("Hemal0606")
        		.doubleClick()
        		.build();
		
		 a2.perform();
		 WebElement log = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		 Action a3 = actions
				 	.moveToElement(log)
				 	.click()
				 	.build();
		 a3.perform();
         }
	     @After 
		public void after() throws InterruptedException
	     {
	     Thread.sleep(2000);
		 driver.close();
	    }
}
