package com.SetComparatorBased.Programs;

import java.util.TreeSet;

import com.BaseClasses.Collections.ClassBase;
import com.BaseClasses.Collections.Employee;

public class CustomizeComparator {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Gopi" , 100);
		Employee e2 = new Employee("Shiva" , 200);
		Employee e3 = new Employee("Rama" , 50);
		Employee e4 = new Employee("Srinu" , 150);
		Employee e5 = new Employee("Gopi" , 100);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
      System.out.println("Without Comparator" + t );		
     TreeSet t1 = new TreeSet(new ClassBase());
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		System.out.println("With Comparator" + t1);
		
		
		


	}

}
