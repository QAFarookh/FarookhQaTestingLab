package com.interviewquestions.java;

import java.util.Scanner;
//Q--1 WAP TO DISPLAY Smallest NO IN ARRAY?

public class SmallestNoFromArray {

	public static void main(String[] args) {
		
		int a[]  = {2,1,3,4,5,8};
		
		int  minNo = a[0];
	
		for (int i = 1; i < a.length; i++) {
			
			if (minNo > a[i]) {
				
				minNo  = a[i];
			}
			
		}
		
		System.out.println(minNo);
		
      
		}
	}


