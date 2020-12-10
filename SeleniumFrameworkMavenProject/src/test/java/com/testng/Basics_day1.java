package com.testng;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Basics_day1 {

	@AfterSuite
    
	public void Exec(){

		System.out.println("I am the no1 but I will execute at the last");
	}

	
	@Test (groups={"Smoke"})
	
	public void smoke1(){
		
		System.out.println("Group & testResult of smoke1");
	}
	
	@Test

	public void demoTest(){

		System.out.println("Hello---TestNG World");
	}

	@Test

	public void demoTest2(){

		System.out.println("This is test case two");
		System.out.println("-----------------");
	}

}
