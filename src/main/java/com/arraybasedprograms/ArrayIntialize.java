package com.arraybasedprograms;

import java.util.Scanner;

public class ArrayIntialize {

	public static void main(String[] args) {
	
	   //String array intialization 
		int length;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Create an String array");
		length = input.nextInt();
		
         String[] names = new String[length];
	
		System.out.println("Elements in the String array are ");
		
		for(int i = 0; i < length ; i++) 
		{
		    System.out.println("Enter the friends names " + (i+1));
		    
		    //TO read the names 
		    names[i] = input.next();
		
	    }
		
		System.out.println("Friends in the list are ");
		
		for(int i = 0; i < length ; i ++) 
		{
           System.out.println(names[i]);
        }
	}
	
}
