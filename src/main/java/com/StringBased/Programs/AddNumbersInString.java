package com.StringBased.Programs;

public class AddNumbersInString {

	public static void AddNumInString(String s)
	{ 
	    String Numstr = s.replaceAll("[a-zA-Z]", "");
	    
	    System.out.println(Numstr);
	    int total = 0;
	   
	  char[] words =  Numstr.toCharArray();
	    
	    for(int i =0 ; i< words.length ; i++)
	    {
	    	int value = Integer.parseInt(String.valueOf(words[i]));
	    	total += value; 
	    	
	    }
	    
	    System.out.println("Total sum of numbers in the string is " + total);
	  
	}
 
	public static void main(String[] args) 
	{
		String s = "s5u7r9y1a";
		AddNumInString(s);
	}


}
