package com.StringBased.Programs;

import java.util.Arrays;

public class Anagrams 
{
	public static void Anagram(String a , String b)
	{
		String a1 = a.replace(" ", "");
		String b1 = b.replace(" ", "");
		
		 String A1 = a1.toLowerCase();
		String B1 =  b1.toLowerCase();
		
		char A[] = A1.toCharArray();
		char B[] = B1.toCharArray();
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		if(Arrays.equals(A, B))
			System.out.println(a + " and " + b + "  Are Anagrams" );
		else 
			System.out.println(a + " and " + b + "  Are not Anagrams" );

	}

	public static void main(String[] args) 
	{
		Anagram("I Can Silent" , "can I Listen");
	}

}
