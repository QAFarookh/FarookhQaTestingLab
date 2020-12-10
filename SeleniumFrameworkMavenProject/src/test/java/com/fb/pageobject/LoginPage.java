package com.fb.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		
		//PageFactory.initElements(factory, page);
	}

}
