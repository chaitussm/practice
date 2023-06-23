package com.StringBased.Programs;

public class RemoveSpecialCharactersInString {

	public static void main(String[] args) {
		
		String s = "50,00.00"; //5000
		
		String n = s.replaceAll(",","");
		//If we want to remove all the numbers after . 
		String m = n.replaceAll("\\..*", "");
		//If we want to remove all the numbers after . but .remains same 
		String l = n.replaceAll("\\..*", ".");
		System.out.println(m);
		System.out.println(l);
		//to fetch the surrentdirectory name
		System.getProperty("user.dir");
	}

}
