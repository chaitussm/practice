package com.CollectionBased.examples;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface 
{
	public static void queueFunction()
	{
		
		Queue<String> qu = new LinkedList<>();
		
		qu.add("{");
		qu.add("}");
		qu.add("[");
		qu.add("]");
		qu.add("(");
		qu.add(")");
		
	     Iterator itr =  qu.iterator();
	     
	     while(itr.hasNext())
	     {
	    	Object elem =  itr.next();
	    	
	    	System.out.print(elem);
	     }
	}
	
	public static void queueUtility()
	{
		Queue<String> qe = new PriorityQueue<>();
		
		qe.add("Durga");
		qe.add("Software");
		qe.add("organization");
		
		System.out.println(qe);
		Iterator itr =  qe.iterator();
	     
	     while(itr.hasNext())
	     {
	    	Object elem =  itr.next();
	    	
	    	System.out.print(elem);
	     }
		
		Deque<String> de = new LinkedList<>();
		de.add("Help");
		de.add("every");
		de.add("other");
		
		Iterator itr1 =  de.iterator();
	     
	     while(itr.hasNext())
	     {
	    	Object elem =  itr1.next();
	    	
	    	System.out.print(elem);
	     }
		
	}

	public static void main(String[] args) 
	{
		queueFunction();
		queueUtility();

	}

}
