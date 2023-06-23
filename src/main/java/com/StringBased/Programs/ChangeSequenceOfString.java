package com.StringBased.Programs;

import java.util.Scanner;

public class ChangeSequenceOfString {

	public static void main(String[] args) {
	  
        
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String n = u.charAt(u.length()-1) +u.substring(0,u.length()-1);   
        System.out.println(n);
        
        String s = "software";
       String s1 =  s + "engineer";
      s.replace(s, u);
       
       StringBuffer sb = new StringBuffer("durga");
       sb.append("soft");
       
       
	}
}













