package com.farookh.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch_Test1 {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	    public static void googleSearch(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automation Step ByStep");
		//GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step ByStep");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
