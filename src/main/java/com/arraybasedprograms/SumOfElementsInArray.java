package com.arraybasedprograms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SumOfElementsInArray 

{
	

	public static void SumOfEleInArray(int[] a, int total)
	{ 
	
	   int length = a.length;
	   for(int i = 0; i< length ; i++)
	   {
		   for(int j = i+1; j< length; j++)
		   {
			   
			   if(total == a[i] + a[j])
			   {
				   int[] b = {i,j};
				   System.out.println(Arrays.toString(b));
			   }
			   
			   else 
			   {
				int[] c = {-1,-1};
				System.out.println(Arrays.toString(c));
				   
			   }
		   }
	   }
	  
	}
  
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		int total = 5;
		
	SumOfEleInArray(a, total);
		
	}

}
