package com.StringBased.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter_Addnumbers {

	public static void main(String[] args) {

		PrintDuplicateCharacters("A");
		PrintDuplicateCharacters("seleniumTest123nunit123");
		PrintDuplicateCharacters("Hi Chaitanya how are you");

		System.out.println(findSum("seleniumTest123nunit123"));
		

		
	}
	
	public static void PrintDuplicateCharacters(String str) {
		
		if(str==null) {
			
			System.out.println("NULL String");
			return;
			
			
		}
		
		if(str.isEmpty()) {
			
			
			System.out.println("Empty String");
			return;
			
			
		}
		
		if(str.length()==1) {
			
			System.out.println("Single Character in the String");
			
			return;
			
		}
		
		


/*Converts this string to a new character array.
Returns:a newly allocated character array whose 
length is the lengthof this string and whose contents are
initialized to containthe character sequence represented by this string.*/
		char[] words = str.toCharArray();
		Map<Character,Integer> charmap = new  HashMap<Character,Integer>();
		
		//Try to iterate the characters in the hashmap and count the character which is repeated 
		
        for(Character ch : words) {
        	
        	
        	if(charmap.containsKey(ch)) {
        		
        		charmap.put(ch, charmap.get(ch) + 1);
        		
        	}
        	else {
        		
        		charmap.put(ch, 1);
        	}
        }
        
        //Print the Hashmap
        
       Set<Map.Entry<Character, Integer>>entrySet =  charmap.entrySet();
       
       for(Map.Entry<Character, Integer> entry : entrySet ) {
    	   
    	   
    	   if(entry.getValue() > 1) {
    		   
    		   System.out.println(entry.getKey() + ":" + entry.getValue());
    	   }
    	   
    	   
    	   
       }
		
	}
	
	public static int findSum(String str)
	{
		// A temporary string
		String temp = "0";

		// holds sum of all numbers present in the string
		int sum = 0;

		// read each character in input string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// if current character is a digit
			if (Character.isDigit(ch))
				temp += ch;

			// if current character is an alphabet
			else {
				// increment sum by number found earlier
				// (if any)
				sum += Integer.parseInt(temp);

				// reset temporary string to empty
				temp = "0";
			}
		}

		// atoi(temp.c_str()) takes care of trailing
		// numbers
		return sum + Integer.parseInt(temp);
	}

}
