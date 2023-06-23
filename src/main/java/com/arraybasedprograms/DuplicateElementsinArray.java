package com.arraybasedprograms;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;


public class DuplicateElementsinArray {
	
	
	public static void Duplicateelements(int[] a ) {
		
		
		
	
		
	
		
		
		Map<Integer,Integer> arrmap = new  HashMap<Integer,Integer>();
		
		//Try to iterate the characters in the hashmap and count the character which is repeated 
		
        for(Integer arr : a) {
        	
        	
        	if(arrmap.containsKey(arr)) {
        		
        		arrmap.put(arr, arrmap.get(arr) + 1);
        		
        	}
        	else {
        		
        		arrmap.put(arr, 1);
        	}
        }
        
        //Print the Hashmap
        
       Set<Map.Entry<Integer, Integer>>entrySet =  arrmap.entrySet();
       
       for(Map.Entry<Integer, Integer> entry : entrySet ) {
    	   
    	   
    	   if(entry.getValue() > 1) {
    		   
    		   System.out.println("Duplicate elements are "+ entry.getKey());
    		   
    		   System.out.println("Duplicate elements are "+ entry.getKey() + ":" + "Repeated by " + entry.getValue() +  "times ");
    	   }
    	   
    	   
    	   
       }
	}

	public static void main(String[] args) {
		
		
		int[] a = {1,4,5,8,4,7,1,4,1,0,4,1,4,1};
		
		
		DuplicateElementsinArray.Duplicateelements(a);
		
		
	

	}

}
