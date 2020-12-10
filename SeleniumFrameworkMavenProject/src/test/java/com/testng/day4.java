package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webLoginHomeLoan(){
		System.out.println("WEB Login Page for Home");
	}

	@Parameters({"URL" ,"APIKey/username"})
	@Test
	public void mobileLoginHomeLoan(String uname ,  String key){

		System.out.println("MOB Login Page for Home");
		
		System.out.println(uname);
		System.out.println(key);
	}

	@Test

	public void loginApiHomeLoan()
	{
		System.out.println("API Login Page for Home");
		System.out.println("-----------------");
	}
}
