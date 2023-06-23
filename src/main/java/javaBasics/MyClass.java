package javaBasics;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	
	public  List<String> GetElement(){
		
		List<String> mylist = new ArrayList<String>();
		
		mylist.add("Hari");
		mylist.add("Hemanth");
		
		return mylist;
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		MyClass m = new MyClass();

        System.out.println("Elements in the list are " + m.GetElement());
	}

}
