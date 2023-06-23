package com.PatternBased.Programs;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows ");
		
		int n = sc.nextInt();
		
	
		
		
       //for loop for rows 
		for( int i =1; i<=n; i++) {
			
			//here columns are in decreasing order
			for( int j = n ; j >= i  ; j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
