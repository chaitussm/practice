package com.MapComparator.Programs;


import java.util.TreeMap;

import com.BaseClasses.Collections.MapBase;

public class TreeMapUsingComparator {

	public static void main(String[] args) 
	{
          TreeMap t = new TreeMap(new MapBase());
          
          t.put("Shiva", 101);
          t.put("Rama", 102);
          t.put("Brahma", 103);
          t.put("Balarka", 104);
          
          System.out.println(t);
	}

}
