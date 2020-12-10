package com.controlstatement;

public class SwapWithoutThirdVariable2 {

	public static void main(String[] args) {
		
		int a = 100;
		int b =  50;
		
       a = a + b;  //a = 150
       b = a - b;  //b = 100
       a = a - b;  //a = 50
		
		
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
		
		

	}

}
