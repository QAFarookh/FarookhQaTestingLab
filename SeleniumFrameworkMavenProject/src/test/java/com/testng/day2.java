package com.testng;

import org.testng.annotations.Test;

public class day2 {

	@Test

	public void loanTest(){

		System.out.println("Money marketing");
		System.out.println("---------------------------");
	}

	@Test(groups={"Smoke"})
	
	public void smoke2(){
		
		System.out.println("Group & testResult of smoke2");
	}
	
	
	
}
