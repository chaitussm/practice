package com.PatternBased.Programs;

import java.util.Scanner;

public class InvertedPattern1 {

	public static void main(String[] args) {
	
		System.out.println("Enter the value for Pattern");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//In the this pattern Rows count and column will be in decreasing order 
		
		for(int i =1; i <= n; i++) 
		{
			
			for(int j =n; j>=i ; j--) 
			
			{
				
				System.out.print("*");
			}
			
			//For navigating to next row
			System.out.println();
		}

	}

}
