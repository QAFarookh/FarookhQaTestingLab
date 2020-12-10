package com.facebook_TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "https://www.facebook.com/";
	
	public String userName = "qafarookh@gmail.com";
	
	public String password = "Tester@123";
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public void setUp(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver.exe");
		
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	
	public void tearDown(){
		
		driver.quit();
	}
	

}
