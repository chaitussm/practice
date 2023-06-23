package com.CollectionBased.examples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass 
{
	public static void vectorBasic()
	{
		Vector v = new Vector();
		
		for(int i =0; i <= 10 ; i++)
		{
			v.addElement(i);
		}
		
		System.out.println("Elements in the Vector: " + v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Integer I = (Integer)e.nextElement();
			if(I % 2 == 0)
			{
				System.out.println("Objects as per condition : "+ I);
			}
		}
		
		System.out.println("objects in the vector : " + v);
	}

	public static void main(String[] args) 
	{
		vectorBasic();

	}

}
