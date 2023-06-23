package com.StringBased.Programs;

public class Honeywell_Compressstring 
{

	
	public static String compress(String str) 
	  {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		  for (int i = 0; i < str.length(); i++) 
		  {
		countConsecutive++;
		/* If next character is different than current, append this char to result.*/
		   if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) 
		    {
			   	
			  compressed.append(str.charAt(i));
		      compressed.append(countConsecutive);
		      countConsecutive = 0;
		    }
		  }
		//return compressed.length() < str.length() ? compressed.toString() : str;
		//If compressed string length is less than original string return compressed
		//string else return original string
		return compressed.toString();
	}
		public static void main(String[] args) {
		String str = "abbbccdd";
	
		
		System.out.println(str);
		System.out.println(compress(str));
		}
}