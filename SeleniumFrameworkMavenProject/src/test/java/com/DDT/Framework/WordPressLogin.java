package com.DDT.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	
	WebDriver driver ;
	
	@Test(dataProvider="WordpressData")
	
	public void loginToWordPress(String username , String password) throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("https://wordpress.com/log-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("usernameOrEmail")).sendKeys("username");
		driver.findElement(By.className("button form-button is-primary")).click();
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("button form-button is-primary")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//driver.close();
	}
	
	
	@DataProvider(name="WordpressData")
	public Object[][] passData(){
		
		Object[][] data = new Object[4][2];
		
		data[0][0]  =  "admin1";
		data[0][1]  =  "data1";
		
		
		data[1][0]  =  "admin2";
		data[1][1]  =  "data2";
		
		data[2][0]  =  "admin";
		data[2][1]  =  "data123";
		
		data[3][0]  =  "admin3";
		data[3][1]  =  "data3";
		
		

		
		
		return data;		
		
		
		
	}
	

}
