package com.interviewquestions.java;

import java.util.Scanner;
//Q--1 WAP TO DISPLAY MAX NO IN ARRAY?

public class LargestNoFromArray2 {

	public static void main(String[] args) {
		
		int a[]  = {1,2,3,4,5,8};
		
		int  maxNo = a[0];
	
		for (int i = 1; i < a.length; i++) {
			
			if (maxNo < a[i]) {
				
				maxNo  = a[i];
			}
			
		}
		
		System.out.println(maxNo );
		
      
		}
	}


