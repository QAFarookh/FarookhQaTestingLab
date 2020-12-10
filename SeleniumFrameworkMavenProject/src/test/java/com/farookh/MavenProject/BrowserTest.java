package com.farookh.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String myUrl= "https://automationstepbystep.com/";
		driver.get(myUrl);
		System.out.println(myUrl);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

}
