package com.arraybasedprograms;

public class FindSecondSmall_LargeNumberinArray {

	public static void getSecondLargest(int[] a){  
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] >  a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		      System.out.println("second largest number is " + a[total-2]); 
		}  
	
	public static void getSecondSmallest(int[] a){  
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] <  a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		      System.out.println("second smallest number is " + a[total-2]); 
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,7,3};  
		int b[]={44,66,99,77};  
		 
		FindSecondSmall_LargeNumberinArray.getSecondLargest(b);
		FindSecondSmall_LargeNumberinArray.getSecondSmallest(b);
		
		}}  

