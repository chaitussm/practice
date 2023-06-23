package com.StringBased.Programs;

public class CharacterPatterninString {

	public static void main(String[] args) {
		
		String str = "Hello World";
		for(int i=0;i<str.length();i++) {
			
			//System.out.println(i);
			if (i+4 <= str.length()) {
			System.out.println(str.substring(i, i+4)); }
		}	
				
				
			}
		

	}


