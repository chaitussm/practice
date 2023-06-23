package com.StringBased.Programs;

public class RemoveSpecificCharacters 
{
	public static void RemoveSpec(String a)
	{
		String latest = a.replaceAll("[^a-zA-Z]", "");
		System.out.println("Final String is " + latest);
		
		String Final = a.replaceAll("[^0-9]", "");
		System.out.println("Final String is " + Final);
		
		String Finale = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Final String is " + Finale);
		
		
		
	}

	public static void main(String[] args) 
	{
		RemoveSpec("Ra^*ma#456$");
	}

}
