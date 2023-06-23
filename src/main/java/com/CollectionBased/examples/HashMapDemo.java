package com.CollectionBased.examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) 
	{
       HashMap m = new HashMap();
       
       m.put("Shiva", 500);
       m.put("Rama", 800);
       m.put("Durga", 200);
       m.put("Lakshmi", 500);
       
       System.out.println("Elements in Map are : " + m);
       
      Set s =  m.keySet();
      System.out.println("Keys in the map are : " + s );
      
      Collection c = m.values();
      System.out.println("Values in the map are : " + c);
      
      Set entry = m.entrySet();
      System.out.println("Entry in the map is " + entry);
      
      Iterator itr = entry.iterator();
      
      while(itr.hasNext())
      {
    	  Map.Entry m1 = (Map.Entry)itr.next();
    	  
    	  System.out.println(m1.getKey()  + "----" + m1.getValue());
    	  
    	  if(m1.getKey().equals("Rama"))
    	  {
    		  m1.setValue("1200");
    	  }
    	  
    	  
      }
       System.out.println("Final values in the Map are : " + m);
	}

}
