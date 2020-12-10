package com.controlstatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		  int year;
	         
          Scanner sc = new Scanner(System.in);
          
          System.out.println(" Enter your year : ");
          
          year = sc.nextInt();
          
          if(year%4 == 0 ){
        	  
        	  System.out.println("Yes this is a leap year");
          }
          
          else{
        	  System.out.println("It is not  a leap year !");
          }

	}

}
