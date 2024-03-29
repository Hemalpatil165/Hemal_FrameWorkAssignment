package com_FrameworkAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWebDriverr5
{
	WebDriver driver;
	@Before
	public void before()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://bstackdemo.com/signin/");
	
	driver.manage().window().maximize();
	}
	@Test
	 public void login() throws InterruptedException 
	{
	
	driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]/div[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[text()='demouser']")).click();
	
	driver.findElement(By.className("css-yk16xz-control")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();		
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();

	Thread.sleep(10000);
	}
	@After 
	public void after()
	{
	driver.close();
}
}
