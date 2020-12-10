package com.demo.DEC2020;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Aiims_Registration {

	WebDriver driver;

	@BeforeTest

	public void fatherCheckup(){

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ors.gov.in/index.html");
	}

	@Test

	public void operation(){

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul[1]/li/div/div/a[2]")).click();
		driver.findElement(By.name("mbl")).clear();
		driver.findElement(By.name("mbl")).sendKeys("9861030271");
		driver.findElement(By.name("txtkey")).clear();
		driver.findElement(By.name("txtkey")).sendKeys("8d8a7a");
		driver.findElement(By.xpath("//input[@id='sbmt']")).click();

	}
}
