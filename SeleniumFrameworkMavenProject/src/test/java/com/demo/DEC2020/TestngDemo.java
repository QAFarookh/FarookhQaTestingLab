package com.demo.DEC2020;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngDemo {

	@Test
	public void demo(){
		System.out.println("a");
	}
	
	@Test(groups={"Smoke"})
	public void demo2(){
		System.out.println("ab");
	}
	
	@BeforeSuite
	public void demo3(){
		System.out.println("abc");
	}
	
	@Test
	public void demo4(){
		System.out.println("abcd");
	}
}
