// 1- How to handles frames ?
package com.interviewquestions.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {
	
public static void main(String[] args) {
	

	WebDriver driver = new FirefoxDriver();

	driver.get("http://demo.guru99.com/test/guru99home/");

	driver.manage().window().maximize();

}
}