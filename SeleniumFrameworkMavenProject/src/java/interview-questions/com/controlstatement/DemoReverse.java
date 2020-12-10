package com.controlstatement;

public class DemoReverse {

	public static void main(String[] args) {
		
		int number = 90875728;
		
		int reminder , reverse = 0;
		
		while(number !=0 ){
			 
			reminder = number % 10;
			
			reverse = reverse * 10 + reminder;
			
			number = number / 10;
		}
            System.out.println(reverse);
	}

}
