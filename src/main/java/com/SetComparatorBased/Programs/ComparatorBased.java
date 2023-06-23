package com.SetComparatorBased.Programs;

import java.util.TreeSet;

import com.BaseClasses.Collections.Baseclass;

public class ComparatorBased {

	public static void main(String[] args) 
	{
		MyComparator m = new MyComparator();
		
		/*Example 1
		To Insert String objects into the Treeset where all elements should 
		inserted according to reverse of alphabetical order*/
          TreeSet t = new TreeSet();
           //TreeSet t = new TreeSet(new Baseclass());
           t.add("Meenakshi");
           t.add("Kamaakshi");
           t.add("Vishalaakshi");
           t.add("Daakshayini");
           
           System.out.println(t);
           
        /*Example-2 
         * To Insert String and String Buffer into TreeSet where sorting order 
         * is increasing length order. If 2 Objects having same length then consider 
         * their alphabetical order*/
         System.out.println("*********Example2*******");
          TreeSet s = new TreeSet(new Baseclass());
          
          s.add("A");
          s.add(new StringBuffer("ABC"));
          s.add(new StringBuffer("AA"));
          s.add("XX");
          s.add("ABCD");
          s.add("A");
          System.out.println(s);
        
           
      
           
	}

}
