package com.PatternBased.Programs;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number ");
       int n = sc.nextInt();
       //for rows count
       for(int i =1; i<=n; i++) 
       {
    	   
    	   //To print space
    	   for(int j = n-1; j>=i; j--) {
    		   
    		   System.out.print(" ");
    	   }
    	   
    	   //to print star
    	   for(int k =1; k<=i; k++) {
    		   
    		   System.out.print(" *");
    	   }
    	   
    	   System.out.println();
       }
	}

}
