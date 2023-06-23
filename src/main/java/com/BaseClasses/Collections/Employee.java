package com.BaseClasses.Collections;

public class Employee implements Comparable
{
	String name;
	int empId;
	
	public Employee(String name , int empId)
	{
		this.name = name;
		this.empId = empId;
		
	}
	
	public String toString()
	{
		return name + "---" + empId;
	}
	
	public int compareTo(Object obj)
	{
		int empId1 = this.empId;
		
		Employee e = (Employee)obj;
		
		int empId2 = e.empId;
		
		if(empId1 < empId2)
			return -1;
		else if(empId1 > empId2)
			return +1;
		else return 0;
		
	}

}
