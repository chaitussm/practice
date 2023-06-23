package com.arraybasedprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MissingNumberInArray {
	
	
		public static int MissingNumber(int [] a )
		{
			 int temp = 0;
			  
			   
			   for(int i = 0; i < a.length-1; i++)
			   {
				   if( a[i+1] - a[i]!= 1)
				   {
					   temp = (a[i] + a[i+1])/2;
				   }
			   }
			return temp;
			
			
		}
		
		
		
	
		
	public static void main(String[] args) {
		
		
	  int[] a = {121,122,124,125,126};
	  
	  
	  int missing = MissingNumber(a);
	
	  System.out.println("Missing number is "  + missing);

		
	}

}
