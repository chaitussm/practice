package com.arraybasedprograms;

import java.lang.reflect.Array;

public class SortArrayWithoutDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a = {31, 89, 67, 35,42};
		 
		 int len = a.length;
		 
		 int i,j;
		 
		 for (i=0;i<len;i++)
		 {
			 for (j=i;j<len;j++)
			 {
				 if(a[i]>a[j])
				 {
					 a[i] = a[i]+a[j];
					 a[j] = a[i]-a[j];
					 a[i] = a[i]-a[j];
				 }
			 }
		 }
		 
		 for(i=0;i<len;i++)
			 System.out.println(a[i]);
		 

	}

}
