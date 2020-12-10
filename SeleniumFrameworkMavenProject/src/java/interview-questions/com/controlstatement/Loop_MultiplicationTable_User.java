package com.controlstatement;

import java.util.Scanner;

public class Loop_MultiplicationTable_User {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your table number for multiplication : ");
		
		int table = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(table + "x" + i + " = " + table*i);
		}

	}

}
