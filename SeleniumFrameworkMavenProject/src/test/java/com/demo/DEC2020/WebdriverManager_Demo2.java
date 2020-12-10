package com.demo.DEC2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager_Demo2 {

	@Test
	public void openBrowser(){

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		String tittle  =	driver.getTitle();

		System.out.println(tittle);
		
		String pg = driver.getPageSource();
		
		System.out.println(pg);
	}
}
