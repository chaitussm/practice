package com.SetComparatorBased.Programs;

public class ComparableBased {

	public static void main(String[] args) 
	{

         System.out.println("A".compareTo("Z"));
         System.out.println("Z".compareTo("K"));
         System.out.println("A".compareTo("A"));
         System.out.println("A".compareTo(null));

          //NOte after java 1.7 version null is not allowed in the set based interfaces

	}

}
