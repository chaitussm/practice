package com.BaseClasses.Collections;

import java.util.Comparator;

public class ArrayBase implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
	    int l2 = s2.length();
	    
	    return s1.compareTo(s2);
	}

}
