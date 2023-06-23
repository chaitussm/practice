package com.PatternBased.Programs;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter the required rows");
		int n = sc.nextInt();
		
		
		//for the first triangle 
		for(int i = 1; i<= n ; i++) 
		{
			
			for(int j=1; j<=i ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//for the second reverse triangle
		
		for(int i =1; i<=n ; i++) 
		{
			
			for( int j = n ; j>=i ; j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
