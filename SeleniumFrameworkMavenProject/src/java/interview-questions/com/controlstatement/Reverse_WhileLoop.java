package com.controlstatement;

public class Reverse_WhileLoop {

	public static void main(String[] args) {
		
		int number = 987654321;
		
		int reminder ;
		
		int reverse = 0;
		
		while(number != 0){
			
			reminder = number % 10;
			
			reverse = reverse * 10 + reminder;
			
			number = number / 10;
		}
      
		System.out.println("The Reverse number is : "+ reverse);
	}

}
