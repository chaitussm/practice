package com.SetComparatorBased.Programs;

import java.util.Comparator;

public class MyComparator implements Comparator
{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);
	}
	
	
}
