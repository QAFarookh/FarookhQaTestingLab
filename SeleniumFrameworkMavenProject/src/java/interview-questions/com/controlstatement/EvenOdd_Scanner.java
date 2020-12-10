//3- wap to check even or odd ?
package com.controlstatement;

import java.util.Scanner;

public class EvenOdd_Scanner {

	public static void main(String[] args) {
	
          int number;
         
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Please user xyz enter your number : ");
          
          number = sc.nextInt();
          
          if(number%2 == 0){
        	  System.out.println("Your number is Even : "+number);
          }
          
          else{
        	  
        	  System.out.println("Your number is Odd : "+number);
          }
          
          
          
          
	}
}

/*
NOTE - Here ( = = ) is used to check the equality between the two numbers.

and single ( = ) is used for assignments */