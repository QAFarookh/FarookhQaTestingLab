package com.interviewquestions.java;

import java.util.Scanner;
//Q--1 WAP TO DISPLAY MAX NO IN ARRAY?

public class LargestNoFromArray {

	public static void main(String[] args) {
		
		int number[] = {2,3,5,6,9};
		
		int max = number[0];  //Suppose 
		
		for(int i=1 ; i < number.length ;i++){
			
		 if(number[i] > max){
			 
			 max = number[i];
		 }
		 
		 System.out.println("max number is : "+max);
			 
		}
		

		

	}

}
