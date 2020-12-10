package com.DDT.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadData {


	WebDriver driver;
	
	@BeforeTest
	
	public void openbrowser(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	
	public void login(){
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	
	public void status(){
		
		String actual = "Welcome Paul";
		
		String expected = driver.findElement(By.linkText("Welcome Paul")).getText();
		
	    Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	
	public void logout(){
		
		driver.findElement(By.linkText("Welcome Paul")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	
	public void close(){
		
		driver.close();
	}
	
}

	



