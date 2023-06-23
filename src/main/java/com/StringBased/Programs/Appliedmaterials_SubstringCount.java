package com.StringBased.Programs;

public class Appliedmaterials_SubstringCount {

	public static int countSubstring(String subStr, String str){
		int count = 0;
		for (int loc = str.indexOf(subStr); loc != -1;
		     loc = str.indexOf(subStr, loc + subStr.length()))
		count++;
		return count;
		}

		public static void main(String[] args){
		System.out.println(countSubstring("day", "today is a good day"));
		System.out.println(countSubstring("abab", "ababababab"));
		System.out.println(countSubstring("a*b", "abaabba*bbaba*bbab"));
		System.out.println(countSubstring("tan", "chaitanya"));

		}

}
