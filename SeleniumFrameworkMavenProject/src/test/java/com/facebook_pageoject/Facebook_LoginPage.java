package com.facebook_pageoject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage {
	
	WebDriver ldriver;
	
	public Facebook_LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
		
	}
	
	//Finding elements by page factory
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id = "pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name = "login")
	@CacheLookup
	WebElement btnLogin;
	
	
	//Action Methods
	
	public void setUserName(String uname){
		
    txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String passw){
		
		txtPassword.sendKeys(passw);
	}
	
	public void clickSubmit(){
		
		btnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
