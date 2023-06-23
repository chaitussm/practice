package com.CollectionBased.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;



public class Anagram {

	public static void main(String[] args) {
		
			
			    String str="i can Silent";
				
				String str1="can i listeN";	


				 List<Object> charsList1 = str.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
				 
				 List<Object> charsList2 = str1.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
				 
				boolean isCommon=charsList1.containsAll(charsList2)&&charsList2.containsAll(charsList1);
				
				System.out.println("Common Elements are there  "+isCommon);
			}

}
