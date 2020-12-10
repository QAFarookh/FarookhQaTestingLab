package com.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.remote.SuiteDispatcher;



public class day3 {

	@Test
	public void webLoginCarLoan(){
		System.out.println("WEB Login Page for car");
	}

	@Parameters({"URL"})
	@Test
	public void mobileLoginCarLoan(String uname){

		System.out.println("MOB Login Page for car");
		System.out.println("uname");
	}

	@Test(dataProvider="getData")
	public void mobileLoginCarLoan2(String username , String password){

		System.out.println("MOB Login Page for car");
		System.out.println(username);
		System.out.println(password);
	}


	@Test(groups={"Smoke"})

	public void smoke3(){

		System.out.println("Group & testResult of smoke3");
	}

	@BeforeSuite

	public void Suit(){

		System.out.println("I am the number one and will eexecute  first");
	}

	@Test
	public void mobileLoginCarLoan3(){

		System.out.println("MOB Login Page for car");
	}
	@Test
	public void mobileLoginCarLoan4(){

		System.out.println("MOB Login Page for car");
	}

	@Test(groups={"Smoke"})

	public void smoke4(){

		System.out.println("Group & testResult of smoke4");
	}
	@Test

	public void loginApiCarLoan()
	{
		System.out.println("API Login Page for car");
		System.out.println("-----------------");
	}

	@DataProvider

	public Object[][] getData(){

		//First combination - username , password - good credit history
		//Second ------------ username , password - no credit history
		//Third ------------- username , password - Scam credit history

		System.out.println("create an multidimnsional araay ");

		Object[][] data = new Object[3][2];

		//1st set
		data[0][0] = "First Set Username";
		data[0][1] =  "password";

		//Coloumns in the row are nothing but values for that particular combination

		//2nd set
		data[1][0] = "Second set username";
		data[1][1] = "Second set password";

		//3rd set
		data[2][0] = "Third set username";
		data[2][1] = "Third set password";
		return data;

	}






















}
