package com.StringBased.Programs;

public class ReverseEachWordInString {

	public static String ReverseConetentsInString(String Str)
	{

	   StringBuilder sb = new StringBuilder(Str);
	   
	   String reversed = sb.reverse().toString();
	   
	    String[]  rev =  reversed.split(" ");
	    
	    StringBuilder sb1 = new StringBuilder();
	    
	    for(int i = rev.length-1; i >= 0 ; i-- )
	    {
	    	sb1.append(rev[i]).append(" ");
	    }
	  
	    return sb1.toString();
	  
		
	}
	public static void main(String[] args) 
	{
		String str = "Geeks for Geeks";

		String lat = ReverseConetentsInString(str);
		
		System.out.println(lat);
    }

	
}