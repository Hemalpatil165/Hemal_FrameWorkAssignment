package com_FrameworkAssignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestNGDependsOn 
{
	WebDriver driver;

	@Test
	public void beforeTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/index.html");
	
	Thread.sleep(2000);
    }
    @Test(dependsOnMethods ="beforeTest") 
    		
    public void login() throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	Thread.sleep(2000);
    }
    @Test(dependsOnMethods ="login") 
    public void loginpass() throws InterruptedException {
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
}
    @Test(dependsOnMethods ="loginpass") 
    public void click() throws InterruptedException {
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
    }
	 //take screen shot
    @Test(dependsOnMethods ="click")
	 public void after() throws IOException {
    	
     File file=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
     //copy ss into your file source to destiny..
     Files.copy(file,new File("D:\\Selenium\\SS\\defect_one.png"));
	 }
     @Test(dependsOnMethods ="after") 
     public void aftertest() 
     {
     System.out.println("wow that's done");	 
     driver.close();
    }	

}
