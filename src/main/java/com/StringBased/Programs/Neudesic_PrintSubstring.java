package com.StringBased.Programs;

public class Neudesic_PrintSubstring {

	// Function to get the specific character 
    public static char
    getCharFromString(String str, int index) 
    { 
        return str.charAt(index); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get the String 
        String str = "chaitanya"; 
  
        // Get the index 
        int index = 4; 
  
        // Get the specific character 
       // char ch = getCharFromString(str, index); 
        String ch = str.substring(4, 7);
        System.out.println("Character from " + str 
                           + " at index " + index 
                           + " is " + ch); 
    } 
}
