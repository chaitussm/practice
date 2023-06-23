package com.StringBased.Programs;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;


public class DeleteDuplicateCharactersinString {
	
	
	public static void Duplicatecharacters(String str ) {
		
		
		
		char[] words = str.toCharArray();
		
	
		
		
		Map<Character,Integer> charmap = new  HashMap<Character,Integer>();
		
		//Try to iterate the characters in the hashmap and count the character which is repeated 
		
        for(Character ch : words) {
        	
        	
        	if(charmap.containsKey(ch)) {
        		
        		//charmap.put(ch, charmap.get(ch) + 1);
        		charmap.remove(ch,charmap.get(ch) + 1);
        		
        	}
        	else {
        		
        		charmap.put(ch, 1);
        	}
        }
        
        //Print the Hashmap
        
       Set<Map.Entry<Character, Integer>>entrySet =  charmap.entrySet();
       
       for(Map.Entry<Character, Integer> entry : entrySet ) 
       {
    	   System.out.println(entry.getKey() + ":" + entry.getValue());
    	   
    	   }
	}

	public static void main(String[] args) {
		
	
		
		DeleteDuplicateCharactersinString.Duplicatecharacters("Nunit$ is my $unit");
		
		
		
		
	

	}

}
