//5) wap to check year 2100 is a leap year or not ?

package com.controlstatement;

public class LeapYear2 {

	public static void main(String[] args) {
		
		  int year = 2100;
		  
		  if (year%400 == 0 || year%4==0 && year%100!=0) {   
			System.out.println("This year is a leap year : "+year);
		}
		  else{
			  System.out.println("This is not a leap year : "+year);
		  }
     

	}

}


/*
Finding a year is a leap or not is a bit tricky. We generally assume that if a year number is evenly divisible by 4 is a leap year. 
But it is not the only case. A year is a leap year if −
1. It is evenly divisible by 100
2. If it is divisible by 100, then it should also be divisible by 400
3. Except this, all other years evenly divisible by 4 are leap years.*/