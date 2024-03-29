package com_FrameworkAssignment;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWebDriverr4
{
		WebDriver driver;

		@Before
		public void before() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
		}
		
		@Test
		 public void login() 
		{
		 	
	List<WebElement> th= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	
	System.out.println("no of row is : "+th.size());
	
	List<WebElement> tr= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	
	System.out.println("no of col is : "+tr.size());
	//TO GET DATA
	for (int i = 1; i <=tr.size(); i++)
	{
		for (int j = 1; j <=th.size(); j++)
		{
String data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]/a")).getText();

	System.out.print("    |   "+data);
		    }
	      }
		}
		 @After 
			public void after() throws InterruptedException
		     {
		Thread.sleep(2000);
	driver.close();
	}

}
