package com.arraybasedprograms;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;


public class DeleteDuplicateelementsinArray {
	
	
	public static void Duplicateelements(int[] a ) {
		
		

		
	
		
		
		Map<Integer,Integer> charmap = new  HashMap<Integer,Integer>();
		
		//Try to iterate the characters in the hashmap and count the character which is repeated 
		
        for(Integer ch : a) {
        	
        	
        	if(charmap.containsKey(ch)) {
        		
        		//charmap.put(ch, charmap.get(ch) + 1);
        		charmap.remove(ch,charmap.get(ch) + 1);
        		
        	}
        	else {
        		
        		charmap.put(ch, 1);
        	}
        }
        
        //Print the Hashmap
        
       Set<Map.Entry<Integer, Integer>>entrySet =  charmap.entrySet();
       
       for(Map.Entry<Integer, Integer> entry : entrySet ) {
    	   
    	   
    	   
    		   
    		   
    		   
    		   System.out.println(entry.getKey() + ":" + entry.getValue());
    	   
    	   
    	   
    	   
       }
	}

	public static void main(String[] args) {
		
		
		int[] a = {1,4,5,8,4,7,1,4,1,0,4,1};
		
		int[] b = {1,5,1,7,1,1,7};
		
		
		//DeleteDuplicateelementsinArray.Duplicateelements(a);
		DeleteDuplicateelementsinArray.Duplicateelements(a);
		
		
	

	}

}
