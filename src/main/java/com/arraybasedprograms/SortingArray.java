package com.arraybasedprograms;

import java.util.Arrays;

public class SortingArray {
	
	
	public static void SortArray(String [] a) {
		
		Arrays.sort(a);
		
		for(String ele : a ) {
			
			System.out.println("Elements in the array are " + ele );
		}
		
		for(int i = 0 ; i <a.length; i++) {
			
			System.out.println("Elments in the Array are " + a[i]);
		}
	}

	public static void main(String[] args) {
		
         String[] a = { "o", "z" , "a" , "v" , "m"};
         
         
         SortArray(a);
         
	}

}
