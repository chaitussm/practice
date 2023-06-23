package com.StringBased.Programs;

import java.util.Arrays;

public class DiscoveryInterview_Anagram 
{
    public static void CheckAnagram(String a , String b)
    {
    	// Remove spaces
    	String A1 = a.replace(" ", "");
    	String B1 = b.replace(" ", "");
    	
    	//Convert into lower case
    	String A = A1.toLowerCase();
    	String B = B1.toLowerCase();
    	
    	//Convert into char array
    	char[] arrA = A.toCharArray();
    	char[] arrB = B.toCharArray();
    	
    	//Sort them
    	Arrays.sort(arrA);
    	Arrays.sort(arrB);
    	
    	boolean result = Arrays.equals(arrA, arrB);
    	
    	if(result == true)
    	{
    		System.out.println(a + "and  " + b + "  are anagrams");
    	}
    	else 
    	{
    		System.out.println(a + "and " + b + "   are not anagrams");	
    	}
    }
	public static void main(String[] args)
	{
		CheckAnagram("silent" , "listen");
	}

}
