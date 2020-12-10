package com.facebook_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook_pageoject.Facebook_LoginPage;

public class Tc1_FbLoginTest101 extends BaseClass {
	
	//Here write down the actual testcase
	
	@Test
	public void loginTest(){
		
		driver.get(baseUrl);
		
		Facebook_LoginPage fb=new Facebook_LoginPage(driver);
		fb.setUserName(userName); 
		fb.setPassword(password);
		fb.clickSubmit();
		
		//Verify the page title
		String title=driver.getTitle();
		System.out.println(title);
		
		//Validation by using assert
		
		if(title.equals("Facebook")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
		
		
		
	}

}
