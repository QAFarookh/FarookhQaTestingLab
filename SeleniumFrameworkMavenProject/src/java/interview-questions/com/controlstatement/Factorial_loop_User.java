package com.controlstatement;

import java.util.Scanner;

public class Factorial_loop_User {

	public static void main(String[] args) {
	
	     
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your number for Factoial : ");    
			
			int number = sc.nextInt();
			
			int fact = 1;
			
			for (int i = 1; i <= number; i++) {
				fact = fact * i;
				System.out.println(fact);
			}
			System.out.println("Factorial  of your no is : "+fact);
	}

}

// Factorial of 5 is = 5 x 4 x 3 x 2x 1 = 120