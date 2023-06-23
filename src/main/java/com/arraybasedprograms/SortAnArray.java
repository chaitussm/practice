package com.arraybasedprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import com.BaseClasses.Collections.ArrayBase;

public class SortAnArray 
{
	public static void SortAscending(int[] a)
	{
		int total = a.length;
		
        TreeSet t = new TreeSet(new ArrayBase());
        
        for(int i = 0 ; i< total ; i++)
        {
        	t.add(a[i]);
		}
		
        Object arr = t.toArray();
        
        System.out.println("Sorted Array: " + Arrays.deepToString((Object[]) arr));
		
		for(Object ele : t)
		{
			System.out.println(ele);
		}
	}

	public static void main(String[] args) 
	{
       int[] a = {31, 89, 67, 35,42};
       
       SortAscending(a);
	}

}
