package com.controlstatement;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a = 101;
		int b = 311;
		
       a = a + b;  // a = 101 + 311 = 412
       b = a - b;  // b = 412 - 311 = 101
       a = a - b;  // a = 412 - 101 = 311
		
		
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
		
		

	}

}
