package com.demo.DEC2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driverRef = new ChromeDriver();
		driverRef.get("https://google.com");
		driverRef.close();
		driverRef.quit();

	}

}