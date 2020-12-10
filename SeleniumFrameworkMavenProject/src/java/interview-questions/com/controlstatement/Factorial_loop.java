package com.controlstatement;

public class Factorial_loop {

	public static void main(String[] args) {
	
		int no = 5;
		int fact = 1;
		
		for (int i = 1; i<=no; i++) {   //DON'T FORGET TO WRITE ( < = ) ;
			
			fact = fact * i;           // 1x1 , 1x2 , 2x3 , 6x4 , 24x5 = 120
			
			System.out.println(fact);
		}
		
		System.out.println("Factorial  of 5 is : "+fact);

	}

}

// Factorial of 5 is = 5 x 4 x 3 x 2x 1 = 120