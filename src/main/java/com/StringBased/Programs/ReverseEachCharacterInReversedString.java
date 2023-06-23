package com.StringBased.Programs;

public class ReverseEachCharacterInReversedString 
{
	public static String ReverseChar(String str)
	{
		String reverse = "";
		String rev = " ";
		
		for(int i = str.length() -1 ; i >= 0 ; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		String Rev[] = reverse.split(" ");
		
		for(int i = Rev.length -1 ; i >=0 ; i--)
		{
			rev = rev + "  "  + Rev[i];
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		String latest = ReverseChar("I am in Banglore");
		System.out.println("Final String is "  + latest);
	}

}
