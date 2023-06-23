package com.CollectionBased.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackClass 
{
	public static void stackFunction()
	{
		Stack<String> st = new Stack<String>();
		
		st.add("{");
		st.add("[");
		st.add("(");
		st.add(")");
		st.add("]");
		st.add("}");
		
	     Iterator itr =  st.iterator();
	     
	     while(itr.hasNext())
	     {
	    	Object ele =  itr.next();
	    	
	    	System.out.print(ele);
	     }
	}
	
	public static void stackBasic()
	{
		Stack s = new Stack();
		
		s.push("A");
		s.push("B");

		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("M"));

		

		
		
	}
	

	public static void main(String[] args) 
	{
		
		stackFunction();
		
		stackBasic();
	}

}
