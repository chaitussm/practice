package com.arraybasedprograms;

public class LargestSmallestElementinArray {

	public static void main(String[] args) {

    int large, small;
    
    int[] a = {25, 56, 9, 780,141};
    
    small= large = a[0];
		   //small = a[0];
   
   int length = a.length;
   
   for( int i =1; i< length; i++) {
	   
	   
	   if(a[i] > large)
		   large = a[i];
		   else if (a[i] < small)
		   small = a[i];
	   
 
	   
   }
    System.out.println("Smallest number is " + small);
    System.out.println("Largest number is " + large);
    System.out.println("Maximum difference between the elements is " + (large-small) );
	}

}
