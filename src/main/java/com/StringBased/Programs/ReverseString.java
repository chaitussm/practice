package com.StringBased.Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string to reverse");
		original = in.nextLine();
		 int length = original.length();
		 for ( int i = length - 1 ; i >= 0 ; i-- )
		 reverse = reverse + original.charAt(i);
		 System.out.println("Reverse of entered string is: "+reverse);
		 
		char[] words =  reverse.toCharArray();
		
	 ArrayList<Character> arr = new ArrayList<Character>();
	 
	 for( Character ele : words) {
		 
		 
		 System.out.println("elements are " + ele);
	 }
	}

}
