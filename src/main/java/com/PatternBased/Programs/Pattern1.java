package com.PatternBased.Programs;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		//For rows count
		for(int i = 1; i<=n; i++) 
		{     
			//For printing space 
             for(int j = n ; j>=i; j--) {
            	 
            	 System.out.print(" ");
             }
             
             //For printing Star
             for(int k =1; k<=i ; k++) {
            	 
            	 System.out.print(" *");
             }
             
             System.out.println();
			
		}
		

	}

}
