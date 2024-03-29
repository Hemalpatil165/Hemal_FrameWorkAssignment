package com_FrameworkAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWebDriver3
{
WebDriver driver;

@Before
public void before() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				
				 driver=new ChromeDriver();
				
				driver.get("https://demo.guru99.com/test/radio.html");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				}
				@Test
				
				 public void login() throws InterruptedException
				 {
					
			for(int i=1; i<4; i++) {
						driver.findElement(By.id("vfb-7-"+i)).click();
						Thread.sleep(2000);
					}
			}
				 @After 
					public void after() throws InterruptedException
				     {
				     Thread.sleep(2000);
					 driver.close();
				     }
			}
			


