package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {

	WebDriver driver = null;

	@BeforeTest

	public void setUpTest(){

		driver = new FirefoxDriver();

	}

	@Test

	public void googleSerach(){

		driver.get("https://google.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation step by step - raghav pal");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	}
}
